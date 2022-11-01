import java.util.Arrays;
import java.util.Scanner;


public class Start {
	
	// ***Funciones***
	
	
	// Función sumar
	public static float suma (float a, float b) {

		float resultSum = 0.0f;		
		resultSum = a+b;
		
		return resultSum;
		
	}
	
	// Función restar
	public static float resta (float a, float b) {

		float resultRest = 0.0f;		
		resultRest = a-b;
		
		return resultRest;
		
	}

	// Función multiplicar
	public static float multiplicacion (float a, float b) {

		float resultMult = 0.0f;		
		resultMult = a*b;
		
		return resultMult;
		
	}

	// Función dividir
	public static float division (float a, float b) {

		float resultDiv = 0.0f;
		float error = -1.0f;
		
		resultDiv = a/b;
		
		if (b == 0) {    // Evaluar si el valor introducido en b es 0.
			return error;
		} else {
			return resultDiv;
		}
				
	}
	
	// Función para hallar el mayor de 3 números.
	public static int mayor (int a, int b, int c) {
		
		int [] numeros = {a, b, c}; // Iniciar un array para guardar los tres valores dados por el usuario.
		
		Arrays.sort(numeros); // Ordenamos los valores de menor a mayor.
		
		return numeros[2]; // Devolvemos la útima posición del array donde se encuentra el valor mas alto de los dados por el usuario.
		
	}
	
	public static int factorial (int entrada) {
        
		int resultado = 1;
        int num = entrada; // "entrada" sera el valor a utilizar como número para hallar el factorial, se guarda en la variable num. 
        int error = -1;
        
        //while (num != 0) { // Mientras que num sea distinto de 0 se ejecutará la instrucción.
        //    resultado=resultado*num;
        //    num--; // En cada paso por esta instrucción se descontará 1 a la variable num.
        //}   
        
		/*
		CORRECCIÓN, EN LA ZONA COMENTADA ARRIBA HAY UN BUCLE INNECESARIO DEBIDO A QUE YA EL IF CONTROLA LA ENTRADA DE UN NUMERO INCORRECTO
		EL BUCLE WHILE TIENE SENTIDO EN EL ELSE, PERO NO FUERA DE EL.
		*/	

        if (entrada <= 0) {
        	return error;
        } else {

			while (num != 0) { // Mientras que num sea distinto de 0 se ejecutará la instrucción.
				resultado=resultado*num;
				num--; // En cada paso por esta instrucción se descontará 1 a la variable num.
			}
			
        	return resultado;
        }
    }
	
	// ***Función principal***
	
