package DateTime;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.*;
import java.awt.Color;
public class SimpleDateTime {

	private JFrame frame;
	private JLabel lblClock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleDateTime window = new SimpleDateTime();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void datetime() {
		Thread datetime=new Thread()
				{
			    	public void run()
			    	{
			    		try {
			    			for(;;) {
			    				Calendar cal=new GregorianCalendar(); 
			    				int day=cal.get(Calendar.DAY_OF_MONTH);
			    				int month=cal.get(Calendar.MONTH);
			    				int year=cal.get(Calendar.YEAR);
			    				
			    				int second=cal.get(Calendar.SECOND);
			    				int minutes=cal.get(Calendar.MINUTE);
			    				int hour=cal.get(Calendar.HOUR);
			    				
			    				lblClock.setText("Time "+hour+" : "+minutes+" : "+second+"  "+"Date  "+year+"/"+month+"/"+day);
			    				
			    				sleep(1000);
			    			}
			    		}
			    		catch(Exception e) {
			    			
			    		}
			    		
			    	}
			    		
				};
			datetime.start();
	}
	

	/**
	 * Create the application.
	 */
	public SimpleDateTime() {
		initialize();
		datetime();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.setBounds(100, 100, 568, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    lblClock = new JLabel("Clock");
		lblClock.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblClock.setBounds(36, 73, 375, 98);
		frame.getContentPane().add(lblClock);
	}

}
