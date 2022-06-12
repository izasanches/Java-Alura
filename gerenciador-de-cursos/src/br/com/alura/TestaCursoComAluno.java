package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 123456);
		Aluno a2 = new Aluno("Gulherme Silveira", 789123);
		Aluno a3 = new Aluno("Mauricio Aniche", 321654);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados:");
		//javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		
		//modo antigo
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		while (iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 123456);
		System.out.println("E esse Turini, está?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é == ao turini?");
		System.out.println(a1 == turini);
		
		System.out.println("O a1 é equals ao turini?");
		System.out.println(a1.equals(turini));
	}

}