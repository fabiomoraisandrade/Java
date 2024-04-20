package fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		// Trabalho na terça  (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou Tv 50\"? " + comprouTV50); // A contra barra \ diz para o Java que você quer usar as aspas duplas dentro da string
		System.out.println("Comprou Tv 50\"? " + comprouTV32);
		System.out.println("Comprou Soverte? " + comprouSorvete);
		System.out.println("Mais Saudavel? " + maisSaudavel);
		
	}
}
