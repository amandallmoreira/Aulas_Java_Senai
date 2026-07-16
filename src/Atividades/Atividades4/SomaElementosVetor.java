package Atividades.Atividades4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

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

