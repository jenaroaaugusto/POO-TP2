package locadora.modelo;

import java.io.Serializable;

/**
 * Locacao
 */
public class Locacao implements Modelo, Comparable<Locacao>, Serializable{

	/*Elabora o padrão de locação*/
	private static final long serialVersionUID = 5973539541036189689L;
	/*Cada operação de locação é realizada por um cliente(portanto existirá
	 * uma ficha dele) e um filme que será alugado*/
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
	
	/*retorna a operação de locação, quando um dado cliente consegue locar um filme*/
	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof Locacao) {
			return cliente.equals(((Locacao) arg0).getCliente()) &&
				filme.equals(((Locacao) arg0).getFilme());
		}
		return false;
	}
	
	/*Função para ordenação de locações (ordena do mesmo jeito que clientes) */
	@Override
	public int compareTo(Locacao arg0) {
		return cliente.compareTo(arg0.cliente);
	}
}