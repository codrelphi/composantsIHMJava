package demo2Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField tfNom;
	private JLabel lblPrenom;
	private JTextField tfPrenom;
	private JButton btnOk;
	private JButton btnClear;
	private JLabel lblIdentite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Window Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNom = new JLabel("NOM: ");
		lbNom.setBounds(33, 63, 63, 20);
		lbNom.setHorizontalAlignment(SwingConstants.LEFT);
		lbNom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbNom.setForeground(Color.BLACK);
		contentPane.add(lbNom);
		
		tfNom = new JTextField();
		tfNom.setBounds(129, 65, 164, 20);
		contentPane.add(tfNom);
		tfNom.setColumns(10);
		
		lblPrenom = new JLabel("PRENOM: ");
		lblPrenom.setBounds(33, 94, 82, 20);
		lblPrenom.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblPrenom);
		
		tfPrenom = new JTextField();
		tfPrenom.setBounds(129, 96, 164, 20);
		contentPane.add(tfPrenom);
		tfPrenom.setColumns(10);

		
		btnOk = new JButton("OK");
		btnOk.setBounds(129, 183, 61, 23);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tfNom
				//tfPrenom
				//lblIdentite
				String identite = tfNom.getText() + " " + tfPrenom.getText();
				lblIdentite.setText(identite);
			}
		});
		contentPane.add(btnOk);
		
		btnClear = new JButton("Effacer");
		btnClear.setBounds(211, 183, 82, 23);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tfNom
				//tfPrenom
				tfNom.setText("");
				tfPrenom.setText("");
				lblIdentite.setText("");
			}
		});
		contentPane.add(btnClear);
		
		JLabel lblNewLabel = new JLabel("BIENVENUE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(132, 11, 233, 43);
		contentPane.add(lblNewLabel);
		
		lblIdentite = new JLabel("");
		lblIdentite.setForeground(Color.RED);
		lblIdentite.setBounds(129, 143, 186, 14);
		contentPane.add(lblIdentite);
	}
}
