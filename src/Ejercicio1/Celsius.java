package Ejercicio1;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		//F = 32 + ( 9 * C / 5)
		int Celsius=0;

		System.out.println(ConvertirGrados(Celsius)+" Grados Fahrenheit");
	}
	
	
	public static int ConvertirGrados(int celsius){
		Scanner teclado=new Scanner(System.in);
		int f=0;
		int c=0;
		Boolean error=false;//centinela
		String cadena="";
		
		do{
			System.out.println("Introduce grados Celsius");
			cadena=teclado.nextLine();
			try{
				c=Integer.parseInt(cadena); //intentamos convertirlo en int.
				error=true; //salir del bucle 
			}catch (NumberFormatException e){
				error=false;
				System.out.println("ERROR: dato incorrecto");
			}
		}while(error==false);
		f = 32 + ( 9 * c/  5);
	
	return f;
	}

		
	}