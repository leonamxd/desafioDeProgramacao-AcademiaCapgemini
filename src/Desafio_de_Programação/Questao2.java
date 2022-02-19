package Desafio_de_Programação;

import java.util.Scanner;

/**
 * 
 * @author Leonam
 *
 */
public class Questao2 {

	public static Scanner scan = new Scanner(System.in);
	
	/**
	 * 
	 * @param _word Senha digitada para ser validada
	 */
	public static void StrongPassword(String _word) {
		int aux = 0;
		if (_word.length() < 6) {
			aux = 6 - _word.length();
		}
		System.out.println(aux);
	}

	public static void main(String[] args) {

		String password = scan.next();
		StrongPassword(password);
	}
}