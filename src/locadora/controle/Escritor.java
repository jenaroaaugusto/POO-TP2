package locadora.controle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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

    public void salvarObjeto(Object obj){
        
        ObjectOutputStream os = null;

        try {
			os = new ObjectOutputStream(new FileOutputStream(obj.toString() + ".dat"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }finally{
            if(os != null) {
                try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
    }
}