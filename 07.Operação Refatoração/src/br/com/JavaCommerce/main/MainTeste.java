package br.com.JavaCommerce.main;

import br.com.JavaCommerce.exception.TipoFreteInvalidoException;
import br.com.JavaCommerce.model.FreteMotoboy;
import  br.com.JavaCommerce.model.CalculadoraFrete;
import  br.com.JavaCommerce.model.FretePac;
import br.com.JavaCommerce.model.FreteSedex;

public class MainTeste {
    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        double valorPedido = 100.0; // válidos para um pedido de R$ 100.00

        try{
                                                // endentado em uma linha par estendimento melhor
            System.out.println("frete SEDEX: R$" + calculadora.processarFrete(valorPedido, new FreteSedex()));
            System.out.println("frete PAC: R$" + calculadora.processarFrete(valorPedido, new FretePac()));
            System.out.println("Frente Motoboy: R$" + calculadora.processarFrete(valorPedido, new FreteMotoboy()));
        
            calculadora.processarFrete(valorPedido, null);

        }catch(TipoFreteInvalidoException e){
            System.out.println("ae gurisão erro capturado : "+ e.getMessage());
        }
    }
}
