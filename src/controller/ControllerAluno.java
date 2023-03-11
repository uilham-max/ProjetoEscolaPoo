package controller;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import view.*;
import model.*;
public class ControllerAluno  {
	
	
	private static Aluno aluno;
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	private static Disciplina disciplina;
	private static ArrayList<Disciplina> listaDeDisciplina = new ArrayList<Disciplina>();
	
	private static Nota notas;
	private static ArrayList<Nota> ListaDeNotas = new ArrayList<Nota>();
//	private static float[] 
	
	
	// metodo que cria o Aluno
	public static void criaAluno() {
		System.out.println("entrando na criaAluno...");
		aluno = new Aluno();
		aluno.setNome(validaNome(AlunoForm.getTextFieldNome().getText()));
		aluno.setIdade(Integer.valueOf(validaIdade(AlunoForm.getTextFieldIdade().getText())) );
		aluno.setNumCPF(Long.valueOf(validaCpf(AlunoForm.getTextFieldCpf().getText())) );
		aluno.setDataMatricula( validaData(AlunoForm.getTextFieldDataMat().getText()) );
		aluno.setNomeEscola(AlunoForm.getTextFieldEscola().getText());
		aluno.setSemestreMatricula(Integer.valueOf(AlunoForm.getTextFieldSemestre().getText()));
		if(aluno.getNome() != null && aluno.getIdade() != -1 && aluno.getNumCPF() != -1 && aluno.getNomeEscola() != null 
				&& aluno.getSemestreMatricula() != -1 && aluno.getNumeroDeDisciplinas() != -1 && aluno.getDataMatricula() != null) {
			System.out.println("chamando criaDisciplina...");
			AlunoForm.getFrmCadastro().dispose();
			DisciplinaForm.main(null);
			System.out.println("saindo do if do criaAluno...");
		}		
	}
	
	
	// metodo que cria as disciplinas
	public static void criaDisciplina() {
		System.out.println("entrando no criaDisciplina...");
			disciplina = new Disciplina();
			notas = new Nota();
			float[] arrayDeNotas = new float[3];
			disciplina.setNomeDisciplina(validaDisciplina((DisciplinaForm.getTextFieldNomeDisciplina().getText())) ) ;
			arrayDeNotas[0] = Float.valueOf(validaInteiroMenorQueDez(DisciplinaForm.getTextFieldNota1().getText()));
			arrayDeNotas[1] = Float.valueOf(validaInteiroMenorQueDez(DisciplinaForm.getTextFieldNota2().getText()));
			arrayDeNotas[2] = Float.valueOf(validaInteiroMenorQueDez(DisciplinaForm.getTextFieldNota3().getText()));
			notas.setNota(arrayDeNotas);
			disciplina.getNota().add(notas);
			System.out.println("adicionando disciplina na lista...");
			aluno.getDisciplina().add(disciplina);
			chamaTelaDisciplina();
	}

//		alunos.get(0).getDisciplina().get(0).getNota().get(0).getMediaNotas();
	
	public static void fim() {
		System.out.println("Criando aluno");
		alunos.add(aluno);
		System.out.println(alunos.toString());
		chamaTelaMostrarDados();
	}

	
	
	
	
	public static void chamaTelaMostrarDados() {
		MostrarDados.main(null);
//		DisciplinaForm.getFrame().dispose();
	}
	
	
	public static void chamaTelaDisciplina() {
		DisciplinaForm.main(null);
//		DisciplinaForm.getFrame().dispose();
	}
	
	//valida data
	public static String validaData(String data) {
		if(data.equals(Aluno.getDataFormatada(new Date()))) {
			return data;
		}
		JOptionPane.showInternalMessageDialog(null, "Data invalida." );
		return null;
	}
	
	//valida nome
		public static String validaNome(String nome) {
			if(nome.matches("^(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+(?:\\-(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+)*(?: (?:(?:e|y|de(?:(?: la| las| lo| los))?|do|dos|da|das|del|van|von|bin|le) )?(?:(?:(?:d'|D'|O'|Mc|Mac|al\\-))?(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+|(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+(?:\\-(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+)*))+(?: (?:Jr\\.|II|III|IV))?$")) {
				return nome;
			} else {
				JOptionPane.showMessageDialog(null, "Nome invalido.");
				return null;
			}
		}
		
		//valida disciplina
				public static String validaDisciplina(String nome) {
					if(nome.matches("/^[A-Za-z]+$/")) {
						return nome;
					} else {
//						JOptionPane.showMessageDialog(null, "Nome da disciplina invalido.");
//						return null;
						return nome;
					}
				}
		
		//valida idade
		public static int validaIdade(String numero) {
			if(numero.matches("[0-9]{1,2}")) {
				int idade = Integer.valueOf(numero);
				if(idade >= 18 && idade < 100) {
					return idade;
				}
			}
			JOptionPane.showMessageDialog(null, "Idade invalida.");
			return -1;
		}
		
		//valida cpf
		public static long validaCpf(String cpf) {
			if(cpf.matches("[0-9]{11}")) {
				return Long.valueOf(cpf);
			} else {
				JOptionPane.showMessageDialog(null, "CPF invalido.");
				return -1;
			}
		}
		
		//valida nome escola
		public static String validaNomeEscola(String nomeEcola) {
			if (nomeEcola.matches("^(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+(?:\\-(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+)*(?: (?:(?:e|y|de(?:(?: la| las| lo| los))?|do|dos|da|das|del|van|von|bin|le) )?(?:(?:(?:d'|D'|O'|Mc|Mac|al\\-))?(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+|(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+(?:\\-(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+)*))+(?: (?:Jr\\.|II|III|IV))?$")) {
				return nomeEcola;
			} else {
				JOptionPane.showMessageDialog(null, "Nome escola invalido.");
				return null;
			}
		}
		
		//valida semestre
		public static int validaSemestre(String numero) {
			if(numero.matches("[0-9]{1,2}")) {
				int semestre = Integer.valueOf(numero);
				if (semestre > 0 && semestre < 20) {
					return semestre;
				} 
			}
				JOptionPane.showMessageDialog(null, "Semestre invalido.");
				return -1;
		}
		
		//valida quantidade de disciplinas
		public static int validaNumeroDeDisciplinas(String numero) {
			if(numero.matches("[0-9]{1,2}")) {
				int numeroDedisciplinas = Integer.valueOf(numero);
				if (numeroDedisciplinas > 0 && numeroDedisciplinas < 20) {
					return numeroDedisciplinas ;
				}
			}
				JOptionPane.showMessageDialog(null, "Quantidade de disciplinas invalido.");
				return -1;
		}
		
		// valida inteiros menores que 10
		public static int validaInteiroMenorQueDez(String numero) {
			if(numero.matches("[0-9]{1}")) {
				int numeroDedisciplinas = Integer.valueOf(numero);
				if (numeroDedisciplinas > 0 && numeroDedisciplinas < 20) {
					return numeroDedisciplinas ;
				}
			}
				JOptionPane.showMessageDialog(null, "Valor maior que 10.");
				return -1;
		}
		
	

}
