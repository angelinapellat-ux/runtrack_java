import java.util.Scanner;

public class jour01 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisis un entier n : ");
        int n = clavier.nextInt();

        long resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }

        System.out.println("La factorielle de " + n + " est : " + resultat);

        clavier.close();
    }
}
