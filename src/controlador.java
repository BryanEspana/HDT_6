/* 
    Hoja de Trabajo #6
    Bryan Carlos Roberto España Machorro - 21550
    Algoritmos y Estructura de Datos - Sección 10
    Catedratico: Moises Alonso
    Auxiliares:  Cristian Laynez y Rudik Rompich
*/

public class controlador {
    public void Programa(){
        vista vista = new vista();
        leerDatos leerDatos = new leerDatos();
        AddProducts AddProducts = new AddProducts();
        HashMaps HashMap = new HashMaps();


        int opcion = vista.menuMaps();
        //String Inventariotxt = lw.leerArchivo("ListadoProducto.txt");

        switch(opcion) {
            case 1:     
                vista.MenuHashMap();
                HashMap.InventarioPrint();
                opcion = vista.MenuInventario();
                switch(opcion) {
                    case 1:
                        AddProducts.AddProductCategory();
                        AddProducts.AddProductName(); 
                        AddProducts.ResultadoProduct();
                        break;
                    case 2:
                        AddProducts.SearchProducts();
                        break;
                    case 3:
                        System.out.println("a");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                        default:
                        System.out.println("Error, solo se pueden numeros del 1 al 4");
                        break;
                }
                
                break;  
            case 2:
                vista.MenuHashMap();
                HashMap.InventarioPrint();
                opcion = vista.MenuInventario();
                switch(opcion) {
                    case 1:
                        AddProducts.AddProductCategory();
                        AddProducts.AddProductName(); 
                        AddProducts.ResultadoProduct();
                        break;
                    case 2:
                        AddProducts.SearchProducts();
                        break;
                    case 3:
                        System.out.println("a");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                        default:
                        System.out.println("Error, solo se pueden numeros del 1 al 4");
                        break;
                    }
                break;
            case 3:
                vista.MenuHashMap();
                HashMap.InventarioPrint();
                opcion = vista.MenuInventario();
                switch(opcion) {
                    case 1:
                        AddProducts.AddProductCategory();
                        AddProducts.AddProductName(); 
                        AddProducts.ResultadoProduct();
                        break;
                    case 2:
                        AddProducts.SearchProducts();
                        break;
                    case 3:
                        System.out.println("a");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                        default:
                        System.out.println("Error, solo se pueden numeros del 1 al 4");
                        break;
                    }
                    break;
            case 4:
            vista.MenuHashMap();
            HashMap.InventarioPrint();
            opcion = vista.MenuInventario();
            switch(opcion) {
                case 1:
                    AddProducts.AddProductCategory();
                    AddProducts.AddProductName(); 
                    AddProducts.ResultadoProduct();
                    break;
                case 2:
                    AddProducts.SearchProducts();
                    break;
                case 3:
                    System.out.println("a");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Error, solo se pueden numeros del 1 al 4");
                    break;
                }
                break;	
                default:
                System.out.println("Error, solo se pueden numeros del 1 al 4");
                break;
        }
    }
}
