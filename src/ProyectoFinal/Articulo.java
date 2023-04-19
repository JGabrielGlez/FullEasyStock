package ProyectoFinal;
//actualiazación de la clase numero 1 
import static javax.swing.JOptionPane.*;

public  class Articulo {

    private int cant;
    private String name="";
    private int id=0, costo=0;
    //la primera posición sería el stock, de ahi lo que se vende, y la tercera lo que se requiere

    Articulo(){}
    Articulo(String name, int id, int cant, int costo){this.name=name; this.id=id; this.cant=cant;
    this.costo=costo;}

    public String toString(){
        return "Nombre del producto: " + name +"\nId: " + id + "\nCantidad: " + cant +
                "\nCosto unitario: " + costo;
    }
    public void leer(){
        name=showInputDialog("Ingresar el nombre del producto: ");
        id=Integer.parseInt(showInputDialog("Ingresar el ID del producto: "));
        cant=Integer.parseInt(showInputDialog("Ingresar la cantidad del producto: "));
        costo=Integer.parseInt(showInputDialog("Ingresar el costo del producto: "));
    }

    public void mostrar(){
        showMessageDialog(null, toString());
    }


    public static void main(String as[]){
        Articulo c=new Articulo(); c.leer();c.mostrar();
    }

}
