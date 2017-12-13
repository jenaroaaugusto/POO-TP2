package locadora.controle;

import locadora.Database;
import locadora.Fabrica;
import locadora.modelo.Cliente;
import locadora.modelo.Filme;
import locadora.modelo.Locacao;

/**
 * LocacaoControle
 */
public class LocacaoControle implements Controle {

    private Fabrica fabrica;

    public LocacaoControle(){
        fabrica = Fabrica.getFabrica("locacao");
    }
    
    /*Com os dados do cliente e do filme, relaciona a locação do filme na ficha do cliente
     * Seta o filme como alugado e adiciona a operação no Database*/
    public boolean adicionarLocacao(Cliente cliente, Filme filme){
        Locacao locacao = (Locacao) fabrica.criaModelo();
        locacao.setCliente(cliente);
        filme.setAlugado(true);
        locacao.setFilme(filme);

        return Database.getInstance().adicionar(locacao);
    }

    /*Remove a operação de locação do banco, pra quando o usuário 
     * realizar a devolução de um filme*/
    public boolean removerLocacao(Locacao locacao){
        locacao.getFilme().setAlugado(false);
        return Database.getInstance().remover(locacao);
    }
}