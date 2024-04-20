package fundamentos;

import java.util.Date;

import javax.swing.JButton;

public class Import {
	
	public static void main(String[] args) {
		java.lang.String b = "Boa tarde";     //Tudo que está no Java lang faz parte do pacote básico do Java e não precisa colocar
		java.lang.System.out.println(b);
		
		String s = "Bom dia";
		System.out.println(s);
		
		Date d = new Date();                 //A data está por exemplo no Java Util.
		System.out.println(d);
		
//		JButton botao = new JButton();
	}
}
