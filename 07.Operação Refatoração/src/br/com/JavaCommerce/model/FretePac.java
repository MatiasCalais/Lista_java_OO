package br.com.JavaCommerce.model;

public class FretePac implements EstrategiaFrete {
    @Override
    public double calcular(double valorPedido) {
        return valorPedido * 0.05;
    }
}
/*
 * TODA VEZ QUE FALA SOBRE CRIAR CLASS FALA DE CRIAR OUTRO AQUIVO]
 * Faça com que as três implementem a interface EstrategiaFrete e sobrescrevam o
 * método de cálculo de acordo com as regras (Sedex 10%, PAC 5%, Motoboy fixo de
 * 15.00).
 */