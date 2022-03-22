/* 
    Hoja de Trabajo #6
    Bryan Carlos Roberto España Machorro - 21550
    Algoritmos y Estructura de Datos - Sección 10
    Catedratico: Moises Alonso
    Auxiliares:  Cristian Laynez y Rudik Rompich
*/

import java.util.*;

public class HashMaps {
    //Agregar la clase del mapa que se desea agregar
    HashMap<String, inventario> Categoria1Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria2Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria3Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria4Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria5Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria6Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria7Products = new HashMap<String, inventario>();

    public void InventarioPrint(){
    //Productos de Mueble de terrazas
    Categoria1Products.put("Mesas de jardín", new inventario("Producto 1:"));
    Categoria1Products.put("Sillas de jardín", new inventario("Producto 2:"));
    Categoria1Products.put("Conjuntos mesas y sillas de jardín", new inventario("Producto 3:"));
    Categoria1Products.put("Mesas de Ping Pong exteriores", new inventario("Producto 4:"));

    //Sillones de masajes
    Categoria2Products.put("Cojines y colchonetas de masaje", new inventario("Producto 1:"));
    Categoria2Products.put("Sillones relax y sofás de masajes", new inventario("Producto 2:"));
    Categoria2Products.put("Sillones de masajes avanzados", new inventario("Producto 3:"));
    Categoria2Products.put("Sofás camas", new inventario("Producto 4:"));
    
    //Bebidas
    Categoria3Products.put("Cerveza tibetana Barley", new inventario("Producto 1:"));
    Categoria3Products.put("Té frios", new inventario("Producto 2:"));
    Categoria3Products.put("Cocacola 1 litro", new inventario("Producto 3:"));
    Categoria3Products.put("Cocacola 2 litros", new inventario("Producto 4:"));

    //Condimentos
    Categoria4Products.put("Sirope de regaliz", new inventario("Producto 1:"));
    Categoria4Products.put("Especies Cajun del chef", new inventario("Producto 2:"));
    Categoria4Products.put("Mezcla Gumbo del chef", new inventario("Producto 3:"));

    //Frutas
    Categoria5Products.put("Peras secas", new inventario("Producto 1:"));
    Categoria5Products.put("Pasas", new inventario("Producto 2:"));
    Categoria5Products.put("Manzana roja", new inventario("Producto 3:"));
    Categoria5Products.put("Manzana verde", new inventario("Producto 4:"));

    //Carnes
    Categoria6Products.put("Res", new inventario("Producto 1:"));
    Categoria6Products.put("Pollo", new inventario("Producto 2:"));
    Categoria6Products.put("Cerdo", new inventario("Producto 3:"));
    Categoria6Products.put("Camarones", new inventario("Producto 4:"));
    Categoria6Products.put("Pescado", new inventario("Producto 5:"));

    //Lacteos
    Categoria7Products.put("Queso de cabra", new inventario("Producto 1:"));
    Categoria7Products.put("Queso Manchego", new inventario("Producto 2:"));
    Categoria7Products.put("Leche descremada", new inventario("Producto 3:"));
    Categoria7Products.put("Leche deslactosada", new inventario("Producto 4:"));
    Categoria7Products.put("Leche entera", new inventario("Producto 5:"));

    //Imprimir el HashMap
    System.out.println("=======Mueble de terraza(1)========");
    for(Map.Entry<String, inventario> Entrada: Categoria1Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("=======Sillones de masaje(2)========");
    for(Map.Entry<String, inventario> Entrada: Categoria2Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("=============Bebidas(3)=============");
    for(Map.Entry<String, inventario> Entrada: Categoria3Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("===========Condimentos(4)==========");
    for(Map.Entry<String, inventario> Entrada: Categoria4Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("=============Frutas(5)=============");
    for(Map.Entry<String, inventario> Entrada: Categoria5Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("=============Carnes(6)=============");
    for(Map.Entry<String, inventario> Entrada: Categoria6Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("=============Lacteos(7)=============");
    for(Map.Entry<String, inventario> Entrada: Categoria7Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    }

    //METODOS PARA BUSCAR UN TIPO DE CATEGORIA
    public void SearchCategory1(){
        System.out.println("=======Mueble de terraza========");
    for(Map.Entry<String, inventario> Entrada: Categoria1Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);}
    }
    public void SearchCategory2(){
        System.out.println("=======Sillones de Masaje========");
        for(Map.Entry<String, inventario> Entrada: Categoria2Products.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void SearchCategory3(){
        System.out.println("=============Bebidas=============");
        for(Map.Entry<String, inventario> Entrada: Categoria3Products.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void SearchCategory4(){
        System.out.println("===========Condimentos==========");
        for(Map.Entry<String, inventario> Entrada: Categoria4Products.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void SearchCategory5(){
        System.out.println("=============Frutas=============");
        for(Map.Entry<String, inventario> Entrada: Categoria5Products.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void SearchCategory6(){
        System.out.println("=============Carnes=============");
        for(Map.Entry<String, inventario> Entrada: Categoria6Products.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
    public void SearchCategory7(){
        System.out.println("=============Lacteos=============");
        for(Map.Entry<String, inventario> Entrada: Categoria7Products.entrySet()){
            String Product = Entrada.getKey();
            inventario cate = Entrada.getValue();
            System.out.println(cate+" "+Product);
        }
    }
}
