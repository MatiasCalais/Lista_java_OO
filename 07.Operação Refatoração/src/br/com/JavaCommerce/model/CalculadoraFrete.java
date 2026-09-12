package br.com.JavaCommerce.model;
import br.com.JavaCommerce.exception.TipoFreteInvalidoException;

public class CalculadoraFrete {
    public double processarFrete(double valorPedido, EstrategiaFrete estrategia){
        if(estrategia == null){
            /*sempre que jogar algo na tela usar o THOW NEW */
            throw new TipoFreteInvalidoException("deu erro meu mano frete invalido");

        }else{
          return   estrategia.calcular(valorPedido);
        }

    }/*
15.00).
ETAPA 3: A Nova Calculadora de Frete
Refatore (reescreva) a classe CalculadoraFrete para que ela seja inteligente.
1. A calculadora não deve mais saber as regras do Sedex ou PAC. Ela deve apenas
"receber" a estratégia pronta.
2. Crie um método chamado processarFrete que receba dois parâmetros: O valor do
pedido (double) e a Estratégia de Frete (EstrategiaFrete).
3. Se a estratégia enviada for nula (null), lance a sua exceção customizada
TipoFreteInvalidoException.
4. Caso contrário, acione o método calcular da estratégia enviada e retorne o valor */
}