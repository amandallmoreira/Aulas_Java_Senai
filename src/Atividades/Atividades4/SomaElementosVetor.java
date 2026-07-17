package Atividades.Atividades4;

import java.util.Scanner;
/*Objetivo: Criar um programa que declare um vetor de inteiros com tamanho fixo, permita ao utilizador preencher todos os campos e exiba a soma total dos valores.
Regras de Negócio:
Declare um vetor de inteiros chamado numeros com tamanho 5 (new int[5]).
Utilize um laço for para ler 5 números inteiros via Scanner e guardá-los nas posições do vetor.
Após o preenchimento, utilize outro laço para somar todos os elementos contidos no vetor.
Exiba o vetor formatado e o resultado da soma no console.
*/

public class SomaElementosVetor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        //Laço: Vai ler os 5 primeiros nºs e guardar no array
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Vetor preenchido: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i]);

            if (i < 4) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        //Soma dos elementos do vetor
        for (int i = 0; i < 5; i++) {
            soma = soma + numeros[i];
        }

        //Resultado
        System.out.println("A soma de todos os elementos do vetor é: " + soma);

    }
}

