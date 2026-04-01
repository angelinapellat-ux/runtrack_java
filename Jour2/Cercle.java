public class Cercle {

    // Attributs protégés
    protected double x;
    protected double y;
    protected double rayon;

    // Constructeur
    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRayon() {
        return rayon;
    }

    // Setters
    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // Méthode surface
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    // Vérifie si un point (px, py) est à l'intérieur du cercle
    public boolean estInterieur(double px, double py) {
        double dx = px - x;
        double dy = py - y;
        double distanceCarree = dx * dx + dy * dy;
        return distanceCarree <= rayon * rayon;
    }

    // Méthode d'affichage
    public void affiche() {
        System.out.println("Cercle centre (" + x + ", " + y + "), rayon = " + rayon);
    }
}


