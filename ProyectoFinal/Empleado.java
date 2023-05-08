package ProyectoFinal;


import static javax.swing.JOptionPane.*;


public class Empleado extends Persona {

    private int salario, id;
    private String horario;

    public Empleado(){ }
    public Empleado(String nombre, long telefono, int edad, int salario, int id, String horario){
        super(nombre,telefono,edad); this.salario=salario; this.id=id; this.horario=horario;}

    public void leer(){
        super.leer(); //redefinir el metodo
        salario=Integer.parseInt(showInputDialog("Ingrese el salario: "));
        id=Integer.parseInt(showInputDialog("Ingrese el ID: "));
        horario=showInputDialog("Ingrese el horario: ");
    }
    public String toString(){
        return super.toString()+"\nSalario: " + salario + "\nID: " + id +
                "\nHorario: " + horario;}

    public void mostrar(){showMessageDialog(null, this.toString());}


    public static void main(String a[]){

        Empleado c= new Empleado();c.leer();c.mostrar();
    }

}
