package br.edu.iftm.threads;

public class Caixa {
    private double valorTotal = 5000;
    private String extrato;
	
	System.out.println(nome + " entrou no caixa.\n");
    public void operacao(String nome, double valor, int opr){
    	this.setExtrato(this.getExtrato() + nome + " "); 
        if(opr == 1){ 
        	// Operação 01 -> Realizar saque
            if(this.getValorTotal() >= valor){
                this.setValorTotal(this.getValorTotal() - valor);
				this.setExtrato(this.getExtrato() + " sacou " + valor + " reais \n"); 
				
                try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            }
            else{
            	// Executar o notify pra saída
            	this.setExtrato(this.getExtrato() + " cancelou a operação.\n");
            }
        }
        else if(opr == 2){ 
        	// Operação 02 -> Realizar depósito
        	this.setValorTotal(this.getValorTotal() + valor);
        	this.setExtrato(this.getExtrato() + " depositou " + valor + " reais \n");
        	 
        	try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        
		this.setExtrato(this.getExtrato() + nome + "\n");
		
		
    }

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getExtrato() {
		return extrato;
	}

	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}

}
