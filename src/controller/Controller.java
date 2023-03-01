package controller;


import javax.swing.JOptionPane;
import javax.swing.JTextField;

import view.*;
import model.*;
import model.Disciplina;

public class Controller  {

	
	public static void validaAluno() {
		Aluno aluno = new Aluno();
		
		//nesse ponto eu consegui resolver o problema de acessar os atributos da classe CadastroAluno
		// acho melhor definir getter e setter para os atributos da classe CadastroAluno
//		aluno.setNumeroDeDisciplinas(Integer.valueOf(CadastroAluno.getTextFieldNumeroDedisciplinas().getText()) );
		
		CadastroAluno.setTextFieldNome("uilha343453");
		aluno.setNome(validaNome(CadastroAluno.getTextFieldNome().getText()));
		
		
//		DisciplinaForm.main(null);
//		CadastroAluno.getFrmCadastro().dispose();
		
//		if(!isBloqueado()) {
//			Disciplina.main(null);
//			frmCadastro.dispose();	
//		}		
		
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
		
		//valida idade
		public static int validaIdade(String numero) {
			if(numero.matches("[0-9]{1,2}")) {
				int idade = Integer.valueOf(numero);
				if(idade > 18 && idade < 100) {
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
		
		
	

}
