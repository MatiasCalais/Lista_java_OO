package br.com.ZeroTrust.main;
import br.com.ZeroTrust.model.Credencial;
import br.com.ZeroTrust.model.Departamento;
import br.com.ZeroTrust.model.Funcionario;
import br.com.ZeroTrust.model.SistemaSeguranca;
import br.com.ZeroTrust.model.Veiculo;


public class MainTeste {
    public static void main(String[] args) {
        Departamento Departamento1 =new Departamento("DP", "Departamento Pessoal", 1);
       Funcionario funcionario1 = new Funcionario("7878", "Camila da Silva", Departamento1);
        Veiculo veiculo1 = new Veiculo("FOH3G15", "Civic", funcionario1);
   
   SistemaSeguranca sistemaSeguranca = new SistemaSeguranca(2);

        Credencial c1 = new Credencial("FFF-999", true, funcionario1);
        Credencial clone = new Credencial("FFF-999", true, funcionario1);
   
    sistemaSeguranca.registrarCatraca(funcionario1);
        sistemaSeguranca.registrarCatraca(funcionario1);

        sistemaSeguranca.acessarCofre(c1);
        sistemaSeguranca.acessarCofre(clone);

        sistemaSeguranca.estacionarVeiculos(veiculo1, 0);
        sistemaSeguranca.estacionarVeiculos(veiculo1, 5);
    }




}
