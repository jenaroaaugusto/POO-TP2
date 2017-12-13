package locadora.controle;

import java.nio.file.Path;

/**
 * Escritor
 */
public class Escritor {

    private static Escritor instance = null;

    public static Escritor getInstance(){
        if(instance == null) {
            instance = new Escritor();
        }
        return instance;
    }

    private Escritor(){

    }

    public void salvar(Object obj, Path path){

        
    }
}