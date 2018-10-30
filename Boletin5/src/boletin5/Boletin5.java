
package boletin5;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin5 {
public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cuenta cuentaOrigen = new Cuenta("Mikel Merino", "1", 1050);
        Cuenta cuentaDestino = new Cuenta();
        cuentaDestino.setNome("Kepa Arrizabalaga");
        cuentaDestino.setNumConta("2");
        cuentaDestino.setSaldo(2600);
        cuentaOrigen.visualizar();
        cuentaDestino.visualizar();
        cuentaOrigen.ingreso(2000);
        cuentaDestino.reintegro(600);
        cuentaOrigen.visualizar();
        cuentaDestino.visualizar();

        System.out.println("\nIndica la cantidad a transferir: ");
        double cant = ler.nextDouble();
        while (cant <= 0) {
            System.out.println("ERROR DE TRANSFERENCIA");
            System.out.println("\nIndica la cantidad a transferir: ");
            cant = ler.nextDouble();
        }

        if (cuentaDestino.transferencia(cuentaOrigen, cant) == true) {
            System.out.println("\nTransferencia realizada");
        } else {
            System.out.println("ERROR DE TRANSFERENCIA");
        }
        cuentaOrigen.visualizar();
        cuentaDestino.visualizar();

        System.out.println("\nIndique la cantidad a transferir: ");
        cant = ler.nextDouble();
        if (cuentaDestino.transferencia(cuentaOrigen, cant) == true) {
            System.out.println("\nTransferencia realizada");
        } else {
            System.out.println("ERROR DE TRANSFERENCIA");
        }
        cuentaOrigen.visualizar();
        cuentaDestino.visualizar();

    }
}
