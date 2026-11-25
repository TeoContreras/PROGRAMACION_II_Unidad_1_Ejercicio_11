public class CuentaAhorros {
    private String numeroCuenta;
    private double saldo;
    private double tasaInteresAnual;

    public CuentaAhorros(String numeroCuenta, double saldo, double tasaInteresAnual) {
        this.numeroCuenta = numeroCuenta;

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
            System.out.println("El saldo no puede ser negativo.");
        }

        if (tasaInteresAnual >= 0) {
            this.tasaInteresAnual = tasaInteresAnual;
        } else {
            this.tasaInteresAnual = 0;
            System.out.println("La tasa de interes no puede ser negativa.");
        }
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        } else {
            System.out.println("El deposito debe ser mayor a cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
        } else {
            System.out.println("No se puede realizar el retiro.");
        }
    }

    public void aplicarInteresMensual() {
        double interes = saldo * (tasaInteresAnual / 12) / 100;
        saldo = saldo + interes;
    }

    public double getSaldo() {
        return saldo;
    }
}
