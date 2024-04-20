package fundamentos;

public class PrimitivoVsObjeto {
	/*
	 * Java é uma linguagem centrada em classes. Tirando os tipos primitivos, qualquer outra classe em Java é um objeto
	 * como pro exemplo, a classe String. Quando é criado uma variável através de uma classe String, essa variável é um
	 * objeto que possui métodos que podem ser usados, como por exemplo .toUpperCase().
	 */
	public static void main(String[] args) {
		
		String s = "texto";
		s.toUpperCase();
		
		//Wrappers são a versão objeto dos tipos primitivos. Os tipos primitivos não tem métodos como os objetos possuem
		//pela notação .toUpperCase() por exemplo.
		int a = 123;
		System.out.println(a);
	}
}
