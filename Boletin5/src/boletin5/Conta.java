
package boletin5;

/**
 *
 * @author cfigueirasvalverde
 */
public class Cuenta {
private String nome;
    private String numCuenta;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nome, String numCuenta, double saldo) {
        this.nome = nome;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumConta(String numConta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNumCuenta() {
        return this.numCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean ingreso(double cantidad) {
        if (cantidad > 0) {
            this.saldo = this.saldo + cantidad;
            return true;
        } else if (cantidad == 0) {
            System.out.println("No puedes ingresar una cantidad nula");
            return false;
        } else {
            System.out.println("No puedes ingresar una cantidad negativa");
            return false;
        }

    }
    public boolean reintegro(double cantidad) {
        if (this.saldo - cantidad < 0) {
            System.out.println("No hay saldo suficiente");
            return false;
        } else if (cantidad > 0) {
            this.saldo = this.saldo - cantidad;
            return true;
        } else if (cantidad == 0) {
            System.out.println("No puedes descontar una cantidad nula");
            return false;
        } else {
            System.out.println("No puedes descontar una cantidad negativa");
            return false;
        }

    }
    public void visualizar() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Numero de cuenta: " + this.numCuenta);
        System.out.println("Saldo: " + this.saldo + " Euros");
    }

    public boolean transferencia(Cuenta origen, double importe) {
        if (importe <= 0) {
            System.out.println("No se puede hacer la transferencia");
            return false;
       } else if (origen.getSaldo() - importe >= 0) {
            this.ingreso(importe);
            origen.reintegro(importe);
            return true;
       } else {
            System.out.println("No hay saldo suficiente");
            return false;
        }
    }
}
