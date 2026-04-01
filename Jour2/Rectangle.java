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

public class FiguresGeometriques {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5.0, 3.0);

        System.out.println("Largeur : " + r.getLargeur());
        System.out.println("Longueur : " + r.getLongueur());
        System.out.println("Surface : " + r.surface());
    }
}
