package ListasDobles;

public class principal {
    public static void main(String[] args) {
        metodo mt1 = new metodo();
        mt1.agregar(11);
        mt1.agregar(12);
        mt1.agregar(16);
        mt1.agregar(19);
        mt1.agregar(25);
        mt1.agregar(20);
        mt1.agregar(17);
        System.out.println("Pila: ");
        mt1.mostrarXPila();
        System.out.println("Cola: ");
        mt1.mostrarXCola();
    }
}
