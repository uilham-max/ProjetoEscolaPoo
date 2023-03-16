package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Inicio {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
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
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 278, 290);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCadastrarAluno = new JButton("Cadastrar aluno");
		btnCadastrarAluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AlunoForm.main(null);
				Inicio.getFrame().dispose();
			}
		});
		btnCadastrarAluno.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarAluno.setBounds(28, 60, 200, 35);
		frame.getContentPane().add(btnCadastrarAluno);
		
		JButton btnCadastrarProfessor = new JButton("Cadastrar professor");
		btnCadastrarProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfessorForm.main(null);
				Inicio.getFrame().dispose();
			}
		});
		btnCadastrarProfessor.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarProfessor.setBounds(28, 105, 200, 35);
		frame.getContentPane().add(btnCadastrarProfessor);
		
		JButton btnMostrarDados = new JButton("Mostrar dados");
		btnMostrarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarDados.main(null);
				Inicio.getFrame().dispose();
			}
		});
		btnMostrarDados.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMostrarDados.setBounds(28, 150, 200, 35);
		frame.getContentPane().add(btnMostrarDados);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		Inicio.frame = frame;
	}
}
