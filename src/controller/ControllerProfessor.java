package controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import model.Disciplina;
import model.Professor;
import view.AlunoForm;
import view.DisciplinaForm;
import view.DisciplinaProfForm;
import view.MostrarDados;
import view.ProfessorForm;
import view.ProfessorForm;

public class ControllerProfessor  {
	
	private static final String NOME_PATTERN = "^[A-Z][a-z]{1,29}$";
    private static final Pattern pattern = Pattern.compile(NOME_PATTERN);
	
	private static Professor professor;
	private static ArrayList<Professor> professores = new ArrayList<Professor>();
	
	private static float[] arrayDeNotas;
	
	private static Disciplina disciplina;
	private static List<Disciplina> listaDeDisciplina = new ArrayList<Disciplina>();
	
	
	// metodo que cria o Aluno
	public static void criarProfessor() {
		System.out.println("entrando na criaProfessor...");
		professor = new Professor();
		professor.setNome(validaNome(ProfessorForm.getTextFieldNome().getText()));
		professor.setIdade(Integer.valueOf(validaIdade(ProfessorForm.getTextFieldIdade().getText())) );
		professor.setNumCPF(Long.valueOf(validaCpf(ProfessorForm.getTextFieldCpf().getText())) );
		professor.setNomeEscola(validaNomeEscola(ProfessorForm.getTextFieldEscola().getText())) ;
		
		professor.setInscMatricula(validaMatricula(ProfessorForm.getTextFieldInscMatricula().getText()));
		professor.setArea(validaArea(ProfessorForm.getTextFieldArea().getText())) ;
		
		if(professor.getNome() != null && professor.getIdade() != -1 && professor.getNumCPF() != -1 && professor.getNomeEscola() != null 
				&& professor.getInscMatricula() != null && professor.getArea() != null) {
			System.out.println("chamando criaDisciplina...");
			ProfessorForm.getFrame().dispose();
			DisciplinaProfForm.main(null);
			System.out.println("Dados do professor OK.");
		}		
	}
	
	
	// metodo que cria as disciplinas
	public static void criaDisciplina() {
		System.out.println("Criando disciplina...");
		
		disciplina = new Disciplina();
		arrayDeNotas = new float[3];
		Arrays.fill(arrayDeNotas, -1);
		
		disciplina.setNomeDisciplina(validaDisciplina((DisciplinaProfForm.getTextFieldNomeDisciplina().getText())) ) ;
		arrayDeNotas[0] = (validaNota1(DisciplinaProfForm.getTextFieldNota1().getText()));
		arrayDeNotas[1] = (validaNota2(DisciplinaProfForm.getTextFieldNota2().getText()));
		arrayDeNotas[2] = (validaNota3(DisciplinaProfForm.getTextFieldNota3().getText()));
		
		if(disciplina.getNomeDisciplina() != null && arrayDeNotas[0] != -1 && arrayDeNotas[1] != -1 && arrayDeNotas[2] != -1) {
			disciplina.setNotas(arrayDeNotas);
			System.out.println("adicionando disciplina na lista...");
			professor.getDisciplina().add(disciplina);
			DisciplinaProfForm.getFrame().dispose();
			DisciplinaProfForm.main(null);
		}
		
		
	}

//		alunos.get(0).getDisciplina().get(0).getNota().get(0).getMediaNotas();
	
