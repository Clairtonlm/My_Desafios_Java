package io.github.jiangdequan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PontoVendas {
    public static void main(String[] args) {
        //variaveis
        double total, desconto, totalDesconto, valorPago, troco;
        //objeto
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        //entrada1
        System.out.println("PDV");
        System.out.println("Valor total: "); 
        total = teclado.nextDouble();

        System.out.println("Desconto(%): "); 
        desconto = teclado.nextDouble();
        //processamento1
        totalDesconto = total - (desconto * total)/100;
        //saida1
        System.out.println("Total com desconto: R$ " + formatador.format(totalDesconto));
        //entrada2
        System.out.println("___________________________________________");
        System.out.println("Valor pago em dinheiro: ");
        valorPago = teclado.nextDouble();
        //processamento2
        troco = valorPago - totalDesconto;
        //saida2
        System.out.println("Troco: R$ " + formatador.format(troco));











        teclado.close();      
    }//fim main
}//fim classe