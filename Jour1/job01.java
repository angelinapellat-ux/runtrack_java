import java.util.Scanner;

public class job01 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Tape quelque chose : ");
        String saisie = clavier.nextLine();

        System.out.println("Tu as tapé : " + saisie);

        clavier.close();
    }
}
