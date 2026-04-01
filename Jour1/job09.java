import java.util.Scanner;

public class job09 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisis ton âge : ");
        int age = clavier.nextInt();

        if (age < 18) {
            System.out.println("Tu es mineur.");
        } else {
            System.out.println("Tu es majeur.");
        }

        clavier.close();
    }
}
