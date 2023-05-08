package ProyectoFinal;


import static javax.swing.JOptionPane.*;

public class Distribuidor {
    private String nombre="", rfc="", domicilio="";
    private long telefono;


    public Distribuidor(){};
    public Distribuidor(String nombre, String rfc, String domicilio, long telefono) {
        this.nombre=nombre; this.rfc=rfc; this.domicilio=domicilio; this.telefono=telefono;
    }

    public void leer(){
        nombre=showInputDialog("Ingrese el nombre del distribuidor: ");
        rfc=showInputDialog("Ingrese el RFC del distribuidor: ");
        domicilio=showInputDialog("Ingrese el domicilio del distribuidor: ");
        telefono=Long.parseLong(showInputDialog("Ingrese el telefono del distribuidor: "));


    }
    public void mostrar() {
        showMessageDialog(null,toString());
    }

    public String toString() {
        String datos="Nombre: " + nombre + "\nRFC: " + rfc + "\nDomicilio:" +
                domicilio + "\nTeléfono: " + telefono;
        return datos;
    }




    public static void main(String a[]){
        Distribuidor x=new Distribuidor(); x.leer();
        x.mostrar();
    }
}
