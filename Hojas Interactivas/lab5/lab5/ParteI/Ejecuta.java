package lab5.ParteI;

public class Ejecuta {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(5);
        c1.calcularPerimetro();
        c1.calcularArea();
        Pentagono p1 = new Pentagono(8);
        p1.calcularPerimetro();
        p1.calcularArea();
    }
}
