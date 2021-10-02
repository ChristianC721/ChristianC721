package PC1.problema1;

public class EjecutaReserva {
    /*sencilla 100
        doble 180
        suite 500*/
    //Generamos 6 instancias
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.setNombre("Raul");
        u1.setDni("87412645");
        u1.setEdad(19);
        u1.setNumregistro(3);
        u1.setTipo("suite");
        Usuario u2 = new Usuario();
        u2.setNombre("jorge");
        u2.setDni("15473025");
        u2.setEdad(25);
        u2.setNumregistro(134);
        u2.setTipo("doble");
        Usuario u3 = new Usuario();
        u3.setNombre("Daniel");
        u3.setDni("06975421");
        u3.setEdad(47);
        u3.setNumregistro(36);
        u3.setTipo("sencilla");
        Usuario u4 = new Usuario();
        u4.setNombre("Christian");
        u4.setDni("72217803");
        u4.setEdad(20);
        u4.setNumregistro(27);
        u4.setTipo("doble");
        Usuario u5 = new Usuario();
        u5.setNombre("Arturo");
        u5.setDni("14456887");
        u5.setEdad(50);
        u5.setNumregistro(250);
        u5.setTipo("doble");
        Usuario u6 = new Usuario();
        u6.setNombre("Carlos");
        u6.setDni("71549875");
        u6.setEdad(20);
        u6.setNumregistro(15);
        u6.setTipo("suite");

        System.out.println(u1);

    }
}
