package Atividades.Atividades1;

import java.util.Scanner;
/*Objetivo: Simular o sistema de faturação de uma loja.
O programa deve declarar uma variável double valorCompra.
Aplique um desconto progressivo baseado no valor total e exiba o valor original,
 o valor poupado com o desconto e o montante final a pagar.
Faixas de Desconto:
Compras abaixo de R$ 100,00: Sem desconto (0%).
Compras de R$ 100,00 até R$ 299,99: 10% de desconto.
Compras de R$ 300,00 ou mais: 20% de desconto.
*/

public class CaixaDeLoja {
    public static void main(String[]args){
        double valorCompra, valorPoupado, valorFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        valorCompra = scanner.nextDouble();

        if(valorCompra<100){
            valorPoupado = 0;
        } else if (valorCompra<300) {
            valorPoupado = valorCompra * 0.10;
        }else{
            valorPoupado = valorCompra * 0.20;
        }
        //calculos

        valorFinal = valorCompra - valorPoupado;

        System.out.println("Valor original: R$ "+ valorCompra);
        System.out.println("Valor poupado: R$ "+ valorPoupado);
        System.out.println("Valor final: R$ "+ valorFinal);

        scanner.close();
    }
}
