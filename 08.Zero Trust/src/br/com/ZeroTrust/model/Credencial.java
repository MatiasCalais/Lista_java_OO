package br.com.ZeroTrust.model;

public class Credencial {
    private String codigoHex;
    private boolean ativo;
    private Funcionario titular;
   
    public Credencial(String codigoHex,Funcionario titular){
        this.codigoHex = codigoHex;
        this.titular = titular;
    }


    public Credencial(String string, boolean b, Funcionario funcionario1) {
        //TODO Auto-generated constructor stub
    }


    public String getCodigoHex() {
        return codigoHex;
    }
    public void setCodigoHex(String codigoHex) {
        this.codigoHex = codigoHex;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public Funcionario getTitular() {
        return titular;
    }
    public void setTitular(Funcionario titular) {
        this.titular = titular;
    }
/*O sistema de segurança não olha para o rosto do funcionário, ele lê o chip do
crachá. Duas credenciais são consideradas idênticas se, e somente se, o
codigoHex for igual.
● Ação: Sobrescreva o equals() e o hashCode() obrigatoriamente usando o
codigoHex como única chave matemática. (Deixe a sua IDE gerar isso para você
evitar erros de digitação). */


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoHex == null) ? 0 : codigoHex.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Credencial other = (Credencial) obj;
        if (codigoHex == null) {
            if (other.codigoHex != null)
                return false;
        } else if (!codigoHex.equals(other.codigoHex))
            return false;
        return true;
    }


   



    //equals
    //hashcode
    //toString
}
