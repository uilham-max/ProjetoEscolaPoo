package model;

import java.util.ArrayList;

public class Disciplina {
	
	private String nomeDisciplina = null;
	private int quantidadeDeNotas =0;
	private ArrayList<Nota> nota = null;
	
	public Disciplina() {
		
	}

	public Disciplina(String nomeDisciplina,int quantidadeDeNotas, ArrayList<Nota> nota) {
		super();

		this.nomeDisciplina = nomeDisciplina;
		this.quantidadeDeNotas = quantidadeDeNotas;
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
	
	public int getQuantidadeDeNotas() {
		return quantidadeDeNotas;
	}

	public void setQuantidadeDeNotas(int quantidadeDeNotas) {
		this.quantidadeDeNotas = quantidadeDeNotas;
	}

	@Override
	public String toString() {
		return "\nDisciplina = " + nomeDisciplina + " = " + nota + " media disc = " + getMediaDisciplina();
	}	

}
