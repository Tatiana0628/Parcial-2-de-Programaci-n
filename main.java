public class main {

    public static void simularBatalla(Criatura c1, Criatura c2) {
        System.out.println("Comienza la batalla entre " + c1.getNombre() + " y " + c2.getNombre());

        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            if (c2.estaViva()) {
                c2.atacar(c1);
            }
        }

        System.out.println("\n--- Resultado Final ---");
        System.out.println(c1.getNombre() + " salud: " + c1.getSalud());
        System.out.println(c2.getNombre() + " salud: " + c2.getSalud());

        if (c1.estaViva()) {
            System.out.println("¡" + c1.getNombre() + " gana la batalla!");
        } else {
            System.out.println("¡" + c2.getNombre() + " gana la batalla!");
        }
    }

    public static void main(String[] args) {
        Criatura dragon = new Dragon("Furia Nocturna", 100, 30, "Negras");
        Criatura mago = new Mago("Merlín", 80, 25, "Hechizo de fuego");
        Criatura guerrero = new Guerrero("Leonidas", 90, 28, "Espada de acero");

        simularBatalla(dragon, mago);
        System.out.println("\n-------------------\n");
        simularBatalla(mago, guerrero);
    }
}