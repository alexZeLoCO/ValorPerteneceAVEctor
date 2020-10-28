import java.util.Scanner;		//IMPORTAR SCANNER
/**
 * @author LOS PROFSORES DE IP
 *	EL PROGRAMA COMPRUEBA SI UN VALOR INTRODUCIDO POR EL USUARIO PERTENECE O NO A UN VECTOR.
 *	EL VECTOR CONTIENE LOS 10 PRIMEROS NÚMEROS PARES. SIN EL 0.
 */
public class ExisteValorEnVector {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		int [] vector = new int [10];		//CREAR VECTOR
		
		for (int a=1;a<10;a++) {		//RELLENAR VECTOR
			vector[a] = a*2;		//10 PRIMEROS PARES
		}
		
		System.out.print("Introduzca un entero: ");		//SOLICITA VALOR
		int n = teclado.nextInt();		//VALOR ALMACENADO EN N
		
		int i = 0;		//INICIALIZAR I
		while ((i<vector.length)&&(vector[i]!=n)) {		//MIENTRAS I SEA MENOR QUE 10 Y N DISTINTA DE VALOR DE VECTOR
			i++;		//SUMAR VALOR A I
		} 
		if (i<vector.length) {		//SI I ES MENOR QUE TAMAÑO VECTOR (SE ENCONTRÓ EL VALOR N=VECTOR[I])
			System.out.print("El valor está en el vector.");		//OUTPUT
		} else {		//SI NO. (NO SE ECONTRÓ N=VECTOR[I])
			System.out.print("El valor no está en el vector.");		//OUTPUT
		}
	}
}

