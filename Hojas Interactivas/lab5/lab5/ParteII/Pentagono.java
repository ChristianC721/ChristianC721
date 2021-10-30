package lab5.ParteII;

public class Pentagono implements Figura{
    int lado;

    public Pentagono(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        float a;
        float ap;
        ap = (float) (this.lado/1.45);
        a = (int) ((5*this.lado*ap)/2);
        System.out.println("El area es "+a+"u.");
    }

    @Override
    public void calcularPerimetro() {
        int p;
        p=5*this.lado;
        System.out.println("El perimetro es "+p+"u.");
    }
}
