package convesorTemperartura;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		//variaveis
		double c, f;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//entrada de dados
		System.out.println("Conversão de temperatura");
		System.out.print("Digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		//processamento
		c = (5 *(f - 32)) / 9;
		//saida
		System.out.println("Temperatura em Celsisu: "
				+ formatador.format(c) + "°C");
		
		teclado.close();

	}//fim main

}//fim classe
