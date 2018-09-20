package Excepciones_1;

import java.io.*;

import javax.swing.JOptionPane;

public class Comprueba_Mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mimail = JOptionPane.showInputDialog("Introduce mail");
		
		try{
		compruebaMail(mimail);
		} catch (IOException e){
			System.out.println(e);
			System.out.println("Introduce un mail correcto");
		}
	}
	
	static void compruebaMail(String mail) throws IOException{
		int arroba = 0;
		boolean punto = false;
		
		if (mail.length()<3){
			throw new IOException();
		} else {
		
		for(int i=0;mail.length()>i;i++){
			if (mail.charAt(i)=='@'){
				arroba++;
			}
			if (mail.charAt(i)=='.'){
				punto=true;
			}
			
		}
		
		if (arroba==1 && punto==true){
			System.out.println("Mail correcto");
		} else {
			System.out.println("Mail incorrecto");
		}
	}
	
	}
	

}
