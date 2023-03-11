package controller;

import java.util.ArrayList;

import model.Aluno;
import model.Disciplina;
import model.Nota;

public class ClasseTeste {
	
	public static void main(String[] args) {
		
		float[] arrayDeNotas = new float[3];
		arrayDeNotas[0]=5;
		arrayDeNotas[1]=8;
		arrayDeNotas[2]=9;
		
		Nota notas = new Nota();
		notas.setNota(arrayDeNotas);
		
		ArrayList<Nota> arrayListDeNotas = new ArrayList<>();
		arrayListDeNotas.add(notas);
		
		Disciplina disciplina = new Disciplina();
		disciplina.setNota(arrayListDeNotas);
		
		ArrayList<Disciplina> arrayListDeDisciplinas = new ArrayList<>();
		arrayListDeDisciplinas.add(disciplina);
		
	
		
		Aluno aluno = new Aluno();
		aluno.setDisciplina(arrayListDeDisciplinas);
		arrayDeNotas[2] = 2;
		System.out.println(aluno.getDisciplina().get(0).getNota().get(0));
		
		
	}

}
