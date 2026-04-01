import java.util.Scanner;

public class job08 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisis un entier n : ");
        int n = clavier.nextInt();

        int somme = 0;

        for (int i = 1; i <= n; i++) {
            somme += i * i * i;
        }

        System.out.println("La somme des " + n + " premiers cubes est : " + somme);

        clavier.close();
    }
}
