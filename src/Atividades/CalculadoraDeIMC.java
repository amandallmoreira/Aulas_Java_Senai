package Atividades;

import java.util.Scanner;

/*Objetivo: Declarar duas variáveis do tipo double (peso e altura),
calcular o IMC utilizando a fórmula IMC = peso / (altura * altura) e
classificar o resultado.
Regras de Classificação:
IMC menor que 18.5: "Abaixo do peso."
IMC entre 18.5 e 24.9: "Peso normal."
IMC entre 25.0 e 29.9: "Sobrepeso."
IMC maior ou igual a 30.0: "Obesidade."
*/

public class CalculadoraDeIMC {
    public static void main(String[]args){
        double peso, altura, imc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        altura = scanner.nextDouble();

        imc = peso/(altura*altura);
        
        if(imc<18.5){
            System.out.println("Abaixo do peso.");
        } else if (imc<25) {
            System.out.println("Peso normal.");
        } else if (imc<30) {
            System.out.println("Sobrepeso.");
        }else{
            System.out.println("Obesidade.");
        }

        scanner.close();
    }

}
