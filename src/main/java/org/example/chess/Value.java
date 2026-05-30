package org.example.chess;


import javafx.scene.image.ImageView;

import java.util.ArrayList;

import static org.example.chess.Piece.*;

public class Value {
    private static final int ROI = 1;
    private static final int REINE = 2;
    private static final int FOU = 3;
    private static final int CAVALIER = 4;
    private static final int TOUR = 5;
    private static final int PION = 6;

    // PIÈCES NOIRES
    private static final int ROINOIR = -1;
    private static final int REINENOIR = -2;
    private static final int FOUNOIR = -3;
    private static final int CAVALIERNOIR = -4;
    private static final int TOURNOIR = -5;
    private static final int PIONNOIR = -6;






    public static boolean Grand_rock_blanc = true;
    public static boolean Grand_rock_noir = true;
    public static boolean Petit_rock_blanc = true;
    public static boolean Petit_rock_noir = true;
    public static int sauvegarde_ligne = -1;
    public static int sauvegarde_colonne = -1;


  public static Piece piecess = new Piece(0,0,0,0,false);


  public static ArrayList<String> listeDiagonal = new ArrayList<>();
  public static ArrayList<String> listeColone = new ArrayList<>();

  public static ArrayList<String> listeCavalier = new ArrayList<>();

  public static ArrayList<String> listeKing = new ArrayList<>();

    public static ArrayList<String> listePion = new ArrayList<>();


    public static ArrayList<String> listePionBlack = new ArrayList<>();




    public boolean movement_piece( int ligne, int colone) {

        int x = sauvegarde_colonne;

        int y = sauvegarde_ligne;


        int piece = Graphic.grilleEchecs[sauvegarde_ligne][sauvegarde_colonne];









        if (ligne == sauvegarde_ligne && colone == sauvegarde_colonne) {

            System.out.println("hmmm  " + sauvegarde_ligne);
            System.out.println("hmmm  " + sauvegarde_colonne);

            return false;
        }






        //On prend la valeur de la pièce sélectionné

        System.out.println("hmmm  " + piece);


        int newpiece = Graphic.grilleEchecs[ligne][colone];
if(!Verification_coup(piece,newpiece)){

    return false;


}




        System.out.println("le bordel est "+ sauvegarde_ligne +"et "+ sauvegarde_colonne);


        switch (Graphic.grilleEchecs[sauvegarde_ligne][sauvegarde_colonne]){
            //ici on récupére le chiffre

            //le chiffre et associer à une piece  ex 6 = pion








            case PION:








                if(AutorisationCoup_Pion(ligne,colone) && Coup.CanPlay(PION)) {


                    //je fait une condition temporaire pour autoriser lereturn true
                    //et tester ce que je veux faire  pense à l'enlever après car ne sert a rien

                    System.out.print("Tout va bien !");
                    Coup.Coup_piece = 0; // le prochaine tour ça sera les noir car je vien de jouer les blanc

                    /**
                     *
                     *
                     * le 0 correspond au noir et le 1 au blanc
                     *
                     */

                    return true;



                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );
                }






                break;

            //verifier si c'est la premier fois qui deplace la piece

            //si oui mettre cordonée autoriser de colone +1 et line +1  et colone +2 et line +2

            //si un de ces coup n'est pas jouer reinitialiser et rien faire et dire que non movement pas autoriser




            case PIONNOIR:

                if(AutorisationCoup_Pion_Black(ligne,colone) && Coup.CanPlay(PIONNOIR)) {


                    //je fait une condition temporaire pour autoriser lereturn true
                    //et tester ce que je veux faire  pense à l'enlever après car ne sert a rien

                    System.out.print("Tout va bien !");
                    Coup.Coup_piece = 1;

                    return true;



                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );
                }










                break;








            case  FOU:

                //faire en sorte de crée un liste de coordonée "autoriser"
                /*

                en prenant la postion de base ajouter x+1 ou  x-1 en ajoutant y +1

                //puis reprendre la coordonée calculer et refaire pareil  jusqu'a 8 en regardant à chaque postion si y a une piece
                si y a un piece s'arreter sinon s'arreter à 8





                 exemple x 1 y 1



//

                 */







