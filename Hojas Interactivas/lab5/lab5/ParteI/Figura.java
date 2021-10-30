package lab5.ParteI;

public abstract class Figura {
    protected int lado;

    public Figura() {
    }

    public Figura(int lado) {
        this.lado = lado;
    }

    public abstract void calcularArea();
    public abstract void calcularPerimetro();
}
