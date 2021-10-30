package lab5.ParteII;

public class Hexagono implements Figura{
    int lado;

    public Hexagono(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        float a;
        a = (float) (6*((Math.pow(this.lado,2)*Math.sqrt(3))/4));
        System.out.println("El area es "+a+"u.");
    }

    @Override
    public void calcularPerimetro() {
        int p;
        p = 6*this.lado;
        System.out.println("El perimetro es "+p+"u.");
    }
}
