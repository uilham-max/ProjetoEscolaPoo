package controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Disciplina;
import view.AlunoForm;
import view.DisciplinaForm;
import view.MostrarDados;
public class ControllerAluno  {
	
	private static final String NOME_PATTERN = "^[A-Z][a-z]{1,29}$";
    private static final Pattern pattern = Pattern.compile(NOME_PATTERN);
	
	private static Aluno aluno;
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	private static float[] arrayDeNotas;
	
	private static Disciplina disciplina;
	private static ArrayList<Disciplina> listaDeDisciplina =  new ArrayList<Disciplina>();
	
	
	// metodo que cria o Aluno
	public static void criaAluno() {
		System.out.println("entrando na criaAluno...");
		aluno = new Aluno();
		aluno.setNome(validaNome(AlunoForm.getTextFieldNome().getText()));
		aluno.setIdade(Integer.valueOf(validaIdade(AlunoForm.getTextFieldIdade().getText())) );
		aluno.setNumCPF(Long.valueOf(validaCpf(AlunoForm.getTextFieldCpf().getText())) );
		aluno.setDataMatricula( validaData(AlunoForm.getTextFieldDataMat().getText()) );
		aluno.setNomeEscola(validaNomeEscola(AlunoForm.getTextFieldEscola().getText())) ;
		aluno.setSemestreMatricula(validaSemestre(String.valueOf(AlunoForm.getTextFieldSemestre().getText()))) ;
		if(aluno.getNome() != null && aluno.getIdade() != -1 && aluno.getNumCPF() != -1 && aluno.getNomeEscola() != null 
				&& aluno.getSemestreMatricula() != -1 && aluno.getNumeroDeDisciplinas() != -1 && aluno.getDataMatricula() != null) {
			System.out.println("chamando criaDisciplina...");
			AlunoForm.getFrmCadastro().dispose();
			
			DisciplinaForm.main(null);
//			DisciplinaForm.getBotaoTerminar().setVisible(false);
		}
		System.out.println("criaAluno ultima linha...");

	}
	
	
	// metodo que cria as disciplinas
	public static void criaDisciplina() {
		System.out.println("Criando disciplina...");
			
			disciplina = new Disciplina();
			arrayDeNotas = new float[3];
			Arrays.fill(arrayDeNotas, -1);
			
			disciplina.setNomeDisciplina(validaNomeDisciplina((DisciplinaForm.getTextFieldNomeDisciplina().getText())) ) ;
			arrayDeNotas[0] = (validaNota1(DisciplinaForm.getTextFieldNota1().getText()));
			arrayDeNotas[1] = (validaNota2(DisciplinaForm.getTextFieldNota2().getText()));
			arrayDeNotas[2] = (validaNota3(DisciplinaForm.getTextFieldNota3().getText()));

			if(disciplina.getNomeDisciplina() != null && arrayDeNotas[0] != -1 && arrayDeNotas[1] != -1 && arrayDeNotas[2] != -1) {
				System.out.println("adicionando disciplina na lista...");
				disciplina.setNotas(arrayDeNotas);
				aluno.getDisciplina().add(disciplina);
				DisciplinaForm.getFrame().dispose();
				DisciplinaForm.main(null);
			} 
			
			
	}

	
	public static void fim() {
		
		if(aluno.getDisciplina().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Cadastar uma disciplina");
			DisciplinaForm.getFrame().dispose();
			DisciplinaForm.main(null);
		} else {
			System.out.println("Criando aluno");
			alunos.add(aluno);
			System.out.println(alunos.toString());
			MostrarDados.main(null);
			DisciplinaForm.getFrame().dispose();
		}
	}
	
