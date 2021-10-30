package lab5.ParteII;

public class Triangulo implements Figura{
    int lado;

    public Triangulo(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        int a;
        a = (int) ((Math.pow(lado,2)*Math.sqrt(3))/4);
        System.out.println("El area es "+a+"u.");
    }

    @Override
    public void calcularPerimetro() {
        int p;
        p = 3*this.lado;
        System.out.println("El perimetro es "+p+"u.");
    }
}
