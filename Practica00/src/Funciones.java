/**
 * Class Funciones. Clase donde se implementan funciones para convertir sistemas numéricos.
 * @author Luis Geovanni Méndez Ávila . Nro de cuenta: 317143980
 */
public class Funciones{

	/**
	 * Funcion que convierte numeros binarios a decimales.
	 * @param cifra . Un dato de tipo String que se busca convertir a decimal.
	 */

	public static int binario_decimal(String cifra){
		int exponente = 0;
		int resultado = 0;

		for(int i = cifra.length()-1; i >= 0; i--){
			int digito = 0;
			
			if(cifra.charAt(i) == '1'){
				digito = 1;
			}

			double potencia = Math.pow(2, exponente);
			resultado += digito*potencia;
			exponente ++;
		}

		return resultado;
	}

	/**
	 * Funcion que convierte numeros binarios a octales.
	 * @param cifra . Un dato de tipo String que se busca convertir a octal.
	 */
	public static int binario_octal(String cifra){
		int resultado = binario_decimal(cifra);
		resultado = decimal_octal(resultado);

		return resultado;
	}

	/**
	 * Funcion que convierte numeros binarios a hexadecimales.
	 * @param cifra . Un dato de tipo String que se busca convertir a hexadecimal.
	 */
	public static String binario_hexadecimal(String cifra){
		int aux = binario_decimal(cifra);
		String resultado = decimal_hexadecimal(aux);

		return resultado;
	}

	/**
	 * Funcion que convierte numeros octales a decimales.
	 * @param cifra . Un dato de tipo String que se busca convertir a decimal.
	 */
	public static int octal_decimal(String cifra){
		int exponente = 0;
		int resultado = 0;
		String octales = "012345678";
		
		for(int i = cifra.length()-1; i >= 0; i--){
			char aux = cifra.charAt(i);
			int valor = octales.indexOf(aux);
			double potencia = Math.pow(8, exponente);
			resultado += valor*potencia;
			exponente ++;
		}

		return resultado;
	}

	/**
	 * Funcion que convierte numeros octales a binarios.
	 * @param cifra . Un dato de tipo String que se busca convertir a binario.
	 */
	public static String octal_binario(String cifra){
		int aux = octal_decimal(cifra);
		String resultado = decimal_binario(aux);

		return resultado;
	}

	/**
	 * Funcion que convierte numeros octales a hexadecimales.
	 * @param cifra . Un dato de tipo String que se busca convertir a hexadecimal.
	 */
	public static String octal_hexadecimal(String cifra){
		int aux = octal_decimal(cifra);
		String resultado = decimal_hexadecimal(aux);

		return resultado;
	}

	/**
	 * Funcion que convierte numeros hexadecimales a binarios.
	 * @param cifra . Un dato de tipo String que se busca convertir a binario.
	 */
	public static String hexadecimal_binario(String cifra){
		int aux = hexadecimal_decimal(cifra);
		String resultado = decimal_binario(aux);

		return resultado;
	}

	/**
	 * Funcion que convierte numeros hexadecimales a octales.
	 * @param cifra . Un dato de tipo String que se busca convertir a octal.
	 */
	public static int hexadecimal_octal(String cifra){
		int resultado = hexadecimal_decimal(cifra);
		resultado = decimal_octal(resultado);

		return resultado;
	}

	/**
	 * Funcion que convierte numeros hexadecimales a decimales.
	 * @param cifra . Un dato de tipo String que se busca convertir a decimal.
	 */
	public static int hexadecimal_decimal(String cifra){
		int exponente = 0;
		int resultado = 0;
		cifra = cifra.toUpperCase();
		String hexadecimales = "0123456789ABCDEF";
		
		for(int i = cifra.length()-1; i >= 0; i--){
			char aux = cifra.charAt(i);
			int valor = hexadecimales.indexOf(aux);
			double potencia = Math.pow(16, exponente);
			resultado += valor*potencia;
			exponente ++;
		}

		return resultado;
	}

	/**
	 * Funcion que convierte numeros decimales a binarios.
	 * @param cifra . Un dato de tipo int que se busca convertir a binario.
	 */
	public static String decimal_binario(int cifra){
		String resultado = "";	
			
		if(cifra == 0){
			return "0";
		}else{
			while(cifra > 0){
			resultado = cifra % 2 + resultado;
			cifra = cifra/2;
			}
		}

		return resultado;
	}

	/**
	 * Funcion que convierte numeros decimales a octales.
	 * @param cifra . Un dato de tipo int que se busca convertir a octal.
	 */
	public static int decimal_octal(int cifra){
		int residuo = 0;
		char[] valores = {'0','1','2','3','4','5','6','7'};
		String resultado = "";

		if(cifra == 0){
			return 0;
		}else{
			while(cifra > 0){
				residuo = cifra % 8;
				char temp = valores[residuo]; 
				resultado = temp + resultado;
				cifra = cifra/8;
			}
		}

		return Integer.parseInt(resultado);
	}

	/**
	 * Funcion que convierte numeros decimales a hexadecimales.
	 * @param cifra . Un dato de tipo int que se busca convertir a hexadecimal.
	 */
	public static String decimal_hexadecimal(int cifra){
		int residuo = 0;
		char[] valores = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String resultado = "";

		if(cifra == 0){
			return "0";
		}else{
			while(cifra > 0){
				residuo = cifra % 16;
				char temp = valores[residuo];
				resultado = temp + resultado;
				cifra = cifra/16;
			}
		}

		return resultado;
	}
}