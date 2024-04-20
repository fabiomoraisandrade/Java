package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.1415; // A palavra static serve para os valores de pi seja pertencente a classe. Os objetos que serão instanciados por essa classe não terão seus valores próprios de pi e sim terá o valor de pi dessa classe.
									 // A palavra final faz o PI (maiúsculo por convenção quando usa o final static) ser uma constante e não é mais possível alterar o valor de PI em objetos instanciados a partir dessa classe.
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	//Também é possível criar um método estático
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
