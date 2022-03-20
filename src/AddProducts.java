/* 
    Hoja de Trabajo #6
    Bryan Carlos Roberto España Machorro - 21550
    Algoritmos y Estructura de Datos - Sección 10
    Catedratico: Moises Alonso
    Auxiliares:  Cristian Laynez y Rudik Rompich
*/

import java.util.Scanner;

public class AddProducts {
    //Imports
    Scanner Scan = new Scanner(System.in);
    Scanner ScanInt = new Scanner(System.in);
    HashMaps HashMap = new HashMaps();
    //Variables
    public String ProductoName;
    public int ProductoCategory;
    
    //AGREGAR PRODUCTOS
    //Agregar Categoria del Producto
    public void AddProductCategory(){
        System.out.println("Coloca la Categoria en el orden que esta en el inventario: 1-7");
        ProductoCategory = ScanInt.nextInt();
    }
    //Agragar Nombre del Producto
    public void AddProductName(){
        System.out.println("Escriba el Nombre del producto");
        ProductoName = Scan.nextLine();
    }
    //Revisar si la Categoria esta en el inventario, si si agregar el producto al carrito
    public void ResultadoProduct(){
        if(ProductoCategory == 1 || ProductoCategory ==2 ||ProductoCategory ==3||ProductoCategory ==4 ||ProductoCategory ==5 ||ProductoCategory ==6||ProductoCategory ==7)
            {
            System.out.println("Se a agregado el siguiente Producto: \n1 "+ProductoName+" de Categoría: "+ProductoCategory);
        }else{
            System.out.println("El producto debe de ser de una de las categorias ingresadas en el inventario, escribe bien la categoria");
        }
               
    }


    //BUSCAR PRODUCTOS

    public String SearchProducts(){
        System.out.println("Escriba el Nombre exacto del producto: ");
        String Producto = Scan.nextLine();
        return Producto;
    }

}
