package view;

import java.util.Scanner;

import controller.naturaisController;

public class Principal {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int quantidade = scan.nextInt();
			scan.close();
		
			naturaisController soma = new naturaisController();
			int resultado = soma.somaNat(quantidade);
			System.out.println(resultado);
	}

}
