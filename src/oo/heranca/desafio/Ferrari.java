package oo.heranca.desafio;

//A interface é usada para colocar métodos que você vai definir o comportamento na própria classe, como por exemplo a interface esportivo que tem o método ligar e desligar turbo implementa a Ferrari. Cada carro esportivo terá um comportamento de ligar turbo.
public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	//Construtor padrão que chama o construtor da classe pai
	//Deixando os construtores publicos, será possível instnaciar essas classes em outra classe fora desse pacote
	public Ferrari() {
		this(315);
	}

	//Construtor que recebe como parametro uma velocidade que chama o construtor da classe pai para salvar essa velocidade quando for instanciada.
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
//	@Override //Esse método é uma validação para indicar que o método acelear da classe filha sobrescreverá o método acelerar da classe Pai
//	public void acelerar() {
//		super.acelerar();
//	}
	
	//Metodos da interface Esportivo
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
}
