package lab5.ParteI;

public class Heptagono extends Figura {

    public Heptagono(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        float a;
        float ap;
        ap = (float) (this.lado/0.96318);
        a = (float) ((7*this.lado*ap)/2);
        System.out.println("El area es "+a+"u.");
    }

    @Override
    public void calcularPerimetro() {
        int p;
        p = 7*this.lado;
        System.out.println("El perimetro es "+p+"u.");
    }
}
