package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		Data d1 = null;
		d1.mes = 3;
		//Não é possível acessar métodos e atributos de uma variável nula pois ela não tem nenhum endereço de memória. Dessa forma, a aplicação irá quebrar.
		
		String s2 = null;
		System.out.println(s2.concat("???"));
	}
}
