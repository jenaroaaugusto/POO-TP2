package locadora;

import locadora.controle.Controle;
import locadora.modelo.Modelo;
import locadora.visao.Visao;

/**
 * Fabrica
 */
public abstract class Fabrica {

    public static Fabrica getFabrica(String fabrica){
    	
    	/*Seleciona qual fábrica será criada*/
        if(fabrica.equalsIgnoreCase("cliente")){
            return new FabricaCliente();
        }else if(fabrica.equalsIgnoreCase("filme")){
            return new FabricaFilme();
        }else if(fabrica.equalsIgnoreCase("locacao")){
            return new FabricaLocacao();
        }
        return null;
    }
    
    /*Realiza as operações em comum entre todas as fábricas*/
    public abstract Modelo criaModelo();
    public abstract Controle criaControle();
    public abstract Visao criaVisao();
}