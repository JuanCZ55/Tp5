
package tp5;

public class Conversor {
    private double saldo;

    public Conversor(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public double convertir(double sueldo) {
        return sueldo * 1200;
    }
    
    public double cotizar(double dolares, double pesos) {
        if (dolares == 0) throw new ArithmeticException("No se puede dividir por cero.");
        return pesos / dolares;
    }

    public void aumentarSaldo(double monto) {
        saldo += monto;
    }

    public double retirarFisico(double monto) {
        if (monto > saldo) {
            System.out.println("Sueldo insuficiente");
        }
        saldo -= monto;
        return monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
