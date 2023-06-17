package classe;

public class PrimeiroTrauma {

	int a = 3;
	static int b = 4; //Também é possível colocar a instancia b para estática. Algo estático pode acessar algo estático. Ou seja um membro de classe consegue acessar outro membro de classe
	//Só é possível, a partir de um método de classe acessar um atributo de instancia se antes criar uma instancia
	//Mesmo estando na própria classe só é possível acessar um membro de instancia a partir de um método estático se for criado uma instancia.
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		System.out.println(b);
	}
}
