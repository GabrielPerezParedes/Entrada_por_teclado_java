package view;

import java.util.Scanner;

public class Introducir_por_Scanner {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 /*
		  * 
		  * ahora digitaremos una cadena 
		  * 
		  */
		 
		 String cadena;
		 
		 System.out.println("Digite una cadena : ");
		 
		 cadena = entrada.nextLine();
		 
		 //
		 //cadena = entrada.next();
		 //
		 
		 /*
		  * cuando ponemos ".next" a la hora de guardar una cadena de caracteres 
		  * este solo guardara hasta encontrar un espacion y luego dejara de imprimir por eso 
		  * es que usaremos el ".nextln"
		  * 
		  */
		  
		 System.out.println("La cadena de caracteres que dijito es : " +cadena);

		 /*
		  * 
		  * 
		  */
		 
		 System.out.println();
		 
		 int numero;
		 
		 System.out.println("Digite el numero de entrada :");
		 
		 numero = entrada.nextInt();
		 
		 System.out.println("El numero es: " +numero);
		 
		 /*
		  * 
		  * 
		  */
		 
		 System.out.println();
		 
		 /*
		  * 
		  * 
		  */

		 double numerod;
		 
		 // A la hora de ingresar un numero decimal tenemos que digitar en la consola el numero con una coma en vez de un punto
		 System.out.println("Digite el numero decimal de entrada :");
		 
		 numerod = entrada.nextDouble();
		 
		 System.out.println("El numero decimal es: " +numerod);
		 
		 /*
		  * 
		  * 
		  */
		 
		 System.out.println();
		 //Ahora como hacemos para guardar una letra
		 
		 char letra;
		 
		 System.out.println("Digite una letra : ");
		 
		 letra = entrada.next().charAt(0);
		 
		 /* que hicimos aqui es que para que guarde la letra dentro de nuestro "char letra"
		  * es que luego del ".next()"
		  * anadimos un ".charArt" y dentro de su parentesis ponemos
		  * la posicion de la LETRA la cual queremos guardar 
		  * digo posicion por si es que el usuario no los ingrasa una letra y en cambio ingresa
		  * una palabra "(0);"
		  */
		 
		 System.out.println("La letra es: " +letra);
		 
		 
	}

}
