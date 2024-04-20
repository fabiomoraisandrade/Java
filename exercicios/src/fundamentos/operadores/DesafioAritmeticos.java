package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		/*
		 * int a = 3 * 4 - 10; int b = (int) Math.pow(a, 3); //É necessário fazer o
		 * casting pois a função Math.pow retorna um double. double c = Math.pow(a, 3);
		 * System.out.println(b); System.out.println(c);
		 */
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1-5) * (2-7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double result = superior / inferior;
		
		System.out.println(result);
		
		double expression = Math.pow((Math.pow((6 * (3 + 2)), 2) / (3 * 2) - Math.pow(((1-5) * (2 - 7) / 2), 2)), 3) / Math.pow(10, 3);
		System.out.println(expression);
	}
}
