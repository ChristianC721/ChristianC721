package lab5.ParteII;

public class Ejecuta {
    public static void main(String[] args) {
        Heptagono hep1 = new Heptagono(4);
        hep1.calcularPerimetro();
        hep1.calcularArea();
        Triangulo t1 = new Triangulo(10);
        t1.calcularPerimetro();
        t1.calcularArea();
        Hexagono hex1 = new Hexagono(2);
        hex1.calcularPerimetro();
        hex1.calcularArea();
    }
}
