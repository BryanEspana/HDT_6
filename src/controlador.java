public class controlador {
    public void Programa(){
        vista vista = new vista();
        leerDatos leerDatos = new leerDatos();
        int opcion = vista.menuMaps();
        //String Inventariotxt = lw.leerArchivo("ListadoProducto.txt");
        switch(opcion) {
            case 1:
                opcion = vista.MenuHashMap();
                leerDatos.Readtxt();
                break;  
            case 2:
                opcion = vista.MenuTreeMap();
                break;
            case 3:
                opcion = vista.MenuLinkedHashMap();
                break;
        }
    }
}
