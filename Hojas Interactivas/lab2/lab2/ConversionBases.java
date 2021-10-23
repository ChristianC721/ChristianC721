package lab2;

import java.util.ArrayList;

public class ConversionBases {
    static int convertiraBase10(int num, int b){
        int num2;
        int ncifras=0;
        int convertido=0;
        num2 = num;
        while (num>0){
            num/=10;
            ncifras++;
        }
        int[] arreglocifras = new int[ncifras];
        for (int i=0; i<ncifras; i++){
            arreglocifras[i] = num2 % 10;
            num2 /= 10;
            convertido+=arreglocifras[i]*Math.pow(b,i);
        }

        return convertido;
    }
    static int convertiraBaseN(int num, int n){
        int convertido=0;
        ArrayList<Integer> lista = new ArrayList<>();
        while (num>n){
            lista.add(num%n);
            num/=n;

        }
        lista.add(num);
        for (int i=0; i<lista.size(); i++){
            convertido+=lista.get(i)*Math.pow(10,i);
        }

        return convertido;
    }
}
