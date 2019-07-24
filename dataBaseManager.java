import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

//import java.net.URL;
//import java.net.URLClassLoader;

/*class ClassPathDetector{

   public static void main (String args[]) {

        ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }
   }
}*/


class dataBaseManager{
	public static void main(String args[]){
		h2Connector h2C = new h2Connector();
		/*ClassLoader cl = ClassLoader.getSystemClassLoader();
        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }*/
	}	

}

class h2Connector{
	Statement stmt;
	Connection con;

	h2Connector(){
		stmt = null;
		con = null;
		try{
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:~/Downloads/symmetric-server-3.10.2/tmp/h2/CRISDB; AUTO_SERVER=TRUE;LOCK_TIMEOUT=60000", "sa","");
			stmt = con.createStatement();
			System.out.println("Connected to h2 Succesfully!");
		}catch(Exception e){
			System.out.println("awd");
			e.printStackTrace();
		}

/*		boolean[] isOccupied;
		isOccupied = new boolean[73];
		GiveBookedSeats(isOccupied);
		Passenger psg = GivePassenger(1,isOccupied);
		System.out.println(psg.Name);
		UpdateLocalDB(psg);*/
	}

	public void GiveBookedSeats(boolean arr[]){
		ResultSet res = null;
		try{
			res = stmt.executeQuery("SELECT * from initialPassengers");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		if(res == null){
			for(int i=1 ; i<=72 ; i++){arr[i] = false;}
		}
		try{
			while(res.next()){
				arr[res.getInt("SEAT")] = true;
			}
		}
		catch(Exception e){
			System.out.println("Error In dataBaseManager_h2Connector_GiveBookedSeats");
			e.printStackTrace();
		}
	}

	public void GiveLockedSeats(boolean syncLocked[]){
		ResultSet res = null;
		try{
			res = stmt.executeQuery("SELECT * from passenger");
		}
		catch(Exception e){
			System.out.println("Error In dataBaseManager_h2Connector_GiveLockedSeats");
			e.printStackTrace();
		}
		if(res == null){
			for(int i=1 ; i<=72 ; i++){
				syncLocked[i] = false;
			}
		} 
		try{
			while(res.next()){
				syncLocked[res.getInt("Seat")] = true;
			}
		} 
		catch(Exception e){
			System.out.println("Error In dataBaseManager_h2Connector_GiveLockedSeats");
			e.printStackTrace();
		}
	}

	// Verifies if the passed pnr already exists in intial database
	public boolean PNRPrivateKeyVerifier(int pnr){
		ResultSet res = null;
		try{
			stmt.executeQuery("SELECT PNR from initialPassengers;");
		}
		catch(Exception e){
			e.printStackTrace();
		}

		if(res == null){return true;}

		try{
			while(res.next()){
				if(res.getInt("PNR") == pnr){
					return false;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}

	public Passenger GivePassenger(int seatNo, boolean isOccupied[]){
		if(!isOccupied[seatNo]){
			return new Passenger();
		}
		ResultSet res = null;
		try{
			res = stmt.executeQuery("SELECT * from initialPassengers");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		if(res == null){
			return new Passenger();
		}
		try{
			while(res.next()){
				if(res.getInt("SEAT") == seatNo){
					Passenger reqPassenger = new Passenger(res.getInt("PNR"),res.getString("NAME"),res.getInt("AGE"), res.getString("START"), res.getString("END"), res.getInt("SEAT"));
					return reqPassenger;
				}				
			}
			return new Passenger();
		}
		catch(Exception e){
			System.out.println("Error In dataBaseManager_h2Connector_GiveBookedSeats");
			e.printStackTrace();
			return new Passenger();
		}	
	}

	public void UpdateLocalIntialDB(Passenger psg){
		String query = "";
		query = "INSERT INTO initialPassengers VALUES(";
		query += "'"+psg.Name+"', ";
		query += Integer.toString(psg.age)+", ";
		query += "'"+psg.start+"', ";
		query += "'"+psg.end+"', ";
		query += Integer.toString(psg.PNRNo) + ", ";		
		query += Integer.toString(psg.seat) + ");";
		System.out.println(query);

		try{
			stmt.executeUpdate(query);
			System.out.println("Updated Succesfully!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public void UpdateLocalDB(Passenger psg){
		String query = "";
		query = "INSERT INTO passenger VALUES(";
		query += Integer.toString(psg.PNRNo) + ", ";
		query += "'"+psg.Name+"', ";
		query += Integer.toString(psg.age)+", ";
		query += "'"+psg.start+"', ";
		query += "'"+psg.end+"', ";
		query += Integer.toString(psg.seat) + ");";
		System.out.println(query);

		try{
			stmt.executeUpdate(query);
			System.out.println("Updated Succesfully!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}


class Passenger{
	int PNRNo;
	String Name;
	int age;
	String start;
	String end;
	int seat;

	Passenger(){
		this.PNRNo = -1;
		this.Name = "";
		this.age = -1;
		this.start = "";
		this.end = "";
		this.seat = -1;
	}


	Passenger(int PNRNo, String Name, int age, String start, String end, int seat){
		this.PNRNo = PNRNo;
		this.Name = Name;
		this.age = age;
		this.start = start;
		this.end = end;
		this.seat = seat;
	}
}
