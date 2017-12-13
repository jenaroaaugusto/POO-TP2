package locadora.controle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

/**
 * Escritor
 */
public class ArquivoManager {

    private static ArquivoManager instance = null;
    
    private ObjectOutputStream oos = null;
    private ObjectInputStream ois = null;
    
    /*Cria apenas uma instância para salvar no arquivo*/
    public static ArquivoManager getInstance(){
        if(instance == null) {
            instance = new ArquivoManager();
        }
        return instance;
    }

    private ArquivoManager(){

    }
    
    /*Escreve no arquivo e exibe os dados nele.*/
    public void salvar(Object obj, Path path) throws FileNotFoundException, IOException{
       
    	/*Foi criado um arquivo para permitir escrever o objeto nele*/
    	oos = new ObjectOutputStream(new FileOutputStream(path.toFile()));
        System.out.println(obj.hashCode()); //printa o objeto mapeado na memória
        oos.writeObject(obj); //escreve esse objeto 
        oos.close();
    }
    
    /*Abre o objeto escrito no arquivo e retorna na tela*/
    public Object abrir(Path path) throws IOException, FileNotFoundException, ClassNotFoundException {
        ois = new ObjectInputStream(new FileInputStream(path.toFile()));
        Object obj = ois.readObject();
        System.out.println(obj.hashCode());
        ois.close();
        return obj;
    }
}