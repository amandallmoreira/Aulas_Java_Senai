package Atividades.Atividade3;
import java.util.Scanner;

/*Objetivo: Criar um programa que simule o bloqueio de um cofre, utilizando o laço while para dar múltiplas tentativas ao utilizador.
Regras de Negócio:
Crie um método chamado abrirCofre que contenha um laço de repetição while.
O cofre só abre se o utilizador digitar o código 9999.
O utilizador tem no máximo 5 tentativas.
Se acertar, imprima "Cofre Aberto!". Se errar, imprima "Código Errado" e mostre quantas tentativas restam. Se acabarem as tentativas, imprima "Cofre Bloqueado!".
*/
public class SistemaCofreDigital {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Chama o método passando o scanner para capturar as entradas
        abrirCofre(scanner);
    }

    public static void abrirCofre(Scanner scanner) {
        int i = 1; // Começa na primeira tentativa;
        while (i <= 5) {
            String codigo = scanner.nextLine(); //Vai ler a senha;
            //equals le o conteudo da String e compara com o input do usuario
            if(codigo.equals("9999")){
                System.out.println("Cofre Aberto!");
                break; // Encerra o laço
            }else {
                int restantes = 5 - i; //Calcula quantas tentativas restam

                if (restantes >0){
                    System.out.println("Código errado. Restam " + restantes + " tentativas.");
                }else {
                    System.out.println("Cofre bloqueado!");
                }
            }
            i++; //Incrementa uma tentativa;
        }

    }
}
