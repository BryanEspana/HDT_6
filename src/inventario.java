/* 
    Hoja de Trabajo #6
    Bryan Carlos Roberto España Machorro - 21550
    Algoritmos y Estructura de Datos - Sección 10
    Catedratico: Moises Alonso
    Auxiliares:  Cristian Laynez y Rudik Rompich
*/

import java.util.*;

class inventario{
    //Variables de Categoria y Producto
    private String Total;
    private int TotalInt;

    //Inventario 
    public inventario(String n){
        Total = n;
}
public inventario(int totalProductos) {
        TotalInt = totalProductos;
    }
public String toString(){
    return Total;
}

}
