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

        boolean fin = false;

        // Test de case_libre
        while(!fin){
            affiche(grille);
            saisie(joueur1, grille);
            fin = !case_libre(grille);
        }
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

    static void saisie(int joueur, int grille[][]){
        ScanUser scanUser = new ScanUser();
        boolean valide = false;
        String coup;
        int ligne;
        int colonne;
        while(!valide){
            System.out.println("Joueur " + joueur + " (format \"ligne colonne\") : ");
            coup = scanUser.saisieString();
            ligne = Character.getNumericValue(coup.charAt(0));
            colonne = Character.getNumericValue(coup.charAt(2));
            System.out.println("x y " + ligne + " " + colonne);
            if(((ligne != 1) && (ligne != 2) && (ligne != 3)) || ((colonne != 1) && (colonne != 2) && (colonne != 3))){
                System.out.println("Veuillez saisir un emplacement correct");
            } else if (grille[ligne-1][colonne-1] != 0){
                System.out.println("Veuillez saisir un emplacement libre");
            } else {
                grille[ligne-1][colonne-1] = joueur;
                valide = true;
            }
        }
    }

    static boolean case_libre(int grille[][]){
        for(int[] ligne : grille){
            for(int elt : ligne){
                if(elt == 0) return true;
            }
        }
        return false;
    }
}


