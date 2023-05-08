package ProyectoFinal;


import java.util.Calendar;
import java.util.GregorianCalendar;
import static javax.swing.JOptionPane.*;

public class Venta {

    private String descripcion, fecha=FechaActual(), hora=horaActual();
    private int numVenta;


    public Venta(){}
    public Venta(String descripcion, String fecha, String hora, int numVenta){
        this.descripcion=descripcion; this.fecha=fecha; this.hora=hora; this.numVenta=numVenta;
    }

    public void leer(){
        descripcion=showInputDialog("Ingrese la descripción de la venta: ");

        //más delante incluir un contador para que el numero de la venta sea automático
        numVenta=Integer.parseInt(showInputDialog("Ingrese el numero de la venta"));
    }

    public String toString(){
        return "Descripcioón: " + descripcion + "\nFecha de realización: " + fecha +
                "\nHora de la venta: " + hora + "\nNumero de la venta: " + numVenta;
    }

    public void mostrar(){showMessageDialog(null,toString());}

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


    public static void main(String asd[]){
        Venta x= new Venta(); x.leer();x.mostrar();
    }
}
