package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		//Instanciando o carro. Como as classes Motor e Carro não são estáticas, cada objeto instanciado terá seu p´roprio motor e carro
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		// Faltou Encapsulamento. O motor não pode girar de forma negativa
		// c1.motor.fatorInjecao = -30;
		System.out.println(c1.motor.giros());
	}
}
