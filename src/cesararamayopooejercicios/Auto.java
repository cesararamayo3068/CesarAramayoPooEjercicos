
package cesararamayopooejercicios;

/**
 *
 * @author cesar_aramayo
 */
public class Auto {
    private String marca ;
    private String modelo;
    private int kilometraje;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
       
        
         this.kilometraje = kilometraje;
    }
    
  
     
     public void estadoAuto() {
           this.kilometraje=9400;
         if (this.kilometraje==0){
         System.out.println("ESTA NUEVO");
         
         }else if (this.kilometraje<1000){
          System.out.println("POCO USADO");
          
         }else if (this.kilometraje<10000){
          System.out.println("USADO");
          
         }else if (this.kilometraje>10000){
          System.out.println("BASTANTE USADO");
     }
         
     }
}