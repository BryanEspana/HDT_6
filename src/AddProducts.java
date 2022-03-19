import java.util.Scanner;

public class AddProducts {
    Scanner Scan = new Scanner(System.in);

    //AGREGAR PRODUCTOS

    public String AddProductName(){
        System.out.println("Escriba el Nombre del producto que deseea agregar: ");
        String Producto = Scan.nextLine();
        return Producto;
    }
    public String AddProductCategory(){
        System.out.println("Escriba la Categoria del Producto: ");
        String Producto = Scan.nextLine();
        return Producto;
    }

    //BUSCAR PRODUCTOS

    public String SearchProducts(){
        System.out.println("Escriba el Nombre exacto del producto: ");
        String Producto = Scan.nextLine();
        return Producto;
    }

}
