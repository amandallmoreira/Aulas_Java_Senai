package Atividades.Atividades1;

import java.util.Scanner;

/*Objetivo: Criar um programa que analise uma variável inteira (int numero) e
 imprima duas classificações independentes: se o número é par ou ímpar,
 e se é positivo, negativo ou zero.
 */
public class DetetiveDeNumeros {
    public static void main(String[]args){
        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        if (numero>=0){
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }

        if(numero%2==0){
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é ímpar.");
        }
        scanner.close();
    }
}
