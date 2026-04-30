public class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado: " + monto);
    }

    public void retirar(double monto) {

        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado: " + monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferir(CuentaBancaria destino, double monto) {

        if (monto <= saldo) {

            saldo -= monto;
            destino.saldo += monto;

            System.out.println("Transferencia realizada de "
                    + monto + " a la cuenta de "
                    + destino.titular);

        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}