public class Dragon extends Criatura {
    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = this.fuerza * 2;
        objetivo.defender(daño);
        System.out.println(nombre + " lanza un fuego poderoso causando " + daño + " de daño.");
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }
}
