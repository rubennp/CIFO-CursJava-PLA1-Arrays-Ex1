package main;

import java.util.Scanner;

public class Main {

	/*
	 * Pide 10 números entre el 1 y el 10.
	 * Los guarda en un Array.
	 * Muestra la suma de todos ellos.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] nums = new int[10];
		int suma = 0;
		
		System.out.println("Introduce 10 números entre el 1 y el 10 y yo los sumaré");
		System.out.println("-------------------------------------------------------");
		
		for (int n = 0; n < 10; n++) {
			do {
				System.out.println("* Número " + (n+1) + ": ");
				nums[n] = in.nextInt();
				if (nums[n] < 1 || nums[n] > 10) System.out.println("¡Tienen que ser entre el 1 y el 10!");
				else suma += nums[n];
			} while (nums[n] < 1 || nums[n] > 10);
		}
		
		System.out.println("-> La suma de los números que has introducido es: " + suma);
		
		in.close();
	}
}