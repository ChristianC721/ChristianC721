package lab5.ParteII;

public class Cuadrado implements Figura{
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        int a;
        a= (int) Math.pow(this.lado,2);
        System.out.println("El area es "+a+"u.");
    }

    @Override
    public void calcularPerimetro() {
        int p;
        p = 4*this.lado;
        System.out.println("El perimetro es "+p+"u.");
    }
}
