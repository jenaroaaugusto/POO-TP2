package locadora.controle;

import locadora.Database;
import locadora.Fabrica;
import locadora.FabricaCliente;
import locadora.modelo.Cliente;

/**
 * ClienteControle
 */
public class ClienteControle implements Controle {

    private FabricaCliente fabrica;

    public ClienteControle(){

        fabrica = (FabricaCliente) Fabrica.getFabrica("cliente");
    }

    public boolean adicionarCliente(String nome, String cpf){

        Cliente cliente = (Cliente) fabrica.criaModelo();

        cliente.setCpf(cpf);
        cliente.setNome(nome);

        return Database.getInstance().adicionar(cliente);
    }

    public void editarCliente(Cliente cliente, String nome){

        cliente.setNome(nome);
    }

    public boolean removerCliente(Cliente cliente){

        return Database.getInstance().remover(cliente);
    }
}