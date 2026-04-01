public class job00 {
    public static void main(String[] args) {

        char lettre = 'A';
        String texte = "Bonjour";
        int entier = 42;
        long grandNombre = 123456789L;
        float decimal = 3.14f;
        boolean vraiOuFaux = true;

        System.out.println("char : " + lettre);
        System.out.println("String : " + texte);
        System.out.println("int : " + entier);
        System.out.println("long : " + grandNombre);
        System.out.println("float : " + decimal);
        System.out.println("boolean : " + vraiOuFaux);

        // Cas particulier demandé
        int TOTO = (int) 3.817;
        System.out.println("Valeur de TOTO : " + TOTO);
    }
}
