package oo.abstrato;

//A classe abstrata é como se ela estivesse inacabada. O método mover não é possível, por exemplo, definir para que todos os animais se comportem com a definição dele.
public abstract class Animal {

	public String respirar() {
		return "Usando oxigenio";
	}
	
	//Quando o método é definido como abstrato, significa que você não tem como definir o método que vai se comportar assim para toda classe animal
	public abstract String mover();
}
