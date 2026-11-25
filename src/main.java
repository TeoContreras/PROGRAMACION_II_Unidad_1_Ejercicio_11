public class main {
    public static void main(String[] args) {
        CuentaAhorros cuenta = new CuentaAhorros("123456", 10000, 12);

        cuenta.depositar(5000);
        cuenta.aplicarInteresMensual();

        System.out.println("Saldo actualizado: $" + cuenta.getSaldo());
    }
}
