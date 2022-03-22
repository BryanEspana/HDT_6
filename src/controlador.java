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
        HashMaps HashMap = new HashMaps();
        carrito carrito = new carrito();

        int opcion = vista.menuMaps();
        while(opcion != 4){
        switch(opcion) {
            case 1:     
                while(opcion !=5){
                opcion = vista.MenuInventario();
                switch(opcion) {
                    case 1:
                        carrito.AgregarCarrito();
                        break;
                    case 2:
                        carrito.BuscarProducto();
                        break;
                    case 3:
                        carrito.CarritoTotal();
                        break;
                    case 4:
                        vista.MenuHashMap();
                        HashMap.InventarioPrint();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                        default:
                        System.out.println("Error, solo se pueden numeros del 1 al 4");
                        break;
                        }
                    }
                break;  
            case 2:
                while(opcion !=5){
                opcion = vista.MenuInventario();
                switch(opcion) {
                    case 1:
                        carrito.AgregarCarrito();
                        break;
                    case 2:
                        carrito.BuscarProducto();
                        break;
                    case 3:
                        carrito.CarritoTotal();
                        break;
                    case 4:
                        vista.MenuHashMap();
                        HashMap.InventarioPrint();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                        default:
                        System.out.println("Error, solo se pueden numeros del 1 al 4");
                        break;
                        }
                    }
                break;
            case 3:
                while(opcion !=5){
                opcion = vista.MenuInventario();
                switch(opcion) {
                    case 1:
                        carrito.AgregarCarrito();
                        break;
                    case 2:
                        carrito.BuscarProducto();
                        break;
                    case 3:
                        carrito.CarritoTotal();
                        break;
                    case 4:
                        vista.MenuHashMap();
                        HashMap.InventarioPrint();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                        default:
                        System.out.println("Error, solo se pueden numeros del 1 al 4");
                        break;
                        }
                    }
                    break;
            case 4:
                System.out.println("Error, solo se pueden numeros del 1 al 3");
                break;
            }
        }
    }
}
