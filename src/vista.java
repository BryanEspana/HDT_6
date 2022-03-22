/* 
    Hoja de Trabajo #6
    Bryan Carlos Roberto España Machorro - 21550
    Algoritmos y Estructura de Datos - Sección 10
    Catedratico: Moises Alonso
    Auxiliares:  Cristian Laynez y Rudik Rompich
*/

import java.util.Scanner;

public class vista {
    Scanner Scan = new Scanner(System.in);

    /*** 
     * This method is MAPS menu
    */
    public int menuMaps(){
        System.out.println("Elije el tipo de MAPs que desea utilizar: \n1.)HashMap \n2.)TreeMap \n3.)LinkedHashMap");
        int opcion = Scan.nextInt();
        return opcion; 
    }
    public int MenuHashMap(){
        System.out.println("Cargando inventario en formato HashMap, porfavor espere...\n");
        System.out.println("---------------------INVENTARIO DE PRODUCTOS EN FORMATO HASHMAP--------------------");
        return 0;
    }
    public int MenuTreeMap(){
        System.out.println("Cargando inventario en formato TreeMap, porfavor espere...\n");
        System.out.println("---------------------INVENTARIO DE PRODUCTOS EN FORMATO TREEMAP--------------------");
        return 0;
    }
    public int MenuLinkedHashMap(){
        System.out.println("Cargando inventario en formato LinkedHashMap, porfavor espere...\n");
        System.out.println("---------------------INVENTARIO DE PRODUCTOS EN FORMATO LINKEDHASHMAP--------------------");
        return 0;
    }
    public int MenuInventario(){
        System.out.println("\n-----------Menu de Cliente:----------- \n1.) Agregar Producto a Carrito  \n2.) Buscar Producto \n3.) Carrito\n4.) Inventario \n5.) Salir");
        int opcion = Scan.nextInt();
        return opcion; 
    }

}
