import java.util.Scanner;

public class jour01 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisis un nombre : ");
        int nombre = clavier.nextInt();

        int carre = nombre * nombre;

        System.out.println("Le carré de " + nombre + " est : " + carre);

        clavier.close();
    }
}
