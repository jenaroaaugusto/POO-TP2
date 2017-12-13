package locadora.tabelas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import locadora.modelo.Filme;

public class TabelaFilme extends AbstractTableModel {
	
	/**
	 * Tebela reponsável pela exibição dos dados de cada Filme
	 */
	private static final long serialVersionUID = 5060657298656557784L;
	/*Exibe a lista de filmes, os nomes de cada coluna que separa eles
	 * o vetor de Class é responsável por exibir cada dado no seu lugar*/
	private List<Filme> filmes;
    private String[] colunas = { "Nome", "Disponível" };
    private Class[] classes = { String.class, String.class };

    public TabelaFilme(List<Filme> filmes){
        this.filmes = filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
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
                filmes.get(i).setNome((String) data);
            case 1:
                filmes.get(i).setAlugado((Boolean) data);
            default:
                break;
        }
    }

    @Override
    public Object getValueAt(int i, int j) {
        switch (j) {
        case 0:
            return filmes.get(i).getNome();
        case 1:
            return filmes.get(i).isAlugado() ? "Não" : "Sim";
        default:
            return null;
        }
    }

    @Override
    public int getRowCount() {
        return filmes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public Filme getValueAt(int i){
        return filmes.get(i);
    }
}