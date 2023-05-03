import java.util.Scanner;

public class ScanUser {

    public ScanUser(){}

    public String saisieString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public int saisieInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}