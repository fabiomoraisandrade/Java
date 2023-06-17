package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;
	
	Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar (Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x); //Diferença entre esse jogador e o oponente no eixo x
		int deltaY = Math.abs(y - oponente.y); //Diferença entre esse jogador e o oponente no eixo y
		
		if (deltaX == 0 && deltaY == 1) { //Um do lado do outro
			oponente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) { //Um do lado do outro
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean andar(Direcao direcao) {
		
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}
}
