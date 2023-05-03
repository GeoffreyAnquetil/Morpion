public class Main {
    public static void main(String[] args) {
        int[][] grille = new int[3][3];

        for(int[] ligne : grille){
            for(int elt : ligne){
                elt = 0;
            }
        }

        int joueur1 = 1;
        int joueur2 = 2;

        affiche(grille);

    }

    static void affiche(int grille[][]){
        System.out.println(" 1 2 3 ");
        System.out.println("-------");
        System.out.println("|" + grille[0][0] + "|" + grille[0][1] + "|" + grille[0][2] + "| 1");
        System.out.println("-------");
        System.out.println("|" + grille[1][0] + "|" + grille[1][1] + "|" + grille[1][2] + "| 2");
        System.out.println("-------");
        System.out.println("|" + grille[2][0] + "|" + grille[2][1] + "|" + grille[2][2] + "| 3");
        System.out.println("-------");
    }
}
