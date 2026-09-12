package br.com.CofreForte.model;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private cliente titular;


    public ContaBancaria(String numeroConta, cliente titular,  double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    
    agencia.registrarNovaConta();

}
            

    public String getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }


    public cliente getTitular() {
        return titular;
    }

    public void depositar(double valor){
        this.saldo += valor;

    }

    public boolean sacar(double valor){
       double totalSaque = valor + agencia.TAXA_SAQUE;
/*lembre de criar uma variavel para receber o valor  */
       if(this.saldo >= totalSaque){
        this.saldo -= totalSaque;
        return true;
       } else {
        return false;
       }
     }
    }


