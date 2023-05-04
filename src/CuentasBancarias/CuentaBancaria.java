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
        this.Saldo = saldo;
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
     * @param cantDinero: cantidad de dinero para ingresar
     */
    private void ingresarDinero (int cantDinero){
        int saldoActual = getSaldo();
        setSaldo(cantDinero+saldoActual);
        System.out.println("Ha añadido "+cantDinero+" euros en su cuenta.");
    }

    /**Metodo para retirar dinero
     * @param cantDinero : cantidad de dinero para retirar
     */
    private void retirarDinero (int cantDinero){
        int saldoActual = getSaldo();
        saldoActual = saldoActual-cantDinero;
        setSaldo(saldoActual);
        System.out.println("Ha retirado "+cantDinero+" , su saldo actual es :"+saldoActual);
    }

    /**Metodo para añadir dinero
     *
     */

    /**Metodo para borrar dinero
     *
     */
}
