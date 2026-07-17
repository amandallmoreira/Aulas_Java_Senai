package Atividades.Atividades4;

import java.util.Scanner;

/*
2. Analisador de Temperaturas
Objetivo: Criar um programa que utilize um vetor para armazenar registros de temperaturas e identifique
qual foi a maior e a menor temperatura informada.

Regras de Negócio:
Declare um vetor do tipo decimal chamado temperaturas de tamanho 6 (new double[6]). OK
Peça ao utilizador para digitar as 6 temperaturas consecutivas através do console (terminal).
Percorra o vetor utilizando uma estrutura de repetição para encontrar o maior valor e o menor valor
armazenados.
Dica: compare os valores de cada posição do vetor com outras variáveis
double maior = temperaturasVetor[0];
double menor = temperaturasVetor[0];
Imprima no console lista de temperaturas informadas, seguidas da maior e da menor temperatura
encontradas.
*/

public class AnalisadorTemperaturas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] temperatura = new double[6];

        for(int i = 0; i<6; i++){
            System.out.println("Digite a temperatura: ");
            temperatura[i] = scanner.nextDouble();

            if(temperatura<)
        }





    }
}
