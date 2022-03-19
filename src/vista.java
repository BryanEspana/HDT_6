import java.util.Scanner;

public class vista {
    Scanner Scan = new Scanner(System.in);

    /*** 
     * This method is MAPS menu
    */
    public int menuMaps(){
        System.out.println("Elije el tipo de MAPs que desea utilizar: \n1.) HashMap \n2.)TreeMap \n3.)LinkedHashMap");
        int opcion = Scan.nextInt();
        return opcion; 
    }
    public int MenuHashMap(){
        System.out.println("Cargando inventario en formato HashMap, porfavor espere...\n");
        System.out.println("-------INVENTARIO DE PRODUCTOS EN FORMATO HASHMAP------");
        int opcion = Scan.nextInt();
        return opcion;
    }
    public int MenuTreeMap(){
        System.out.println("Cargando inventario en formato TreeMap, porfavor espere...\n");
        System.out.println("-------INVENTARIO DE PRODUCTOS EN FORMATO TREEMAP------");
        int opcion = Scan.nextInt();
        return opcion;
    }
    public int MenuLinkedHashMap(){
        System.out.println("Cargando inventario en formato LinkedHashMap, porfavor espere...\n");
        System.out.println("-------INVENTARIO DE PRODUCTOS EN FORMATO LINKEDHASHMAP------");
        int opcion = Scan.nextInt();
        return opcion;
    }
}
