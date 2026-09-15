package br.com.ZeroTrust.model;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import  java.util.HashSet;

// SEMPRE QUE TIVER <>




public class SistemaSeguranca {

    private Veiculo[] vagasGaragem;// array seria : Veiculo[] que quarda objetos do tipo Veiculos
    private List<Funcionario> catracaPrincipal = new ArrayList<>(); // imniciaa arraylist<> na declaração 
    private Set<Credencial> cofreFisico = new HashSet<>();// tabem incializado com novamente com new hashset

    public SistemaSeguranca(int totalVagas){ // contructor 
        this.vagasGaragem = new Veiculo[totalVagas]; // instanciado com tamanho fisico 
    }

    
    public void estacionarVeiculos(Veiculo v, int vaga){
        vagasGaragem[vaga] = v;
        System.out.println("geragem:Veiculo[" + v.getPlaca() + "] estacionando na vaga["+ vaga + "].");

    }
    public void registrarCatraca(Funcionario f){
        catracaPrincipal.add(f);
        System.out.println("Acesso liberado para " + f.getNome() + ".");

    }

  

    public void acessarCofre (Credencial cred){
     if(cofreFisico.add(cred)){
            System.out.println("Cofre: Acesso CONCEDIDO. Bem-vindo(a) " + cred.getTitular() + ".");
        }else{
            System.out.println("ALERTA MÁXIMO: Credencial [" + cred.getCodigoHex() + "] bloqueada! Tentativa de clonagem detectada.");
        }

    }


    public SistemaSeguranca(Veiculo[] vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

}
