package PC1.problema3;

import java.util.Scanner;

public class MultiplicacionRusa {
    public static int main(String[] args) {
        int multiplicando;
        int multiplicador;
        String cadena;

        System.out.println("Introduzca una cadena de caracteres: ");
        Scanner entrada = new Scanner(System.in);
        cadena = entrada.nextLine();

        int ejecutaMultiRusa(int a, int b){
            while (b>1){
                a *= 2;
                b /= 2;
            }
            return 0;
        }

    }
}
