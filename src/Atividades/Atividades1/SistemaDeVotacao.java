package Atividades.Atividades1;

import java.util.Scanner;

/*1. Sistema de Votação
Objetivo: Criar um programa que declare uma variável inteira para a idade de uma pessoa e determine a sua situação eleitoral de acordo com a legislação.
Regras de Negócio:
Menor de 16 anos: "Não pode votar."
Entre 16 e 17 anos, ou maior que 70 anos: "Voto facultativo."
Entre 18 e 70 anos: "Voto obrigatório."
*/
public class SistemaDeVotacao {
    public static void main(String[]args) {
        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar!");
        } else if (idade <= 17) {
            System.out.println("Voto facultativo.");

        } else if (idade <= 70) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Voto facultativo.");
        }
        scanner.close(); //Encerra o programa (boa prática)
    }


}