	public static void main(String[] args) {
		
		// Inicialización de datos para el menú
		
		Scanner entradaDatos = new Scanner (System.in);
		boolean salir = false;
		int opcion = 0;
				
		do {			
			System.out.println("*********************************");
			System.out.println("  Calculadora de Calculator S.A  ");
			System.out.println("*********************************");
			System.out.print("\n");
			System.out.println("-----------------------------");
			System.out.println("--       Opciones          --");
			System.out.println("-----------------------------");
			System.out.print("\n");
			System.out.println("\t1. Función Sumar");
			System.out.println("\t2. Función Restar");
			System.out.println("\t3. Función Multiplicar");
			System.out.println("\t4. Función Dividir");
			System.out.println("\t5. Función Número mayor de 3 números");
			System.out.println("\t6. Función Factorial");
			System.out.print("\n");
			System.out.println("\t0. Salir");
			System.out.print("\n");
			System.out.print("Introduzca una opción: ");
						
			opcion = entradaDatos.nextInt();
			
			if (opcion>6 || opcion<0) {
				System.out.print("\n");
				System.out.println("--------------------------------------------");
				System.out.println("Opción errónea");
				System.out.println("--------------------------------------------");
				System.out.print("\n");
			} else {
				switch (opcion) {
				case 1: // Función sumar
					float sum = 0.0f;
					float aSum = 0.0f;
					float bSum = 0.0f;
					
					System.out.print("\n");
					System.out.print("Introduzca el primer número flotante a sumar: ");
					
					aSum = entradaDatos.nextFloat();
					
					System.out.print("Introduzca el segundo número flotante a sumar: ");
					
					bSum = entradaDatos.nextFloat();

					sum=suma(aSum, bSum); // Inicialización de la función sumar
					
					System.out.print("\n");
					System.out.println("--------------------------------------------");
					System.out.println("La suma de "+aSum+" y "+bSum+" es: "+sum);
					System.out.println("--------------------------------------------");
					System.out.print("\n");
					
					break;
				
				case 2: // Función restar
					float rest = 0.0f;
					float aRest = 0.0f;
					float bRest = 0.0f;
					
					System.out.print("\n");
					System.out.print("Introduzca el primer número flotante a restar: ");
					
					aRest = entradaDatos.nextFloat();
					
					System.out.print("Introduzca el segundo número flotante a restar: ");
					
					bRest = entradaDatos.nextFloat();
					
					rest=resta(aRest, bRest); // Inicialización de la función restar.
					
					System.out.print("\n");
					System.out.println("--------------------------------------------");
					System.out.println("La resta de "+aRest+" y "+bRest+" es: "+rest);
					System.out.println("--------------------------------------------");
					System.out.print("\n");
					break;
				
				case 3: // Función multiplicar.
					float mult = 0.0f;
					float aMult = 0.0f;
					float bMult = 0.0f;
					
					System.out.print("\n");
					System.out.print("Introduzca el primer número flotante a multiplicar: ");
					
					aMult = entradaDatos.nextFloat();
					
					System.out.print("Introduzca el segundo número flotante a multiplicar: ");
					
					bMult = entradaDatos.nextFloat();
					
					mult=multiplicacion(aMult, bMult); // Inicialización de la función multiplicar.
					
					System.out.print("\n");
					System.out.println("--------------------------------------------");
					System.out.println("La multiplicación de "+aMult+" y "+bMult+" es: "+mult);
					System.out.println("--------------------------------------------");
					System.out.print("\n");
					break;
				
				case 4: // Función dividir.
					float div = 0.0f;
					float aDiv = 0.0f;
					float bDiv = 0.0f;
					
					
					System.out.print("\n");
					System.out.print("Introduzca el primer número flotante a dividir: ");
					
					aDiv = entradaDatos.nextFloat();
					
					System.out.print("Introduzca el segundo número flotante a dividir: ");
					
					bDiv = entradaDatos.nextFloat();
					
					div=division(aDiv, bDiv); // Inicialización de la función dividir.
					
					if (div == -1.0f) { // Si la salida de la función devuelve -1.0f significa que el usuario intenta dividir por 0.
						System.out.println();
						System.out.println("--------------------------------------------");
						System.out.println("Error division por 0");
						System.out.println("--------------------------------------------");
					} else {
						System.out.print("\n");
						System.out.println("--------------------------------------------");
						System.out.println("La división de "+aDiv+" y "+bDiv+" es: "+div);
						System.out.println("--------------------------------------------");
						System.out.print("\n");
					}
					
					break;
					
				case 5: // Función mayor de 3.
					int numMayor = 0;
					
			        int [] listaNum = new int [3];

			        for (int i = 0; i< listaNum.length; i++) {
			        	System.out.print("Introduzca el número "+ (i+1) +": ");
			            listaNum[i] = entradaDatos.nextInt();
			        } 
			        /* 	
			          	Con el fin de no meter ningún sysout en las funciones he guardado los datos introducidos por el usuario en 
			          	array de manera que pueda recoger los datos comodamente con un for, una vez hecho esto, paso las posiciones del
			        	array como parametros a la función.
			        */
			        
			        System.out.println();
			        numMayor = mayor(listaNum[0], listaNum[1], listaNum[2]); // Inicialización de la función mayor de 3.
			        System.out.println();
			        System.out.println("--------------------------------------------");
			        System.out.println("El número "+numMayor+" es el mayor de los 3 números.");
			        System.out.println("--------------------------------------------");
					break;
					
				case 6:
					int salidaFactorial = 0;
					int numFactorial = 0;
					
					System.out.print("Introduzca un número para calcular el factorial: ");
					numFactorial = entradaDatos.nextInt();
					
					salidaFactorial = factorial(numFactorial);
					
					if (salidaFactorial == -1) { // Si la salida de la función nos devuelve -1 significa que el usuario introdujo un valor erroneo.
						System.out.println();
						System.out.println("--------------------------------------------");
						System.out.println("Error valor inferior a 0, introduzca un valor superior a 0");
						System.out.println("--------------------------------------------");
					} else {
						System.out.println();
						System.out.println("--------------------------------------------");
						System.out.println("El factorial de "+numFactorial+" es "+salidaFactorial+".");
						System.out.println("--------------------------------------------");
					}					
					break;
					
				case 0:	
					System.out.print("\n");
					System.out.println("--------------------------------------------");
					System.out.println("El programa ha finalizado");
					System.out.println("--------------------------------------------");
					salir = true;
				}
			}
		}
		
		while (!salir);
		
		entradaDatos.close();
	}

}


