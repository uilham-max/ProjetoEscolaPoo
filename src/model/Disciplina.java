package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Arrays;


public class Disciplina {
	
    private String nomeDisciplina = "Disciplina";
    private float[] notas = {-1,-1,-1};

    public Disciplina() {

    }
    
    NumberFormat numeroFormatado = new DecimalFormat("0.0");

    public Disciplina(String nomeDisciplina, float[] notas) {
            super();

            this.nomeDisciplina = nomeDisciplina;
            this.notas = notas;
    }
    
    public Float getMediaDisciplina() {
            float soma = 0;
            for(int i = 0; i < this.notas.length; i++) {
                    soma += this.notas[i];
            }
            float media = soma/this.notas.length;
            
            DecimalFormatSymbols dfs = new DecimalFormatSymbols();
            dfs.setDecimalSeparator('.');
            
            NumberFormat df = new DecimalFormat("0.0", dfs);
            String numeroFormatado = df.format(media);
            
            return  Float.parseFloat(numeroFormatado);
    }
    
    
    
    public String getNomeDisciplina() {
            return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
            this.nomeDisciplina = nomeDisciplina;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }



    public float getNotaPorIndice(int indice) {
        return this.notas[indice];
    }

    @Override
    public String toString() {
        return      "\n\nDisciplina--: " +nomeDisciplina
//        			+"\nNotas--------: " +Arrays.toString(notas)
        			+"\nNota 1-------: " +notas[0]
        			+"\nNota 2-------: " +notas[1]
        			+"\nNota 3-------: " +notas[2]
        			+"\nMedia -------: " +getMediaDisciplina();
    }

    
}
