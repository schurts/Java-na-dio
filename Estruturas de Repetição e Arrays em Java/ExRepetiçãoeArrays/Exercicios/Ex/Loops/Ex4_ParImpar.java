package Ex.Loops;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int qunatPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            
            if (numero % 2 == 0) qunatPares++; //quantPares = quantPares + 1;
            else quantImpares++; //quantImpares = quantImpares + 1;

            count++;
            //count = coint +1
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + qunatPares);
        System.out.println("Quantidade Impares: " + quantImpares);

    }

}
