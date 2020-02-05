package windowBuilder.pupr.edu.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import windowBuilder.pupr.edu.common;

public class FirstWbGUI extends JFrame
{

	private JPanel cpMain;
	private final ButtonGroup bgBackColor = new ButtonGroup();
	private JButton btnCalculateArea;
	private JTextField tfRadius;
	private JLabel lblAreaResult;
	private JRadioButton rbBlue;
	private JRadioButton rbRed;
	private JRadioButton rbGreen;
	private JPanel pnDisp;
	private JComboBox cbImageSelect;
	private JLabel lblImage;

	//////////////////////////////////////////
	//Variables necessary to do calculations.
	//////////////////////////////////////////
	private double radius;
	private double pi = 3.14;
	private double res;
	private int ico;
	private String icon;
	private String[] imgStrings = {"Dog", "Cat", "Bird", "Pig", "Rabbit", "Bug1", "Bug2", "Bug3", "BugAnim"};
	private JMenuItem mniCreator;

	/////////////////////////////////////////////////////
	///This returns the image to lblImageSelect
	/////////////////////////////////////////////////////
	public void updateLabel(String imgStrings) 
	{
		if (imgStrings == "Dog") 
		{
			lblImage.setIcon(new ImageIcon(FirstWbGUI.class.getResource("/windowBuilder/pupr/edu/resources/dog_125.gif")));
		}
		if (imgStrings == "Cat")
		{
			lblImage.setIcon(new ImageIcon(FirstWbGUI.class.getResource("/windowBuilder/pupr/edu/resources/cat_125.gif")));
		}
		if (imgStrings == "Bird")
		{
			lblImage.setIcon(new ImageIcon(FirstWbGUI.class.getResource("/windowBuilder/pupr/edu/resources/bird_125.gif")));
		}
		if (imgStrings == "Pig")
		{
			lblImage.setIcon(new ImageIcon(FirstWbGUI.class.getResource("/windowBuilder/pupr/edu/resources/pig_121x129.gif")));
		}
		if (imgStrings == "Rabbit")
		{
			lblImage.setIcon(new ImageIcon(FirstWbGUI.class.getResource("/windowBuilder/pupr/edu/resources/Rabbit_125.gif")));
		}
		if (imgStrings == "Bug1")
		{
			lblImage.setIcon(new ImageIcon(FirstWbGUI.class.getResource("/windowBuilder/pupr/edu/resources/bug_40x42.gif")));
		}
		if (imgStrings == "Bug2")
		{
			lblImage.setIcon(new ImageIcon(FirstWbGUI.class.getResource("/windowBuilder/pupr/edu/resources/bug2_40x42.gif")));
		}
		if (imgStrings == "Bug3")
		{
			lblImage.setIcon(new ImageIcon(FirstWbGUI.class.getResource("/windowBuilder/pupr/edu/resources/travelbug_74x62.gif")));
		}
		if (imgStrings == "BugAnim")
		{
			lblImage.setIcon(new ImageIcon(FirstWbGUI.class.getResource("/windowBuilder/pupr/edu/resources/buganim_60x58.gif")));
		}
	}
	
	
	////////////////////////////////////////
	////Launch the application.
	////////////////////////////////////////
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
					FirstWbGUI frame = new FirstWbGUI();
					frame.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	 ///////////////////////////////////////////////
	 ////Create the frame.
	 ///////////////////////////////////////////////
	public FirstWbGUI() 
	{
		setTitle("ExamII");	
		initComponents();
		createEvents();
		
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	//This contains all of the code for creating events.
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	private void createEvents() 
	{
		
		btnCalculateArea.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
			
				
				radius=Double.parseDouble(tfRadius.getText());
				
				res=pi*radius*radius;
				
				lblAreaResult.setText(Double.toString(res));
				}
				
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
				
			}
		});
		
	
		rbBlue.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg1)
			{
				if (arg1.getSource() == rbBlue)
				{
					pnDisp.setBackground(Color.BLUE);
				}
			}
			
		});
		
		rbRed.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg1)
			{
				
				if (arg1.getSource() == rbRed)
				{
					pnDisp.setBackground(Color.RED);
				}
			}
		});
		
		rbGreen.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg1)
			{
				
				if (arg1.getSource() == rbGreen)
				{
					pnDisp.setBackground(Color.GREEN);
				}
			}
		});
		
		
		cbImageSelect.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg2) 
			{
				ico = cbImageSelect.getSelectedIndex();
				updateLabel(imgStrings[ico]);
			}
		});
		

		mniCreator.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "This program was created by Carlos J. Marcano\nFrom the Polytechnic University of Puerto Rico\nOn Feb 4, 2020 \n*SEALED* 9:40PM\n STUDENT #104163\ncarlosjosemarcano@gmail.com");
			}
		});
		
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	//This contains all of the code for initializing and creating components.
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	private void initComponents() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		mniCreator = new JMenuItem("Creator");
		mnAbout.add(mniCreator);
		cpMain = new JPanel();
		cpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpMain);
		
		JPanel pnMath = new JPanel();
		pnMath.setBorder(new TitledBorder(null, "Math", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel pnColor = new JPanel();
		pnColor.setBorder(new TitledBorder(null, "Colors", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "List", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel pnImageSelect = new JPanel();
		pnImageSelect.setBorder(new TitledBorder(null, "Image Selection", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		
		//////////////////////////////////////
		//Combo Box Initialization
		//////////////////////////////////////
		cbImageSelect = new JComboBox();
		cbImageSelect.setModel(new DefaultComboBoxModel(new String[] {"Dog", "Cat", "Bird", "Pig", "Rabbit", "Bug1", "Bug2", "Bug3", "BugAnim"}));
		
		
		//////////////////////////////////////
		//Image label init.
		/////////////////////////////////////
		lblImage = new JLabel();
		lblImage.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblImage.setName("lblImage");
		updateLabel(imgStrings[cbImageSelect.getSelectedIndex()]);
		GroupLayout gl_pnImageSelect = new GroupLayout(pnImageSelect);
		gl_pnImageSelect.setHorizontalGroup(
			gl_pnImageSelect.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnImageSelect.createSequentialGroup()
					.addContainerGap()
					.addComponent(cbImageSelect, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(152, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_pnImageSelect.createSequentialGroup()
					.addContainerGap(180, Short.MAX_VALUE)
					.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		gl_pnImageSelect.setVerticalGroup(
			gl_pnImageSelect.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnImageSelect.createSequentialGroup()
					.addContainerGap()
					.addComponent(cbImageSelect, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_pnImageSelect.createSequentialGroup()
					.addContainerGap(41, Short.MAX_VALUE)
					.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(9))
		);
		pnImageSelect.setLayout(gl_pnImageSelect);
		GroupLayout gl_cpMain = new GroupLayout(cpMain);
		gl_cpMain.setHorizontalGroup(
			gl_cpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cpMain.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_cpMain.createParallelGroup(Alignment.LEADING)
						.addComponent(pnMath, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnImageSelect, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_cpMain.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
						.addComponent(pnColor, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_cpMain.setVerticalGroup(
			gl_cpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cpMain.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_cpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(pnColor, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnMath, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addGroup(gl_cpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(pnImageSelect, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(256, Short.MAX_VALUE))
		);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(27)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Dog", "Cat", "Bird", "Pig", "Rabbit", "Bug1", "Bug2", "Bug3", "BugAnim"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setColumnHeaderView(list);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblBackground = new JLabel("Background: ");
		
		rbBlue = new JRadioButton("Blue");
		
		bgBackColor.add(rbBlue);
		
		rbRed = new JRadioButton("Red");
		rbRed.setSelected(true);
		bgBackColor.add(rbRed);
		
		rbGreen = new JRadioButton("Green");
		bgBackColor.add(rbGreen);
		
		pnDisp = new JPanel();
		pnDisp.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnDisp.setBackground(Color.RED);
		GroupLayout gl_pnColor = new GroupLayout(pnColor);
		gl_pnColor.setHorizontalGroup(
			gl_pnColor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnColor.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnColor.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBackground)
						.addComponent(rbBlue)
						.addComponent(rbRed)
						.addComponent(rbGreen))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addComponent(pnDisp, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(40))
		);
		gl_pnColor.setVerticalGroup(
			gl_pnColor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnColor.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnColor.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnDisp, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnColor.createSequentialGroup()
							.addComponent(lblBackground)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rbBlue)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rbRed)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rbGreen)))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		pnColor.setLayout(gl_pnColor);
		
		JLabel lblRadius = new JLabel("Radius: ");
		
		tfRadius = new JTextField();
		tfRadius.setText("0000");
		tfRadius.setColumns(10);
		
		JLabel lblAreaForm = new JLabel("A = π r²");
		lblAreaForm.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		
		btnCalculateArea = new JButton("Calculate Area");

		
		JLabel lblArea = new JLabel("Area: ");
		
		lblAreaResult = new JLabel("n/a");
		lblAreaResult.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblAreaResult.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		GroupLayout gl_pnMath = new GroupLayout(pnMath);
		gl_pnMath.setHorizontalGroup(
			gl_pnMath.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMath.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnMath.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnMath.createSequentialGroup()
							.addComponent(lblRadius)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfRadius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAreaForm)
						.addComponent(btnCalculateArea)
						.addGroup(gl_pnMath.createSequentialGroup()
							.addComponent(lblArea)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblAreaResult)))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		gl_pnMath.setVerticalGroup(
			gl_pnMath.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMath.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnMath.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRadius)
						.addComponent(tfRadius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAreaForm)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCalculateArea)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnMath.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblArea)
						.addComponent(lblAreaResult))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		pnMath.setLayout(gl_pnMath);
		cpMain.setLayout(gl_cpMain);
		
		
	}
}
