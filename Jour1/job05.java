import java.util.Scanner;

public class job05 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisis le premier nombre : ");
        int a = clavier.nextInt();

        System.out.print("Saisis le deuxième nombre : ");
        int b = clavier.nextInt();

        System.out.print("Saisis le troisième nombre : ");
        int c = clavier.nextInt();

        int max = Math.max(a, Math.max(b, c));

        System.out.println("Le maximum des trois nombres est : " + max);

        clavier.close();
    }
}
