package ProyectoFinal;
import static javax.swing.JOptionPane.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Requisicion {
    private String articulo, fecha=FechaActual();
    private int stock, cantidadSolicitada;

    public void leer(){
        articulo=showInputDialog("Ingrese el artículo a pedir: ");
        //el stock para cada articulo debería definirse una sola vez
        stock=Integer.parseInt(showInputDialog("Ingrese el stock del artículo"));
        cantidadSolicitada=Integer.parseInt(showInputDialog("Ingrese la cantidad solicitada"));
    }

    public void mostrar(){showMessageDialog(null, toString());}

    public String toString(){
        return "Fecha de requisión: " +  fecha + "\nNombre del artículo: " + "\nStock: " + stock +
                "\nCantidad solicitada: " + cantidadSolicitada;}

    public String FechaActual(){
        int d,m,a;
        Calendar c=new GregorianCalendar();
        d=c.get(Calendar.DATE);
        m=c.get(Calendar.MONTH)+1;
        a=c.get(Calendar.YEAR);
        return d +"/" + m +"/" + a;
    }

   
}

