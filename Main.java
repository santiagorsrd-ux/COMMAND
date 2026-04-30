    public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 =
                new CuentaBancaria("001",
                        "Santiago",
                        1000);

        CuentaBancaria cuenta2 =
                new CuentaBancaria("002",
                        "Carlos",
                        500);

        CajeroAutomatico cajero =
                new CajeroAutomatico();

        // Depositar
        Command deposito =
                new DepositarCommand(cuenta1, 300);

        cajero.ejecutarOperacion(deposito);

        // Retirar
        Command retiro =
                new RetirarCommand(cuenta1, 200);

        cajero.ejecutarOperacion(retiro);

        // Transferir
        Command transferencia =
                new TransferirCommand(cuenta1,
                        cuenta2,
                        150);

        cajero.ejecutarOperacion(transferencia);

        // Consultar saldo
        Command consultar =
                new ConsultarSaldoCommand(cuenta1);

        cajero.ejecutarOperacion(consultar);
    }
}