package pupr.edu.finalProject.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class shapeCalc extends JFrame 
{

	private JPanel contentPane;

	////////////////////////////////
	///Launch the application.
	////////////////////////////////
	public static void main(String[] args) 
	{
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try 
				{
					shapeCalc frame = new shapeCalc();
					frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	////////////////////////////////
	///Creates JFrame
	////////////////////////////////
	public shapeCalc() 
	{
		////////////////////////////
		///Organize stuff by events and components
		////////////////////////////
		initComponents();
		createEvents();
	}
	
	
	/////////////////////////////////
	///Initializes components.
	/////////////////////////////////
	private void initComponents()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem miCone = new JMenuItem("Cone");
		mnFile.add(miCone);
		
		JMenuItem miCylinder = new JMenuItem("Cylinder");
		mnFile.add(miCylinder);
		
		JMenuItem miExit = new JMenuItem("Exit");
		mnFile.add(miExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem miHelpCont = new JMenuItem("Help Contents");
		mnHelp.add(miHelpCont);
		
		JMenuItem miAbout = new JMenuItem("About");
		mnHelp.add(miAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 666, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 711, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	
	/////////////////////////////////
	///Creates events and handles them.
	/////////////////////////////////
	private void createEvents()
	{
		
	}

}
