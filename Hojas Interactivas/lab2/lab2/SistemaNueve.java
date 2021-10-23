package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaNueve {

    int sumarBase9(int a, int b, int base1, int base2){
        int s1,s2,suma;

        s1 = ConversionBases.convertiraBaseN(ConversionBases.convertiraBase10(a,base1),9);
        s2 = ConversionBases.convertiraBaseN(ConversionBases.convertiraBase10(b,base2),9);
        suma = s1 + s2;

        return suma;
    }

    int restarBase9(int a, int b, int base1, int base2){
        int r1,r2,resta;

        r1 = ConversionBases.convertiraBaseN(ConversionBases.convertiraBase10(a,base1),9);
        r2 = ConversionBases.convertiraBaseN(ConversionBases.convertiraBase10(b,base2),9);
        resta = r1 - r2;

        return resta;
    }

    public static void main(String[] args) {
        int numa , numb , bnuma , bnumb;

        SistemaNueve operacion = new SistemaNueve();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numa = entrada.nextInt();
        System.out.println("Ingrese el sistema de numeracion del primer numero (ej. 2): ");
        bnuma = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numb = entrada.nextInt();
        System.out.println("Ingrese el sistema de numeracion del segundo numero (ej. 2): ");
        bnumb = entrada.nextInt();

        System.out.println("La suma en base 9 es: "+operacion.sumarBase9(numa,numb,bnuma,bnumb));
        System.out.println("La resta en base 9 es: "+operacion.restarBase9(numa,numb,bnuma,bnumb));
    }
}