	public static void fim() {
		
		if(professor.getDisciplina().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Cadastar uma disciplina");
			DisciplinaProfForm.getFrame().dispose();
			DisciplinaProfForm.main(null);
		} else {
			System.out.println("Criando professor...");
			professores.add(professor);
			System.out.println(professores.toString());
			MostrarDados.main(null);
			DisciplinaProfForm.getFrame().dispose();
		}
	}

	
	
	
	//valida nome
	public static String validaNome(String nome) {
		if(nome.matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)*$")) {
			ProfessorForm.getTextFieldNome().setBackground(Color.GREEN);
			return nome;
		} else {
			JOptionPane.showMessageDialog(null, "Nome invalido.");
			ProfessorForm.getTextFieldNome().setBackground(Color.RED);
			return null;
		}
	}
	
	//valida idade
	public static int validaIdade(String numero) {
		if(numero.matches("[0-9]{1,2}")) {
			int idade = Integer.valueOf(numero);
			if(idade >= 18 && idade < 100) {
				ProfessorForm.getTextFieldIdade().setBackground(Color.GREEN);
				return idade;
			}
		}
		ProfessorForm.getTextFieldIdade().setBackground(Color.RED);
		JOptionPane.showMessageDialog(null, "Idade invalida.");
		return -1;
	}
		
		//valida cpf
	public static long validaCpf(String cpf) {
		if(cpf.matches("[0-9]{11}")) {
			ProfessorForm.getTextFieldCpf().setBackground(Color.GREEN);
			return Long.valueOf(cpf);
		} else {
			ProfessorForm.getTextFieldCpf().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "CPF invalido.");
			return -1;
		}
	}
	
	//valida nome escola
	public static String validaNomeEscola(String nomeEcola) {
		if (nomeEcola.matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)*$")) {
			ProfessorForm.getTextFieldEscola().setBackground(Color.GREEN);
			return nomeEcola;
		} else {
			ProfessorForm.getTextFieldEscola().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nome escola invalido.");
			return null;
		}
	}

	//valida matricula
	public static String validaMatricula(String matricula) {
		if(matricula.matches("[0-9]{4,20}")) {
			ProfessorForm.getTextFieldInscMatricula().setBackground(Color.GREEN);
			return matricula;
		} else {
			ProfessorForm.getTextFieldInscMatricula().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Matricula invalido.");
			return null;
		}
	}
		
		
	//Valid area
	public static String validaArea(String area) {
		if(area.matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)*$")) {
			ProfessorForm.getTextFieldArea().setBackground(Color.GREEN);
			return area;
		} else {
			JOptionPane.showMessageDialog(null, "Area invalida.");
			ProfessorForm.getTextFieldArea().setBackground(Color.RED);
			return null;
		}
	}
		
	
	
	
		//valida disciplina
	public static String validaDisciplina(String nome) {
		if(nome.matches("^[a-zA-Z]+(?:\\s[a-zA-Z]+)*$")) {
			DisciplinaProfForm.getTextFieldNomeDisciplina().setBackground(Color.GREEN);
			return nome;
		} else {
			DisciplinaProfForm.getTextFieldNomeDisciplina().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nome da disciplina invalido.");
			return null;
		}
	}
		
		// valida nota1
	public static Float validaNota1(String numeroString) {
		
		if(numeroString.matches("[0-9]{1,2}")) {
			Float numeroFloat = Float.parseFloat(numeroString);
			if(numeroFloat > -1 && numeroFloat < 11) {
				DisciplinaProfForm.getTextFieldNota1().setBackground(Color.GREEN);
				return Float.valueOf(numeroString);
			}
			DisciplinaProfForm.getTextFieldNota1().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nota 1 fora do intervalo.");
			return -1f;
		}
		DisciplinaProfForm.getTextFieldNota1().setBackground(Color.RED);
		JOptionPane.showMessageDialog(null, "Nota 1 invalida.");
		return -1f;
	}
		
		// valida nota2
	public static Float validaNota2(String numeroString) {
		
		if(numeroString.matches("[0-9]{1,2}")) {
			Float numeroFloat = Float.parseFloat(numeroString);
			if(numeroFloat > -1 && numeroFloat < 11) {
				DisciplinaProfForm.getTextFieldNota2().setBackground(Color.GREEN);
				return Float.valueOf(numeroString);
			}
			DisciplinaProfForm.getTextFieldNota2().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nota 2 fora do intervalo.");
			return -1f;
		}
		DisciplinaProfForm.getTextFieldNota2().setBackground(Color.RED);
		JOptionPane.showMessageDialog(null, "Nota 2 invalida.");
		return -1f;
	}
		
		// valida nota3
	public static Float validaNota3(String numeroString) {
		
		if(numeroString.matches("[0-9]{1,2}")) {
			Float numeroFloat = Float.parseFloat(numeroString);
			if(numeroFloat > -1 && numeroFloat < 11) {
				DisciplinaProfForm.getTextFieldNota3().setBackground(Color.GREEN);
				return Float.valueOf(numeroString);
			}
			DisciplinaProfForm.getTextFieldNota3().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Nota 3 fora do intervalo.");
			return -1f;
		}
		DisciplinaProfForm.getTextFieldNota3().setBackground(Color.RED);
		JOptionPane.showMessageDialog(null, "Nota 3 invalida.");
		return -1f;
	}

		

	public static ArrayList<Professor> getProfessores() {
		return professores;
	}


	public static void setProfessores(ArrayList<Professor> professores) {
		ControllerProfessor.professores = professores;
	}

	

}
