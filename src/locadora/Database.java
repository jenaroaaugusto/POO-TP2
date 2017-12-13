package locadora;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import locadora.modelo.*;

/**
 * Database
 */
public class Database implements Serializable {

	private static final long serialVersionUID = -4112197063571309836L;
	private static Database instance = null;

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static void setInstance(Database db){
        instance = db;
    }

    private List<Cliente> clientes;
    private List<Filme> filmes;
    private List<Locacao> locacoes;

    public Database() {
        clientes = new ArrayList<>();
        filmes = new ArrayList<>();
        locacoes = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public boolean adicionar(Cliente cliente) {
        return clientes.add(cliente);
    }

    public boolean editar(Cliente cliente, String nome) {
        if (clientes.contains(cliente)) {
            cliente.setNome(nome);
            return true;
        }
        return false;
    }

    public boolean remover(Cliente cliente) {
        return clientes.remove(cliente);
    }

    public boolean adicionar(Filme filme) {
        return filmes.add(filme);
    }

    public boolean editar(Filme filme, String nome) {
        if (filmes.contains(filme)) {
            filme.setNome(nome);
            return true;
        }
        return false;
    }

    public boolean remover(Filme filme) {
        return filmes.remove(filme);
    }

    public boolean adicionar(Locacao locacao) {
        return locacoes.add(locacao);
    }

    public boolean remover(Locacao locacao) {
        return locacoes.remove(locacao);
    }
}