	//valida nome
	public static String validaNome(String nome) {
		if(nome.matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)*$")) {
			AlunoForm.getTextFieldNome().setBackground(Color.GREEN);
			return nome;
		} else {
			
			AlunoForm.getTextFieldNome().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nome invalido.");
			return null;
		}
	}

	//valida idade
	public static int validaIdade(String numero) {
		if(numero.matches("[0-9]{1,2}")) {
			int idade = Integer.valueOf(numero);
			if(idade >= 18 && idade < 100) {
				AlunoForm.getTextFieldIdade().setBackground(Color.GREEN);
				return idade;
			}
		}
		AlunoForm.getTextFieldIdade().setBackground(Color.RED);
		JOptionPane.showMessageDialog(null, "Idade invalida.");
		return -1;
	}
	
	//valida cpf
	public static long validaCpf(String cpf) {
		if(cpf.matches("[0-9]{11}")) {
			AlunoForm.getTextFieldCpf().setBackground(Color.GREEN);
			return Long.valueOf(cpf);
		} else {
			AlunoForm.getTextFieldCpf().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "CPF invalido.");
			return -1;
		}
	}
		
	//valida data
	public static String validaData(String data) {
		if(data.equals(Aluno.getDataFormatada(new Date()))) {
			AlunoForm.getTextFieldDataMat().setBackground(Color.GREEN);
			return data;
		}
		AlunoForm.getTextFieldDataMat().setBackground(Color.RED);
		JOptionPane.showInternalMessageDialog(null, "Data invalida." );
		return null;
	}
	
	
	
	//valida nome escola
	public static String validaNomeEscola(String nomeEcola) {
		if (nomeEcola.matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)*$")) {
			AlunoForm.getTextFieldEscola().setBackground(Color.GREEN);
			return nomeEcola;
		} else {
			AlunoForm.getTextFieldEscola().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nome escola invalido.");
			return null;
		}
	}
	
	//valida semestre
	public static int validaSemestre(String numero) {
		if(numero.matches("[0-9]{1,2}")) {
			int semestre = Integer.valueOf(numero);
			if (semestre > 0 && semestre < 20) {
				AlunoForm.getTextFieldSemestre().setBackground(Color.GREEN);
				return semestre;
			} 
		}
		AlunoForm.getTextFieldSemestre().setBackground(Color.RED);
		JOptionPane.showMessageDialog(null, "Semestre invalido.");
		return -1;
	}

	//valida disciplina
	public static String validaNomeDisciplina(String nome) {
		if(nome.matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)*$")) {
			DisciplinaForm.getTextFieldNomeDisciplina().setBackground(Color.GREEN);
			return nome;
		} else {
			DisciplinaForm.getTextFieldNomeDisciplina().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nome da disciplina invalido.");
			return null;
		}
	}
			
	// valida nota1
	public static Float validaNota1(String numeroString) {
		
		if(numeroString.matches("[0-9]{1,2}")) {
			Float numeroFloat = Float.parseFloat(numeroString);
			if(numeroFloat > -1 && numeroFloat < 11) {
				DisciplinaForm.getTextFieldNota1().setBackground(Color.GREEN);
				return Float.valueOf(numeroString);
			}
			DisciplinaForm.getTextFieldNota1().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nota fora do intervalo.");
			return -1f;
		}
		DisciplinaForm.getTextFieldNota1().setBackground(Color.RED);
		JOptionPane.showMessageDialog(null, "Nota 1 invalida.");
		return -1f;
	}
	
	// valida nota2
	public static Float validaNota2(String numeroString) {
		
		if(numeroString.matches("[0-9]{1,2}")) {
			Float numeroFloat = Float.parseFloat(numeroString);
			if(numeroFloat > -1 && numeroFloat < 11) {
				DisciplinaForm.getTextFieldNota2().setBackground(Color.GREEN);
				return Float.valueOf(numeroString);
			}
			DisciplinaForm.getTextFieldNota2().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nota 2 fora do intervalo.");
			return -1f;
		}
		DisciplinaForm.getTextFieldNota2().setBackground(Color.RED);
		JOptionPane.showMessageDialog(null, "Nota 2 invalida.");
		return -1f;
	}
	
	// valida nota3
	public static Float validaNota3(String numeroString) {
		
		if(numeroString.matches("[0-9]{1,2}")) {
			Float numeroFloat = Float.parseFloat(numeroString);
			if(numeroFloat > -1 && numeroFloat < 11) {
				DisciplinaForm.getTextFieldNota3().setBackground(Color.GREEN);
				return Float.valueOf(numeroString);
			}
			DisciplinaForm.getTextFieldNota3().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nota 3 fora do intervalo.");
			return -1f;
		}
		DisciplinaForm.getTextFieldNota3().setBackground(Color.RED);
		JOptionPane.showMessageDialog(null, "Nota 3 invalida.");
		return -1f;
	}
	
	

	public static ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public static void setAlunos(ArrayList<Aluno> alunos) {
		ControllerAluno.alunos = alunos;
	}

}
