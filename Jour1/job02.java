import java.util.Scanner;

public class jour01 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Quel est ton prénom ? ");
        String prenom = clavier.nextLine();

        System.out.println("Bonjour " + prenom + " !");

        clavier.close();
    }
}
