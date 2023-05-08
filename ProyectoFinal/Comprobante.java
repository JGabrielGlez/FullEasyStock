package ProyectoFinal;

import java.util.Calendar;
import java.util.GregorianCalendar;
import static javax.swing.JOptionPane.*;

public class Comprobante {
    private int folio, cantTotal;
    private String fecha, hora, descripcion;

    Comprobante(){}
    Comprobante(int folio, int cantTotal, String fecha, String hora, String descripcion){
        this.folio=folio; this.cantTotal=cantTotal; this.fecha=fecha; this.hora=hora;
        this.descripcion=descripcion;
    }

    public void leer(){//el folio debería ser dado automaticamente, mediante un contador interno
        folio=Integer.parseInt(showInputDialog("Ingrese el folio"));
        cantTotal=Integer.parseInt(showInputDialog("Ingrese la cantidad total de la venta: "));
        fecha=FechaActual(); hora=horaActual();
        descripcion=showInputDialog("Ingrese la descripción de la venta: ");
    }
    public void mostrar(){}
    public String toString(){
        return "Folio: " + folio + "\nCantidad total de la comprar: " + cantTotal +
                "\nFecha de emisión: " + fecha + "\nHora de emisión: " + hora +
                "\nDescripción general: " + descripcion;}

    public String FechaActual(){
        int d,m,a;
        Calendar c=new GregorianCalendar();
        d=c.get(Calendar.DATE);
        m=c.get(Calendar.MONTH)+1;
        a=c.get(Calendar.YEAR);
        return d +"/" + m +"/" + a;
    }

    public String horaActual(){
        int h,m,s;
        Calendar c= new GregorianCalendar();
        h=c.get(Calendar.HOUR);
        m=c.get(Calendar.MINUTE);
        s=c.get(Calendar.SECOND);
        return h + ":" + m + ":" +s;
    }

    public static void main(String asdf[]){
        Comprobante c= new Comprobante(); c.leer(); c.mostrar();

    }
}
