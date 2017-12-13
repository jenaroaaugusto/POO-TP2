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

    public static ArquivoManager getInstance(){
        if(instance == null) {
            instance = new ArquivoManager();
        }
        return instance;
    }

    private ArquivoManager(){

    }

    public void salvar(Object obj, Path path) throws FileNotFoundException, IOException{
        oos = new ObjectOutputStream(new FileOutputStream(path.toFile()));
        System.out.println(obj.hashCode());
        oos.writeObject(obj);
        oos.close();
    }

    public Object abrir(Path path) throws IOException, FileNotFoundException, ClassNotFoundException {
        ois = new ObjectInputStream(new FileInputStream(path.toFile()));
        Object obj = ois.readObject();
        System.out.println(obj.hashCode());
        ois.close();
        return obj;
    }
}