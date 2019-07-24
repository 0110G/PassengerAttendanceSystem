import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JTextField;

import javax.swing.ImageIcon;
import java.sql.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JLabel;

public class serverSideApplicationWindow implements ActionListener{

	private JFrame frame;
	JRadioButton[] radioButton;
	getpassengerDetails1 pd;
	JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					serverSideApplicationWindow window = new serverSideApplicationWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public serverSideApplicationWindow() {
		pd= new getpassengerDetails1();
		radioButton = new JRadioButton[73];
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frame = new JFrame("Server Client DB:[MySQL] URL:mysql://localhost/PassDB");
		frame.setBounds(100, 100, 640, 741);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 207, 687);
		frame.getContentPane().add(panel);
	//	//panel.setBackground(new Color(255,255,255,100));
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
	//	panel_1.setBackground(new Color(0,0,0,0));
		panel_1.setBounds(12, 12, 124, 63);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 3, 0, 0));
		
		 radioButton[1] = new JRadioButton("1");
		//radioB//utton[1].setBackground(new Color(0,0,0,0));
		panel_1.add(radioButton[1]);
		
		 radioButton[2] = new JRadioButton("2");
		panel_1.add(radioButton[2]);
		//radioB//utton[2].setBackground(new Color(255,255,255,50));

		
		 radioButton[3] = new JRadioButton("3");
		panel_1.add(radioButton[3]);
		
		 radioButton[4] = new JRadioButton("4");
		panel_1.add(radioButton[4]);
		
		radioButton[5] = new JRadioButton("5");
		panel_1.add(radioButton[5]);
		
		 radioButton[6] = new JRadioButton("6");
		panel_1.add(radioButton[6]);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(148, 12, 51, 63);
	//	panel_2.setBackground(new Color(0,0,0,0));
		panel.add(panel_2);
		
		 radioButton[7] = new JRadioButton("7");
		panel_2.add(radioButton[7]);
		
	 	radioButton[8] = new JRadioButton("8");
		panel_2.add(radioButton[8]);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 87, 124, 63);
	//	panel_3.setBackground(new Color(0,0,0,0));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 3, 0, 0));
		
	    radioButton[9] = new JRadioButton("9");
		panel_3.add(radioButton[9]);
		
		radioButton[10] = new JRadioButton("10");
		panel_3.add(radioButton[10]);
		
		radioButton[11] = new JRadioButton("11");
		panel_3.add(radioButton[11]);
		
		radioButton[12] = new JRadioButton("12");
		panel_3.add(radioButton[12]);
		
		 radioButton[13] = new JRadioButton("13");
		panel_3.add(radioButton[13]);
		
		radioButton[14] = new JRadioButton("14");
		panel_3.add(radioButton[14]);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 162, 124, 63);
	//	panel_4.setBackground(new Color(0,0,0,0));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 3, 0, 0));
		
		radioButton[17] = new JRadioButton("17");
		panel_4.add(radioButton[17]);
		
		 radioButton[18] = new JRadioButton("18");
		panel_4.add(radioButton[18]);
		
		 radioButton[19] = new JRadioButton("19");
		panel_4.add(radioButton[19]);
		
		radioButton[20] = new JRadioButton("20");
		panel_4.add(radioButton[20]);
		
		radioButton[21] = new JRadioButton("21");
		panel_4.add(radioButton[21]);
		
		 radioButton[22] = new JRadioButton("22");
		panel_4.add(radioButton[22]);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(12, 237, 124, 63);
	//	panel_5.setBackground(new Color(0,0,0,0));
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 3, 0, 0));
		
		radioButton[25] = new JRadioButton("25");
		panel_5.add(radioButton[25]);
		
		radioButton[26] = new JRadioButton("26");
		panel_5.add(radioButton[26]);
		
		radioButton[27] = new JRadioButton("27");
		panel_5.add(radioButton[27]);
		
		 radioButton[28] = new JRadioButton("28");
		panel_5.add(radioButton[28]);
		
		radioButton[29] = new JRadioButton("29");
		panel_5.add(radioButton[29]);
		
		 radioButton[30] = new JRadioButton("30");
		panel_5.add(radioButton[30]);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(12, 312, 124, 63);
	//	panel_6.setBackground(new Color(0,0,0,0));
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(2, 3, 0, 0));
		
		 radioButton[33] = new JRadioButton("33");
		panel_6.add(radioButton[33]);
		
		 radioButton[34] = new JRadioButton("34");
		panel_6.add(radioButton[34]);
		
		 radioButton[35] = new JRadioButton("35");
		panel_6.add(radioButton[35]);
		
		 radioButton[36] = new JRadioButton("36");
		panel_6.add(radioButton[36]);
		
		 radioButton[37] = new JRadioButton("37");
		panel_6.add(radioButton[37]);
		
		 radioButton[38] = new JRadioButton("38");
		panel_6.add(radioButton[38]);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(12, 387, 124, 63);
	//	panel_7.setBackground(new Color(0,0,0,0));
		panel.add(panel_7);
		panel_7.setLayout(new GridLayout(2, 3, 0, 0));
		
		 radioButton[41] = new JRadioButton("41");
		panel_7.add(radioButton[41]);
		
		 radioButton[42] = new JRadioButton("42");
		panel_7.add(radioButton[42]);
		
		 radioButton[43] = new JRadioButton("43");
		panel_7.add(radioButton[43]);
		
		 radioButton[44] = new JRadioButton("44");
		panel_7.add(radioButton[44]);
		
		 radioButton[45] = new JRadioButton("45");
		panel_7.add(radioButton[45]);
		
		 radioButton[46] = new JRadioButton("46");
		panel_7.add(radioButton[46]);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(12, 462, 124, 63);
	//	panel_8.setBackground(new Color(0,0,0,0));
		panel.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 3, 0, 0));
		
		 radioButton[49] = new JRadioButton("49");
		panel_8.add(radioButton[49]);
		
		 radioButton[50]= new JRadioButton("50");
		panel_8.add(radioButton[50]);
		
		 radioButton[51] = new JRadioButton("51");
		panel_8.add(radioButton[51]);
		
		 radioButton[52] = new JRadioButton("52");
		panel_8.add(radioButton[52]);
		
		radioButton[53] = new JRadioButton("53");
		panel_8.add(radioButton[53]);
		
	     radioButton[54] = new JRadioButton("54");
		panel_8.add(radioButton[54]);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(12, 537, 124, 63);
	//	panel_9.setBackground(new Color(0,0,0,0));
		panel.add(panel_9);
		panel_9.setLayout(new GridLayout(2, 3, 0, 0));
		
		 radioButton[57] = new JRadioButton("57");
		panel_9.add(radioButton[57]);
		
		 radioButton[58] = new JRadioButton("58");
		panel_9.add(radioButton[58]);
		
		 radioButton[59] = new JRadioButton("59");
		panel_9.add(radioButton[59]);
		
		 radioButton[60] = new JRadioButton("60");
		panel_9.add(radioButton[60]);
		
		 radioButton[61] = new JRadioButton("61");
		panel_9.add(radioButton[61]);
		
		
		radioButton[62] = new JRadioButton("62");
		panel_9.add(radioButton[62]);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(148, 87, 51, 63);
		//panel_10.setBackground(new Color(0,0,0,0));
		panel.add(panel_10);
		
		 radioButton[15] = new JRadioButton("15");
		panel_10.add(radioButton[15]);
		
		radioButton[16] = new JRadioButton("16");
		panel_10.add(radioButton[16]);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(148, 162, 51, 63);
		//panel_11.setBackground(new Color(0,0,0,0));
		panel.add(panel_11);
		
		 radioButton[23] = new JRadioButton("23");
		panel_11.add(radioButton[23]);
		
		 radioButton[24] = new JRadioButton("24");
		panel_11.add(radioButton[24]);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(148, 237, 51, 63);
		//panel_12.setBackground(new Color(0,0,0,0));
		panel.add(panel_12);
		
		 radioButton[31] = new JRadioButton("31");
		panel_12.add(radioButton[31]);
		
		 radioButton[32] = new JRadioButton("32");
		panel_12.add(radioButton[32]);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(148, 312, 51, 63);
		//panel_13.setBackground(new Color(0,0,0,0));
		panel.add(panel_13);
		
		 radioButton[39] = new JRadioButton("39");
		panel_13.add(radioButton[39]);
		
		radioButton[40] = new JRadioButton("40");
		panel_13.add(radioButton[40]);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(148, 387, 51, 63);
		//panel_14.setBackground(new Color(0,0,0,0));
		panel.add(panel_14);
		
		 radioButton[47] = new JRadioButton("47");
		panel_14.add(radioButton[47]);
		
		 radioButton[48] = new JRadioButton("48");
		panel_14.add(radioButton[48]);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(148, 462, 51, 63);
		//panel_15.setBackground(new Color(0,0,0,0));
		panel.add(panel_15);
		
		 radioButton[55] = new JRadioButton("55");
		panel_15.add(radioButton[55]);
		
		 radioButton[56] = new JRadioButton("56");
		panel_15.add(radioButton[56]);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(148, 537, 51, 63);
		//panel_16.setBackground(new Color(0,0,0,0));
		panel.add(panel_16);
		
		 radioButton[63] = new JRadioButton("63");
		panel_16.add(radioButton[63]);
		
		 radioButton[64] = new JRadioButton("64");
		panel_16.add(radioButton[64]);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(12, 612, 124, 63);
		//panel_17.setBackground(new Color(0,0,0,0));
		panel.add(panel_17);
		panel_17.setLayout(new GridLayout(2, 3, 0, 0));
		
		 radioButton[65] = new JRadioButton("65");
		panel_17.add(radioButton[65]);
		
		 radioButton[66] = new JRadioButton("66");
		panel_17.add(radioButton[66]);
		
		 radioButton[67] = new JRadioButton("67");
		panel_17.add(radioButton[67]);
		
		 radioButton[68] = new JRadioButton("68");
		panel_17.add(radioButton[68]);
		
		 radioButton[69] = new JRadioButton("69");
		panel_17.add(radioButton[69]);
		
		 radioButton[70] = new JRadioButton("70");
		panel_17.add(radioButton[70]);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(148, 612, 51, 63);
		////panel_18.setBackground(new Color(0,0,0,0));
		panel.add(panel_18);
		
		 radioButton[71] = new JRadioButton("71");
		panel_18.add(radioButton[71]);
		
		radioButton[72] = new JRadioButton("72");
		panel_18.add(radioButton[72]);
		
		for(int i=1;i<=72;i++){
			//System.out.println(i);	
			radioButton[i].setBackground(new Color(0,0,0,0));
		}
		
		btnNewButton = new JButton("REFRESH");
		btnNewButton.setBounds(286, 372, 100, 30);
		btnNewButton.addActionListener(this);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -14, 634, 725);
		lblNewLabel.setIcon(new ImageIcon("./newbackground1.jpg"));
		frame.getContentPane().add(lblNewLabel);
		
		ResultSet rs = pd.GetPassengerDetails();
		showdetails(rs);
	}
    void showdetails(ResultSet res){
    	boolean[] isOcc = new boolean[73];

    	// Intitializing the boolean array
    	for(int i=1 ; i<=72 ; i++){isOcc[i] = false;}

    	if(res == null){return;}
    	try{
    		while(res.next()){
  				int seat=res.getInt("seat");
      	    	radioButton[seat].setBackground(Color.green);
      	    	//radioButton[seat].setOpaque(true);
      	    	radioButton[seat].setSelected(true);
      	    	radioButton[seat].setEnabled(false);
      	    	isOcc[seat] = true;
  				//System.out.println(seat);
 	 		}	
    	}
    	catch (Exception e){
    		e.printStackTrace();
    	}

    	for(int i=1 ; i<=72 ; i++){
    		if(!isOcc[i]){
    			radioButton[i].setEnabled(true);
    			radioButton[i].setSelected(false);
    			radioButton[i].setBackground(new Color(0,0,0,0));
    		}
    	}


	}
	public void actionPerformed(ActionEvent e){
       	if(e.getSource() == btnNewButton){
       		ResultSet rs = pd.GetPassengerDetails();
			showdetails(rs);
       	}
    }
}
