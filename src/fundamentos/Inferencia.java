package fundamentos;

/*
 * Para declarar uma variável em Java, segue os passos:
 * 1 - Tipo (Double - float [Double é o dobro do Float])
 * 2 - Nome da variável
 * 3- Valor que será atribuído
 * 
 * Inferência
 * É possível declarar uma variável no Java sem declarar o tipo. Colocando a variável como var, depois o nome dela
 * e depois o seu valor, pelo valor colocado, o java vai inferir o tipo da variável. Se o valor for um texto, o Java
 * vai inferir que ela é do tipo String e irá amarrá-la a esse tipo, não sendo possível atribuir um valor numérico
 * pois seria de outro tipo.*/

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
	}
}
