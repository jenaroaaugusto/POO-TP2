package locadora.tabelas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import locadora.modelo.Cliente;

public class TabelaCliente extends AbstractTableModel {

	/**
	 * Tebela reponsável pela exibição dos dados de cada cliente
	 */
	private static final long serialVersionUID = -5809871876547904178L;
	/*Exibe a lista de clientes, os nomes de cada coluna que separa eles
	 * o vetor de Class é responsável por exibir cada dado no seu lugar*/
	private List<Cliente> clientes;
    private String[] colunas = { "Nome", "CPF" };
    private Class[] classes = { String.class, String.class };

    public TabelaCliente(List<Cliente> clientes){
        this.clientes = clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return classes[i];
    }

    /*seta os valores na tabela de clientes*/
    @Override
    public void setValueAt(Object data, int i, int j) {
        switch (j) {
            case 0:
                clientes.get(i).setNome((String) data);
            case 1:
                clientes.get(i).setCpf((String) data);
            default:
                break;
        }
    }

    @Override
    public Object getValueAt(int i, int j) {
        switch (j) {
        case 0:
            return clientes.get(i).getNome();
        case 1:
            return clientes.get(i).getCpf();
        default:
            return null;
        }
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public Cliente getValueAt(int i){
        return clientes.get(i);
    }
}