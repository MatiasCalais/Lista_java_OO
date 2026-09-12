package br.com.CofreForte.model;

public class agencia {
    public static final String NOME_BANCO = "JavaBank";
    public static final double TAXA_SAQUE = 0.5;

    private static int totalContasAbertas;


public static void registrarNovaConta(){
    totalContasAbertas++;

}

public static int getTotalContasAbertas(){
    return totalContasAbertas;

}

}