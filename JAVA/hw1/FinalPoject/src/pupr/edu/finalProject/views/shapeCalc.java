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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.border.EtchedBorder;

public class shapeCalc extends JFrame 
{

	private JPanel cpMain;
	private JMenuItem miCone;
	private JMenuItem miCylinder;
	private JMenuItem miExit;
	private JLayeredPane lpCone;
	private JLayeredPane lpCylinder;
	private JTextField tfHeightCyl;
	private JTextField tfRadCyl;

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
		setBounds(100, 100, 680, 800);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		miCone = new JMenuItem("Cone");
		mnFile.add(miCone);
		
		miCylinder = new JMenuItem("Cylinder");
		mnFile.add(miCylinder);
		
		miExit = new JMenuItem("Exit");
		mnFile.add(miExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem miHelpCont = new JMenuItem("Help Contents");
		mnHelp.add(miHelpCont);
		
		JMenuItem miAbout = new JMenuItem("About");
		mnHelp.add(miAbout);
		cpMain = new JPanel();
		cpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpMain);
		
		lpCylinder = new JLayeredPane();
		lpCylinder.setVisible(false);
		
		lpCone = new JLayeredPane();
		lpCone.setVisible(false);
		
		JLabel lblCone = new JLabel("Cone: ");
		lblCone.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblConeImg = new JLabel("");
		lblConeImg.setIcon(new ImageIcon(shapeCalc.class.getResource("/pupr/edu/finalProject/resources/cone.png")));
		GroupLayout gl_lpCone = new GroupLayout(lpCone);
		gl_lpCone.setHorizontalGroup(
			gl_lpCone.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_lpCone.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCone)
					.addPreferredGap(ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
					.addComponent(lblConeImg)
					.addContainerGap())
		);
		gl_lpCone.setVerticalGroup(
			gl_lpCone.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_lpCone.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_lpCone.createParallelGroup(Alignment.LEADING)
						.addComponent(lblConeImg)
						.addComponent(lblCone))
					.addContainerGap(181, Short.MAX_VALUE))
		);
		lpCone.setLayout(gl_lpCone);
		GroupLayout gl_cpMain = new GroupLayout(cpMain);
		gl_cpMain.setHorizontalGroup(
			gl_cpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_cpMain.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_cpMain.createParallelGroup(Alignment.TRAILING)
						.addComponent(lpCone, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
						.addComponent(lpCylinder, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_cpMain.setVerticalGroup(
			gl_cpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cpMain.createSequentialGroup()
					.addComponent(lpCylinder, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lpCone, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblCyl = new JLabel("Cylinder: ");
		lblCyl.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		lblCyl.setName("lblCylinder");
		
		JLabel lblCylImg = new JLabel("");
		lblCylImg.setIcon(new ImageIcon(shapeCalc.class.getResource("/pupr/edu/finalProject/resources/cylinder.png")));
		
		JLabel lblHeightCyl = new JLabel("Height: ");
		
		JLabel lblRadCyl = new JLabel("Radius: ");
		
		tfHeightCyl = new JTextField();
		tfHeightCyl.setColumns(10);
		
		tfRadCyl = new JTextField();
		tfRadCyl.setColumns(10);
		
		JButton btnCalcCyl = new JButton("Calculate");
		
		JCheckBox cbAreaCyl = new JCheckBox("Area");
		
		JCheckBox cbVolumeCyl = new JCheckBox("Volume");
		
		JLabel lblResCyl = new JLabel("Result = ");
		
		JLabel lblResFieldCyl = new JLabel("n/a");
		lblResFieldCyl.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		lblResFieldCyl.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_lpCylinder = new GroupLayout(lpCylinder);
		gl_lpCylinder.setHorizontalGroup(
			gl_lpCylinder.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_lpCylinder.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_lpCylinder.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_lpCylinder.createSequentialGroup()
							.addGroup(gl_lpCylinder.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCyl)
								.addGroup(gl_lpCylinder.createSequentialGroup()
									.addComponent(lblHeightCyl)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfHeightCyl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_lpCylinder.createSequentialGroup()
									.addComponent(lblRadCyl)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_lpCylinder.createParallelGroup(Alignment.LEADING)
										.addComponent(btnCalcCyl)
										.addComponent(tfRadCyl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addGroup(gl_lpCylinder.createParallelGroup(Alignment.LEADING)
								.addComponent(cbAreaCyl)
								.addComponent(cbVolumeCyl))
							.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
							.addComponent(lblCylImg))
						.addGroup(gl_lpCylinder.createSequentialGroup()
							.addComponent(lblResCyl)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblResFieldCyl)))
					.addContainerGap())
		);
		gl_lpCylinder.setVerticalGroup(
			gl_lpCylinder.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_lpCylinder.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_lpCylinder.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCylImg)
						.addGroup(gl_lpCylinder.createSequentialGroup()
							.addComponent(lblCyl)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_lpCylinder.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHeightCyl)
								.addComponent(tfHeightCyl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbAreaCyl))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_lpCylinder.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRadCyl)
								.addComponent(tfRadCyl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbVolumeCyl))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCalcCyl)))
					.addGap(21)
					.addGroup(gl_lpCylinder.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResCyl)
						.addComponent(lblResFieldCyl))
					.addContainerGap(168, Short.MAX_VALUE))
		);
		lpCylinder.setLayout(gl_lpCylinder);
		cpMain.setLayout(gl_cpMain);
		
	}
	
	
	/////////////////////////////////
	///Creates events and handles them.
	/////////////////////////////////
	private void createEvents()
	{
		miCone.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
					lpCylinder.setVisible(false);
					lpCone.setVisible(true);
			}
		});
		
		miCylinder.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				lpCone.setVisible(false);
				lpCylinder.setVisible(true);
			}
		});
		
		
	}
}
