package br.edu.iftm.threads;

public class Thread_pessoa implements Runnable {

    private String nome;
    private double valor;
    private int opr; // Operação
    private static Caixa caixa = new Caixa();

    public Thread_pessoa(String nome, double valor, int opr) {
        this.nome = nome;
        this.valor = valor;
        this.opr = opr;
        new Thread(this,nome).start();
    }

    
    public synchronized void run() {


        caixa.operacao(nome, valor, opr);
        
        System.out.println(this.nome + " saiu do caixa as " + java.time.LocalTime.now() + ".");

        System.out.println(caixa.getExtrato());
    }
}