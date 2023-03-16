package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa implements CalculaMedia {
	
	private String nomeEscola = "Nome Escola";
	private String inscMatricula = "matricula";
	private String area = "Area";
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	public Professor() {
		super();
	}

	public Professor(String nome, int idade, long numCPF, String nomeEscola, String inscMatricula, String area, List<Disciplina> disciplinas) {
		super(nome, idade, numCPF);
		this.nomeEscola = nomeEscola;
		this.inscMatricula = inscMatricula;
		this.area = area;
		this.disciplinas = disciplinas;
		// TODO Auto-generated constructor stub
	}


	@Override
	 public float calculaMediaGeral() {
		// TODO Auto-generated method stub
		float soma = 0;
		for(int i = 0; i < disciplinas.size(); i++) {
			soma += disciplinas.get(i).getMediaDisciplina();
		}
		
		float mediaGeral = soma/this.disciplinas.size();
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		
		NumberFormat df = new DecimalFormat("0.0", dfs);
		String mediaGeralFormatada = df.format(mediaGeral);
		
		return Float.parseFloat(mediaGeralFormatada);
	}

	@Override
	public boolean CalculaMediaGeral1() {
		// TODO Auto-generated method stub
		if(calculaMediaGeral() > 7) {
			return true;
		}
		return false;
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

	public List<Disciplina> getDisciplina() {
		return disciplinas;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		if(this.disciplinas.isEmpty()) {
            this.disciplinas = new ArrayList<>();
        }
        this.disciplinas = disciplina;
	}
	
	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	@Override
	public String toString() {
		return "\n*** Professor ***" 
				+"\n\nNome------:" + nome 
				+"\nIidade------:" + idade 
				+"\nCPF---------:" + numCPF 
				+"\nMatricula---:" + inscMatricula 
				+"\nArea--------:" + area 
				+"\n\n*** Disciplinas ***" +disciplinas 
				+"\nMedia geral-: " + calculaMediaGeral();
	}

}
