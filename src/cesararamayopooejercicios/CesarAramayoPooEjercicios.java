package cesararamayopooejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar_aramayo
 */
public class CesarAramayoPooEjercicios {

    public static void main(String[] args) {

        int opcion;
        opcion = 0;

        Scanner ingresar = new Scanner(System.in);

        System.out.println("SELECCIONE EL EJERCICIO  : ");
        System.out.println("INGRESE 1 PERRO QUE LADRA : ");
        System.out.println("INGRESE 2 ESTADO DEL AUTO : ");
        System.out.println("INGRESE 3 SALDO DE LA CUENTA BANCARIA : ");

        opcion = ingresar.nextInt();
        switch (opcion) {
            case 1:
                Perro perro;
                perro = new Perro("Negro");
                perro.Ladrar();
                break;
            case 2:
                Auto auto;
                auto = new Auto("Ford", "Falcon", 3000);
                auto.estadoAuto();

                break;
            case 3:
                cuentaBancaria Cuenta;
                Cuenta = new cuentaBancaria("Juan Cortez ","Caja de Ahorro", 3000);
                Cuenta.extraer();

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            default:
                System.out.println("OPCION NO VALIDA");
        }
    }

}
