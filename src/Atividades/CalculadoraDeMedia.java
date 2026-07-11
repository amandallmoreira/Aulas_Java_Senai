package Atividades;

import java.util.Scanner;

/*
   Objetivo: Desenvolver um programa que declare três variáveis do tipo decimal (double) representando as notas de um aluno. O programa deve calcular a média aritmética e exibir o estado académico do aluno.
   Regras de Negócio:
   Média maior ou igual a 7.0: "Aprovado!"
   Média entre 5.0 e 6.9: "Em Recuperação."
   Média menor que 5.0: "Reprovado."
   */
public class CalculadoraDeMedia {
   public static void main(String[]args){
       double nota1, nota2, nota3, media;

       Scanner scanner = new Scanner(System.in);

       //MEDIA
       System.out.println("Digite aqui a primeira nota: ");
       nota1 = scanner.nextDouble();

       System.out.println("Digite aqui a segunda nota: ");
       nota2 = scanner.nextDouble();

       System.out.println("Digite aqui a terceira nota: ");
       nota3 = scanner.nextDouble();

       //Calculo da media
       media = (nota1 + nota2 + nota3)/3;
       //Imprime a media
       System.out.println("A média aritmética é : " + media);

       //ESTRUTURA DE DECISAO
       if (media >=7){
           System.out.println("Aprovado.");
       } else if (media>=5) {
           System.out.println("Em recuperação.");
       }else{
           System.out.println("Reprovado.");
       }
        scanner.close();
   }

}
