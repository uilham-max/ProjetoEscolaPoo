package model;

import java.util.Arrays;

public class Nota {
	
	private float nota[] = new float[3];
	
	public Nota() {
		
	}
	
	public Nota(float nota[]) {
		this.nota = nota;
	}

	public float getSomaNotas() {
		return (nota[0] + nota[1] + nota[2]);
	}
	
	public float getMediaNotas() {
		return (getSomaNotas() / 3);
	}
	
	public void setNota(float[] nota) {
		this.nota = nota;
	}

	public float[] getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Notas = " + Arrays.toString(nota);
	}
	
	

}
