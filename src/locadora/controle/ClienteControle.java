package locadora.controle;

import locadora.Database;
import locadora.Fabrica;
import locadora.FabricaCliente;
import locadora.modelo.Cliente;

/**
 * ClienteControle(controlador dos dados de um cliente)
 */
public class ClienteControle implements Controle {

    private FabricaCliente fabrica;
    
    /*Cria uma instância de cliente na fábrica*/
    public ClienteControle(){

        fabrica = (FabricaCliente) Fabrica.getFabrica("cliente");
    }
    
    /*Registra os dados de um cliente e adiciona no banco de dados*/
    public void adicionarCliente(String nome, String cpf){

        Cliente cliente = (Cliente) fabrica.criaModelo();

        cliente.setCpf(cpf);
        cliente.setNome(nome);

        if(!Database.getInstance().getClientes().contains(cliente)){
            Database.getInstance().getClientes().add(cliente);
        }
    }

    /*Edita os dados de um cliente*/
    public void editarCliente(Cliente cliente, String nome){

        cliente.setNome(nome);
    }
    
    /*Remove um cliente da instância de banco*/
    public boolean removerCliente(Cliente cliente){

        return Database.getInstance().getClientes().remove(cliente);
    }
}