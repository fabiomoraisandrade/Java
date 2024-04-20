package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//Integer i = Integer.parseInt(entrada.next());
		Integer i = 10000; // Wrapper do tipo primitivo int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); //Converte uma string para Wrapper Booleano. Observe que existe o tipo primitivo boolean e o Wrapper Boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //Wrapper do tipo primitivo char
		System.out.println(c + "...");
	}
}