                if(AutorisationCoup_Diagonal(ligne,colone) && Coup.CanPlay(FOU)) {


                    //je fait une condition temporaire pour autoriser lereturn true
                    //et tester ce que je veux faire  pense à l'enlever après car ne sert a rien

                    System.out.print("Tout va bien !");
                    Coup.Coup_piece = 0;

                    return true;

                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );
                }



                break;


            case TOUR:


                if(AutorisationCoup_Colone(ligne,colone) && Coup.CanPlay(TOUR)) {

                    System.out.print("Tout va bien pour la tour!");


                    Coup.Coup_piece = 0;

                    return true;



                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );


                }


            break;








            case REINE:


                if(AutorisationCoup_Colone(ligne,colone)  && Coup.CanPlay(REINE) || AutorisationCoup_Diagonal(ligne,colone) && Coup.CanPlay(REINE)) {

                    System.out.print("Tout va bien pour la reine!");


                    Coup.Coup_piece = 0;

                    return true;



                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );


                }


                break;











            case ROI:

                if(AutorisationCoup_King(ligne,colone) && Coup.CanPlay(ROI)) {


                    //je fait une condition temporaire pour autoriser lereturn true
                    //et tester ce que je veux faire  pense à l'enlever après car ne sert a rien

                    System.out.print("Tout va bien !");
                    Coup.Coup_piece = 0;
                    return true;

                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );
                }


                break;



            case CAVALIER:


                if(AutorisationCoup_Cavalier(ligne,colone) && Coup.CanPlay(CAVALIER)) {

                    Coup.Coup_piece = 0;
                    //je fait une condition temporaire pour autoriser lereturn true
                    //et tester ce que je veux faire  pense à l'enlever après car ne sert a rien

                    System.out.print("Tout va bien !");

                    return true;

                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );
                }



                break;

            case CAVALIERNOIR:
                if(AutorisationCoup_Cavalier(ligne,colone) && Coup.CanPlay(CAVALIERNOIR)) {


                    //je fait une condition temporaire pour autoriser lereturn true
                    //et tester ce que je veux faire  pense à l'enlever après car ne sert a rien

                    System.out.print("Tout va bien !");
                    Coup.Coup_piece = 1;

                    return true;

                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );
                }


                break;


            case ROINOIR:

                if(AutorisationCoup_King(ligne,colone) && Coup.CanPlay(ROINOIR)) {


                    //je fait une condition temporaire pour autoriser lereturn true
                    //et tester ce que je veux faire  pense à l'enlever après car ne sert a rien

                    System.out.print("Tout va bien !");
                    Coup.Coup_piece = 1;
                    return true;

                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );
                }


                break;


            case REINENOIR:


                if(AutorisationCoup_Colone(ligne,colone)  && Coup.CanPlay(REINENOIR)|| AutorisationCoup_Diagonal(ligne,colone)&& Coup.CanPlay(REINENOIR)) {

                    System.out.print("Tout va bien pour la reine!");

                    Coup.Coup_piece = 1;


                    return true;



                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );


                }


                break;



            case  TOURNOIR:


                if(AutorisationCoup_Colone(ligne,colone)&& Coup.CanPlay(TOURNOIR)) {

                    System.out.print("Tout va bien pour la tour!");



                    Coup.Coup_piece = 1;
                    return true;



                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );


                }


                break;


            case FOUNOIR:

                //faire en sorte de crée un liste de coordonée "autoriser"
                /*

                en prenant la postion de base ajouter x+1 ou  x-1 en ajoutant y +1

                //puis reprendre la coordonée calculer et refaire pareil  jusqu'a 8 en regardant à chaque postion si y a une piece
                si y a un piece s'arreter sinon s'arreter à 8





                 exemple x 1 y 1



//

                 */







                if(AutorisationCoup_Diagonal(ligne,colone) && Coup.CanPlay(FOUNOIR)) {


                    //je fait une condition temporaire pour autoriser lereturn true
                    //et tester ce que je veux faire  pense à l'enlever après car ne sert a rien




                    Coup.Coup_piece = 1;
                    System.out.print("Tout va bien !");

                    return true;

                }else{

                    System.out.print("non ça va pas ! le x est " + x + " le y est " + y );
                }



                break;






            default:

                System.out.println("Rien n'a été selectionner comme piece ! ");
                break;

        }



        return false;
    }














    public void coordonnees(int ligne, int colonne) {


        System.out.println("selection = " + sauvegarde_ligne + " , " + sauvegarde_colonne);

//premier fois que on selection le tyruc par defaut c'est -1
        if (sauvegarde_ligne == -1) {

            //si rien n'est selectioonner et bien faire verification que la la case choisi n'es pas 0

            if (Graphic.grilleEchecs[ligne][colonne] != 0) {

                //si la case qui est selectionner n'est pas vide et bien svg les coordoner dans ligne selection
                //et colone selection

                //alors pourquoi on mais ligneselection = à ligne alors que c'est nouveaux et parreil ave  colone?
                //car enfaite avant on appel cette fonction et mais les coordonée comme ligne et colone et donc vu que c'est la
                //premier fois on selec la case et bien on leur attribut c'est donnée car par défaut  c'est sur -1


                sauvegarde_ligne = ligne;
                sauvegarde_colonne = colonne;

                //le mlettre en jaune pour bien voir


               Graphic.buttons[ligne][colonne].setStyle("-fx-background-color: yellow;");

               Coup coup = new Coup();


               if(coup.GetCoup() == -1){

                   Coup.Coup_piece = 1;



               }


                coup.GetCoup();


                autorisation_list_diagonale(sauvegarde_ligne,sauvegarde_colonne,sauvegarde_ligne,sauvegarde_colonne,0);


                autorisation_list_Colone(sauvegarde_ligne,sauvegarde_colonne,sauvegarde_ligne,sauvegarde_colonne,0);


                autorisation_list_Cavalier(sauvegarde_ligne,sauvegarde_colonne,sauvegarde_ligne,sauvegarde_colonne,0);

                autorisation_list_King(sauvegarde_ligne,sauvegarde_colonne,sauvegarde_ligne,sauvegarde_colonne,0);


                autorisation_list_Pion(sauvegarde_ligne,sauvegarde_colonne,sauvegarde_ligne,sauvegarde_colonne,0);

                autorisation_list_Pion_Black(sauvegarde_ligne,sauvegarde_colonne,sauvegarde_ligne,sauvegarde_colonne,0);

//
                if(Coup.Coup_piece == -1){


                    Coup.Coup_piece = 1;
                    //au blanc de jouer



                }





                System.out.println("_____________________");
                System.out.println("                        ");
                System.out.println("                        ");

                System.out.println("le ancien y est " + sauvegarde_colonne);
                System.out.println("le ancien x est " + sauvegarde_ligne);
                System.out.println("                            ");

                System.out.println("                        ");
                System.out.println("_____________________");









                System.out.println("piece  :" + Graphic.grilleEchecs[ligne][colonne]);
                System.out.println("LIGNE :" + sauvegarde_ligne);
                System.out.println("COLONE :" + sauvegarde_colonne);

                piecess.setIsSelectionner(true);

            }else{






            }

        } else {


            if (movement_piece(ligne, colonne)) {





                int piece = Graphic.grilleEchecs[sauvegarde_ligne][sauvegarde_colonne];

                System.out.println("int piece = grilleEchecs[ligneSelectionnee][colonneSelectionnee];" + piece);

                //On prend la valeur de la pièce sélectionné


                Graphic.grilleEchecs[ligne][colonne] = piece;
                //La pièce arrive sur la case cliquée


               //FirstMove(sauvegarde_ligne, sauvegarde_colonne);

                Graphic.grilleEchecs[sauvegarde_ligne][sauvegarde_colonne] = 0;
                //on mais lancien position de la piece à 0 pour dire que y a plus rien

                ImageView img = (ImageView) Graphic.buttons[sauvegarde_ligne][sauvegarde_colonne].getGraphic();

                Graphic.buttons[ligne][colonne].setGraphic(img);
                Graphic.buttons[sauvegarde_ligne][sauvegarde_colonne].setGraphic(null);
                //dans l'ancienne position on mais le graphic à null


                //ici petit verification pour mettre case noir ou blanche pour faire style damier

                int i = sauvegarde_ligne;
                int j = sauvegarde_colonne;


                System.out.println("LIGNE :" + ligne);
                System.out.println("COLONE :" + colonne);


                if ((i + j) % 2 == 0)
                    Graphic.buttons[i][j].setStyle("-fx-background-color: #F0D8B5; -fx-padding: 0;");


                else
                    Graphic.buttons[i][j].setStyle("-fx-background-color: #B58863; -fx-padding: 0;");


                //partie renitialisation

                sauvegarde_ligne = -1;
                sauvegarde_colonne = -1;
                System.out.println("la on reset le truc par defaut mon gars donc ligne" + sauvegarde_ligne + "et colone" + sauvegarde_colonne);


                piecess.setIsSelectionner(false);


            }else{



                System.out.println("il y a eu un soucis !!");


            }
        }
    }


















    public  static boolean FirstMove(int sauvegarde_ligne, int sauvegarde_colonne){

        switch(Graphic.grilleEchecs[sauvegarde_ligne][sauvegarde_colonne]) {

            case PION:

                if(sauvegarde_ligne == 6) {



                    System.out.println("Ceci et la premier fois que vous bouger un pion");

                    return true;



                }else{

                    System.out.println("vous avez déjà bougez ce pion null");
                    System.out.println("vous avez déjà bougez ce pion null"); System.out.println("vous avez déjà bougez ce pion null"); System.out.println("vous avez déjà bougez ce pion null");
                    System.out.println("vous avez déjà bougez ce pion null");
                    System.out.println("vous avez déjà bougez ce pion null");
                    System.out.println("vous avez déjà bougez ce pion null");
                    System.out.println("vous avez déjà bougez ce pion null");
                    System.out.println("vous avez déjà bougez ce pion null");


                }

                break;



            case PIONNOIR:
                if(sauvegarde_ligne == 1) {
                    System.out.println("first time");


                    return true;
                }else{

                    System.out.println("vous avez déjà bougez ce pion null");
                }

                break;

            case TOUR:

                if(sauvegarde_colonne == 0) {



                    System.out.println("le grand rock à été désactiver" +
                            "");

                    Grand_rock_blanc = false;


                    return true;
                }else{

                    System.out.println("le petit rock à été desactiver ");
                    Petit_rock_blanc = false;
                }








                break;

            case TOURNOIR:


                if(sauvegarde_colonne == 0) {



                    System.out.println("le grand rock à été désactiver" +
                            "");

                    Grand_rock_noir = false;


                    return true;
                }else{

                    System.out.println("le petit rock à été desactiver ");
                    Petit_rock_noir = false;
                }


                break;

            case ROINOIR:

                System.out.println("le petit et grand rock noir  à été desactiver ");
                Petit_rock_noir = false;
                Grand_rock_noir = false;



                break;


            case ROI:

                System.out.println("le petit et grand rock blanc  à été desactiver ");
                Petit_rock_blanc = false;
                Grand_rock_blanc = false;


                break;







            default:
                break;


        }







        return false;
    }

    public static void reset(String all){



        if(all.equalsIgnoreCase("all")){


            sauvegarde_colonne = -1;
            sauvegarde_ligne = -1;
            Grand_rock_blanc = true;
            Grand_rock_noir = true;
            Petit_rock_blanc = true;
            Petit_rock_noir = true;
            piecess.setIsSelectionner(false);




        }else{
            int i = sauvegarde_ligne;
            int j = sauvegarde_colonne;


            if ((i + j) % 2 == 0)
                Graphic.buttons[i][j].setStyle("-fx-background-color: #F0D8B5; -fx-padding: 0;");


            else
                Graphic.buttons[i][j].setStyle("-fx-background-color: #B58863; -fx-padding: 0;");

            sauvegarde_colonne = -1;
            sauvegarde_ligne = -1;

            piecess.setIsSelectionner(false);


            System.out.println("reset effectuer ");


        }



    }

    public boolean Same_White(int piece,int second_piece){

        return piece > 0 && second_piece > 0;


    }




    public boolean Same_Black(int piece,int second_piece){

        return piece < 0 && second_piece < 0;


    }

    public boolean Same_Color(int piece, int seconde_piece){


        return Same_Black(piece,seconde_piece) || Same_White(piece,seconde_piece);


    }


    public boolean Verification_coup(int piece , int newpiece){



        if(piece == newpiece || Same_Color(piece,newpiece)){
            //

            System.out.println("même coordonée ??? ou meme couleur de piece");




            reset("a");

            return false;

        }else {

            System.out.println("Tout semble être ok ?");




            return true;


        }



    }








}
