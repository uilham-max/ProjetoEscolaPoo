package model;

import java.util.ArrayList;

public class Disciplina {
	
	private String nomeDisciplina;
	private ArrayList<Nota> nota;
	
	public Disciplina() {
		
	}

	public Disciplina(String nomeDisciplina, ArrayList<Nota> nota) {
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.nota = nota;
	}

	public float getMediaDisciplina() {
		float media = 0;
		for(int i = 0; i < this.nota.size(); i++) {
			media += this.nota.get(i).getMediaNotas();
		}
		return media/this.nota.size();
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public ArrayList<Nota> getNota() {
		return nota;
	}

	public void setNota(ArrayList<Nota> nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "\nDisciplina = " + nomeDisciplina + " = " + nota + " media disc = " + getMediaDisciplina();
	}	

}
