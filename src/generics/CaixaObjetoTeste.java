package generics;

public class CaixaObjetoTeste {

	//Dessa forma, não apresenta erro de compilação, mas sempre será necessário saber o tipo de informação que chega para fazer o casting
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);
		
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Ola");
		
		Double coisaB = (Double) caixaB.abrir();
		System.out.println(coisaB);
	}
}
