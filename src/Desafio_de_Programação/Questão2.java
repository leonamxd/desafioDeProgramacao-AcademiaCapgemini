package Desafio_de_Programa��o;

import java.util.Scanner;

public class Quest�o2 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String password = scan.next();
		int aux = 0;

		if (password.length() < 6) {
			aux = 6 - password.length();
		}
		System.out.println(aux);
	}
}