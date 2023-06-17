package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome) {
		this.nome = nome;
	}
	
	//Método que adiciona aluno e cria uma relação bidirecional
	//ou seja, um curso tem um aluno e esse aluno tem o curso.
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
