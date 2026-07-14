package Atividades.Atividades2;

import java.util.Scanner;
/*Objetivo: Fazer com que diferentes métodos comuniquem entre si, retirando do main a responsabilidade de fazer cálculos matemáticos e impressões diretas.

Regras de Negócio:
Crie um método chamado subtrairNumeros que receba dois inteiros (x e y) e retorne o resultado da subtração (x - y).
Crie um segundo método chamado imprimirResultado (void) que receba o valor calculado e imprima: "O resultado da operação é: [valor]".
O main deve ler dois números, chamar o método de subtração, e passar o resultado diretamente para o método de impressão.
*/
public class CalculadoraMetodosEncadeados {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        int x,y;
        System.out.println("Digite o valor de x: ");
            x=leia.nextInt();
        System.out.println("Digite o valor de y: ");
            y=leia.nextInt();

        //Encadeamento de métodos
        imprimirResultado(subtrairNumeros( x,  y));

    }

    public static int subtrairNumeros(int x, int y){
       int  subtracao = x-y;
       return subtracao;

    }
    //Void pq o return é vazio, não tem um tipo;
    //Apenas imprime;
    public static void imprimirResultado(int subtracao){
        System.out.println("O resultado da operação é : "+ subtracao);
    }

}
