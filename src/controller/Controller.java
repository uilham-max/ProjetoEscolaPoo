package controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import view.*;
import model.*;

public class Controller  {
	
	

	
	public static void validaAluno() {
		Aluno aluno = new Aluno();
		
		aluno.setNome(validaNome(CadastroAluno.getTextFieldNome().getText()));
		aluno.setIdade(Integer.valueOf(validaIdade(CadastroAluno.getTextFieldIdade().getText())) );
		aluno.setNumCPF(Long.valueOf(validaCpf(CadastroAluno.getTextFieldCpf().getText())) );
		aluno.setDataMatricula( validaData(CadastroAluno.getTextFieldDataMat().getText()) );
		aluno.setNomeEscola(CadastroAluno.getTextFieldEscola().getText());
		aluno.setSemestreMatricula(Integer.valueOf(CadastroAluno.getTextFieldSemestre().getText()));
		aluno.setNumeroDeDisciplinas(Integer.valueOf(CadastroAluno.getTextFieldNumeroDedisciplinas().getText()) );


		
		if(aluno.getNome() != null && aluno.getIdade() != -1 && aluno.getNumCPF() != -1 && aluno.getNomeEscola() != null 
				&& aluno.getSemestreMatricula() != -1 && aluno.getNumeroDeDisciplinas() != -1 && aluno.getDataMatricula() != null) {
			DisciplinaForm.main(null);
			CadastroAluno.getFrmCadastro().dispose();
		}		
		
		
		
		
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
	

}
