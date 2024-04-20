package oo.composicao;

public class Carro {

	//Relação de 1 para 1. Cada carro tem 1 motor e cada motor tem 1 carro
	//Instanciando o motor na classe carro
	Motor motor = new Motor();
	
	void acelerar() {
		if (motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
