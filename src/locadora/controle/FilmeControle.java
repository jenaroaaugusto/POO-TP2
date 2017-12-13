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

    public FilmeControle() {

        fabrica = (FabricaFilme) Fabrica.getFabrica("filme");
    }

    public void adicionarFilme(String nome) {

        Filme filme = (Filme) fabrica.criaModelo();

        filme.setNome(nome);

        if (!Database.getInstance().getFilmes().contains(filme)) {
            Database.getInstance().getFilmes().add(filme);
        }
    }

    public void editarFilme(Filme filme, String nome) {

        filme.setNome(nome);
    }

    public boolean removerFilme(Filme filme) {

        return Database.getInstance().getFilmes().remove(filme);
    }
}