public class Mago extends Criatura {
    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        objetivo.defender(fuerza);
        System.out.println(nombre + " lanza un hechizo causando " + fuerza + " de daño.");
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " sufre " + daño + " de daño. Salud actual: " + salud);
    }
}