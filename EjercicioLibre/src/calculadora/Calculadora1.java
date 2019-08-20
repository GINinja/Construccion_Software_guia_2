package calculadora;

import java.util.Scanner;

public class Calculadora1 {

	String unidad;
	int respuesta;
	double masa_molar, masa, volumen;
	double conc_molar;
	double conc_masa;
	double moles;
	double concentracion;

	public void calculadora() {

		int a;
		// Se declaran las variables
		// Este while hace el el programa se reinice automaticamente al terminar
		while (2 > 1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Este programa convierte concentraciones. \n"
					+ "Para calcular de g/L a mol/L, ingrese 1 . Para convertir \n" + "de mol/L a g/L ingrese 2 .");
			respuesta = scan.nextInt();
			// Se imprimen las instrucciones del programa
			while (respuesta != 1 && respuesta != 2) {
				System.out.println("Este programa convierte concentraciones. \n"
						+ "Para calcular de g/L a mol/L, ingrese 1 . Para convertir \n" + "de mol/L a g/L ingrese 2.");
				respuesta = scan.nextInt();
			}
			// Este loop se activa en caso de ingresar otro numero de 1 o 2
			switch (respuesta) {
			case 1:
				System.out.println("Ingrese la concentraci�n en g/L: ");
				conc_masa = scan.nextDouble();
				System.out.println("Ingrese el volumen de la soluci�n en L: ");
				volumen = scan.nextDouble();
				System.out.println("Ingrese la masa molar de la sustancia en g/mol: ");
				masa_molar = scan.nextDouble();
				masa = conc_masa * volumen;
				moles = masa_molar / masa;
				conc_molar = moles / volumen;
				concentracion = conc_molar;
				unidad = " M";
				break;
			case 2:
				System.out.println("Ingrese la concentraci�n en mol/L: ");
				conc_molar = scan.nextDouble();
				System.out.println("Ingrese el volumen de la soluci�n en L: ");
				volumen = scan.nextDouble();
				System.out.println("Ingrese la masa molar de la sustancia en g/mol: ");
				masa_molar = scan.nextDouble();
				moles = conc_molar * volumen;
				masa = moles * masa_molar;
				conc_masa = masa / volumen;
				concentracion = conc_masa;
				unidad = " g/L";
				break;
			default:
				System.out.println("El programa se cerrar�");
				concentracion = 0.0;
				unidad = "no hay unidad";
				/**
				 * Dado que hay casos definido para 1 y para 2 y pora todo lo dem�s el default
				 * no deber�a poder ejecutarse
				 */

			}
			System.out.println("La concentraci�n de la soluci�n es: " + concentracion + unidad + "\n");

		}
	}

}
