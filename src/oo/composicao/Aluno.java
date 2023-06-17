package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	//O final deixa o objeto constante. Por exemplo, no caso
	//de instanciar a lista como final, significa que ela aponta pra um
	//endereço de memória e não é possível instanciar outra lista que vai
	//apontar pra outro endereço de memória.
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	//Método para procurar um curso a partir de um nome que pertence a determinado aluno
	Curso obterCursoPorNome(String nome) {
		for (Curso curso: this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
	public String toString() {
		return nome;
	}
}
