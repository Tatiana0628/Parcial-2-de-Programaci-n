public class Guerrero extends Criatura {
    private String arma;

    public Guerrero(String nombre, int salud, int fuerza, String arma) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }

    @Override
    public void atacar(Criatura objetivo) {
        objetivo.defender(fuerza);
        System.out.println(nombre + " ataca con su " + arma + " causando " + fuerza + " de daño.");
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " bloquea parte del ataque pero recibe " + daño + " de daño. Salud restante: " + salud);
    }
}