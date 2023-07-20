package regra3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RegraTres {

	public static void main(String[] args) {
		// variaveis
		double x, y, valor;
		// Objeto
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// entrada

		System.out.println("Calculo de Regra de 3");
		System.out.println("x % de y = valor");

		System.out.print("Digite o valor de x = ");
		x = teclado.nextDouble();

		System.out.print("Digite o valor de y = ");
		y = teclado.nextDouble();

		// processamento
		valor = (x * y) / 100;
		// saida
		System.out.println(x + " % de " + y + " = " + formatador.format(valor));

		teclado.close();

	}// fim main
}// fim classe
