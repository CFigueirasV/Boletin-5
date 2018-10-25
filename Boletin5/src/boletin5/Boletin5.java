
package boletin5;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin5 {
public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta contaOrigen = new Conta("Roberto Merino", "1", 1050);
        Conta contaDestino = new Conta();
        contaDestino.setNome("Ricardo Méndez");
        contaDestino.setNumConta("2");
        contaDestino.setSaldo(2600);
        contaOrigen.visualizar();
        contaDestino.visualizar();
        contaOrigen.ingreso(2000);
        contaDestino.reintegro(600);
        contaOrigen.visualizar();
        contaDestino.visualizar();

        System.out.println("\nIndique la cantidad a transferir: ");
        double cant = ler.nextDouble();
        while (cant <= 0) {
            System.out.println("ERROR DE TRANSFERENCIA");
            System.out.println("\nIndique la cantidad a transferir: ");
            cant = ler.nextDouble();
        }

        if (contaDestino.transferencia(contaOrigen, cant) == true) {
            System.out.println("\nTransferencia realizada");
        } else {
            System.out.println("ERROR DE TRANSFERENCIA");
        }
        contaOrigen.visualizar();
        contaDestino.visualizar();

        System.out.println("\nIndique la cantidad a transferir: ");
        cant = ler.nextDouble();
        if (contaDestino.transferencia(contaOrigen, cant) == true) {
            System.out.println("\nTransferencia realizada");
        } else {
            System.out.println("ERROR DE TRANSFERENCIA");
        }
        contaOrigen.visualizar();
        contaDestino.visualizar();

    }
}