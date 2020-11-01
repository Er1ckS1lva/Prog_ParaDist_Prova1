package br.edu.iftm.tests;

import java.util.Random;

import br.edu.iftm.threads.Thread_pessoa;

public class Teste {

    public static void main(String[] args) {
        
        Thread_pessoa pessoa = new Thread_pessoa("Erick",4000,1);

        Thread_pessoa pessoa2 = new Thread_pessoa("Pedro",2000,1);
    }

}