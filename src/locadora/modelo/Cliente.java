package locadora.modelo;

import java.io.Serializable;

/**
 * Cliente
 */
public class Cliente implements Modelo, Comparable<Cliente>, Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -4460507951606447160L;
	private String nome;
    private String cpf;

	public String getNome() {
		return nome;
	}

    public void setNome(String nome) {
		this.nome = nome;
	}

    public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
    }

    @Override
    public boolean equals(Object arg0) {
        if(arg0 instanceof Cliente){
            return cpf.equals(((Cliente) arg0).cpf);
        }
        return false;
    }

    @Override
    public int compareTo(Cliente arg0) {
        return nome.compareToIgnoreCase(arg0.getNome());
    }

    @Override
    public String toString() {
        return nome;
    }
}