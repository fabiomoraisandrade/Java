package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //conversão implícita
		System.out.println(a);
		
		float b = (float) 1.1234567888; //conversão explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //conversão explícita (CAST) - int é tem maior espaço de armazenamento do que o byte
		System.out.println(d);
		
		double e = 1.99999; //conversão explícita (CAST)
		int f = (int) e;
		System.out.println(f);
	}
}
