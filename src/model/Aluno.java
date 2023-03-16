package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno extends Pessoa implements CalculaMedia{

	private String dataMatricula;
	

	private String nomeEscola = "Nome Escola";
	private int semestreMatricula = 0;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private int numeroDeDisciplinas = 0;
	

	public Aluno() {
		super();
	}	
	
	public Aluno(String nome, int idade, long numCPF, String dataMatricula, String nomeEscola, int semestreMatricula,
			ArrayList<Disciplina> disciplina, int numeroDeDisciplinas) {
		super(nome, idade, numCPF);
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.semestreMatricula = semestreMatricula;
		this.disciplinas = disciplina;
		this.numeroDeDisciplinas = numeroDeDisciplinas;
	}


	@Override
	 public float calculaMediaGeral() {
		
		float soma = 0;
		for(int i = 0; i < disciplinas.size(); i++) {
			
			soma += (disciplinas.get(i).getMediaDisciplina()) ;
		}
		float mediaGeral = soma/this.disciplinas.size();
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		
		NumberFormat df = new DecimalFormat("#.#", dfs);
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

	public String getSituacao() {
		float num = calculaMediaGeral();
		if(num >= 7 ) {
			return Situacao.APROVADO;
		} else if (num >= 4.5 && num <= 7 ) {
			return Situacao.RECUPERACAO;
		} 
		return Situacao.REPROVADO;
	}
	
//	public String getDataMatricula() {
//		return getDataFormatada(this.dataMatricula);
//	}
//
//	public void setDataMatricula(Date dataMatricula) {
//		this.dataMatricula = dataMatricula;
//	}
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public int getSemestreMatricula() {
		return semestreMatricula;
	}

	public void setSemestreMatricula(int semestreMatricula) {
		this.semestreMatricula = semestreMatricula;
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

	public int getNumeroDeDisciplinas() {
		return numeroDeDisciplinas;
	}

	public void setNumeroDeDisciplinas(int numeroDeDisciplinas) {
		this.numeroDeDisciplinas = numeroDeDisciplinas;
	}

	@Override
	public String toString() {
		return 		"\n*** Aluno ***"
					+"\n\nNome------------: " + nome 
					+"\nIdade-----------: " + idade
					+"\nCPF-------------: " + numCPF
					+"\nData Matricula--: " + dataMatricula
					+"\nEscola----------: " + nomeEscola
					+"\nSemestre--------: " + semestreMatricula
					+"\n\n*** Disciplinas ***" +disciplinas
					+"\n\nMedia geral-----: " + calculaMediaGeral()
					+"\nSituacao--------: " + getSituacao();
		
	}
	
	public static String getDataFormatada(Date data) {
		String formatoData = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(formatoData);
		String dataFormatada = sdf.format(data);                 
		return dataFormatada;
	}
	
}
