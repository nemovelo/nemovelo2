package Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Canvas;
import java.awt.Label;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel buttons_bas = new JPanel();
		contentPane.add(buttons_bas, BorderLayout.SOUTH);
		buttons_bas.setBackground(new Color(240, 230, 140));
		
		JButton btnAjouterStation = new JButton("Ajouter station");
		btnAjouterStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnDtailsDuParc = new JButton("D\u00E9tails du parc");
		
		JButton btnSauvegarder = new JButton("Sauvegarder");
		
		JButton btnQuitter = new JButton("Quitter");
		buttons_bas.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		buttons_bas.add(btnAjouterStation);
		buttons_bas.add(btnDtailsDuParc);
		buttons_bas.add(btnSauvegarder);
		buttons_bas.add(btnQuitter);
		
		JPanel panel_mid = new JPanel();
		contentPane.add(panel_mid, BorderLayout.CENTER);
		
		Canvas canvas = new Canvas();
		panel_mid.add(canvas);
	}

}
