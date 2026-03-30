import java.util.Scanner;
public class jour01 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int somme = 0;
        int n;

        System.out.println("Saisis cinq entiers :");

        for (int i = 0; i < 5; i++) {
            n = clavier.nextInt();
            somme += n;
        }

        System.out.println("La moyenne est : " + (somme / 5.0));

        clavier.close();
    }
}
