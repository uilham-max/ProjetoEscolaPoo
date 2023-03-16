package model;

import java.util.Arrays;

public class Nota {
	
	private float[] notas = {0,0,0};
	
	public Nota() {
		
	}
	
	public Nota(float nota[]) {
		this.notas = nota;
	}

	public float getSomaNotas() {
		return (notas[0] + notas[1] + notas[2]);
	}
	
	public float getMediaNotas() {
		return (getSomaNotas() / 3);
	}
	
	public void setNotas(float[] nota) {
		this.notas = nota;
	}

	public float[] getNotas() {
		return notas;
	}
        


	@Override
	public String toString() {
		return "Notas = " + Arrays.toString(notas);
	}
	
	

}
