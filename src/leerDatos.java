import java.io.File;
import java.util.Scanner;

public class leerDatos {

    public void Readtxt(){
    File  doc = new File("HDT_6\\src\\ListadoProducto.txt");
    Scanner Scan = new Scanner(System.in);

    while(Scan.hasNextLine()) {
        System.out.println(Scan.nextLine());
    }
    }
}
