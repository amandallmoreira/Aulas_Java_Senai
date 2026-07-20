package Atividades.Atividades4;

import java.util.ArrayList;
import java.util.Scanner;

/*Objetivo: Desenvolver uma lista de tarefas interativa que utilize um ArrayList para permitir que o utilizador insira quantas tarefas desejar, sem limitação de tamanho.
Regras de Negócio:
Instancie um ArrayList<String> para guardar as tarefas.
Utilize um laço while para pedir que o utilizador digite uma tarefa.
Se o utilizador digitar a palavra "fim" (utilize a função .equals), o programa deve parar de pedir novas tarefas.
Caso contrário, adicione a tarefa ao ArrayList.
Ao terminar, exiba a quantidade total de tarefas registadas e liste-as uma a uma.
*/

public class TarefasDinamicas {

    public static void main(String[] args) {

        //Instancia o ArrayList para guardar tarefas
        //Lista vazia
        ArrayList<String> tarefas = new ArrayList<>();
        //Lê o que o usuário digita
        Scanner scanner = new Scanner(System.in);
        String entrada;

        //Pede as tarefas
        while(true){
            System.out.println("Digite uma tarefa (Ou 'fim' para terminar): ") ;
            entrada=scanner.nextLine();

            //Verifica se o usuário quer parar (Digitou FIM)
            if(entrada.equals("fim")){
                break; //Sai do while
            }

            //Caso não tenha digitado FIM, adiciona tarefa na lista
            tarefas.add(entrada);
        }

        //Exibir o total de tarefas na lista
        //tarefas.size : retorna quantos elementos existem na lista
        System.out.println("Total de tarefas registradas: "+ tarefas.size());

        //Percorre a lista, posição por posição
        for(int i =0; i<tarefas.size();i++){
            System.out.println((i+1)+ "." + tarefas.get(i));
        }
    }
}
