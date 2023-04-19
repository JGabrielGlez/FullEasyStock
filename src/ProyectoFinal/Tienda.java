package ProyectoFinal;

import static javax.swing.JOptionPane.*;


//esta clase será más para definir el encabezado o la pantalla de inicio

public class Tienda {
    private String nombre="", rfc="", domicilio="", horario="", telefono;


    public Tienda(){};
    public Tienda(String nombre, String rfc, String domicilio, String horario, String telefono) {
        this.nombre=nombre; this.rfc=rfc; this.domicilio=domicilio; this.horario=horario; this.telefono=telefono;
    }

    public void mostrar() {
        showMessageDialog(null,toString());
    }

    public String toString() {
        String datos="Nombre: " + nombre + "\nRFC: " + rfc + "\nDomicilio:" +
                domicilio + "\nHorario: " + horario + "\nTeléfono: " + telefono;
        return datos;
    }



    //no se crearán nuevos objetos tienda, porque realmente este vendrá predefinido según el negocio que
    //adquiera el sistema
    public static void main(String a[]){
        Tienda x=new Tienda("Vision2000","HOEK098734JNHNSSU7", "Av. Colosio #23",
                "Todo el día", "3271055587");
        x.mostrar();
    }
}

