package java_odev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class java_odev {

	private JFrame frmYaziDuzenleme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					java_odev window = new java_odev();
					window.frmYaziDuzenleme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public java_odev() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmYaziDuzenleme = new JFrame();
		frmYaziDuzenleme.getContentPane().setBackground(new Color(221, 160, 221));
		frmYaziDuzenleme.setTitle("Yazi Duzenleme");
		frmYaziDuzenleme.setBounds(100, 100, 737, 496);
		frmYaziDuzenleme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmYaziDuzenleme.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("Bu alana yaz\u0131lan yaz\u0131y\u0131 se\u00E7ilen font ve size a g\u00F6re ayarlayan program");
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textArea.setBounds(125, 103, 554, 228);
		frmYaziDuzenleme.getContentPane().add(textArea);
		
		JRadioButton radiob1 = new JRadioButton("12");
		radiob1.setBackground(new Color(221, 160, 221));
		radiob1.setFont(new Font("Tahoma", Font.BOLD, 12));
		radiob1.setBounds(22, 103, 77, 41);
		frmYaziDuzenleme.getContentPane().add(radiob1);
		
		JRadioButton radiob2 = new JRadioButton("14");
		radiob2.setBackground(new Color(221, 160, 221));
		radiob2.setFont(new Font("Tahoma", Font.BOLD, 14));
		radiob2.setBounds(22, 149, 77, 41);
		frmYaziDuzenleme.getContentPane().add(radiob2);
		
		JRadioButton radiob3 = new JRadioButton("16");
		radiob3.setBackground(new Color(221, 160, 221));
		radiob3.setFont(new Font("Tahoma", Font.BOLD, 16));
		radiob3.setBounds(22, 191, 77, 41);
		frmYaziDuzenleme.getContentPane().add(radiob3);
		
		JRadioButton radiob4 = new JRadioButton("18");
		radiob4.setBackground(new Color(221, 160, 221));
		radiob4.setFont(new Font("Tahoma", Font.BOLD, 18));
		radiob4.setBounds(22, 239, 77, 41);
		frmYaziDuzenleme.getContentPane().add(radiob4);
		
		JRadioButton radiob5 = new JRadioButton("20");
		radiob5.setBackground(new Color(221, 160, 221));
		radiob5.setFont(new Font("Tahoma", Font.BOLD, 20));
		radiob5.setBounds(22, 290, 77, 41);
		frmYaziDuzenleme.getContentPane().add(radiob5);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(radiob1);
		bg.add(radiob2);
		bg.add(radiob3);
		bg.add(radiob4);
		bg.add(radiob5);
		
		
		JCheckBox checkbox1 = new JCheckBox("Bold");
		checkbox1.setFont(new Font("Tahoma", Font.BOLD, 27));
		checkbox1.setBackground(new Color(221, 160, 221));
		checkbox1.setBounds(172, 47, 107, 34);
		frmYaziDuzenleme.getContentPane().add(checkbox1);
		
		JCheckBox checkbox2 = new JCheckBox("\u0130talik");
		checkbox2.setFont(new Font("Tahoma", Font.ITALIC, 27));
		checkbox2.setBackground(new Color(221, 160, 221));
		checkbox2.setBounds(307, 47, 107, 34);
		frmYaziDuzenleme.getContentPane().add(checkbox2);
		

		
		JButton btn1 = new JButton("D\u00FCzenle");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int size = 13;
				if(radiob1.isSelected()){
					size=12;
				}
				else if(radiob2.isSelected()){
					size=14;
				}
				else if(radiob3.isSelected()){
					size=16;
				}
				else if(radiob4.isSelected()){
					size=18;
				}
				else if(radiob5.isSelected()){
					size=20;
				}
				
				if(checkbox1.isSelected() == true && checkbox2.isSelected() == true){
					textArea.setFont(new Font("Tahoma", Font.ITALIC | Font.BOLD,size));
				}
				else if(checkbox1.isSelected() == true){
				    textArea.setFont(new Font("Tahoma", Font.BOLD,size)); 
				}		
				else if(checkbox2.isSelected() == true){
					textArea.setFont(new Font("Tahoma", Font.ITALIC,size)); 
					}
				else{
					textArea.setFont(new Font("Tahoma",Font.PLAIN,size));
				};
			}
		
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn1.setBounds(326, 339, 171, 41);
		frmYaziDuzenleme.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("\u00C7IKI\u015E");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn2.setBounds(508, 339, 171, 41);
		frmYaziDuzenleme.getContentPane().add(btn2);
	}

}
