package model;

import java.util.ArrayList;

public class Professor extends Pessoa implements CalculaMedia {
	
	private String inscMatricula = null;
	private String area = null;
	private ArrayList <Disciplina> disciplina = null;
	
	public Professor() {
		super();
	}

	public Professor(String nome, int idade, long numCPF, String inscMatricula, String area, ArrayList<Disciplina> disciplina) {
		super(nome, idade, numCPF);
		this.inscMatricula = inscMatricula;
		this.area = area;
		this.disciplina = disciplina;
		// TODO Auto-generated constructor stub
	}


	@Override
	 public float calculaMediaGeral() {
		// TODO Auto-generated method stub
		float mediaGeral = 0;
		for(int i = 0; i < disciplina.size(); i++) {
			mediaGeral += disciplina.get(i).getMediaDisciplina();
		}
		return mediaGeral/this.disciplina.size();
	}

	@Override
	public boolean CalculaMediaGeral1() {
		// TODO Auto-generated method stub
		if(calculaMediaGeral() > 7) {
			return true;
		}
		return false;
	}	

	
	@Override
	public String toString() {
		return "\n\nProfessor \n[" + "\\nnome=" + nome +  "\nidade=" + idade + "\nCPF=" + numCPF + "\ninscMatricula=" + inscMatricula + ", \narea=" + area + ", \ndisciplina=" + disciplina + "]";
	}

	public String getInscMatricula() {
		return inscMatricula;
	}

	public void setInscMatricula(String inscMatricula) {
		this.inscMatricula = inscMatricula;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	

}
