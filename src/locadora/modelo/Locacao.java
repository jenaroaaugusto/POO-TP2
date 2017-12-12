package locadora.modelo;

/**
 * Locacao
 */
public class Locacao implements Modelo, Comparable<Locacao>{

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

	@Override
	public int compareTo(Locacao arg0) {
		return cliente.compareTo(arg0.cliente);
	}
}