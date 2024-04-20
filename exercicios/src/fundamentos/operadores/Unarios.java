package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // Essa expressão é verdadeira porque a operação ++a tem uma maior precedencia do que a comparação e a b-- tem uma menor precedencia do que a comparação. Ou seja, a variável a vai ser incrementada antes da comparação e passará a valer 2. A variável b vale dois e é incrementada apenas depois da comparação.
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
