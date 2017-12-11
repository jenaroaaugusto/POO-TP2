package locadora;

import locadora.controle.Controle;
import locadora.controle.LocacaoControle;
import locadora.modelo.Locacao;
import locadora.modelo.Modelo;
import locadora.visao.Visao;

/**
 * FabricaLocacao
 */
public class FabricaLocacao extends Fabrica {

    @Override
    public Modelo criaModelo() {
        return new Locacao();
    }

	@Override
	public Controle criaControle() {
		return new LocacaoControle();
	}
    
    @Override
	public Visao criaVisao() {
		return null;
	}

    
}