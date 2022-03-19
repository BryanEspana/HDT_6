import java.util.*;

class inventario{
    private String nombre;
    private String categoria;

    public inventario(String n){
            nombre = n;
            categoria = "a";
    }  
    public String toString(){
        return "[name= "+nombre + ", sueldo"+categoria+"]";
    }
}
