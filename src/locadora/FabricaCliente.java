package locadora;

import locadora.controle.ClienteControle;
import locadora.controle.Controle;
import locadora.modelo.Cliente;
import locadora.modelo.Modelo;
import locadora.visao.Visao;

/**
 * FabricaCliente
 */
public class FabricaCliente extends Fabrica {

    @Override
    public Modelo criaModelo() {
        return new Cliente();
    }

	@Override
	public Controle criaControle() {
		return new ClienteControle();
	}

	@Override
	public Visao criaVisao() {
		return null;
    }   
}