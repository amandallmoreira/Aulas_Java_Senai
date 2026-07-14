package Atividades.Atividades2;

import java.util.Scanner;

/*Objetivo: Criar um método que misture parâmetros, retorno de tipo booleano (boolean) e lógicas de condição (if/else), semelhante ao metodoDeComparacao visto em aula.

Regras de Negócio:
Crie um método chamado verificarMaioridade que receba uma idade (int) e retorne true se for maior ou igual a 18, e false caso contrário.
No método main, peça a idade do utilizador usando o Scanner.
A partir do retorno verdadeiro ou falso do método, o main deve usar um if/else para imprimir "Acesso Liberado" ou "Acesso Negado".
*/

public class VerificadorDeAcessoDeSeguranca {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.println("Digite a sua idade: ");
            idade=scanner.nextInt();
        verificarMaioridade(idade);

        if(verificarMaioridade(idade)){
            System.out.println("Acesso liberado!");
        }else {
            System.out.println("Acesso negado");
        }
    }

    public static boolean verificarMaioridade(int idade) {
        if (idade>=18){
            return true;
        }else{
            return false;
        }
    }
}
