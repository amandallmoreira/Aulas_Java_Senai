package Atividades.Atividades2;
import java.util.Scanner;
/*Objetivo: Desenvolver um programa que utilize um método com retorno de valor numérico para calcular o dobro de um número fornecido.
Regras de Negócio:
Crie um método chamado calcularDobro que receba um int numero como parâmetro e retorne (return) o dobro desse valor.
O método main deve pedir ao utilizador para digitar um número via Scanner.
O resultado retornado pelo método deve ser armazenado numa variável no main e impresso na consola.
*/
public class MaquinaDoDobro {
    public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       int numero;
        System.out.println("Digite um nº: ");
        numero = scanner.nextInt();
       calcularDobro(numero);

    }
    //METODO, só pode retornar um int;
    public static int calcularDobro(int numero){
        System.out.println("O dobro do número é : " + (numero*2));
        return numero;
    }
}
