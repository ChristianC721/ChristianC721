package PC1.problema2;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private long ISBN;
    private int numpags;
    private int edicion;
    private String editorial;
    private String fechaedicion;

    //constructor por defecto

    public Libro() {
    }

    //constructores


    public Libro(String titulo, String autor, long ISBN, int edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.edicion = edicion;
    }

    public void digitos(long n) {
        if(n > 0) {
            long aux;
            digitos(n/10);
            aux = (n%10);
            ArrayList<Integer> num = new ArrayList<>();
            num.add((int) aux);
        }
    /*
    public boolean validalsbn(long ibsn){
        boolean a = false;
        if ((ibsn/1000000000<100 & ibsn/1000000000>10) & (true)) {
            a = true;
        }
        return a */
    }


    public void imprimirLibro() {
            System.out.println("titulo: "+this.titulo+"\nautor: "+this.autor+this.edicion+this.editorial+this.ISBN);
        }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN=" + ISBN +
                ", numpags=" + numpags +
                ", edicion=" + edicion +
                ", editorial='" + editorial + '\'' +
                ", fechaedicion='" + fechaedicion + '\'' +
                '}';
    }
    public void imprimirDetalleLibro(){
        System.out.println("Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN=" + ISBN +
                ", numpags=" + numpags +
                ", edicion=" + edicion +
                ", editorial='" + editorial + '\'' +
                ", fechaedicion='" + fechaedicion + '\'' +
                '}');
    }

}
