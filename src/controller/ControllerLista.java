package controller;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import view.MostrarDados;

public class ControllerLista {
	
	
	// recebe a comboBoxAluno
	public static void criarComboBoxAluno(JComboBox comboBoxAluno) {
		
		// cria um array de String e aloca memoria para o tamanho da lista de alunos
		String nomes[] = new String[ControllerAluno.getAlunos().size()+1];
		nomes[0] = "Alunos"; // na posicao zero define o titulo da comboBox
		
		// populando o array nomes[] com a lista de alunos a partir da posicao 1
		for(int i = 0; i < ControllerAluno.getAlunos().size(); i++) {
			nomes[i+1] = ControllerAluno.getAlunos().get(i).getNome();
		}
		
		comboBoxAluno.setModel(new DefaultComboBoxModel(nomes));
	}
	
	
	public static void mostrarItemSelecionadoAluno(int index) {
		MostrarDados.textAreaMostrarDados.setText(ControllerAluno.getAlunos().get(index-1).toString());
	}
	
	
	
	
	// combo box dos professores
	public static void criarComboBoxProfessor(JComboBox comboBoxprofessor) {
		
		String nomes[] = new String[ControllerProfessor.getProfessores().size()+1];
		nomes[0] = "Professores";
		for(int i = 0; i < ControllerProfessor.getProfessores().size(); i++) {
			nomes[i+1] = ControllerProfessor.getProfessores().get(i).getNome();
		}
		comboBoxprofessor.setModel(new DefaultComboBoxModel(nomes));
		
	}
	
	public static void mostrarItemSelecionadoProfessor(int index) {
		try {
			MostrarDados.textAreaMostrarDados.setText(ControllerProfessor.getProfessores().get(index-1).toString());
		}catch(Exception err) {
			System.out.println(err);
		}finally{
			
		}
		
	}

}
