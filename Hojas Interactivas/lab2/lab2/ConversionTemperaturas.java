package lab2;

import java.util.Scanner;

public class ConversionTemperaturas {

    public int CelsiusKelvin(int n){
        int k;

        n = ConversionBases.convertiraBase10(n,8); //pasamos a base 10 para operar
        n = n+273;
        k = ConversionBases.convertiraBaseN(n,8); //devolvemos el resultado en base 8

        return k;
    }

    public static void main(String[] args) {
        int num;

        ConversionTemperaturas conversion = new ConversionTemperaturas();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de grados celsius en base 8 a convertir: ");
        num = entrada.nextInt();

        System.out.println("El resultado en base 8 es: "+conversion.CelsiusKelvin(num));;
    }
}
