package br.com.techcorp.model;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class ControleDeAcesso {
    private List<Funcionario> historicoCatraca = new ArrayList<>();
    private Set<Funcionario> autorizadosSalaSegura = new HashSet<>();

    public void registrarPassagem(Funcionario f){
        historicoCatraca.add(f);
    }

    public void concederAcessoSala(Funcionario f){
        if (autorizadosSalaSegura.add(f)) {
            System.out.println("Acesso liberado para Sala Segura.");
        }else{
            System.out.println("Aviso: Matrícula já registrada na sala. Acesso não permitido.");
        }
    }
}
