
package cesararamayopooejercicios;


public class Perro {
    private String nombre;
    private String color;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     public void Ladrar(){
            System.out.println("Guau");
        }
     
     //Constructor que reciba Color 
     //Ejercicio 4 Contructor que reciba uno de los parametros 
    public Perro(String color){
        this.color= color;
    }
}
