package locadora.controle;

import locadora.Database;
import locadora.Fabrica;
import locadora.FabricaFilme;
import locadora.modelo.Filme;

/**
 * FilmeControle
 */
public class FilmeControle implements Controle {

    private FabricaFilme fabrica;

    /*Cria uma instância do tipo Filme em Fábrica*/
    public FilmeControle() {

        fabrica = (FabricaFilme) Fabrica.getFabrica("filme");
    }

    /*Cria um novo filme e busca se ele não existe na Database, 
     * caso não exista, será adicionado*/
    public void adicionarFilme(String nome) {

        Filme filme = (Filme) fabrica.criaModelo();

        filme.setNome(nome);

        if (!Database.getInstance().getFilmes().contains(filme)) {
            Database.getInstance().adicionar(filme);
        }
    }

    /*Editar o nome do filme*/
    public void editarFilme(Filme filme, String nome) {

        filme.setNome(nome);
    }
    
    /*Remove o filme do banco de dados de filmes*/
    public boolean removerFilme(Filme filme) {

        return Database.getInstance().remover(filme);
    }
}