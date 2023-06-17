package generics;

//A classe caixa foi criada usando o Generics que foi definido como um T. Esse tipo genérico T será definido quando for instanciado um
//objeto Caixa, podendo ser String, Double ou qualquer coisa.
public class Caixa<T> {

	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
