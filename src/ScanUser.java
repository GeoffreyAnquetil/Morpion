import java.util.Scanner;

public class ScanUser {

    public ScanUser(){}

    public String saisieString(){
        System.out.println("Saisir une chaine de caractère");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public int saisieInt() {
        System.out.println("Saisir un entier");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}