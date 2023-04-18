package CuentasBancarias;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setNumCuenta(355);
        int c = cuenta1.getNumCuenta();
        System.out.println("La cuenta es "+c);
    }
}
