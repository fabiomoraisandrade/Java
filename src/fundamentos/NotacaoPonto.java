package fundamentos;

/*
 * Todas as palavras reservadas do Java vem "Em negrito". Os 8 tipos primitivos do java (6 numéricos: byte, short, int, long, float e double
 * e o char e o booleano), vem em negrito. Outros tipos do Java que não são primitivos (String) não vem em negrito.
 */

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
		
		
	}
}
