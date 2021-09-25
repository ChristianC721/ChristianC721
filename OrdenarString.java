package Codigos;

public class OrdenarString {
    public static void main(String[] args) {
        String[] utiles={"lapiz","lapicero","borrador","corrector","tijera"};
        int cont=utiles.length;
        for(int i=0; i<cont-1; i++){
            for(int j=i+1; j<cont; j++){
                if(utiles[i].compareTo(utiles[j])>0){
                    String aux=utiles[i];
                    utiles[i]=utiles[j];
                    utiles[j]=aux;
                }
            }
        }
        System.out.println("\n");
        for(String s: utiles){
            System.out.println(s);
        }
    }
}


