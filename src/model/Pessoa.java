package model;

public abstract class Pessoa {

	protected String nome = null;
	protected int idade =0;
	protected long numCPF=0;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade, long numCPF) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.numCPF = numCPF;
	}

	public boolean maioridade(int idade) {
		if(idade >= 18) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "\nNome: " + this.nome +
				"\nIdade: " + this.idade +
				"\nCPF: " + this.numCPF;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getNumCPF() {
		return numCPF;
	}

	public void setNumCPF(long numCPF) {
		this.numCPF = numCPF;
	}
	
}
