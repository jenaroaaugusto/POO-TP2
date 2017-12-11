package locadora;

import locadora.controle.Controle;
import locadora.controle.FilmeControle;
import locadora.modelo.Filme;
import locadora.modelo.Modelo;
import locadora.visao.Visao;

/**
 * FabricaFilme
 */
public class FabricaFilme extends Fabrica {
    
    @Override
    public Modelo criaModelo() {
        return new Filme();
    }

    @Override
	public Controle criaControle() {
		return new FilmeControle();
	}

	@Override
	public Visao criaVisao() {
		return null;
	}
}