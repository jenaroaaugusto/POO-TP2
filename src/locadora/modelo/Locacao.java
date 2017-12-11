package locadora.modelo;

/**
 * Locacao
 */
public class Locacao implements Modelo {

	private Cliente cliente;
	private Filme filme;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof Locacao) {
			return cliente.equals(((Locacao) arg0).getCliente()) &&
				filme.equals(((Locacao) arg0).getFilme());
		}
		return false;
	}
}