package org.example.chess;


import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

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
    public static int diagonal =  0;





    public boolean Grand_rock_blanc = true;
    public boolean Grand_rock_noir = true;
    public boolean Petit_rock_blanc = true;
    public boolean Petit_rock_noir = true;
    public int sauvegarde_ligne = -1;
    public int sauvegarde_colonne = -1;


    piece piecess = new piece(0,0,0,0,false);
    ArrayList<String> liste = new ArrayList<>();
    public boolean movement_piece( int ligne, int colone) {

        int x = sauvegarde_colonne;

        int y = sauvegarde_ligne;


        int piece = Graphic.grilleEchecs[sauvegarde_ligne][sauvegarde_colonne];

        try {
            int piece_error = Graphic.grilleEchecs[9][9];
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);
            System.out.println("the error   " + piece_error);


        } catch (Exception e) {

            System.out.println("une erreur c'est produit ");
            System.out.println("une erreur c'est produit ");
            System.out.println("une erreur c'est produit ");
            System.out.println("une erreur c'est produit ");
            System.out.println("une erreur c'est produit ");


        }

        System.out.println("hmmm  " + piece);







        if (ligne == sauvegarde_ligne && colone == sauvegarde_colonne) {

            System.out.println("hmmm  " + sauvegarde_ligne);
            System.out.println("hmmm  " + sauvegarde_colonne);

            return false;
        }






        //On prend la valeur de la pièce sélectionné

        System.out.println("hmmm  " + piece);


        int newpiece = Graphic.grilleEchecs[ligne][colone];

        if(piece == newpiece){

            System.out.println("même coordonée ??? ");


            System.out.println("sauvegarde ligne  " + sauvegarde_ligne);
            System.out.println("sauvegarde colone  " + sauvegarde_colonne);

            System.out.println("ligne  " + ligne);
            System.out.println("colonne   " + colone);
            System.out.println("piece " + piece);
            System.out.println("newpiece " + newpiece);

            reset("a");

            return false;

        }
        System.out.println("le bordel est "+ sauvegarde_ligne +"et "+ sauvegarde_colonne);


        switch (Graphic.grilleEchecs[sauvegarde_ligne][sauvegarde_colonne]){
            //ici on récupére le chiffre

            //le chiffre et associer à une piece  ex 6 = pion




            case PION:



                System.out.println(" pion :)" + y);

                if (ligne == (y -= 2) && FirstMove(sauvegarde_ligne, sauvegarde_colonne)) {


                    System.out.println(" pion :)" + y);
                    if (x == colone) {
                        System.out.println(" youpiii premier coup de pi_on ");
                        System.out.println(" _______________________________ ");
                        System.out.println("la Ligne  :" + ligne + "le y :" + y);
                        System.out.println("La colonne :" + colone + "le x = " + x);





                        /*
                        On appel cette fonction pour povuoirs mettre ajour la grille car je ne l'avais pas sur cette classe
                        ce qui fait que on avait pas la meme grille et que après chaque coup je me taper un
                         System.out.println("même coordonée ??? ");
            System.out.println("même coordonée ??? ");

            mis ajour le 06/03/26 prochainne fois tester le bordel puis mettre les get et continuer de migre le code




                         */

                        return true;
                    } else {


                        System.out.println("un zib zob ");

                        return false;

                    }
                }else {




                    y += 2;
                    System.out.println(" on passe au else  ");
                    System.out.println(" _______________________________ ");
                    System.out.println("la Ligne  :" + ligne + "le y :" + y);
                    System.out.println("La colonne :" + colone + "le x = " + x);


                    y -= 1;

                    if (ligne != y ) {

                        return false;

                    }

                    if (x == colone) {

                        return true;

                    }




                }


                break;

            //verifier si c'est la premier fois qui deplace la piece

            //si oui mettre cordonée autoriser de colone +1 et line +1  et colone +2 et line +2

            //si un de ces coup n'est pas jouer reinitialiser et rien faire et dire que non movement pas autoriser




            case PIONNOIR:






                System.out.println(" pion :)" + y);

                if (ligne == (y += 2) && FirstMove(sauvegarde_ligne, sauvegarde_colonne)) {


                    System.out.println(" pion :)" + y);
                    if (x == colone) {
                        System.out.println(" youpiii premier coup de pi_on ");
                        System.out.println(" _______________________________ ");
                        System.out.println("la Ligne  :" + ligne + "le y :" + y);
                        System.out.println("La colonne :" + colone + "le x = " + x);





                        /*
                        On appel cette fonction pour povuoirs mettre ajour la grille car je ne l'avais pas sur cette classe
                        ce qui fait que on avait pas la meme grille et que après chaque coup je me taper un
                         System.out.println("même coordonée ??? ");
            System.out.println("même coordonée ??? ");

            mis ajour le 06/03/26 prochainne fois tester le bordel puis mettre les get et continuer de migre le code




                         */

                        return true;
                    } else {


                        System.out.println("un zib zob ");

                        return false;

                    }
                }else {




                    y -= 2;
                    System.out.println(" on passe au else  ");
                    System.out.println(" _______________________________ ");
                    System.out.println("la Ligne  :" + ligne + "le y :" + y);
                    System.out.println("La colonne :" + colone + "le x = " + x);


                    y += 1;

                    if (ligne != y ) {

                        return false;

                    }

                    if (x == colone) {

                        return true;

                    }




                }






                break;


            case FOU:

                //faire en sorte de crée un liste de coordonée "autoriser"
                /*

                en prenant la postion de base ajouter x+1 ou  x-1 en ajoutant y +1

                //puis reprendre la coordonée calculer et refaire pareil  jusqu'a 8 en regardant à chaque postion si y a une piece
                si y a un piece s'arreter sinon s'arreter à 8





                 exemple x 1 y 1





                 */






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


               // Graphic.buttons[ligne][colonne].setStyle("-fx-background-color: yellow;");

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


               FirstMove(sauvegarde_ligne, sauvegarde_colonne);

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


















    public  boolean FirstMove(int sauvegarde_ligne, int sauvegarde_colonne){

        switch(Graphic.grilleEchecs[sauvegarde_ligne][sauvegarde_colonne]) {

            case PION:

                if(sauvegarde_ligne == 6) {



                    System.out.println("Ceci et la premier fois que vous bouger un pion");

                    return true;
                }else{

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

    public void reset(String all){



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


    public void autorisation_list_diagonale(int Ax,int Ay, int x, int y, int usage){

/*
Le but de cette fonction est de faire un calcul matématique en ajoutant/ retirant des valeur de façon à fait
les différente 4 diagonal  on prend pour Ax et Ay les tout premier valeur la ou est la piece sur le plateau
et x et y la premier valeur qui sera modifier pour ajouter les nouvel valeur en fesant les calcul
le usage permet de s'arreter de voir combien de diagonal on a fait ce qui permet de changer de diagonal par la suite








 */


       try {
           int piece_error = Graphic.grilleEchecs[x][y];
           int piece_ancienn = Graphic.grilleEchecs[Ax][Ay];

           switch (usage) {
               case 1:

                   //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                   x += 1;
                   y += 1;

                   if(piece_error != 0) {
                       //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                       //suivante
                       usage += 1;
                       int newpiece = Graphic.grilleEchecs[x][y];

                       if(piecess.Same_Color(piece_ancienn,newpiece)) {


                           autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);
                       }else{

                           liste.add("" + x + "," + y + "");
                           autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);

                       }



                   }else{

                       liste.add("" + x + "," + y + "");
                       autorisation_list_diagonale(Ax, Ay, x, y, usage);

                   }
                   break;





               case 2:

                   //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                   x -= 1;
                   y -= 1;

                   if(piece_error != 0) {
                       //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                       //suivante
                       usage += 1;
                       int newpiece = Graphic.grilleEchecs[x][y];

                       if(piecess.Same_Color(piece_ancienn,newpiece)) {


                           autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);
                       }else{

                           liste.add("" + x + "," + y + "");
                           autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);

                       }



                   }else{

                       liste.add("" + x + "," + y + "");
                       autorisation_list_diagonale(Ax, Ay, x, y, usage);

                   }
                   break;





               case 3:

                   //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                   //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                   x -= 1;
                   y -= 1;

                   if(piece_error != 0) {
                       //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                       //suivante
                       usage += 1;
                       int newpiece = Graphic.grilleEchecs[x][y];

                       if(piecess.Same_Color(piece_ancienn,newpiece)) {


                           autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);
                       }else{

                           liste.add("" + x + "," + y + "");
                           autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);

                       }



                   }else{

                       liste.add("" + x + "," + y + "");
                       autorisation_list_diagonale(Ax, Ay, x, y, usage);

                   }
                   break;


               case 4:

                   //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                   //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                   x -= 1;
                   y += 1;

                   if(piece_error != 0) {
                       //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                       //suivante
                       usage += 1;
                       int newpiece = Graphic.grilleEchecs[x][y];

                       if(piecess.Same_Color(piece_ancienn,newpiece)) {
                           //on vérifie si il son de la meme couleur
                           //si c'est le cas ne pas ajouter à la liste et ajouter pour la diagonal suivante


                           autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);
                       }else{
//ici on ajouter les coordonée car c'est une piece adverse mais on continu pas donc on ajoute 1 si dessus
                           liste.add("" + x + "," + y + "");
                           autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);

                       }



                   }else{
//la tout ce passe comme prevu le truc fai son taff
                       liste.add("" + x + "," + y + "");
                       autorisation_list_diagonale(Ax, Ay, x, y, usage);

                   }
                   break;


           }






       } catch (Exception e) {
           System.out.print("la fin car voila voila ");
           usage += 1;
           /*
           ici il y a eu une erreur car on a essayer de  appeler un piece erreur qui est pas dans le tableau
           donc on a depasse notre limite donc on ajoute à usage pour passer à la diagonal suivante et on remait
           tout à 0 et voila


            */






           if (usage < 5) {

               autorisation_list_diagonale(Ax,Ay,Ax, Ay, usage);
           }else{

               System.out.print("FINI FINI ");
               System.out.print("FINI FINI ");
               System.out.print("FINI FINI ");
           }

       }

/*



if (liste.contains("4,2")) {
    System.out.println("Coordonnée trouvée !");
}
 */


    }





}
