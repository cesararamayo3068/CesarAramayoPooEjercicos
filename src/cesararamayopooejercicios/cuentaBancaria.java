package cesararamayopooejercicios;

/**
 *
 * @author cesar_aramayo
 */
public class cuentaBancaria {

    private String nombreTitular;
    private String tipoDeCuenta;
    private int saldo;
    private int saldoExtraer;

    public int getSaldoExtraer() {
        return saldoExtraer;
    }

    public void setSaldoExtraer(int saldoExtraer) {
        this.saldoExtraer = saldoExtraer;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    //Constructor que recibe los 3 parametros  
     //Ejercicio 6 Contructor que reciba los 3 parametros 
    public cuentaBancaria  (String nombreTitular  , String tipoDeCuenta ,int saldo){
        this.nombreTitular= nombreTitular;
        this.tipoDeCuenta=tipoDeCuenta;
        this.saldo=saldo;
    }

    public void extraer() {
        
        this.saldoExtraer=100;
        this.saldo=800;
        if (this.saldo == 0) {
            System.out.println("NO CUENTA CON SALDO");
        } else if (this.saldoExtraer > this.saldo) {
            System.out.println("SALDO INSUFICIENTE");

        } else {
            this.saldo = this.saldo - this.saldoExtraer;
            
            System.out.println(this.saldo);
    }
        
    }
}