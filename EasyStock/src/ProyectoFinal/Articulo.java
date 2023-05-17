package ProyectoFinal;
//actualiazación de la clase numero 1 

//prueba
public  class Articulo {

    private int cant;
    private String name="";
    private int id=0; double costo=0;

    Articulo(){}
    Articulo(String name, int id, int cant, double costo){this.name=name; this.id=id; this.cant=cant;
    this.costo=costo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
     
    
    

    
    


}
