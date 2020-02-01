package pupr.edu.hw6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JInternalFrame;

public class Hw6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtJanuary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hw6 frame = new Hw6();
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
	public Hw6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 100);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(700, 100));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("Month: ");
		panel.add(lblNewLabel_2);
		
		txtJanuary = new JTextField();
		txtJanuary.setText("1");
		panel.add(txtJanuary);
		txtJanuary.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Day: ");
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setText("31");
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Year: ");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText("2002");
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Day Of Week");
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("The day of the week was Tuesday.");
		panel.add(lblNewLabel_3);
		
		JInternalFrame internalFrame = new JInternalFrame("DAY OF WEEK");
		internalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		internalFrame.setResizable(true);
		internalFrame.setClosable(true);
		internalFrame.setMaximizable(true);
		contentPane.add(internalFrame, BorderLayout.NORTH);
		internalFrame.setVisible(true);
	}

}
