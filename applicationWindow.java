import java.awt.EventQueue;
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
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class applicationWindow implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JRadioButton[] radioButton;
	private JLabel passengerNameDBLabel;
	private JLabel passengerPNRDBLabel;
	private JLabel passengerAgeDBLabel;
	private JLabel passengerStartDBLabel;
	private JLabel passengerEndDBLabel;
	private JLabel passengerSeatDBLabel;
	private JButton rstButton;
	private JButton syncButton;
	private JButton reportButton;
	private JButton btnUpdate;
	private JButton btnEnterInformation;
	boolean[] ifOccupied;
	boolean[] reportLocked;
	boolean[] syncLocked;
	h2Connector h2C;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					applicationWindow window = new applicationWindow();
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
	public applicationWindow() {
		radioButton = new JRadioButton[73];
		ifOccupied = new boolean[73];
		syncLocked = new boolean[73];
		reportLocked = new boolean[73];
		h2C = new h2Connector();
		h2C.GiveBookedSeats(ifOccupied);
		h2C.GiveLockedSeats(syncLocked);
		//for(int i=0 ; i<=72 ; i++){syncLocked[i] = false; reportLocked[i] = false;}
		//for(int i=0 ; i<=72 ; i++) {ra}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Local Client DB:[h2] URL:jdbc:h2:...");
		//frame.setBounds(100, 100, 868, 691);
		frame.setSize(868,670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 80, 210, 585);
		panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.setResizable(false);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(255, 255, 255,100));
		radioButton = new JRadioButton[73];
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 12, 123, 53);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 3, 0, 0));
		panel_1.setBackground(new Color(0,0,0,0));
		
		 radioButton[1] = new JRadioButton("1");
		radioButton[1].setBackground(new Color(0,0,0,0));
		panel_1.add(radioButton[1]);
		
		 radioButton[2] = new JRadioButton("2");
		panel_1.add(radioButton[2]);
		radioButton[2].setBackground(new Color(0,0,0,0));
		
		
		 radioButton[3] = new JRadioButton("3");
		panel_1.add(radioButton[3]);
		radioButton[3].setBackground(new Color(0,0,0,0));
		
		
		 radioButton[4] = new JRadioButton("4");
		radioButton[4].setBackground(new Color(0,0,0,0));
		
		panel_1.add(radioButton[4]);
		
		 radioButton[5] = new JRadioButton("5");
		radioButton[5].setBackground(new Color(0,0,0,0));
		
		panel_1.add(radioButton[5]);
		
		 radioButton[6] = new JRadioButton("6");
		
		radioButton[6].setBackground(new Color(0,0,0,0));
		
		panel_1.add(radioButton[6]);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(155, 12, 41, 53);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		panel_2.setBackground(new Color(0,0,0,0));
		
		 radioButton[7] = new JRadioButton("7");
		radioButton[7].setBackground(new Color(0,0,0,0));
		
		panel_2.add(radioButton[7]);
		
	    radioButton[8] = new JRadioButton("8");
		radioButton[8].setBackground(new Color(0,0,0,0));
		
		panel_2.add(radioButton[8]);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 77, 123, 53);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 3, 0, 0));
		panel_3.setBackground(new Color(0,0,0,0));
		
	    radioButton[9] = new JRadioButton("9");
		radioButton[9].setBackground(new Color(0,0,0,0));
		
		panel_3.add(radioButton[9]);
		
	    radioButton[10] = new JRadioButton("10");
		radioButton[10].setBackground(new Color(0,0,0,0));
		
		panel_3.add(radioButton[10]);
		
		 radioButton[11] = new JRadioButton("11");
		radioButton[11].setBackground(new Color(0,0,0,0));
		
		panel_3.add(radioButton[11]);
		
		 radioButton[12] = new JRadioButton("12");
		radioButton[12].setBackground(new Color(0,0,0,0));
		
		panel_3.add(radioButton[12]);
		
		 radioButton[13] = new JRadioButton("13");
		radioButton[13].setBackground(new Color(0,0,0,0));
		
		panel_3.add(radioButton[13]);
		
		 radioButton[14] = new JRadioButton("14");
		radioButton[14].setBackground(new Color(0,0,0,0));
		
		panel_3.add(radioButton[14]);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(155, 77, 41, 53);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 0, 0, 0));
		panel_4.setBackground(new Color(0,0,0,0));
		
		radioButton[15] = new JRadioButton("15");
		radioButton[15].setBackground(new Color(0,0,0,0));
		
		panel_4.add(radioButton[15]);
		
		 radioButton[16] = new JRadioButton("16");
		radioButton[16].setBackground(new Color(0,0,0,0));
		panel_4.add(radioButton[16]);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(12, 142, 123, 53);
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 3, 0, 0));
		panel_5.setBackground(new Color(0,0,0,0));
		
		 radioButton[17] = new JRadioButton("17");
		radioButton[17].setBackground(new Color(0,0,0,0));
		panel_5.add(radioButton[17]);
		
		 radioButton[18] = new JRadioButton("18");
		radioButton[18].setBackground(new Color(0,0,0,0));
		panel_5.add(radioButton[18]);
		
		 radioButton[19] = new JRadioButton("19");
		radioButton[19].setBackground(new Color(0,0,0,0));
		panel_5.add(radioButton[19]);
		
		 radioButton[20] = new JRadioButton("20");
		radioButton[20].setBackground(new Color(0,0,0,0));
		panel_5.add(radioButton[20]);
		
		 radioButton[21] = new JRadioButton("21");
		radioButton[21].setBackground(new Color(0,0,0,0));
		panel_5.add(radioButton[21]);
		
		radioButton[22] = new JRadioButton("22");
		radioButton[22].setBackground(new Color(0,0,0,0));
		panel_5.add(radioButton[22]);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(12, 207, 123, 53);
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(2, 3, 0, 0));
		panel_6.setBackground(new Color(0,0,0,0));
		
		 radioButton[25] = new JRadioButton("25");
		radioButton[25].setBackground(new Color(0,0,0,0));
		panel_6.add(radioButton[25]);
		
		 radioButton[26] = new JRadioButton("26");
		radioButton[26].setBackground(new Color(0,0,0,0));
		panel_6.add(radioButton[26]);
		
		 radioButton[27] = new JRadioButton("27");
		radioButton[27].setBackground(new Color(0,0,0,0));
		panel_6.add(radioButton[27]);
		
		 radioButton[28] = new JRadioButton("28");
		radioButton[28].setBackground(new Color(0,0,0,0));
		panel_6.add(radioButton[28]);
		
		 radioButton[29] = new JRadioButton("29");
		radioButton[29].setBackground(new Color(0,0,0,0));
		panel_6.add(radioButton[29]);
		
		radioButton[30] = new JRadioButton("30");
		radioButton[30].setBackground(new Color(0,0,0,0));
		panel_6.add(radioButton[30]);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(12, 272, 123, 53);
		panel.add(panel_7);
		panel_7.setLayout(new GridLayout(2, 3, 0, 0));
		panel_7.setBackground(new Color(0,0,0,0));
		
		 radioButton[33] = new JRadioButton("33");
		radioButton[33].setBackground(new Color(0,0,0,0));
		panel_7.add(radioButton[33]);
		
		 radioButton[34] = new JRadioButton("34");
		radioButton[34].setBackground(new Color(0,0,0,0));
		panel_7.add(radioButton[34]);
		
		 radioButton[35] = new JRadioButton("35");
		radioButton[35].setBackground(new Color(0,0,0,0));
		panel_7.add(radioButton[35]);
		
		 radioButton[36] = new JRadioButton("36");
		radioButton[36].setBackground(new Color(0,0,0,0));
		panel_7.add(radioButton[36]);
		
		 radioButton[37] = new JRadioButton("37");
		radioButton[37].setBackground(new Color(0,0,0,0));
		panel_7.add(radioButton[37]);
		
		 radioButton[38] = new JRadioButton("38");
		radioButton[38].setBackground(new Color(0,0,0,0));
		panel_7.add(radioButton[38]);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(12, 337, 123, 53);
		panel.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 3, 0, 0));
		panel_8.setBackground(new Color(0,0,0,0));
		
		 radioButton[41] = new JRadioButton("41");
		radioButton[41].setBackground(new Color(0,0,0,0));
		panel_8.add(radioButton[41]);
		
		 radioButton[42] = new JRadioButton("42");
		radioButton[42].setBackground(new Color(0,0,0,0));
		panel_8.add(radioButton[42]);
		
		 radioButton[43] = new JRadioButton("43");
		radioButton[43].setBackground(new Color(0,0,0,0));
		panel_8.add(radioButton[43]);
		
		 radioButton[44] = new JRadioButton("44");
		radioButton[44].setBackground(new Color(0,0,0,0));
		panel_8.add(radioButton[44]);
		
		 radioButton[45] = new JRadioButton("45");
		radioButton[45].setBackground(new Color(0,0,0,0));
		panel_8.add(radioButton[45]);
		
		radioButton[46] = new JRadioButton("46");
		//radioButton[46].setOpaque(true);
		radioButton[46].addActionListener(this);
		radioButton[46].setBackground(new Color(255,0,0));
		//radioButton[46].setForeground(new Color(210,105,30));
		panel_8.add(radioButton[46]);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(12, 402, 123, 53);
		panel.add(panel_9);
		panel_9.setLayout(new GridLayout(2, 3, 0, 0));
		panel_9.setBackground(new Color(0,0,0,0));
		
		 radioButton[49] = new JRadioButton("49");
		radioButton[49].setBackground(new Color(0,0,0,0));
		panel_9.add(radioButton[49]);
		
		 radioButton[50] = new JRadioButton("50");
		radioButton[50].setBackground(new Color(0,0,0,0));
		panel_9.add(radioButton[50]);
		
		 radioButton[51] = new JRadioButton("51");
		radioButton[51].setBackground(new Color(0,0,0,0));
		panel_9.add(radioButton[51]);
		
		 radioButton[52] = new JRadioButton("52");
		radioButton[52].setBackground(new Color(0,0,0,0));
		panel_9.add(radioButton[52]);
		
		 radioButton[53] = new JRadioButton("53");
		radioButton[53].setBackground(new Color(0,0,0,0));
		panel_9.add(radioButton[53]);
		
		 radioButton[54] = new JRadioButton("54");
		radioButton[54].setBackground(new Color(0,0,0,0));
		panel_9.add(radioButton[54]);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(12, 467, 123, 53);
		panel.add(panel_10);
		panel_10.setLayout(new GridLayout(2, 3, 0, 0));
		panel_10.setBackground(new Color(0,0,0,0));
		
	    radioButton[57] = new JRadioButton("57");
		radioButton[57].setBackground(new Color(0,0,0,0));
		panel_10.add(radioButton[57]);
		
		 radioButton[58] = new JRadioButton("58");
		radioButton[58].setBackground(new Color(0,0,0,0));
		panel_10.add(radioButton[58]);
		
		 radioButton[59] = new JRadioButton("59");
		radioButton[59].setBackground(new Color(0,0,0,0));
		panel_10.add(radioButton[59]);
		
		 radioButton[60] = new JRadioButton("60");
		radioButton[60].setBackground(new Color(0,0,0,0));
		panel_10.add(radioButton[60]);
		
		 radioButton[61] = new JRadioButton("61");
		radioButton[61].setBackground(new Color(0,0,0,0));
		panel_10.add(radioButton[61]);
		
		 radioButton[62] = new JRadioButton("62");
		radioButton[62].setBackground(new Color(0,0,0,0));
		panel_10.add(radioButton[62]);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(12, 532, 123, 53);
		panel.add(panel_11);
		panel_11.setLayout(new GridLayout(2, 3, 0, 0));
		panel_11.setBackground(new Color(0,0,0,0));
		
		radioButton[65] = new JRadioButton("65");
		radioButton[65].setBackground(new Color(0,0,0,0));
		panel_11.add(radioButton[65]);
		
		 radioButton[66] = new JRadioButton("66");
		radioButton[66].setBackground(new Color(0,0,0,0));
		panel_11.add(radioButton[66]);
		
		 radioButton[67] = new JRadioButton("67");
		radioButton[67].setBackground(new Color(0,0,0,0));
		panel_11.add(radioButton[67]);
		
		 radioButton[68] = new JRadioButton("68");
		radioButton[68].setBackground(new Color(0,0,0,0));
		panel_11.add(radioButton[68]);
		
		 radioButton[69] = new JRadioButton("69");
		radioButton[69].setBackground(new Color(0,0,0,0));
		panel_11.add(radioButton[69]);
		
		 radioButton[70] = new JRadioButton("70");
		radioButton[70].setBackground(new Color(0,0,0,0));
		panel_11.add(radioButton[70]);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(155, 142, 41, 53);
		panel.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 1, 0, 0));
		panel_12.setBackground(new Color(0,0,0,0));
		
		 radioButton[23] = new JRadioButton("23");
		radioButton[23].setBackground(new Color(0,0,0,0));
		panel_12.add(radioButton[23]);
		
		 radioButton[24] = new JRadioButton("24");
		radioButton[24].setBackground(new Color(0,0,0,0));
		panel_12.add(radioButton[24]);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(155, 207, 41, 53);
		panel.add(panel_13);
		panel_13.setLayout(new GridLayout(2, 1, 0, 0));
		panel_13.setBackground(new Color(0,0,0,0));
		
		radioButton[31] = new JRadioButton("31");
		radioButton[31].setBackground(new Color(0,0,0,0));
		panel_13.add(radioButton[31]);
		
		radioButton[32] = new JRadioButton("32");
		radioButton[32].setBackground(new Color(0,0,0,0));
		panel_13.add(radioButton[32]);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(155, 272, 41, 53);
		panel.add(panel_14);
		panel_14.setLayout(new GridLayout(2, 1, 0, 0));
		panel_14.setBackground(new Color(0,0,0,0));
		
		radioButton[39] = new JRadioButton("39");
		radioButton[39].setBackground(new Color(0,0,0,0));
		panel_14.add(radioButton[39]);
		
		radioButton[40] = new JRadioButton("40");
		radioButton[40].setBackground(new Color(0,0,0,0));
		panel_14.add(radioButton[40]);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(155, 337, 41, 53);
		panel.add(panel_15);
		panel_15.setLayout(new GridLayout(2, 1, 0, 0));
		panel_15.setBackground(new Color(0,0,0,0));
		
		radioButton[47] = new JRadioButton("47");
		radioButton[47].setBackground(new Color(0,0,0,0));
		panel_15.add(radioButton[47]);
		
		radioButton[48] = new JRadioButton("48");
		radioButton[48].setBackground(new Color(0,0,0,0));
		panel_15.add(radioButton[48]);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(155, 402, 41, 53);
		panel.add(panel_16);
		panel_16.setLayout(new GridLayout(2, 1, 0, 0));
		panel_16.setBackground(new Color(0,0,0,0));
		
		radioButton[55] = new JRadioButton("55");
		radioButton[55].setBackground(new Color(0,0,0,0));
		panel_16.add(radioButton[55]);
		
		radioButton[56] = new JRadioButton("56");
		radioButton[56].setBackground(new Color(0,0,0,0));
		panel_16.add(radioButton[56]);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(155, 467, 41, 53);
		panel.add(panel_17);
		panel_17.setLayout(new GridLayout(2, 1, 0, 0));
		panel_17.setBackground(new Color(0,0,0,0));
		
		radioButton[63] = new JRadioButton("63");
		radioButton[63].setBackground(new Color(0,0,0,0));
		panel_17.add(radioButton[63]);
		
		radioButton[64] = new JRadioButton("64");
		radioButton[64].setBackground(new Color(0,0,0,0));
		panel_17.add(radioButton[64]);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(155, 532, 41, 53);
		panel.add(panel_18);
		panel_18.setLayout(new GridLayout(2, 1, 0, 0));
		panel_18.setBackground(new Color(0,0,0,0));
		
		 radioButton[71] = new JRadioButton("71");
		radioButton[71].setBackground(new Color(0,0,0,0));
		panel_18.add(radioButton[71]);
		
		radioButton[72] = new JRadioButton("72");
		radioButton[72].setBackground(new Color(0,0,0,0));
		panel_18.add(radioButton[72]);
		

		// panel_20 for passenger Information Panel
		JPanel panel_20 = new JPanel();
		panel_20.setBounds(388, 398, 461, 264);
		panel_20.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "-", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.add(panel_20);
		//panel_20.setLayout(new GridLayout(7,2));
		panel_20.setLayout(null);
		panel_20.setBackground(new Color(255,255,255,100));
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBackground(new Color(204, 102, 51));
		menuBar_1.setBounds(0, 0, 461, 21);
		panel_20.add(menuBar_1);

		JMenu mnPassengerInformation = new JMenu("Passenger Information");
		menuBar_1.add(mnPassengerInformation);

		
		JLabel passengerNameLabel = new JLabel("Name:");
		passengerNameLabel.setBounds(23,47,66,15);
		panel_20.add(passengerNameLabel);

		passengerNameDBLabel = new JLabel("Select A Seat");
		passengerNameDBLabel.setBounds(107,45,342,19);
		passengerNameDBLabel.setOpaque(true);
		panel_20.add(passengerNameDBLabel);

		JLabel passengerPNRLabel = new JLabel("PNR:");
		passengerPNRLabel.setBounds(23,77,66,15);
		panel_20.add(passengerPNRLabel);

		passengerPNRDBLabel = new JLabel("Select A Seat");
		passengerPNRDBLabel.setBounds(107,75,342,19);
		passengerPNRDBLabel.setOpaque(true);
		panel_20.add(passengerPNRDBLabel);

		JLabel passengerAgeLabel = new JLabel("Age:");
		passengerAgeLabel.setBounds(23,107,66,15);
		panel_20.add(passengerAgeLabel);

		passengerAgeDBLabel = new JLabel("Select A Seat");
		passengerAgeDBLabel.setBounds(107,105,342,19);
		passengerAgeDBLabel.setOpaque(true);
		panel_20.add(passengerAgeDBLabel);

		JLabel passengerStartLabel = new JLabel("From:");
		passengerStartLabel.setBounds(23,137,66,15);
		panel_20.add(passengerStartLabel);

		passengerStartDBLabel = new JLabel("Select A Seat");
		passengerStartDBLabel.setBounds(107,135,342,19);
		passengerStartDBLabel.setOpaque(true);
		panel_20.add(passengerStartDBLabel);

		JLabel passengerEndLabel = new JLabel("To:");
		passengerEndLabel.setBounds(23,167,66,15);
		panel_20.add(passengerEndLabel);

		passengerEndDBLabel = new JLabel("Select A Seat");
		passengerEndDBLabel.setBounds(107,165,342,19);
		passengerEndDBLabel.setOpaque(true);
		panel_20.add(passengerEndDBLabel);

		JLabel passengerSeatLabel = new JLabel("Seat:");
		passengerSeatLabel.setBounds(23,197,66,15);
		panel_20.add(passengerSeatLabel);

		passengerSeatDBLabel = new JLabel("Select A Seat");
		passengerSeatDBLabel.setBounds(107,195,342,19);
		passengerSeatDBLabel.setOpaque(true);
		panel_20.add(passengerSeatDBLabel);
		
		rstButton = new JButton("Reset");
		rstButton.setBounds(20,227,114,25);
		rstButton.addActionListener(this);
		panel_20.add(rstButton);

		reportButton = new JButton("Reported");
		reportButton.setBounds(175, 227, 114, 25);
		reportButton.addActionListener(this);
		panel_20.add(reportButton);
		
		syncButton = new JButton("Sync");
		syncButton.setBounds(330, 227, 114, 25);
		syncButton.addActionListener(this);
		panel_20.add(syncButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("CRIS  (1).jpg"));
		lblNewLabel.setBounds(71, 12, 98, 65);
				
		lblNewLabel.setIgnoreRepaint(true);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBounds(388, 94, 458, 276);
		frame.getContentPane().add(panel_19);
		panel_19.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Enter Passenger Information ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_19.setLayout(null);
		panel_19.setBackground(new Color(255,255,255,100));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(102, 153, 255));
		menuBar.setBounds(0, 0, 461, 21);
		menuBar.setToolTipText("Add Passenger Information \"HERE\"");
		menuBar.setFont(new Font("Add Passenger Information", Font.BOLD, 12));
		panel_19.add(menuBar);
		
		JMenu mnAddPasengerInformation = new JMenu("Add Pasenger Information");
		menuBar.add(mnAddPasengerInformation);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(23, 47, 66, 15);
		panel_19.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(107, 45, 342, 19);
		panel_19.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(23, 74, 66, 15);
		panel_19.add(lblAge);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 72, 342, 19);
		panel_19.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStart = new JLabel("Start:");
		lblStart.setBounds(23, 101, 66, 15);
		panel_19.add(lblStart);
		
		textField_2 = new JTextField();
		textField_2.setBounds(107, 99, 342, 19);
		panel_19.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDestination = new JLabel("End:");
		lblDestination.setBounds(23, 128, 66, 15);
		panel_19.add(lblDestination);
		
		textField_3 = new JTextField();
		textField_3.setBounds(107, 126, 342, 19);
		panel_19.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPnrNo = new JLabel("PNR No:");
		lblPnrNo.setBounds(23, 155, 66, 15);
		panel_19.add(lblPnrNo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(107, 153, 342, 19);
		panel_19.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSeatNo = new JLabel("Seat No:");
		lblSeatNo.setBounds(23, 182, 66, 15);
		panel_19.add(lblSeatNo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(107, 184, 27, 19);
		panel_19.add(textField_5);
		textField_5.setColumns(10);
		
		btnEnterInformation = new JButton("Clear All");
		btnEnterInformation.addActionListener(this);
		btnEnterInformation.setBounds(117, 226, 174, 25);
		panel_19.add(btnEnterInformation);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(322, 226, 114, 25);
		btnUpdate.addActionListener(this);
		panel_19.add(btnUpdate);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBounds(187, 12, 573, 65);
		frame.getContentPane().add(panel_21);
		panel_21.setBackground(new Color(0,0,0,0));
		
		JLabel lblPassengerAttendanceSystem = new JLabel("Passenger Attendance System");
		lblPassengerAttendanceSystem.setFont(new Font("Dialog", Font.BOLD, 28));
		panel_21.add(lblPassengerAttendanceSystem);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("RailLogo.png"));
		lblNewLabel_1.setBounds(778, 12, 85, 70);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBounds(0, 0, 892, 674);
		frame.getContentPane().add(panel_22);
		panel_22.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("newbackground1.jpg"));
		lblNewLabel_2.setBounds(0, 0, 868, 691);
		panel_22.add(lblNewLabel_2);

		for(int i=1 ; i<=72 ; i++){
			radioButton[i].addActionListener(this);

			if(syncLocked[i]){radioButton[i].setSelected(true); radioButton[i].setBackground(Color.green);  continue;}

			if(ifOccupied[i]){
				radioButton[i].setBackground(new Color(255,0,0));
			}
			else{
				radioButton[i].setBackground(new Color(211,211,211));
			}
		}

	}

	// Logic used
	// ifOccupied[] is array representing which seats are occupied
	// if a seat is 

	boolean CheckNewPassengerInfo(){
		// Name
		String name = textField.getText();
		if(name.length() == 0){return false;}

		// Age
		String age = textField_1.getText();
		if(age.length() == 0){return false;}
		int x = -1;
		try{
			 x = Integer.parseInt(age);
		}
		catch(Exception e){
			return false;
		}
		if(x<=0){return false;}

		// Start
		String start = textField_2.getText();
		if(start.length() == 0){return false;}

		// End
		String end = textField_3.getText();
		if(end.length() == 0){return false;}

		// PNR
		String pnr = textField_4.getText();
		if(pnr.length() == 0){return false;}

		try{
			x = Integer.parseInt(pnr);
		}
		catch(Exception e){
			return false;
		}
		if(x<=0 || !h2C.PNRPrivateKeyVerifier(x)){
			return false;
		}

		// Seat
		String seat = textField_5.getText();
		if(seat.length() == 0){return false;}

		try{
			x = Integer.parseInt(seat);
		}
		catch(Exception e){
			return false;
		}

		if(x<=0 || x>72){return false;}

		return true;
	}

	/*int PNRNo, String Name, int age, String start, String end, int seat*/


	public Passenger GeneratePassenger(){
		int pnr =  Integer.parseInt(textField_4.getText());
		String name = textField.getText();
		int age = Integer.parseInt(textField_1.getText());
		String start = textField_2.getText();
		String end = textField_3.getText();
		int seat = Integer.parseInt(textField_5.getText());
		Passenger psg = new Passenger(pnr,name,age,start,end,seat);
		return psg;
	}


	public void actionPerformed(ActionEvent e){
		for(int i=1 ; i<=72 ; i++){
			if(e.getSource() == radioButton[i]){
				System.out.println(i);
				if(!ifOccupied[i]){
					passengerPNRDBLabel.setText("");
					passengerPNRDBLabel.setText("Not Booked");
					passengerNameDBLabel.setText("Not Booked");
					passengerAgeDBLabel.setText("Not Booked");
					passengerEndDBLabel.setText("Not Booked");
					passengerStartDBLabel.setText("Not Booked");
					passengerSeatDBLabel.setText("Not Booked");
					break;	
				}
				Passenger reqPassenger = h2C.GivePassenger(i,ifOccupied);
				passengerPNRDBLabel.setText(Integer.toString(reqPassenger.PNRNo));
				passengerNameDBLabel.setText(reqPassenger.Name);
				passengerAgeDBLabel.setText(Integer.toString(reqPassenger.age));
				passengerEndDBLabel.setText(reqPassenger.end);
				passengerStartDBLabel.setText(reqPassenger.start);
				passengerSeatDBLabel.setText(Integer.toString(i));

				if(!syncLocked[i]){
					radioButton[i].setBackground(Color.red);
					reportLocked[i] = false;	
				}
				else{
					radioButton[i].setSelected(true);
				}

				// A seat can be sync locked 


			}
		}

		if(e.getSource() == rstButton){
			for(int i=1 ; i<=72 ; i++){
				if(syncLocked[i]){continue;}
				radioButton[i].setSelected(false);
				if(ifOccupied[i]){
					reportLocked[i] = false;
					radioButton[i].setBackground(Color.red);	
				}
				
			}
			passengerPNRDBLabel.setText("Select A Seat");
			passengerNameDBLabel.setText("Select A Seat");
			passengerAgeDBLabel.setText("Select A Seat");
			passengerEndDBLabel.setText("Select A Seat");
			passengerStartDBLabel.setText("Select A Seat");
			passengerSeatDBLabel.setText("Select A Seat");
		}

		if(e.getSource() == reportButton){
			for(int i=1 ; i<=72 ; i++){
				if(radioButton[i].isSelected() && ifOccupied[i]){
					radioButton[i].setBackground(Color.green);
					reportLocked[i] = true;
				}
			}
		}

		if(e.getSource() == syncButton){
			for(int i=1 ; i<=72 ; i++){
				if(reportLocked[i] && !syncLocked[i]){
					syncLocked[i] = true;
					//radioButton[i].setEnabled(false);
					radioButton[i].setSelected(true);
					Passenger psg = h2C.GivePassenger(i,ifOccupied);
					h2C.UpdateLocalDB(psg);
				}
			}
		}

		if(e.getSource() == btnUpdate){
			boolean retVal = CheckNewPassengerInfo();
			System.out.println(retVal);
			if(retVal){
				Passenger newPassenger = GeneratePassenger();

				if(!ifOccupied[newPassenger.seat] && !syncLocked[newPassenger.seat]){
					h2C.UpdateLocalIntialDB(newPassenger);
					radioButton[newPassenger.seat].setBackground(Color.red);
					ifOccupied[newPassenger.seat] = true;
				}	
			}
		}

		if(e.getSource() == btnEnterInformation){
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField_5.setText("");
		}


		/*JRadioButton jb = (JRadioButton)(e.getSource());
		System.out.println(jb.getText());*/
		
		//Passenger reqPassenger = h2C.GivePassenger(Integer.parseInt(jb.getText()));
		//jb.setOpaque(false);
		//jb.setBackground(new Color(255,0,0,50));
	}
}
