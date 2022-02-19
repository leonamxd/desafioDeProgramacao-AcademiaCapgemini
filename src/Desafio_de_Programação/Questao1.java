package Desafio_de_Programação;

import java.util.Scanner;

/**
 * 
 * @author Leonam
 *
 */
public class Questao1 {

	public static Scanner scan = new Scanner(System.in);
	/**
	 * 
	 * @param _value Numero de andares da escada
	 */
	public static void Escada(int _value) {
		for (int i = 1; i <= _value; i++) {
			for (int j = _value; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int value = scan.nextInt();
		Escada(value);
	}
}