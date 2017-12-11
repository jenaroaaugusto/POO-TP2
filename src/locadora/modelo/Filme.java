package locadora.modelo;

/**
 * Filme
 */
public class Filme implements Modelo {

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
}