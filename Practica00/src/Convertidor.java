/**
 * Class convertidor. Clase donde se diseña la interaz de usuario para usar un
 * convertidor de sistemas numéricos.
 * @author Luis Geovanni Méndez Ávila. Nro de cuenta: 317143980.
 */

import java.util.Scanner;
public class Convertidor{

	/**
	 * Imprime las opciones del menu principal.
	 */
	public static void opcionesMenu(){
		System.out.println("----------------CONVERTIDOR DE NUMEROS---------------");
		System.out.println("Por favor seleccione una opción: \n" +
							"1  : Convertir de decimal a binario \n" +
							"2  : Convertir de decimal a octal \n" +
							"3  : Convertir de decimal a hexadecimal \n" +
							"4  : Convertir de binario a octal \n" +
							"5  : Convertir de binario a decimal \n" +
							"6  : Convertir de binario a hexadecimal \n" +
							"7  : Convertir de octal a binario \n" +
							"8  : Convertir de octal a decimal \n" +
							"9  : Convertir de octal a hexadecimal \n" +
							"10 : Convertir de hexadecimal a binario \n" +
							"11 : Convertir de hexadecimal a octal \n" +
							"12 : Convertir de hexadecimal a decimal\n" );
	}

	/**
	 * Recibe la opción seleccionada de las opciones dadas. Depués precede a hacer la
	 * conversión.
	 * @param opcion. La eleccion del usuario.
	 * @param numero. El numero que quieres transformar.
	 */
	public static void menuPrincipal(int opcion, String numero){

		switch(opcion){
			case 1:
				try{
					System.out.println("Numero en decimal: " + numero);
					int num = Integer.parseInt(numero);
					System.out.println("En binario es: " + Funciones.decimal_binario(num) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico decimal.");
				}
				break;

			case 2:
				try{
					System.out.println("Numero en decimal: " + numero);
					int num = Integer.parseInt(numero);
					System.out.println("En octal es: " + Funciones.decimal_octal(num) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico decimal.");
				}
				break;

			case 3:
				try{
					System.out.println("Numero en decimal: " + numero);
					int num = Integer.parseInt(numero);
					System.out.println("En hexadecimal es: " + Funciones.decimal_hexadecimal(num) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico decimal.");	
				}
				break;

			case 4:
				try{
					System.out.println("Numero en binario: " + numero);
					System.out.println("En octal es: " + Funciones.binario_octal(numero) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico binario.");
				}
				break;

			case 5:
				try{
					System.out.println("Numero en binario: " + numero);
					System.out.println("En decimal es: " + Funciones.binario_decimal(numero) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico binario.");	
				}
				break;

			case 6:
				try{
					System.out.println("Numero en binario: " + numero);
					System.out.println("En hexadecimal es: " + Funciones.binario_hexadecimal(numero) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico binario.");	
				}
				break;

			case 7:
				try{
					System.out.println("Numero en octal: " + numero);
					System.out.println("En binario es: " + Funciones.octal_binario(numero) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico octal.");	
				}
				break;

			case 8:
				try{
					System.out.println("Numero en octal: " + numero);
					System.out.println("En decimal es: " + Funciones.octal_decimal(numero) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico octal.");
				}
				break;
				
			case 9:
				try{
					System.out.println("Numero en octal: " + numero);
					System.out.println("En hexadecimal es: " + Funciones.octal_hexadecimal(numero) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico octal.");
				}
				break;
				
			case 10:
				try{
					System.out.println("Numero en hexadecimal: " + numero);
					System.out.println("En binario es: " + Funciones.hexadecimal_binario(numero) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico hexadecimal.");
				}
				break;

			case 11:
				try{
					System.out.println("Numero en hexadecimal: " + numero);
					System.out.println("En octal es: " + Funciones.hexadecimal_octal(numero) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico hexadecimal.");
				}
				break;

			case 12:
				try{
					System.out.println("Numero en hexadecimal: " + numero);
					System.out.println("En decimal es: " + Funciones.hexadecimal_decimal(numero) + "\n");
				}catch(Exception ex){
					System.out.println("Unicamente se puede convertir numeros enteros positivos y" +
										" digitos dentro del rango valido para el sistema numerico hexadecimal.");
				}
				break;

			default:
				System.out.println("No te pases de listo >:(");
		}

	}

	/**
	 * Método main.
	 */
	public static void main(String[] args){
	
		int continuar = 1;
		while(continuar == 1){

			opcionesMenu();

			System.out.println("Por favor ingrese la opcion que necesite: ");
			Scanner entrada1 = new Scanner(System.in);
			Scanner entrada2 = new Scanner(System.in);
			Scanner entrada3 = new Scanner(System.in);
			int opcion = entrada1.nextInt();
			System.out.println("Ingrese el numero que desea convertir: ");
			String numero = entrada2.next();
			System.out.println("\n");
			menuPrincipal(opcion, numero);

			System.out.println("Desea continuar?? (Presione 1 para continuar, presione 0 para terminar.)");
			continuar = entrada3.nextInt();
		}
	}


}