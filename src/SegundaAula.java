import java.util.Scanner;

public class SegundaAula {
    public static void main(String[] args){
        //Scanner = input
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        //Usabilidade do if-> pode ter duas respostas
        System.out.println("\n \n Utilizando a comparação do If Else");
        if(valor==1){
            System.out.println("Menor que 10");
        }else {
            System.out.println("Maior que 10");
        }

        //Switch case -> pode fazer várias comparações
        System.out.println("\n \n Utilizando a comparação do Switch Case");
        switch (valor){
            case 1:
                System.out.println("Escolheu 1");
                break;
            case 2:
                System.out.println("Escolheu 2");
                break;
            default:
                System.out.println("Não escolheu uma das opções!");
                break;

        }
}
