package Desafio_de_Programação;

import java.util.Scanner;

public class Questão1 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}