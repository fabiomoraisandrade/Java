package oo.heranca;

//A classe Heroi recebe código (herança) da classe Jogador pela palavra extends
public class Heroi extends Jogador{

	public Heroi(int x, int y) {
		super(x, y);
	}
	
	@Override
	public boolean atacar (Jogador oponente) {
		boolean ataque1 = super.atacar(oponente); //Usa o método da classe pai (Jogador)
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}
