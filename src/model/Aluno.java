package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Pessoa implements CalculaMedia{

	private String dataMatricula;
	

	private String nomeEscola;
	private int semestreMatricula = 0;
	private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
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
		this.disciplina = disciplina;
		this.numeroDeDisciplinas = numeroDeDisciplinas;
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

	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public int getNumeroDeDisciplinas() {
		return numeroDeDisciplinas;
	}

	public void setNumeroDeDisciplinas(int numeroDeDisciplinas) {
		this.numeroDeDisciplinas = numeroDeDisciplinas;
	}

	@Override
	public String toString() {
		return "\n----------\n"+"\nnome=" + nome +  "\nidade=" + idade + "\nCPF=" + numCPF + "\nNumero de discip." + numeroDeDisciplinas+ 
				"\ndataMatricula=" + /*getDataFormatada(dataMatricula)*/dataMatricula + "\nnomeEscola=" + nomeEscola + 
				"\nsemestreMatricula=" + semestreMatricula +""+ disciplina +
				"\nmedia geral = " + calculaMediaGeral() +
				"\nsituacao=" + getSituacao();
		
	}
	
	public static String getDataFormatada(Date data) {
		String formatoData = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(formatoData);
		String dataFormatada = sdf.format(data);                 
		return dataFormatada;
	}
	
}
