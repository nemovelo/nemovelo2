package Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class StationFrame extends JFrame {

	private JPanel contentPane;
	private JTextField TextNbVelos;
	private JTextField TextNbVelosMax;

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
		setBounds(100, 100, 427, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_btn_stations = new JPanel();
		panel_btn_stations.setBackground(SystemColor.control);
		contentPane.add(panel_btn_stations, BorderLayout.SOUTH);
		
		JButton btnSuppStation = new JButton("Supprimer la station");
		btnSuppStation.setBackground(SystemColor.inactiveCaptionBorder);
		btnSuppStation.setForeground(new Color(0, 0, 128));
		btnSuppStation.addActionListener(new ActionListener() {
			
			
			
		public void actionPerformed(ActionEvent arg0) {
			
			ConfirmerSuppression pop_up_confirm = new ConfirmerSuppression();
			
			}
		});
		panel_btn_stations.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_btn_stations.add(btnSuppStation);
		
		JButton btnValid = new JButton("Sauvegarder");
		btnValid.setForeground(new Color(0, 128, 0));
		panel_btn_stations.add(btnValid);
		
		JButton btnQuit = new JButton("Annuler");
		btnQuit.setForeground(new Color(165, 42, 42));
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
		
		TextNbVelos = new JTextField();
		TextNbVelos.setBackground(new Color(255, 255, 255));
		TextNbVelos.setBounds(226, 57, 116, 22);
		panel_tableau.add(TextNbVelos);
		TextNbVelos.setColumns(10);
		
		TextNbVelosMax = new JTextField();
		TextNbVelosMax.setToolTipText("");
		TextNbVelosMax.setColumns(10);
		TextNbVelosMax.setBounds(226, 117, 116, 22);
		panel_tableau.add(TextNbVelosMax);
	}
}
