package Atividades.Atividades2;

import java.util.Scanner;
/*Objetivo: Criar um programa que utilize um método sem retorno (void) para exibir uma mensagem de boas-vindas a um utilizador.
Regras de Negócio:
-Crie um método chamado imprimirSaudacao que receba uma String nome como parâmetro.
-O método deve imprimir a frase: "Olá, [nome]! Bem-vindo(a) à nossa aula de métodos."
-No método main, utilize o Scanner para capturar o nome digitado pelo utilizador e chame o método imprimirSaudacao passando esse nome.
*/

public class SaudacaoPersonalizada {
    //Só o Main executa
    public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);
      String nome;
        System.out.println("Digite seu nome: ");
        nome = scanner.next();
      imprimirSaudacao(nome);
    }

    //METODO
    public static void imprimirSaudacao(String nome){
        System.out.println("Olá, "+nome+"! Bem-vindo(a) à nossa aula de métodos.");
    }
}
