package practica5;

import java.util.Scanner ;

public class Calculadora {

	public static void main(String[] args) {
		
		Metodos operaciones = new Metodos();
		Scanner entrada = new Scanner(System.in);
		int numero1 , numero2 , accion;
		double resultado;
		boolean op = true;
		
		while (op) {
			System.out.println("ELIJA LA OPERACIÓN A REALIZAR:"); //ON
			System.out.println("1) Sumar");        //Sumar	
			System.out.println("2) Restar");        //Restar
			System.out.println("3) Multiplicar");        //Multiplicar
			System.out.println("4) Dividir");        //Dividir
			System.out.println("5) ON/OFF");        //OFF
			accion = entrada.nextInt();
			
			
			if (accion==5) {
				System.out.println("Bienvenido a su Calculadora Virtual!");
				
			} else {
				
				switch (accion) {
				
				case 1 :
					System.out.println("Ingrese un Nro: ");
					numero1 = entrada.nextInt();
					System.out.println("Ingrese otro Nro: ");
					numero2 = entrada.nextInt();
					resultado = operaciones.Sumar(numero1 , numero2);
					System.out.println("El resultado de la suma es: " + resultado);
					break;
					
				case 2 :
					System.out.println("Ingrese un Nro: ");
					numero1 = entrada.nextInt();
					System.out.println("Ingrese otro Nro: ");
					numero2 = entrada.nextInt();
					resultado = operaciones.Restar(numero1 , numero2);
					System.out.println("El resultado de la resta es: " + resultado);
					break;
					
				case 3 :
					System.out.println("Ingrese un Nro: ");
					numero1 = entrada.nextInt();
					System.out.println("Ingrese otro Nro: ");
					numero2 = entrada.nextInt();
					resultado = operaciones.Multiplicar(numero1 , numero2);
					System.out.println("El resultado de la Multiplicación es: " + resultado);
					break;
					
				case 4 :
					System.out.println("Ingrese un Nro: ");
					numero1 = entrada.nextInt();
					System.out.println("Ingrese otro Nro: ");
					numero2 = entrada.nextInt();
					resultado = operaciones.Dividir(numero1 , numero2);
					System.out.println("El resultado de la División es: " + resultado);
					break;	
					
				default :
					System.out.println("Opción Invalida, intente nuevamente...");
					
				}
				
			}
			
			
			
		}

	}

}
