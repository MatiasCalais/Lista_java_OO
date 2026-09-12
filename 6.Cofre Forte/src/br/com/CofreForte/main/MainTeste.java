package br.com.CofreForte.main;
import br.com.CofreForte.model.cliente;// puxar a class
import br.com.CofreForte.model.ContaBancaria;
public class MainTeste {
    public static void main(String[] args){


        cliente cliente1 = new cliente("111.222.333-44", "João Silva", "joao@email.com");
        cliente cliente2 = new cliente("111.222.333-44", "maria Silva", "maria@email.com");
        ContaBancaria conta1 = new ContaBancaria("1", cliente1, 50.0);
        ContaBancaria conta2 = new ContaBancaria("2", cliente2, 50.0);
        
        if(cliente1.equals(cliente2)){
            System.out.println("SUCESSO: Os clientes são iguais (mesmo CPF).");
        } else {
            System.out.println("FALHA: Os clientes deveriam ser iguais.");
        }
        // contar1 ele recebe os daods de cliente 1
       boolean ConSacar = conta1.sacar(50.0);
       System.out.println("Deu certo sacar os 50 reais? " + ConSacar);

        ConSacar = conta2.sacar(25.0);
        System.out.println("Deu certo sacar 25 reais? " + ConSacar);
    }
}
