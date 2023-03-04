package controller;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import view.*;
import model.*;
public class ControllerAluno  {
	
	private static Aluno aluno;
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	// metodo que cria as notas do aluno
	public static ArrayList<Nota> criaNota() {
		
		NotaForm.main(null);
		Nota notas = new Nota();
		ArrayList<Nota> ListaDeNotas = new ArrayList<Nota>();
		float[] arrayDeNotas = null;
		
		arrayDeNotas[0] = Float.valueOf(validaInteiroMenorQueDez(NotaForm.getTextFieldNota1().getText()));
		arrayDeNotas[1] = Float.valueOf(validaInteiroMenorQueDez(NotaForm.getTextFieldNota2().getText()));
		arrayDeNotas[2] = Float.valueOf(validaInteiroMenorQueDez(NotaForm.getTextFieldNota3().getText()));
		
		notas.setNota(arrayDeNotas);
		ListaDeNotas.add(notas);
		
		NotaForm.getFrame().dispose();
		return ListaDeNotas;
		
//		alunos.get(0).getDisciplina().get(0).getNota().get(0).getMediaNotas();
	}
	
	// metodo que cria as disciplinas
	public static void criaDisciplina() {

		Disciplina disciplina = new Disciplina();
		ArrayList<Disciplina> listaDeDisciplina = new ArrayList<Disciplina>();
		
		for(int i=1; i<Integer.valueOf(AlunoForm.getTextFieldNumeroDedisciplinas().getText()); i++) {
			
			disciplina.setNomeDisciplina( validaDisciplina(DisciplinaForm.getTextFieldNomeDisciplina().getText())) ;
			
			if(disciplina.getNomeDisciplina() != null) {
				NotaForm.main(null);
//				disciplina.setNota(criaNota());
//				listaDeDisciplina.add(disciplina);
			}
			
			
			
			
		}

		aluno.setDisciplina(listaDeDisciplina);
		// nesta parte devo chamar a view MostrarDados
		MostrarDados.main(null);
		DisciplinaForm.getFrame().dispose();
	}
	
	// metodo que cria o Aluno
	public static void criaAluno() {
		aluno = new Aluno();
		
		aluno.setNome(validaNome(AlunoForm.getTextFieldNome().getText()));
		aluno.setIdade(Integer.valueOf(validaIdade(AlunoForm.getTextFieldIdade().getText())) );
		aluno.setNumCPF(Long.valueOf(validaCpf(AlunoForm.getTextFieldCpf().getText())) );
		aluno.setDataMatricula( validaData(AlunoForm.getTextFieldDataMat().getText()) );
		aluno.setNomeEscola(AlunoForm.getTextFieldEscola().getText());
		aluno.setSemestreMatricula(Integer.valueOf(AlunoForm.getTextFieldSemestre().getText()));
		aluno.setNumeroDeDisciplinas(Integer.valueOf(AlunoForm.getTextFieldNumeroDedisciplinas().getText()) );
		
		if(aluno.getNome() != null && aluno.getIdade() != -1 && aluno.getNumCPF() != -1 && aluno.getNomeEscola() != null 
				&& aluno.getSemestreMatricula() != -1 && aluno.getNumeroDeDisciplinas() != -1 && aluno.getDataMatricula() != null) {
			
			DisciplinaForm.main(null);
			AlunoForm.getFrmCadastro().dispose();
//			criaDisciplina();
		}		
		
		// e... quando tudo tiver dado certo o aluno será adicionado na pilha
		alunos.add(aluno);
		
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
					if(nome.matches("^(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+(?:\\-(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+)*(?: (?:(?:e|y|de(?:(?: la| las| lo| los))?|do|dos|da|das|del|van|von|bin|le) )?(?:(?:(?:d'|D'|O'|Mc|Mac|al\\-))?(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+|(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+(?:\\-(?:[\\p{Lu}&&[\\p{IsLatin}]])(?:(?:')?(?:[\\p{Ll}&&[\\p{IsLatin}]]))+)*))+(?: (?:Jr\\.|II|III|IV))?$")) {
						return nome;
					} else {
						JOptionPane.showMessageDialog(null, "Nome invalido.");
						return null;
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
