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
		
		JPanel buttons_panel = new JPanel();
		contentPane.add(buttons_panel, BorderLayout.SOUTH);
		buttons_panel.setBackground(new Color(240, 230, 140));
		
		JButton btnAjouterStation = new JButton("Ajouter station");
		btnAjouterStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnDtailsDuParc = new JButton("D\u00E9tails du parc");
		
		JButton btnSauvegarder = new JButton("Sauvegarder");
		
		JButton btnQuitter = new JButton("Quitter");
		buttons_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		buttons_panel.add(btnAjouterStation);
		buttons_panel.add(btnDtailsDuParc);
		buttons_panel.add(btnSauvegarder);
		buttons_panel.add(btnQuitter);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setToolTipText("");
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBorder(null);
		tabbedPane.addTab("Carte", null, tabbedPane_1, null);
		tabbedPane.setEnabledAt(0, true);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("New tab", null, tabbedPane_2, null);
	}

}
