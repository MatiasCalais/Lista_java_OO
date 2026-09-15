package br.com.nexustech.main;

import br.com.nexustech.exception.NivelInsuficienteException;
import br.com.nexustech.model.Masmorra;
import br.com.nexustech.model.Matchmaker;
import br.com.nexustech.model.ModoCasual;
import br.com.nexustech.model.ModoRanqueado;

public class Main {
    public static void main(String[] args) {
        int kills = 15;
        int deaths = 0;
        String[] inventario = new String[3];
        String jogador = null;

        try {
            System.out.println(kills / deaths);
        } catch (ArithmeticException e){
            System.out.println("Taxa K/D: Jogador Invicto!");
        }

        try {
            inventario[5] = "Espada";
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Iventário cheio!");
        }

        if(jogador != null){
            System.out.println(jogador);
        }else{
            System.out.println("Jogador desconectado");
        }

        try {
            conectarServidor();
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println("Fechando portas de rede do jogo...");
        }

        Masmorra masmorra = new Masmorra();
        try {
            masmorra.entrar(20);
        } catch (NivelInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        Matchmaker match = new Matchmaker();
        ModoCasual casual = new ModoCasual();
        ModoRanqueado rank = new ModoRanqueado();
        try {
            match.encontrarSala(rank, true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void conectarServidor() throws Exception {
        throw new Exception("Servidor caiu!");
    }
    
}

