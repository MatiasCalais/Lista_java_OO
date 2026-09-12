package br.com.CofreForte.model;

public class cliente {
    
    private String cpf;
    private String nome;
    private String email;

    public cliente (String cpf, String nome, String email) {
    this.cpf = cpf;
    this.nome = nome;
    this.email = email;

    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
/*obj seria o que recebe e vai estar perguntando se o ele esta igual a da memoria */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
        cliente other = (cliente) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "cliente [nome=" + nome + ", email=" + email + "]";
    }
    



/*////////////////////////////////////////// 
@Override 
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        cliente cliente = (cliente) obj;
        return Object.equals(cpf, cliente.cpf);
    }
 */
}
