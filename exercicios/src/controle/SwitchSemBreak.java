package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Nao sei nada.");
		}
		System.out.println("Fim");
			
		/*
		 * O Switch case sem o break, executa todos os cases abaixo
		 * do que entrou. Essa situação nao é bem comum. Para esse
		 * caso das faixas, serve pois se você sabe uma faixa, voce
		 * sabe todas as outras abaixo dela.
		 */
		
	}
}
