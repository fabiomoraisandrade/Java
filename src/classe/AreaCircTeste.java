package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		// a1.pi = 100000; Essa não é a melhor maneira de acessar o valor de pi que tem o valor direto na classe produto (palavra static) e não no objeto instanciado a partir da classe.
		
		AreaCirc a2 = new AreaCirc(5);
		// a2.pi = 0;
		
		// AreaCirc.PI = 3.1415; //Maneira correta de acessar o valor de pi. Com o final static, não é mais possível alterar o valor de PI.
		System.out.println(a1.area());
		
		// AreaCirc.PI = 0.1;		
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI); // também possível fazer isso com o Math do Java.
		System.out.println(AreaCirc.area(100)); //metodo area que pertence a classe.
	}
}
