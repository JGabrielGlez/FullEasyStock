package ProyectoFinal;
import static javax.swing.JOptionPane.*;

public class Bodega {
    private int numero;
    private String ubicacion;

    Bodega(){}
    Bodega(int numero, String ubicacion){this.numero=numero; this.ubicacion=ubicacion;}

    public void leer(){
        numero=Integer.parseInt(showInputDialog("Ingrese el número de la bodega: "));
        ubicacion=showInputDialog("Ingrse la ubicación de la bodega: ");
    }


    public void mostrar(){showMessageDialog(null,toString());}

    public String toString(){
        return "Número de la bodega: " + numero +"\nUbicación de la bodega: " + ubicacion;}



    public static void main(String asdf[]){
        Bodega g=new Bodega();
        g.leer(); g.mostrar();

    }

}
