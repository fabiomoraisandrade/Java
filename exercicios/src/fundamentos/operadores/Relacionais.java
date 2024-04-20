package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a'; //a variável inteira b está recebendo a variável inteira a que tem valor igual a 97
		
		System.out.println(b);
		System.out.println(a == b);
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
