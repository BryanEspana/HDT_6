import java.util.*;

public class HashMaps {

    public void InventarioPrint(){
    //Agregar la clase del mapa que se desea agregar
    HashMap<String, inventario> Categoria1Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria2Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria3Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria4Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria5Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria6Products = new HashMap<String, inventario>();
    HashMap<String, inventario> Categoria7Products = new HashMap<String, inventario>();
    String Categoria1 = "Mueble de terraza";
    String Categoria2 = "Sillones de masaje";
    String Categoria3 = "Bebidas";
    String Categoria4 = "Condimentos";
    String Categoria5 = "Frutas";
    String Categoria6 = "Carnes";
    String Categoria7 = "Lacteos";

    //Agregar datos al mapa con put y los dos comonentes String y empleado 

    //Productos de Mueble de terrazas
    Categoria1Products.put("Mesas de jardín", new inventario("5"));
    Categoria1Products.put("Sillas de jardín", new inventario("6"));
    Categoria1Products.put("Conjuntos mesas y sillas de jardín", new inventario("10"));
    Categoria1Products.put("Mesas de Ping Pong exteriores", new inventario("2"));

    //Sillones de masajes
    Categoria2Products.put("Cojines y colchonetas de masaje", new inventario("15"));
    Categoria2Products.put("Sillones relax y sofás de masajes", new inventario("10"));
    Categoria2Products.put("Sillones de masajes avanzados", new inventario("15"));
    Categoria2Products.put("Sofás camas", new inventario("10"));
    
    //Bebidas
    Categoria3Products.put("Cerveza tibetana Barley", new inventario("50"));
    Categoria3Products.put("Té frios", new inventario("30"));
    Categoria3Products.put("Cocacola 1 litro", new inventario("90"));
    Categoria3Products.put("Cocacola 2 litros", new inventario("70"));

    //Condimentos
    Categoria4Products.put("Sirope de regaliz", new inventario("130"));
    Categoria4Products.put("Especies Cajun del chef", new inventario("150"));
    Categoria4Products.put("Mezcla Gumbo del chef", new inventario("190"));

    //Frutas
    Categoria5Products.put("Peras secas", new inventario("30"));
    Categoria5Products.put("Pasas", new inventario("100"));
    Categoria5Products.put("Manzana roja", new inventario("50"));
    Categoria5Products.put("Manzana verde", new inventario("50"));

    //Carnes
    Categoria6Products.put("Res", new inventario("15"));
    Categoria6Products.put("Pollo", new inventario("15"));
    Categoria6Products.put("Cerdo", new inventario("15"));
    Categoria6Products.put("Camarones", new inventario("10"));
    Categoria6Products.put("Pescado", new inventario("10"));

    //Lacteos
    Categoria7Products.put("Queso de cabra", new inventario("30"));
    Categoria7Products.put("Queso Manchego ", new inventario("25"));
    Categoria7Products.put("Leche descremada", new inventario("20"));
    Categoria7Products.put("Leche deslactosada", new inventario("20"));
    Categoria7Products.put("Leche entera", new inventario("20"));


    //Eliminar Un dato del mapa con remove (Se coloca un componente del dato que se desea eliminar) 
    /*productos.remove("147");
    System.out.print(productos);
    productos.put("147", new inventario("Angel"));
    productos.put("147", new inventario("Gabriel"));
    System.out.println("\n"+productos);*/

    //Esto es para al imprimir el mapa envez de que salga con {} salga con []
    //System.out.println(productos.entrySet());
    System.out.println("======="+Categoria1+"========");
    for(Map.Entry<String, inventario> Entrada: Categoria1Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("======="+Categoria2+"========");
    for(Map.Entry<String, inventario> Entrada: Categoria2Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("============="+Categoria3+"=============");
    for(Map.Entry<String, inventario> Entrada: Categoria3Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("==========="+Categoria4+"==========");
    for(Map.Entry<String, inventario> Entrada: Categoria4Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("============="+Categoria5+"=============");
    for(Map.Entry<String, inventario> Entrada: Categoria5Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("============="+Categoria6+"=============");
    for(Map.Entry<String, inventario> Entrada: Categoria6Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }
    System.out.println("============="+Categoria7+"=============");
    for(Map.Entry<String, inventario> Entrada: Categoria7Products.entrySet()){
        String Product = Entrada.getKey();
        inventario cate = Entrada.getValue();
        System.out.println(cate+" "+Product);
    }

    }
}
