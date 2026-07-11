package Aulas;

import java.util.Scanner; //Lê dados digitados pelo usuário

//objetivo receber informações do usuário pelo teclado e exibi-las na tela.
public class PrimeiraAula {
    public static void main(String[]args){
         //void -> não retorna nenhum valor
         //String[] args → recebe argumentos enviados pela linha de comando.
         String nome;
         int idade;

         Scanner scanner = new Scanner(System.in);
         //Objeto scanner -> responsavel por ler tudo o que o usuario digitar
         //System.in -> leia os dados do teclado

         //Exibe mensagens na tela
         System.out.println("Digite seu nome: ");
         //System.out.println() ->  Serve para mostrar mensagens na tela
         //nextLine() -> Lê uma linha inteira de texto
         nome=scanner.nextLine();

         System.out.println("Informe sua idade: ");
         //nextInt() -> Lê um numero inteiro
         idade = scanner.nextInt();

         System.out.println("Informe sua altura: ");
         float altura = scanner.nextFloat();

         System.out.println("Informe seu cargo: ");
         //next() -> Lê apenas uma palavra, para quando encontra um espaço
         String cargo = scanner.next();

         System.out.println("Informe o periodo em que estuda no SENAI: ");
         String turno = scanner.next();

         System.out.println("Nome: "+nome+"\n Idade: "+idade+"\n Altura: "+altura+"\n Cargo: "+cargo+"\n Periodo: "+turno);

    }
}
