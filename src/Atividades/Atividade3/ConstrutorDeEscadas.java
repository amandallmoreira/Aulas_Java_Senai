package Atividades.Atividade3;

import java.util.Scanner;

/*Objetivo: Praticar o uso de laços for aninhados (um dentro do outro) para criar formas geométricas assimétricas.
Regras de Negócio:
Baseado no GeradorDeFormas visto em aula, crie um método desenharEscada que receba um int degraus e um char simbolo.
O laço externo (eixo Y) deve controlar o número de linhas (degraus).
O laço interno (eixo X) deve imprimir o símbolo repetidas vezes, mas a quantidade de símbolos em cada linha deve ser igual ao número da linha atual.
*/

public class ConstrutorDeEscadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite quantos degraus sua escada deve ter: ");
        int degraus = scanner.nextInt();

        char simbolo = '#';

        desenharEscada(degraus,simbolo);

    }

    public static void desenharEscada(int degraus, char simbolo) {

        //Laço que controla as LINHAS
        for(int linha=1; linha<=degraus; linha++){
            //Controla as colunas / SIMBOLOS
            for(int coluna = 1; coluna<=linha; coluna++){
                    System.out.print(simbolo); //Não pode ser println pois pula linha
                }
                System.out.println(); //Pula a linha
        }

    }

}
