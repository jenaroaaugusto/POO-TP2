package locadora.tabelas;

import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import locadora.modelo.Cliente;
import locadora.modelo.Filme;
import locadora.modelo.Locacao;

/**
 * TabelaLocacao
 * Implementa TableModelLister pois sua exibição depende das outras tabelas,
 * Quando uma das outras mudam seus dados, esta atualiza de acordo
 */
public class TabelaLocacao extends AbstractTableModel implements TableModelListener{

	/**
	 * Tebela reponsável pela exibição da operação de uma locação
	 */
    private static final long serialVersionUID = 5060657298656557784L;
    /*Exibe a lista de operações de locação, os nomes de cada coluna que separa 
     * um cliente e o filme que este alugou o vetor de Class é responsável por 
     * exibir cada dado no seu lugar*/
	private List<Locacao> locacoes;
    private String[] colunas = { "Nome do Cliente", "Nome do Filme" };
    private Class[] classes = { String.class, String.class };

    public TabelaLocacao(List<Locacao> locacoes){
        this.locacoes = locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return classes[i];
    }

    @Override
    public void setValueAt(Object data, int i, int j) {
        switch (j) {
            case 0:
                locacoes.get(i).setCliente((Cliente) data);
            case 1:
                locacoes.get(i).setFilme((Filme) data);
            default:
                break;
        }
    }

    @Override
    public Object getValueAt(int i, int j) {
        switch (j) {
        case 0:
            return locacoes.get(i).getCliente().getNome();
        case 1:
            return locacoes.get(i).getFilme().getNome();
        default:
            return null;
        }
    }

    @Override
    public int getRowCount() {
        return locacoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public Locacao getValueAt(int i){
        return locacoes.get(i);
    }

	@Override
	public void tableChanged(TableModelEvent arg0) {
		fireTableDataChanged();
	}
}