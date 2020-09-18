package Restaurant_S;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;

public class Restaurant_S extends  javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JTextField jTextField8;
	private JTextField jTextField9;
	private JTextField jTextField10;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	
	double Bangladesh1=101.80;
	double USA1=1.52;
	double Nigeria1=302.96;
	double Kenyan1=156.21;
	double Canada1=2.03;
	double Indonesia1=20746.75;
	double Brazil1=5.86;
	double Philippine1=71.74;
	double India1=100.68;
	
	protected JLabel jlblConvert1;
	private JTextField jtxtConversion;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant_S frame = new Restaurant_S();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Restaurant_S() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 890, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 11, 855, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRestaurantManagementSystem = new JLabel("Restaurant Management System");
		lblRestaurantManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblRestaurantManagementSystem.setBounds(62, 11, 734, 49);
		panel.add(lblRestaurantManagementSystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(10, 86, 466, 316);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		jTextField1 = new JTextField();
		jTextField1.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField1.setFont(new Font("Tahoma", Font.BOLD, 16));
		jTextField1.setBounds(282, 18, 165, 34);
		panel_1.add(jTextField1);
		jTextField1.setColumns(10);
		
		jTextField2 = new JTextField();
		jTextField2.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField2.setFont(new Font("Tahoma", Font.BOLD, 16));
		jTextField2.setColumns(10);
		jTextField2.setBounds(282, 68, 165, 34);
		panel_1.add(jTextField2);
		
		jTextField4 = new JTextField();
		jTextField4.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField4.setFont(new Font("Tahoma", Font.BOLD, 16));
		jTextField4.setColumns(10);
		jTextField4.setBounds(282, 119, 165, 34);
		panel_1.add(jTextField4);
		
		JLabel lblNewLabel = new JLabel("Drinks\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(20, 191, 123, 23);
		panel_1.add(lblNewLabel);
		
		JComboBox jComboBox = new JComboBox();
		jComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select an Item", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange Juice"}));
		jComboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		jComboBox.setBounds(20, 223, 165, 34);
		panel_1.add(jComboBox);
		
		JCheckBox jCheckBox6 = new JCheckBox("Tax");
		jCheckBox6.setFont(new Font("Tahoma", Font.BOLD, 16));
		jCheckBox6.setBounds(17, 286, 97, 23);
		panel_1.add(jCheckBox6);
		
		JCheckBox jCheckBox5 = new JCheckBox("Home Delivery");
		jCheckBox5.setFont(new Font("Tahoma", Font.BOLD, 16));
		jCheckBox5.setBounds(282, 286, 165, 23);
		panel_1.add(jCheckBox5);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQty.setBounds(282, 195, 89, 14);
		panel_1.add(lblQty);
		
		jTextField5 = new JTextField();
		jTextField5.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField5.setFont(new Font("Tahoma", Font.BOLD, 16));
		jTextField5.setBounds(285, 223, 162, 34);
		panel_1.add(jTextField5);
		jTextField5.setColumns(10);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger :");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblChickenBurger.setBounds(20, 18, 165, 34);
		panel_1.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal :");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblChickenBurgerMeal.setBounds(20, 68, 203, 34);
		panel_1.add(lblChickenBurgerMeal);
		
		JLabel lblBaconAndCheese = new JLabel("Bacon and Cheese burger :");
		lblBaconAndCheese.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBaconAndCheese.setBounds(20, 119, 239, 34);
		panel_1.add(lblBaconAndCheese);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(99, 178, 293, 2);
		panel_1.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(10, 413, 466, 205);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cost of Drinks :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 11, 156, 37);
		panel_2.add(lblNewLabel_1);
		
		JLabel jLabel9 = new JLabel("");
		jLabel9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jLabel9.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel9.setFont(new Font("Tahoma", Font.BOLD, 16));
		jLabel9.setBounds(238, 11, 174, 37);
		panel_2.add(jLabel9);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal :");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCostOfMeal.setBounds(10, 74, 156, 37);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery :");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCostOfDelivery.setBounds(10, 143, 156, 37);
		panel_2.add(lblCostOfDelivery);
		
		JLabel jLabel10 = new JLabel("0");
		jLabel10.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel10.setFont(new Font("Tahoma", Font.BOLD, 16));
		jLabel10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jLabel10.setBounds(238, 74, 174, 37);
		panel_2.add(jLabel10);
		
		JLabel jLabel11 = new JLabel("");
		jLabel11.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel11.setFont(new Font("Tahoma", Font.BOLD, 16));
		jLabel11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jLabel11.setBounds(238, 143, 174, 37);
		panel_2.add(jLabel11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(10, 629, 855, 81);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton jbtnTotal = new JButton("Total");
		jbtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double chickburger=Double.parseDouble(jTextField1.getText());
				double ichickburger=2.39;
				double Burger;
				Burger=(chickburger*ichickburger);
				String pmeal=String.format("%.2f", Burger);
				jLabel10.setText(pmeal);
				
				double chickburgermeal=Double.parseDouble(jTextField2.getText());
				double ichickburgermeal=4.39;
				double Burgermeal;
				Burgermeal=(chickburgermeal*ichickburgermeal);
				String pmeal1=String.format("%.2f", Burgermeal+Burger);
				jLabel10.setText(pmeal1);
				
				double cheeseburger=Double.parseDouble(jTextField4.getText());
				double icheeseburger=3.39;
				double cheeseBurger;
				cheeseBurger=(cheeseburger*icheeseburger);
				String pmeal2=String.format("%.2f", cheeseBurger+Burgermeal+Burger);
				jLabel10.setText(pmeal2);
				
				//-------------------------------Home Delivery------------------------------------------
				
				double iDelivery=3.39;
				if(jCheckBox5.isSelected())
				{
					String pdelivery=String.format("%.2f", iDelivery);
					jLabel11.setText(pdelivery);
				}
				else
				{
					jLabel11.setText("0");
				}
				
				//-------------------------------Drinks-----------------------------------------
				
				double Drinks=Double.parseDouble(jTextField5.getText());
				double Tea=1.20*Drinks;
				double AppleJuice=1.99*Drinks;
				double Cola=2.10*Drinks;
				double Coke=1.60*Drinks;
				double Coffee=2.5*Drinks;
				double IceTea=0.90*Drinks;
				double IceCoffee=1.10*Drinks;
				double OrangeJuice=1.70*Drinks;
				
				if(jComboBox.getSelectedItem().equals("Apple Juice"))
				{
					String Apple=String.format("%.2f", AppleJuice);
					jLabel9.setText(Apple);
				} 
				
				if(jComboBox.getSelectedItem().equals("Tea"))
				{
					String Tea1=String.format("%.2f", Tea);
					jLabel9.setText(Tea1);
				} 
				
				if(jComboBox.getSelectedItem().equals("Cola"))
				{
					String Cola1=String.format("%.2f", Cola);
					jLabel9.setText(Cola1);
				} 
				
				if(jComboBox.getSelectedItem().equals("Coke"))
				{
					String Coke1=String.format("%.2f", Coke);
					jLabel9.setText(Coke1);
				} 
				
				if(jComboBox.getSelectedItem().equals("Coffee"))
				{
					String Coffee1=String.format("%.2f", Coffee);
					jLabel9.setText(Coffee1);
				} 
				
				if(jComboBox.getSelectedItem().equals("Ice Tea"))
				{
					String IceTea1=String.format("%.2f", IceTea);
					jLabel9.setText(IceTea1);
				} 
				
				if(jComboBox.getSelectedItem().equals("Ice Coffee"))
				{
					String IceCoffee1=String.format("%.2f", IceCoffee);
					jLabel9.setText(IceCoffee1);
				} 
				
				if(jComboBox.getSelectedItem().equals("Orange Juice"))
				{
					String OrangeJuice1=String.format("%.2f", OrangeJuice);
					jLabel9.setText(OrangeJuice1);
				}
				
				if(jComboBox.getSelectedItem().equals("Select an Item"))
				{
					jLabel9.setText("0");
				} 
				
				//---------------------------------Tax---------------------------------------
				
				double total1=Double.parseDouble(jLabel9.getText());
				double total2=Double.parseDouble(jLabel10.getText());
				double total3=Double.parseDouble(jLabel11.getText());
			    double alltotal=(total1+total2+total3)/100;
			    
			    if(jCheckBox6.isSelected())
			    {
			    	String itotal=String.format("%.2f", alltotal);
			    	jTextField8.setText(itotal);
			    }
			    
			    //----------------------------------total--------------------------------------------
			    
			    double total4=Double.parseDouble(jTextField8.getText());
			    
			    double subtotal=(total1+total2+total3);
			    String isubtotal=String.format("%.2f", subtotal);
			    jTextField7.setText(isubtotal);
			    
			    double total=(total1+total2+total3+total4);
			    String itotal=String.format("%.2f", total);
			    jTextField9.setText(itotal);
			    
			    String itaxtotal=String.format("%.2f", total4);
			    jTextField8.setText(itaxtotal);
			    
				
			}
		});
		jbtnTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnTotal.setBounds(59, 22, 115, 36);
		panel_3.add(jbtnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabel9.setText(null);
				jLabel10.setText(null);
				jLabel11.setText(null);
				jLabel9.setText(null);
				jLabel10.setText("0");
				jLabel11.setText(null);
				jTextField1.setText(null);
				jTextField2.setText(null);
				jTextField4.setText(null);
				jTextField5.setText(null);
				jTextField6.setText(null);
				jTextField7.setText(null);
				jTextField8.setText(null);
				jTextField9.setText(null);
				jTextField10.setText(null);
				jTextField1.setText(null);
				jTextField2.setText(null);
				jTextField4.setText(null);
				jTextField5.setText(null);
				jTextField6.setText(null);
				jTextField7.setText(null);
				jTextField8.setText(null);
				jTextField9.setText(null);
				jTextField10.setText(null);
				jComboBox.setSelectedItem("Select an Item");
				jComboBox.setSelectedItem("Select an Item");
				
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(365, 22, 115, 36);
		panel_3.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBounds(665, 22, 115, 36);
		panel_3.add(btnExit);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(500, 86, 365, 316);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JComboBox jComboBox1 = new JComboBox();
		jComboBox1.setFont(new Font("Tahoma", Font.BOLD, 16));
		jComboBox1.setModel(new DefaultComboBoxModel(new String[] {"Choose One", "Bangladesh", "USA", "Nigeria", "Kenyan", "Canada", "Indonesia", "Brazil", "Philippine", "India"}));
		jComboBox1.setBounds(103, 30, 162, 37);
		panel_4.add(jComboBox1);
		
		jTextField6 = new JTextField();
		jTextField6.setHorizontalAlignment(SwingConstants.CENTER);
		jTextField6.setFont(new Font("Tahoma", Font.BOLD, 16));
		jTextField6.setColumns(10);
		jTextField6.setBounds(103, 94, 162, 34);
		panel_4.add(jTextField6);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double britishpound=Double.parseDouble(jTextField6.getText());
				if(jComboBox1.getSelectedItem().equals("Nigeria"))
				{
					String convert1=String.format("N %.2f",britishpound*Nigeria1);
					jTextField10.setText(convert1);
				}
				
				if(jComboBox1.getSelectedItem().equals("USA"))
				{
					String convert2=String.format("U$ %.2f", britishpound*USA1);
					jTextField10.setText(convert2);
				}
				
				if(jComboBox1.getSelectedItem().equals("Bangladesh"))
				{
					String convert3=String.format("T %.2f", britishpound*Bangladesh1);
					jTextField10.setText(convert3);
				}
				
				if(jComboBox1.getSelectedItem().equals("Kenyan"))
				{
					String convert4=String.format("KS %.2f", britishpound*Kenyan1);
					jTextField10.setText(convert4);
				}
				
				if(jComboBox1.getSelectedItem().equals("Indonesia"))
				{
					String convert5=String.format("IN %.2f", britishpound*Indonesia1);
					jTextField10.setText(convert5);
				}
				
				if(jComboBox1.getSelectedItem().equals("Brazil"))
				{
					String convert6=String.format("BRA %.2f", britishpound*Brazil1);
					jTextField10.setText(convert6);
				}
				
				if(jComboBox1.getSelectedItem().equals("Philippine"))
				{
					String convert7=String.format("PHP %.2f", britishpound*Philippine1);
					jTextField10.setText(convert7);
				}
				
				if(jComboBox1.getSelectedItem().equals("Canada"))
				{
					String convert8=String.format("C$ %.2f", britishpound*Canada1);
					jTextField10.setText(convert8);
				}
				
				if(jComboBox1.getSelectedItem().equals("India"))
				{
					String convert9=String.format("R %.2f", britishpound*India1);
					jTextField10.setText(convert9);
				}
				
				
				
			}
		});
		jbtnConvert.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnConvert.setBounds(34, 229, 115, 36);
		panel_4.add(jbtnConvert);
		
		JButton jbtnClose = new JButton("Clear");
		jbtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jComboBox1.setSelectedItem("Choose One");
				jComboBox1.setSelectedItem("Choose One");
				jTextField6.setText(null);
				jTextField6.setText(null);
				jTextField10.setText(null);
				jTextField10.setText(null);
			}
		});
		jbtnClose.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnClose.setBounds(210, 229, 115, 36);
		panel_4.add(jbtnClose);
		
		jTextField10 = new JTextField();
		jTextField10.setBounds(103, 163, 162, 34);
		panel_4.add(jTextField10);
		jTextField10.setHorizontalAlignment(SwingConstants.CENTER);
		jTextField10.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		jTextField10.setFont(new Font("Tahoma", Font.BOLD, 16));
		jTextField10.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_5.setBounds(500, 413, 365, 205);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblSubtotal = new JLabel("SubTotal :");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSubtotal.setBounds(10, 11, 156, 37);
		panel_5.add(lblSubtotal);
		
		JLabel lblTax = new JLabel("Tax :");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTax.setBounds(10, 79, 156, 37);
		panel_5.add(lblTax);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotal.setBounds(10, 146, 156, 37);
		panel_5.add(lblTotal);
		
		jTextField9 = new JTextField();
		jTextField9.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField9.setFont(new Font("Tahoma", Font.BOLD, 16));
		jTextField9.setColumns(10);
		jTextField9.setBounds(178, 146, 162, 34);
		panel_5.add(jTextField9);
		
		jTextField7 = new JTextField();
		jTextField7.setBounds(176, 12, 162, 34);
		panel_5.add(jTextField7);
		jTextField7.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField7.setFont(new Font("Tahoma", Font.BOLD, 16));
		jTextField7.setColumns(10);
		
		jTextField8 = new JTextField();
		jTextField8.setBounds(176, 80, 162, 34);
		panel_5.add(jTextField8);
		jTextField8.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField8.setFont(new Font("Tahoma", Font.BOLD, 16));
		jTextField8.setColumns(10);
	}
}
