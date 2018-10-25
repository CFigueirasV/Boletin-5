
package boletin5;

/**
 *
 * @author cfigueirasvalverde
 */
class Conta {
private String nome;
    private String numConta;
    private double saldo;

    //constructores
    public Conta() {
    }

    public Conta(String nome, String numConta, double saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //getters
    public String getNome() {
        return this.nome;
    }

    public String getNumConta() {
        return this.numConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    //Outros metodos(ingreso,reintegro,visualizar y transferencia)
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
        System.out.println("Numero de conta: " + this.numConta);
        System.out.println("Saldo: " + this.saldo + " Euros");
    }

    public boolean transferencia(Conta origen, double importe) {
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