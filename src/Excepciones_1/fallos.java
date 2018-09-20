package Excepciones_1;

import javax.swing.JOptionPane;

public class fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] miArray = new int[5];
		miArray[0] = 1;
		miArray[1] = 2;
		miArray[2] = 3;
		miArray[3] = 4;
		miArray[4] = 5;
		//miArray[5] = 6;
		
		for (int i=0; i<5; i++){
			System.out.println(miArray[i]);
		}
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));	
		System.out.println("Tu nombre es: " + nombre + " y tu edad es: " + edad);

	}

} 

