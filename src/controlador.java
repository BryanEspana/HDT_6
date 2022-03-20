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
                        AddProducts.AddProductName(); 
                        AddProducts.AddProductCategory();
                        break;
                    case 2:
                        AddProducts.SearchProducts();
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                        default:
                        System.out.println("Error, solo se pueden numeros del 1 al 3");
                        break;
                }
                
                break;  
            case 2:
                vista.MenuTreeMap();
                leerDatos.Readtxt(); 
                System.out.println("\nMenu de Inventario: \n1.) Agregar Productos \n2.) Buscar Producto \n3.) Salir");
                switch(opcion) {
                    case 1:
                        //Nombre del producto
                        System.out.println("Escriba el Nombre del producto que deseea agregar: ");
                        
                        //Categoria del producto
                        System.out.println("Escriba la categoria del producto: ");

                        //Agregar otro producto
                        System.out.println("¿Desea Agregar otro producto? 1.Si, 2.No");

                        break;
                    case 2:
                        System.out.println("Coloca el nombre exacto del producto: ");
                        break;  
                }
                break;
            case 3:
                vista.MenuLinkedHashMap();
                leerDatos.Readtxt(); 
                System.out.println("\nMenu de Inventario: \n1.) Agregar Productos \n2.) Buscar Producto \n3.) Salir");
                switch(opcion) {
                    case 1:
                        //Nombre del producto
                        System.out.println("Escriba el Nombre del producto que deseea agregar: ");
                        
                        //Categoria del producto
                        System.out.println("Escriba la categoria del producto: ");

                        //Agregar otro producto
                        System.out.println("¿Desea Agregar otro producto? 1.Si, 2.No");

                        break;
                    case 2:
                        System.out.println("Coloca el nombre exacto del producto: ");
                        break;  
                }
                break;
            case 4:
                System.out.println("Finalizando Programa...");
                System.exit(0);
                System.out.println("\nMenu de Inventario: \n1.) Agregar Productos \n2.) Buscar Producto \n3.) Salir");
                switch(opcion) {
                    case 1:
                        //Nombre del producto
                        System.out.println("Escriba el Nombre del producto que deseea agregar: ");
                        
                        //Categoria del producto
                        System.out.println("Escriba la categoria del producto: ");

                        //Agregar otro producto
                        System.out.println("¿Desea Agregar otro producto? 1.Si, 2.No");

                        break;
                    case 2:
                        System.out.println("Coloca el nombre exacto del producto: ");
                        break;  
                }
                break;	
                default:
                System.out.println("Error, solo se pueden numeros del 1 al 4");
                break;
        }
    }
}
