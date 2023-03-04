package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarDados {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarDados window = new MostrarDados();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MostrarDados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBoxAlunos = new JComboBox();
		comboBoxAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxAlunos.setBounds(73, 92, 251, 78);
		frame.getContentPane().add(comboBoxAlunos);
		
		JLabel lblNewLabelAlunos = new JLabel("Alunos");
		lblNewLabelAlunos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabelAlunos.setBounds(165, 46, 68, 36);
		frame.getContentPane().add(lblNewLabelAlunos);
		
		JLabel lblProfessores = new JLabel("Professores");
		lblProfessores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProfessores.setBounds(545, 46, 118, 36);
		frame.getContentPane().add(lblProfessores);
		
		JComboBox comboBoxProfessores = new JComboBox();
		comboBoxProfessores.setBounds(472, 92, 251, 78);
		frame.getContentPane().add(comboBoxProfessores);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio.main(null);
				MostrarDados.getFrame().dispose();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVoltar.setBounds(310, 426, 150, 40);
		frame.getContentPane().add(btnVoltar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(76, 193, 647, 217);
		frame.getContentPane().add(textArea);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		MostrarDados.frame = frame;
	}
}
