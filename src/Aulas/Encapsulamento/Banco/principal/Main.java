package Aulas.Encapsulamento.Banco.principal;

import Aulas.Encapsulamento.Banco.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        //Nova variavel
        ContaBancaria minhaConta = new ContaBancaria ("Amanda", 123456);
        minhaConta.setTitular("Amanda");
        System.out.println(minhaConta.getTitular());

        minhaConta.depositar(100);

       // ContaBancaria pessoa1 = new ContaBancaria("Fulano");
                //Titular = "Fulano", numeroDaConta = 1, saldo =0;

    }


}
