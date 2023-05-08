package ProyectoFinal;


import static javax.swing.JOptionPane.*;

public class Cliente extends Persona {
    private String tipoCliente;
    //para el tipo de cliente podríamos agregar un tipo de confianza, nuevo, recurrente, etc.


    public void leer(){super.leer();
        tipoCliente=showInputDialog("Ingrese el tipo de cliente");}
    public void mostrar(){showMessageDialog(null,super.toString()+
            "\nTipo de Cliente: " + tipoCliente);}



    public static void main(String asd[]){
        Cliente c=new Cliente(); c.leer();c.mostrar();
    }
}
