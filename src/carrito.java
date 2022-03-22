/* 
    Hoja de Trabajo #6
    Bryan Carlos Roberto España Machorro - 21550
    Algoritmos y Estructura de Datos - Sección 10
    Catedratico: Moises Alonso
    Auxiliares:  Cristian Laynez y Rudik Rompich
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class carrito {
    
    Scanner scan = new Scanner(System.in);
    HashMaps hashmap = new HashMaps();
    //HashMap de Carrito
    HashMap<String, inventario> CarritoHashMap = new HashMap<String, inventario>();
    String Category = "";
    String Product = "";


    public void AgregarCarrito(){
        //CARRITO 
        System.out.println("=======================Carrito de Compras=====================");
        System.out.println("-------------------------Información--------------------------");
        System.out.println("Para  agregar  un  Producto  a  su carrito  debe  de  colocar \nel numero de la categoria primero y el numero del producto. \nEjemplo: Categoria: 1, Producto: 1 \n(Categoria Mueble de terraza(1) y producto 1(Mesas de jardín)");
        System.out.println("----------------------Agregar Producto------------------------");
        //Introduce los productos que desea comprar
        System.out.println("Coloca la Categoria en el orden que esta en el inventario: (1-7)");
        int CategoryAdd = scan.nextInt();
        System.out.println("Coloca el Producto con el numero que esta en el inventario: ");
        int ProductAdd = scan.nextInt();
        System.out.println("¿Cuantos desea comprar?");
        int TotalProductos = scan.nextInt();
        //Asignar a variables los Scanners ingresados para agregarlos a un Maps de carrito
        if(CategoryAdd == 1){
            Category = "Mueble de terraza";
            if(ProductAdd == 1){
                Product = "Mesas de jardín";
            }else if(ProductAdd == 2){
                Product = "Sillas de jardín";
            }else if(ProductAdd == 3){
                Product = "Conjuntos mesas y sillas de jardín";
            }else if(ProductAdd == 4){
                Product = "Mesas de Ping Pong exteriores";
            }else{
                System.out.println("No existen más de 4 tipos de productos en esta categoria");
            }
        }else if(CategoryAdd == 2){
            Category = "Sillones de masaje";
            if(ProductAdd == 1){
                Product = "Cojines y colchonetas de masaje";
            }else if(ProductAdd == 2){
                Product = "Sillones relax y sofás de masajes";
            }else if(ProductAdd == 3){
                Product = "Sillones de masajes avanzados";
            }else if(ProductAdd == 4){
                Product = "Sofás camas";
            }else{
                System.out.println("No existen más de 4 tipos de productos en esta categoria");
            }
        }else if(CategoryAdd == 3){
            Category = "Bebidas";
            if(ProductAdd == 1){
                Product = "Cerveza tibetana Barley";
            }else if(ProductAdd == 2){
                Product = "Té frios";
            }else if(ProductAdd == 3){
                Product = "Cocacola 1 litro";
            }else if(ProductAdd == 4){
                Product = "Cocacola 2 litros";
            }else{
                System.out.println("No existen más de 4 tipos de productos en esta categoria");
            }
        }else if(CategoryAdd == 4){
            Category = "Condimentos";
            if(ProductAdd == 1){
                Product = "Sirope de regaliz";
            }else if(ProductAdd == 2){
                Product = "Especies Cajun del chef";
            }else if(ProductAdd == 3){
                Product = "Mezcla Gumbo del chef";
            }else{
                System.out.println("No existen más de 3 tipos de productos en esta categoria");
            }
        }else if(CategoryAdd ==5){
            Category = "Frutas";
            if(ProductAdd == 1){
                Product = "Peras secas";
            }else if(ProductAdd == 2){
                Product = "Pasas";
            }else if(ProductAdd == 3){
                Product = "Manzana roja";
            }else if(ProductAdd == 4){
                Product = "Manzana verde";
            }else{
                System.out.println("No existen más de 4 tipos de productos en esta categoria");
            }
        }else if(CategoryAdd ==6){
            Category = "Carnes";
            if(ProductAdd == 1){
                Product = "Res";
            }else if(ProductAdd == 2){
                Product = "Pollo";
            }else if(ProductAdd == 3){
                Product = "Cerdo";
            }else if(ProductAdd == 4){
                Product = "Camarones";
            }else if(ProductAdd == 5){
                Product = "Pescado";
            }else{
                System.out.println("No existen más de 5 tipos de productos en esta categoria");
            }
        }else if(CategoryAdd ==7){
            Category = "Lacteos";
            if(ProductAdd == 1){
                Product = "Queso de cabra";
            }else if(ProductAdd == 2){
                Product = "Queso Manchego";
            }else if(ProductAdd == 3){
                Product = "Leche descremada";
            }else if(ProductAdd == 4){
                Product = "Leche deslactosada";
            }else if(ProductAdd == 5){
                Product = "Leche entera";
            }else{
                System.out.println("No existen más de 5 tipos de productos en esta categoria");
            }
        }else{
            System.out.println("Debes colocar un numero del 1 al 7");
            System.exit(0);
        }
        System.out.println(TotalProductos+" "+Product+" de Categoria: "+Category+" Agregado a su Carrito de compras");
        //
        String TotalProductosStr = Integer.toString(TotalProductos);
        CarritoHashMap.put(Product,new inventario(TotalProductosStr));
    }
    public void CarritoTotal(){
        //Total del carrito
        System.out.println("============Total del Carrito=============");
        for(Map.Entry<String, inventario> Entrada: CarritoHashMap.entrySet()){
            String MapProduct = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void BuscarProducto(){
        System.out.println("=======================Busca Tu Producto=====================");
        System.out.println("1. Ver el inventario Completo\n2.Buscar por categoria");
        int SearchProduct = scan.nextInt();
        if(SearchProduct ==1){
            hashmap.InventarioPrint();
        }else if(SearchProduct ==2){
            System.out.println("Escribe la categoria que desees ver(1-7): ");
            int SearchCategory = scan.nextInt();
            if(SearchCategory ==1){
                hashmap.SearchCategory1();
            }else if(SearchCategory ==2){
                hashmap.SearchCategory2();
            }else if(SearchCategory ==3){
                hashmap.SearchCategory3();
            }else if(SearchCategory ==4){
                hashmap.SearchCategory4();
            }else if(SearchCategory ==5){
                hashmap.SearchCategory5();
            }else if(SearchCategory ==6){
                hashmap.SearchCategory6();
            }else if(SearchCategory ==7){
                hashmap.SearchCategory7();
            }else{
                System.out.println("ERROR: Solo existen 7 categorias");
            }
        } 
    }
}
