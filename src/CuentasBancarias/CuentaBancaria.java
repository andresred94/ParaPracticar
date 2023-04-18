package CuentasBancarias;

/**
 * @author Andres Bravo
 * @version 18.04.23 - 10:47
 */
public class CuentaBancaria {
    //Atributos de la cuenta bancaria
    private int NumCuenta;
    private int Saldo;
    private Titular titular;

    //Metodos Setter
    public void setNumCuenta(int numCuenta) {
        NumCuenta = numCuenta;
    }
    public void setSaldo(int saldo) {
        Saldo = saldo;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    //Metodos Getter
    public int getNumCuenta() {
        return NumCuenta;
    }
    public int getSaldo() {
        return Saldo;
    }
    public Titular getTitular() {
        return titular;
    }


    //Metodos propios de la clase
    /**Metodo para ingresar dinero
     *
     */
    private static void ingresarDinero (){

    }

    /**Metodo para retirar dinero
     *
     */

    /**Metodo para añadir dinero
     *
     */

    /**Metodo para borrar dinero
     *
     */
}
