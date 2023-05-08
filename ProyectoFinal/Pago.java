package ProyectoFinal;
import static javax.swing.JOptionPane.*;

public class Pago {
    private String tipoPago;
    private int cantidad, importeRecibido, cambio;

    Pago(){}
    Pago(String tipoPago, int cantidad, int importeRecibido){
        this.tipoPago=tipoPago; this.cantidad=cantidad; this.importeRecibido=importeRecibido;
    }

    public void leer(){
        //para el tipo de pago podríamos poner un combo box con los métodos de pago usados
        //o también un radio button.
        tipoPago=showInputDialog("Ingres el tipo de pago: ");
        cantidad=Integer.parseInt(showInputDialog("Ingrese la cantidad de la venta: "));
        importeRecibido=Integer.parseInt(showInputDialog("Ingrese el importe recibido: "));
        cambio=importeRecibido-cantidad;
    }

    public void mostrar(){showMessageDialog(null, toString());}
    public String toString(){
        return  "El tipo de pago fue: " + tipoPago + "\nLa cantidad de la venta fue de: " +
                cantidad + "\nImporte recibido: " + importeRecibido + "\nEl cambio es de: " + cambio;}

    public static void main(String asd[]){
       Pago c= new Pago(); c.leer();c.mostrar();
    }
}
