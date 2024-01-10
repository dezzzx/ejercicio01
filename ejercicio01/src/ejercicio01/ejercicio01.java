package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("                                                                      PANTALLA");
            System.out.println();	        
	        int filas = 6;
	        int columnas = 10;
	        int[][] matriz = new int[filas][columnas];
	        int valor = 1;
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                matriz[i][j] = valor;
	                valor++;
	            }
	        }

	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print(matriz[i][j]+"->Libre" + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        int exit = 0;
	        int asientosocupados=0;
			int [] ocupados = new int [60];
			int asiento=0;
	        do {
	        	
	        	try {
	                System.out.println("¿Qué asiento quiere ?");
	                asiento = scanner.nextInt();
	            } catch (InputMismatchException e) {
	                System.out.println("Formato incorrecto. Por favor, introduce un número entero.");
	                scanner.next(); 
	                continue;
	            }
	        	
	          
	            boolean verificador = false;
	            for (int i = 0; i < asientosocupados; i++) {
	                if (ocupados[i] == asiento) {
	                    verificador = true;
	                    break;
	                }
	            }
	            
	            
	            if (verificador) {
	                System.out.println("Ese asiento está ocupado. Por favor, elija otro.");
	            }else if(asiento>60 || asiento<1){
	            	System.out.println("Valor fuera de los limites");
	            }else {
	                ocupados[asientosocupados] = asiento;
	                asientosocupados++;
	                
	                
	                System.out.println("                                                                      PANTALLA");
	                System.out.println();
	                int filas1 = 6;
	                int columnas1 = 10;
	                int[][] matriz1 = new int[filas1][columnas1];
	                int valor1 = 1;
	                for (int i = 0; i < filas1; i++) {
	                    for (int j = 0; j < columnas1; j++) {
	                        matriz1[i][j] = valor1;
	                        valor1++;
	                    }
	                }

	                for (int i = 0; i < filas1; i++) {
	                    for (int j = 0; j < columnas1; j++) {
	                        boolean ocupado = false;
	                        
	                        for (int k = 0; k < asientosocupados; k++) {
	                            if (ocupados[k] == matriz1[i][j]) {
	                                ocupado = true;
	                                break;
	                            }
	                        }
	                        if (ocupado) {
	                            System.out.print(matriz1[i][j] + "->Ocupado" + "\t");
	                        } else {
	                            System.out.print(matriz1[i][j] + "->Libre" + "\t");
	                        }
	                    }
	                    System.out.println();
	                }
	                System.out.println();
	            }
	        	
	            System.out.println("¿Quiere otro asiento? Si=Cualquier numero 2=No");
	             exit = scanner.nextInt();
	        }while(exit!=2);
	        scanner.close();
	        System.out.println("Entrada/s conseguidas disfrute de ellas");
	    }
	
	}
	
		
	

		
	


