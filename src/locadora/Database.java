package locadora;

import java.util.Set;
import java.util.TreeSet;
import locadora.modelo.*;

/**
 * Database
 */
public class Database {

    private static Database instance = null;

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Set<Cliente> clientes;
    private Set<Filme> filmes;
    private Set<Locacao> locacoes;

    public Database() {
        clientes = new TreeSet<>();
        filmes = new TreeSet<>();
        locacoes = new TreeSet<>();
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public Set<Filme> getFilmes() {
        return filmes;
    }

    public Set<Locacao> getLocacoes() {
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
        locacao.getFilme().setAlugado(true);
        return locacoes.add(locacao);
    }

    public boolean remover(Locacao locacao) {
        locacao.getFilme().setAlugado(false);
        return locacoes.remove(locacao);
    }
}