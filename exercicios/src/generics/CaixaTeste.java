package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		//No momento de instanciar um objeto Caixa, é colocado o tipo (nesse caso como String) com a notação do generics (<>)
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo!");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.14);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
