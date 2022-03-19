import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class leerDatos {

    public void Readtxt(){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         archivo = new File ("C:\\Users\\Bryan\\OneDrive - Universidad del Valle de Guatemala\\Documentos\\UVG\\SEMESTRE III\\Algoritmos y Estructura de Datos\\Hoja de Trabajo 6\\HDT_6\\src\\ListadoProducto.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null)
            System.out.println(linea);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }
}
