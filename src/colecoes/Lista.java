package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
//		List<Usuario> lista = new ArrayList<>(); De forma alternativo, pode ser importado o Javautil List
		
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3));
		
		lista.remove(1);
		lista.remove(new Usuario("Manu"));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
