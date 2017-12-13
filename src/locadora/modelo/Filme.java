package locadora.modelo;

import java.io.Serializable;

/**
 * Filme
 */
public class Filme implements Modelo, Comparable<Filme>, Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7681136281087677344L;
	private String nome;
	private boolean alugado;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
    }
    
	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Filme){
			return nome.equalsIgnoreCase(((Filme) arg0).nome);
		}
		return false;
	}

	@Override
	public int compareTo(Filme arg0) {
		return nome.compareToIgnoreCase(arg0.nome);
	}
}