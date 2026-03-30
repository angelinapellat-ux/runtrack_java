public class jour01 {
    public static void main(String[] args) {

        int resultat = 1;

        for (int i = 1; i <= 8; i++) {
            resultat *= i;
        }

        System.out.println("La factorielle de 8 est : " + resultat);
    }
}
