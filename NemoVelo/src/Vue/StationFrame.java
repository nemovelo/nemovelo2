package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class StationFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StationFrame frame = new StationFrame();
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
	public StationFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel_btn_stations = new JPanel();
		panel_btn_stations.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_btn_stations.setBackground(Color.WHITE);
		contentPane.add(panel_btn_stations, BorderLayout.SOUTH);

		JButton btnSuppStation = new JButton("Supprimer la station");
		btnSuppStation.setForeground(new Color(0, 0, 128));
		btnSuppStation.addActionListener(new ActionListener() {



			public void actionPerformed(ActionEvent arg0) {

				ConfirmerSuppression pop_up_confirm = new ConfirmerSuppression();

			}
		});

		JButton btnAjoutVelo = new JButton("Ajouter un/des v\u00E9lo(s)");
		btnAjoutVelo.setForeground(new Color(0, 0, 139));

		JButton btnValid = new JButton("Sauvegarder");
		btnValid.setForeground(new Color(0, 128, 0));

		JButton btnQuit = new JButton("Annuler");
		btnQuit.setForeground(new Color(165, 42, 42));
		panel_btn_stations.setLayout(new GridLayout(0, 2, 0, 0));
		panel_btn_stations.add(btnAjoutVelo);
		panel_btn_stations.add(btnSuppStation);
		panel_btn_stations.add(btnValid);
		panel_btn_stations.add(btnQuit);

		JPanel panel_tableau = new JPanel();
		contentPane.add(panel_tableau, BorderLayout.CENTER);
		panel_tableau.setLayout(null);

		JLabel lblNomStation = new JLabel("Nom de la station");
		lblNomStation.setBounds(136, 13, 121, 17);
		lblNomStation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNomStation.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tableau.add(lblNomStation);

		JLabel lblNombreDeVelo = new JLabel("V\u00E9los \u00E0 la station : ");
		lblNombreDeVelo.setBounds(35, 60, 111, 16);
		panel_tableau.add(lblNombreDeVelo);

		JLabel lblVlosMaximum = new JLabel("V\u00E9los maximum \u00E0 la station : ");
		lblVlosMaximum.setBounds(35, 120, 201, 16);
		panel_tableau.add(lblVlosMaximum);

		textField = new JTextField();
		textField.setBounds(226, 57, 116, 22);
		panel_tableau.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(226, 117, 116, 22);
		panel_tableau.add(textField_1);
	}
}