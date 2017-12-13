package locadora;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import locadora.modelo.*;

/**
 * Database(onde os dados serão salvos)
 */
public class Database implements Serializable {

	private static final long serialVersionUID = -4112197063571309836L;
	private static Database instance = null;
	
	/*Cria o padrão Singleton no banco de dados*/
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

    /*Adiciona a ficha completa do cliente no bd*/
    public boolean adicionar(Cliente cliente) {
        return clientes.add(cliente);
    }
    
    /*Editar o nome do cliente, confere se o cliente está na lista
     * de clientes registrados, se estiver, permite alterar seu nome*/
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

    /*Confere se foi possível editar o nome do filme no banco, caso seja, 
     * será editado e retorna um valor verdadeiro*/
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