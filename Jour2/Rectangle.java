public class Rectangle {

    // Attributs protégés
    protected double largeur;
    protected double longueur;

    // Constructeur
    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    // Getter pour la longueur
    public double getLongueur() {
        return longueur;
    }

    // Getter pour la largeur
    public double getLargeur() {
        return largeur;
    }

    // Setter pour la longueur
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    // Setter pour la largeur
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Méthode surface
    public double surface() {
        return largeur * longueur;
    }
}

