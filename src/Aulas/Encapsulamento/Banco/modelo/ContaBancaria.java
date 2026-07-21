package Aulas.Encapsulamento.Banco.modelo;

import java.util.ArrayList;

public class ContaBancaria {
    //MODELO DE CB

    //Atributos dessa classe
    //Modificadores de acesso -> Encapsulamento
    private String titular;
    private int numeroDaConta;
    private double saldo;




    //Construtor dessa classe
    public ContaBancaria(String titular, int numeroDaConta) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo=0.0;

       /*ATIVIDADE

        1. Quando instanciar a classe, o usuário deve somente inserir seu nome
        2. O usuário não poderá mais modificar o próprio nome depois de instancia-lo na classe principal (cria o nome, não pode alterar)
        3. Toda vez que uma instância dessa classe for criada, ou seja, quando criar um objeto com o new, o número de conta deve ser diferente da instância anterior.
        OBS: essa lógica de modificar o número do usuário deve ser inserida na classe de ContaBancaria para fazer sentido com o uso desse sistema bancário. Não é para criar a lógica dentro da classe Main.*/

        System.out.println("Digite seu nome: ");

        /* Salvou o titular, cria o num da conta
           salva o numero da conta

        */

    }


    //Métodos Getters and Setters
    //Pega o valor dentro do atributo Titular;
    public String getTitular() {
        return titular; //Apresenta o nome do Titular
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
            System.out.println(valor+ " foi depositado.");
        }else{
            System.out.println("Erro: Valor inválido.");
        }
    }

    //Metodo para sacar o valor do saldo do objeto

    public void sacar(double valor){
        if(this.saldo>valor){
            this.saldo -= valor;
            System.out.println( valor+" foi retirado da conta.");
        }else{
            System.out.println("Saldo insuficiente! Saldo em conta: R$ "+saldo);
        }
    }

    private String acessarTodosOsDados(){
        return this.titular;
    }



    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }
    //metodos privados tambem só pode ser acessados dentro da classe que foram criados








}
