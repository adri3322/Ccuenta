
/**
 * esta clase contiene el main donde tiene 
 * las excepciones de la clase CCuenta
 * @author Adriana Martin Sanchez
 * @version 1.0.0
 */


package practica;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCuenta miCuenta;

        double saldoActual;



        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

        saldoActual = miCuenta.estado();

        System.out.println("El saldo actual es"+ saldoActual );



        try {

            miCuenta.retirar(2300);

        } catch (Exception e) {

            System.out.print("Fallo al retirar");

        }

        try {

            System.out.println("Ingreso en cuenta");

            miCuenta.ingresar(695);

        } catch (Exception e) {

            System.out.print("Fallo al ingresar");

        }

    }
	}


