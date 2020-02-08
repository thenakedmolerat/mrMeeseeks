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
import javax.swing.JOptionPane;

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

import pupr.edu.finalProject.common.Cone;
import pupr.edu.finalProject.common.Cylinder;

import javax.swing.ButtonGroup;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class shapeCalc extends JFrame 
{
	private Cone cone = new Cone();
	private Cylinder cylinder = new Cylinder();
	private JPanel cpMain;
	private JMenuItem miCone;
	private JMenuItem miCylinder;
	private JMenuItem miExit;
	private JLayeredPane lpCone;
	private JLayeredPane lpCylinder;
	private JTextField tfHeightCyl;
	private JTextField tfRadCyl;
	private JTextField tfHeightCone;
	private JTextField tfRadCone;
	private final ButtonGroup bgArNVolCyl = new ButtonGroup();
	private final ButtonGroup bgArNVolCon = new ButtonGroup();
	private JCheckBox cbAreaCyl;
	private JCheckBox cbVolumeCyl;
	private JButton btnCalcCyl;
	private JLabel lblResFieldCyl;
	private JLabel lblRadCyl;
	private JLabel lblHeightCyl;
	private JLabel lblCyl;
	private JLabel lblResCyl;
	private JLabel lblCylImg;
	private JLabel lblCone;
	private JLabel lblHeightCone;
	private JLabel lblRadCone;
	private JButton btnCalcCone;
	private JLabel lblResFieldCone;
	private JLabel lblResCone;
	private JCheckBox cbAreaCone;
	private JCheckBox cbVolumeCone;
	private JLabel lblConeImg;

	////////////////////////////////
	///Launch the application.
	////////////////////////////////
	public static void main(String[] args) 
	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
		setBounds(100, 100, 800, 474);
		
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
		
		lblCone = new JLabel("Cone: ");
		lblCone.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		
		lblConeImg = new JLabel("");
		lblConeImg.setIcon(new ImageIcon(shapeCalc.class.getResource("/edu/pupr/finalProyect/resources/cone.png")));
		
		lblHeightCone = new JLabel("Height: ");
		
		lblRadCone = new JLabel("Radius: ");
		
		tfHeightCone = new JTextField();
		tfHeightCone.setText("0");
		tfHeightCone.setColumns(10);
		
		tfRadCone = new JTextField();
		tfRadCone.setText("0");
		tfRadCone.setColumns(10);
		
		cbAreaCone = new JCheckBox("Area");
		bgArNVolCon.add(cbAreaCone);
		
		cbVolumeCone = new JCheckBox("Volume");
		bgArNVolCon.add(cbVolumeCone);
		
		btnCalcCone = new JButton("Calculate");
		btnCalcCone.setSelected(true);
		
		lblResCone = new JLabel("Result = ");
		
		lblResFieldCone = new JLabel("n/a");
		lblResFieldCone.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		lblResFieldCone.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_lpCone = new GroupLayout(lpCone);
		gl_lpCone.setHorizontalGroup(
			gl_lpCone.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_lpCone.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_lpCone.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_lpCone.createSequentialGroup()
							.addGroup(gl_lpCone.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCone)
								.addComponent(lblHeightCone)
								.addComponent(lblRadCone))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_lpCone.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_lpCone.createSequentialGroup()
									.addGroup(gl_lpCone.createParallelGroup(Alignment.LEADING)
										.addComponent(tfHeightCone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(tfRadCone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_lpCone.createParallelGroup(Alignment.LEADING)
										.addComponent(cbVolumeCone)
										.addComponent(cbAreaCone)))
								.addComponent(btnCalcCone)))
						.addGroup(gl_lpCone.createSequentialGroup()
							.addComponent(lblResCone)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblResFieldCone)))
					.addPreferredGap(ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
					.addComponent(lblConeImg)
					.addContainerGap())
		);
		gl_lpCone.setVerticalGroup(
			gl_lpCone.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_lpCone.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_lpCone.createParallelGroup(Alignment.LEADING)
						.addComponent(lblConeImg)
						.addGroup(gl_lpCone.createSequentialGroup()
							.addComponent(lblCone)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_lpCone.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHeightCone)
								.addComponent(tfHeightCone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbAreaCone))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_lpCone.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRadCone)
								.addComponent(tfRadCone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbVolumeCone))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCalcCone)
							.addGap(18)
							.addGroup(gl_lpCone.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblResCone)
								.addComponent(lblResFieldCone))))
					.addContainerGap(173, Short.MAX_VALUE))
		);
		lpCone.setLayout(gl_lpCone);
		GroupLayout gl_cpMain = new GroupLayout(cpMain);
		gl_cpMain.setHorizontalGroup(
			gl_cpMain.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_cpMain.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_cpMain.createParallelGroup(Alignment.LEADING)
						.addComponent(lpCone, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
						.addComponent(lpCylinder, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_cpMain.setVerticalGroup(
			gl_cpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cpMain.createSequentialGroup()
					.addComponent(lpCylinder, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lpCone, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(232, Short.MAX_VALUE))
		);
		
		lblCyl = new JLabel("Cylinder: ");
		lblCyl.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		lblCyl.setName("lblCylinder");
		
		lblCylImg = new JLabel("");
		lblCylImg.setIcon(new ImageIcon(shapeCalc.class.getResource("/edu/pupr/finalProyect/resources/cylinder.png")));
		
		lblHeightCyl = new JLabel("Height: ");
		
		lblRadCyl = new JLabel("Radius: ");
		
		tfHeightCyl = new JTextField();
		tfHeightCyl.setText("0");
		tfHeightCyl.setColumns(10);
		
		tfRadCyl = new JTextField();
		tfRadCyl.setText("0");
		tfRadCyl.setColumns(10);
		
		btnCalcCyl = new JButton("Calculate");
		btnCalcCyl.setSelected(true);
		
		cbAreaCyl = new JCheckBox("Area");
		
		bgArNVolCyl.add(cbAreaCyl);
		
		cbVolumeCyl = new JCheckBox("Volume");
		bgArNVolCyl.add(cbVolumeCyl);
		
		lblResCyl = new JLabel("Result = ");
		
		lblResFieldCyl = new JLabel("n/a");
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
								.addComponent(lblHeightCyl)
								.addGroup(gl_lpCylinder.createSequentialGroup()
									.addComponent(lblRadCyl)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_lpCylinder.createParallelGroup(Alignment.LEADING)
										.addComponent(btnCalcCyl)
										.addGroup(gl_lpCylinder.createParallelGroup(Alignment.TRAILING)
											.addComponent(tfHeightCyl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(tfRadCyl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
							.addGap(18)
							.addGroup(gl_lpCylinder.createParallelGroup(Alignment.LEADING)
								.addComponent(cbAreaCyl)
								.addComponent(cbVolumeCyl))
							.addPreferredGap(ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
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
								.addComponent(cbAreaCyl)
								.addComponent(tfHeightCyl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
					.addContainerGap(167, Short.MAX_VALUE))
		);
		lpCylinder.setLayout(gl_lpCylinder);
		cpMain.setLayout(gl_cpMain);
		
	}
	
	
	/////////////////////////////////
	///Creates events and handles them.
	/////////////////////////////////
	private void createEvents()
	{
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCalcCone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbAreaCone.isSelected()) {
					cone.calculateArea();
					lblResFieldCone.setText(Double.toString(cone.getArea()));
				}
				else if (cbVolumeCone.isSelected()) {
					cone.calculateVolume();
					lblResFieldCone.setText(Double.toString(cone.getVolume()));
				}
			}
		});
		btnCalcCyl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbAreaCyl.isSelected()) {
					cylinder.calculateArea();
					lblResFieldCyl.setText(Double.toString(cylinder.getArea()));
				}
				else if (cbVolumeCyl.isSelected())
				{
					cylinder.calculateVolume();
					lblResFieldCyl.setText(Double.toString(cylinder.getVolume()));
				}
			}
		});
		tfHeightCyl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double temp = Double.parseDouble(tfHeightCyl.getText());
					cylinder.setHeight(temp);
				} catch (NumberFormatException numberFormatException) {
					JOptionPane.showMessageDialog(null, "Invalid height. Please, enter a valid floating-point number.");
				}
			}
		});
		tfRadCyl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double temp = Double.parseDouble(tfRadCyl.getText());
					cylinder.setRadius(temp);
				} catch (NumberFormatException numberFormatException) {
					JOptionPane.showMessageDialog(null, "Invalid radius. Please, enter a valid floating-point number.");
				}
			}
		});
		tfHeightCone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double temp = Double.parseDouble(tfHeightCone.getText());
					cone.setHeight(temp);
				} catch (NumberFormatException numberFormatException) {
					JOptionPane.showMessageDialog(null, "Invalid height. Please, enter a valid floating-point number.");
				}
			}
		});
		tfRadCone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double temp = Double.parseDouble(tfRadCone.getText());
					cone.setRadius(temp);
				} catch (NumberFormatException numberFormatException) {
					JOptionPane.showMessageDialog(null, "Invalid radius. Please, enter a valid floating-point number.");
				}
			}
		});
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