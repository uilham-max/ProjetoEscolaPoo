package model;

import java.util.ArrayList;
import java.util.Date;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// instanciação de cada disciplina
		Disciplina dis1 = new Disciplina();
		dis1.setNomeDisciplina("POO");
		dis1.setNota(null);
		
		Disciplina dis2 = new Disciplina();
		dis2.setNomeDisciplina("REDES");
		dis2.setNota(null);
		
		Disciplina dis3 = new Disciplina();
		dis3.setNomeDisciplina("ED");
		dis3.setNota(null);
		
		Disciplina dis4 = new Disciplina();
		dis4.setNomeDisciplina("PWI");
		dis4.setNota(null);
		
		Disciplina dis5 = new Disciplina();
		dis5.setNomeDisciplina("BDII");
		dis5.setNota(null);
		
		
		
		// disList = -- um professor pode ministrar mais de uma disciplina
		ArrayList<Disciplina> disciplinasMinistradas1 = new ArrayList<Disciplina>();
		disciplinasMinistradas1.add(dis1);
		
		ArrayList<Disciplina> disciplinasMinistradas2 = new ArrayList<Disciplina>();
		disciplinasMinistradas2.add(dis3);
		disciplinasMinistradas2.add(dis5);
		
		ArrayList<Disciplina> disciplinasMinistradas3 = new ArrayList<Disciplina>();
		disciplinasMinistradas3.add(dis2);
		
		ArrayList<Disciplina> disciplinasMinistradas4 = new ArrayList<Disciplina>();
		disciplinasMinistradas4.add(dis4);
		
		
		// isntancia os professores
		Professor prof1 = new Professor();
		prof1.setNome("Brayan Teixeira");
		prof1.setNumCPF(1111111111);
		prof1.setInscMatricula("30000");
		prof1.setIdade(28);
		prof1.setArea("TADS");
		prof1.setDisciplina(disciplinasMinistradas1);


		Professor prof2 = new Professor();
		prof2.setNome("Marcio Spenst");
		prof2.setNumCPF(1222222222);
		prof2.setInscMatricula("40000");
		prof2.setIdade(50);
		prof2.setArea("TADS");
		prof2.setDisciplina(disciplinasMinistradas2); // este professor ministra mais de uma disciplina


		Professor prof3 = new Professor();
		prof3.setNome("Gledson Leal");
		prof3.setNumCPF(1333333333);
		prof3.setInscMatricula("50000");
		prof3.setIdade(39);
		prof3.setArea("TADS");
		prof3.setDisciplina(disciplinasMinistradas4);


		Professor prof4 = new Professor();
		prof4.setNome("Anderson");
		prof4.setNumCPF(04444444444);
		prof4.setInscMatricula("60000");
		prof4.setIdade(40);
		prof4.setArea("TADS");
		prof4.setDisciplina(disciplinasMinistradas3);

		
		
		// lista de disciplinas de segundo semestre 
		ArrayList<Disciplina> listaDisciplinasSegundoSemestre = new ArrayList<Disciplina>();
		listaDisciplinasSegundoSemestre.add(dis1);
		listaDisciplinasSegundoSemestre.add(dis2);
		listaDisciplinasSegundoSemestre.add(dis3);
		listaDisciplinasSegundoSemestre.add(dis4);
		listaDisciplinasSegundoSemestre.add(dis5);
		
		
		// algumas notas, que serao passadas para uma ArrayList nota
		Nota nota1 = new Nota(new float[]{9,8,9});
		Nota nota2 = new Nota(new float[]{5,4,9});
		Nota nota3 = new Nota(new float[]{3,6,9});
		Nota nota4 = new Nota(new float[]{7,8,9});
		Nota nota5 = new Nota(new float[]{3,5,1});
		
		
		// criado ArrayList das notas
		ArrayList<Nota> not1 = new ArrayList<Nota>();
		not1.add(nota1);
		ArrayList<Nota> not2 = new ArrayList<Nota>();
		not2.add(nota2);
		ArrayList<Nota> not3 = new ArrayList<Nota>();
		not3.add(nota3);
		ArrayList<Nota> not4 = new ArrayList<Nota>();
		not4.add(nota4);
		ArrayList<Nota> not5 = new ArrayList<Nota>();
		not5.add(nota5);
		ArrayList<Nota> not6 = new ArrayList<Nota>(); // 
		not6.add(nota5);
		not6.add(nota3);

		
		// instacia um aluno da classe Aluno e preeche seus atributos
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Uilham Oliveira");
		aluno1.setNomeEscola("IFSul-Bage");
		aluno1.setDisciplina(listaDisciplinasSegundoSemestre);
		aluno1.setIdade(39);
		aluno1.setDataMatricula(Aluno.getDataFormatada(new Date()));
		aluno1.setSemestreMatricula(2);
		aluno1.getDisciplina().get(0).setNota(not1);
		aluno1.getDisciplina().get(1).setNota(not3);
		aluno1.getDisciplina().get(2).setNota(not1);
		aluno1.getDisciplina().get(3).setNota(not4);
		aluno1.getDisciplina().get(4).setNota(not1);
//		
//		
		System.out.println(aluno1.toString());
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Inácio Machado");
		aluno2.setNomeEscola("IFSul-Bage");
		aluno2.setDisciplina(listaDisciplinasSegundoSemestre);
		aluno2.setIdade(20);
		aluno2.setDataMatricula(Aluno.getDataFormatada(new Date()));
		aluno2.setSemestreMatricula(2);
		aluno2.getDisciplina().get(0).setNota(not3);
		aluno2.getDisciplina().get(1).setNota(not4);
		aluno2.getDisciplina().get(2).setNota(not1);
		aluno2.getDisciplina().get(3).setNota(not5);
		aluno2.getDisciplina().get(4).setNota(not6);

		
		System.out.println(aluno2.toString());
		
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Lucas Wollmann");
		aluno3.setNomeEscola("IFSul-Bage");
		aluno3.setDisciplina(listaDisciplinasSegundoSemestre);
		aluno3.setIdade(22);
		aluno3.setDataMatricula(Aluno.getDataFormatada(new Date()));
		aluno3.setSemestreMatricula(2);
		aluno3.getDisciplina().get(0).setNota(not2);
		aluno3.getDisciplina().get(1).setNota(not5);
		aluno3.getDisciplina().get(2).setNota(not5);
		aluno3.getDisciplina().get(3).setNota(not3);
		aluno3.getDisciplina().get(4).setNota(not5);
//		
		
		System.out.println(aluno3.toString());

	
		
		
	}

}
