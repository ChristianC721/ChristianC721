package lab5.ParteI;

public class Pentagono extends Figura {

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
