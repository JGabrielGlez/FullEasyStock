package ProyectoFinal;


import static javax.swing.JOptionPane.*;

public class Persona{

    protected String nombre="";
    protected int edad=0;
    protected long telefono=0;

    Persona(){};
    Persona(String nombre, long telefono, int edad){this.nombre=nombre; this.telefono=telefono; this.edad=edad;}

    public void mostrar() {
        showMessageDialog(null,toString());
    }

    public void leer() {
        nombre=showInputDialog("Ingrese el nombre: ");
        telefono=Long.parseLong(showInputDialog("Ingrese el teléfono: "));
        edad=Integer.parseInt(showInputDialog("Ingrese la edad: "));
    }

    public String toString(){
        return "Nombre: " + nombre + "\nTelefono: " + telefono + "\nEdad: " + edad;
    }

    public static void main (String a[]){
        Persona c=new Persona(); c.leer();c.mostrar();
    }
}
