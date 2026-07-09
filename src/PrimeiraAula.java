import java.util.Scanner; //Lê dados do teclado

public class PrimeiraAula {
    public static void main(String[]args){
         String nome;
         int idade;

         Scanner scanner = new Scanner(System.in);

         //Exibe mensagens na tela
         System.out.println("Digite seu nome: ");
         //nextLine() -> Lê uma linha inteira de texto
         nome=scanner.nextLine();

         System.out.println("Informe sua idade: ");
         //nextInt() -> Lê um numero inteiro
         idade = scanner.nextInt();

         System.out.println("Informe sua altura: ");
         float altura = scanner.nextFloat();

         System.out.println("Informe seu cargo: ");
         //next() -> Lê apenas uma palavra
         String cargo = scanner.next();

         System.out.println("Informe o periodo em que estuda no SENAI: ");
         String turno = scanner.next();

         System.out.println("Nome: "+nome+"\n Idade: "+idade+"\n Altura: "+altura+"\n Cargo: "+cargo+"\n Periodo: "+turno);

    }
}
