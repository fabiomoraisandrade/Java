package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		
		System.out.println(c);
		c %= 2; // c = c % 2; Resultado dessa operação dará 0 (par) ou 1 (ímpar)
		System.out.println(c);
		
		
		
	}
}
