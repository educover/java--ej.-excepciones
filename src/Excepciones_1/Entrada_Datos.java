package Excepciones_1;

import java.io.IOException;
import java.util.*;

public class Entrada_Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Que deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner S = new Scanner(System.in);
		int decision = S.nextInt();
		
		if(decision==1){
			try{
			pedirDatos();
			} catch (Exception e){
				System.out.println("Introduce datos correctos");
			}
		} else if (decision==2){
			System.exit(0);
		}
		S.close();
		System.out.println("Hemos terminado");
	}

	
	static void pedirDatos(){
		//try{
		Scanner a = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombreU = a.nextLine();
		
		System.out.println("Introduce tu edad");
		int edadU = a.nextInt();
		
		System.out.println("Nombre: " + nombreU + " Edad: " + edadU + " El año que viene tendras: " + (edadU+1));
		
		a.close();
		//} catch (InputMismatchException e){
		
		//System.out.println("Introduce datos correctos");
		
		//}
		
		
	
	}
}
