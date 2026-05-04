package org.example.chess;


import static org.example.chess.Value.*;

public class piece {

   public int ligneselectionner;
   public int coloneselectionner;

   public int ligne;
   public int colone;
   public boolean selection_click;


public piece(int ligneselectionner,int coloneselectionner,int ligne,int colone,boolean selection_click){
    this.coloneselectionner = coloneselectionner;
    this.ligneselectionner = ligneselectionner;


    this.ligne = ligne;
    this.colone = colone;
    this.selection_click = selection_click;


}


//ANCIEN

public int getligneSelectionnee(){



    return ligneselectionner;


}

public void SetLigneslection(int ligne){


    ligneselectionner = ligne;


}


    public int getColoneSelectionnee(){



        return coloneselectionner;


    }

    public void SetColonelection(int colone){


        this.coloneselectionner = colone;






    }



    //NOUVEAUX



    public int getligne(){
return ligne;

    }

    public void setligne(int lignee){


    this.ligne = lignee;

    }






    public int getColone(){
        return colone;

    }

    public void setColone(int colonee){


        this.colone = colonee;

    }










    public boolean isWhite(int piece) {


        return piece > 0;

    }

    public boolean Same_White(int piece,int second_piece){

    return piece > 0 && second_piece > 0;


    }

    public boolean isBlack(int piece){


        return piece < 0;

    }


    public boolean Same_Black(int piece,int second_piece){

        return piece < 0 && second_piece < 0;


    }

    public boolean Same_Color(int piece, int seconde_piece){


    return Same_Black(piece,seconde_piece) || Same_White(piece,seconde_piece);


    }











    public boolean IsSelectionner(){



    return selection_click;


    }


    public void setIsSelectionner(boolean valeur){



    this.selection_click = valeur;



    }


    public static void autorisation_list_Colone(int Ax, int Ay, int x, int y, int usage){






        if(usage == 0){
            //petit morceau de code qui permet de quand on reutilise le fou ça clear les
            //ancien coordonée "autoriser"

            System.out.println("ça clear " + usage);

            listeColone.clear();

            usage += 1;



        }

        System.out.println("APPEL FONCTION ");


        try {

            int piece_ancienn = Graphic.grilleEchecs[Ax][Ay];

            int piece_error = Graphic.grilleEchecs[x][y];

            System.out.println("DEBUT DU TRY ");

            switch (usage) {



                case 1:

                    System.out.println("USAGE a  ");

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                    x += 1;

                    piece_error = Graphic.grilleEchecs[x][y];
                    //le piece error acrémente jusqu'a tomber sur un piece donc pas egale à 0

                    if(piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        usage += 1;

                        int newpiece = Graphic.grilleEchecs[x][y];

                        if(piecess.Same_Color(piece_ancienn,newpiece)) {


                            autorisation_list_Colone(Ax, Ay, Ax, Ay, usage);

                            System.out.println("On tombe sur une piece allier ");


                        }else{



                            System.out.println("ON Tombe sur une piece  ");


                            listeColone.add("" + x + "," + y + "");

                            System.out.println("" + x + "," + y + "");

                            autorisation_list_Colone(Ax, Ay, Ax, Ay, usage);

                        }



                    }else{



                        System.out.println("On ajoute le bordel");

                        listeColone.add("" + x + "," + y + "");

                        System.out.println("" + x + "," + y + "");

                        autorisation_list_Colone(Ax, Ay, x, y, usage);

                    }
                    break;





                case 2:
                    System.out.println("USAGE a  ");


                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                    y += 1;

                    piece_error = Graphic.grilleEchecs[x][y];

                    if(piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if(piecess.Same_Color(piece_ancienn,newpiece)) {


                            autorisation_list_Colone(Ax, Ay, Ax, Ay, usage);
                            System.out.println("On tombe sur une piece allier ");


                        }else{
                            System.out.println("ON Tombe sur une piece  ");


                            listeColone.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_Colone(Ax, Ay, Ax, Ay, usage);

                        }



                    }else{
                        System.out.println("On ajoute le bordel");
                        listeColone.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");
                        autorisation_list_Colone(Ax, Ay, x, y, usage);

                    }
                    break;




                case 3:
                    System.out.println("USAGE a  ");


                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                    y -= 1;

                    piece_error = Graphic.grilleEchecs[x][y];

                    if(piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if(piecess.Same_Color(piece_ancienn,newpiece)) {


                            autorisation_list_Colone(Ax, Ay, Ax, Ay, usage);
                            System.out.println("On tombe sur une piece allier ");


                        }else{
                            System.out.println("ON Tombe sur une piece  ");


                            listeColone.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_Colone(Ax, Ay, Ax, Ay, usage);

                        }



                    }else{
                        System.out.println("On ajoute le bordel");
                        listeColone.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");
                        autorisation_list_Colone(Ax, Ay, x, y, usage);

                    }
                    break;







                case 4:
                    System.out.println("USAGE a  ");


                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                    x -= 1;

                    piece_error = Graphic.grilleEchecs[x][y];

                    if(piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if(piecess.Same_Color(piece_ancienn,newpiece)) {


                            autorisation_list_Colone(Ax, Ay, Ax, Ay, usage);

                            System.out.println("On tombe sur une piece allier ");


                        }else{
                            System.out.println("ON Tombe sur une piece  ");


                            listeColone.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_Colone(Ax, Ay, Ax, Ay, usage);

                        }



                    }else{
                        System.out.println("On ajoute le bordel");
                        listeColone.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");
                        autorisation_list_Colone(Ax, Ay, x, y, usage);

                    }
                    break;


























            }










        } catch (Exception e) {
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");

            usage += 1;
           /*
           ici il y a eu une erreur car on a essayer de  appeler un piece erreur qui est pas dans le tableau
           donc on a depasse notre limite donc on ajoute à usage pour passer à la diagonal suivante et on remait
           tout à 0 et voila


            */


            if (usage < 5) {

                System.out.println("la on rapel encore");


                autorisation_list_Colone(Ax, Ay, Ax, Ay, usage);

            } else {

                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");


            }


        }





        }


    public static void autorisation_list_diagonale(int Ax, int Ay, int x, int y, int usage){

/*
Le but de cette fonction est de faire un calcul matématique en ajoutant/ retirant des valeur de façon à fait
les différente 4 diagonal  on prend pour Ax et Ay les tout premier valeur la ou est la piece sur le plateau
et x et y la premier valeur qui sera modifier pour ajouter les nouvel valeur en fesant les calcul
le usage permet de s'arreter de voir combien de diagonal on a fait ce qui permet de changer de diagonal par la suite








 */


        if(usage == 0){
            //petit morceau de code qui permet de quand on reutilise le fou ça clear les
            //ancien coordonée "autoriser"

            System.out.println("ça clear " + usage);

            listeDiagonal.clear();
            usage += 1;



        }
        System.out.println("APPEL FONCTION ");

        try {

            int piece_ancienn = Graphic.grilleEchecs[Ax][Ay];
            int piece_error = Graphic.grilleEchecs[x][y];
            System.out.println("DEBUT DU TRY ");

            switch (usage) {



                case 1:
                    System.out.println("USAGE a  ");

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                    x += 1;
                    y += 1;
                    piece_error = Graphic.grilleEchecs[x][y];

                    if(piece_error != 0) {



                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if(piecess.Same_Color(piece_ancienn,newpiece)) {


                            autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);
                            System.out.println("On tombe sur une piece allier ");


                        }else{
                            System.out.println("ON Tombe sur une piece  ");


                            listeDiagonal.add("" + x + "," + y + "");

                            System.out.println("" + x + "," + y + "");

                            autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);

                        }



                    }else{
                        System.out.println("On ajoute le bordel");
                        listeDiagonal.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");
                        autorisation_list_diagonale(Ax, Ay, x, y, usage);

                    }
                    break;





                case 2:
                    System.out.println("USAGE a  ");


                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                    x += 1;
                    y -= 1;
                    piece_error = Graphic.grilleEchecs[x][y];

                    if(piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if(piecess.Same_Color(piece_ancienn,newpiece)) {


                            autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);
                            System.out.println("On tombe sur une piece allier ");


                        }else{
                            System.out.println("ON Tombe sur une piece  ");


                            listeDiagonal.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);

                        }



                    }else{
                        System.out.println("On ajoute le bordel");
                        listeDiagonal.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");
                        autorisation_list_diagonale(Ax, Ay, x, y, usage);

                    }
                    break;





                case 3:

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                    x -= 1;
                    y -= 1;
                    System.out.println("DEBUT case 3  ");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if(piece_error != 0) {





                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if(piecess.Same_Color(piece_ancienn,newpiece)) {


                            autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);

                            System.out.println("on est tomber sur un allier :(");
                        }else{
                            System.out.println("on est tomber sur une piece  ");
                            listeDiagonal.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);


                        }



                    }else{
                        System.out.println("tous ce passe comme preveu  ");
                        listeDiagonal.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");
                        autorisation_list_diagonale(Ax, Ay, x, y, usage);

                    }
                    break;


                case 4:

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                    x -= 1;
                    y += 1;
                    System.out.println("case 4 ");




                    piece_error = Graphic.grilleEchecs[x][y];


                    if(piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if(piecess.Same_Color(piece_ancienn,newpiece)) {
                            //on vérifie si il son de la meme couleur
                            //si c'est le cas ne pas ajouter à la liste et ajouter pour la diagonal suivante

                            System.out.println("On est tomber sur un piece allier :/ ");
                            autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);
                        }else{
//ici on ajouter les coordonée car c'est une piece adverse mais on continu pas donc on ajoute 1 si dessus



                            listeDiagonal.add("" + x + "," + y + "");


                            System.out.println("" + x + "," + y + "");


                            autorisation_list_diagonale(Ax, Ay, Ax, Ay, usage);

                        }



                    }else{
//la tout ce passe comme prevu le truc fai son taff

                        listeDiagonal.add("" + x + "," + y + "");


                        System.out.println("" + x + "," + y + "");


                        autorisation_list_diagonale(Ax, Ay, x, y, usage);

                    }
                    break;


            }






        } catch (Exception e) {
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");

            usage += 1;
           /*
           ici il y a eu une erreur car on a essayer de  appeler un piece erreur qui est pas dans le tableau
           donc on a depasse notre limite donc on ajoute à usage pour passer à la diagonal suivante et on remait
           tout à 0 et voila


            */






            if (usage < 5) {

                System.out.println("la on rapel encore");


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





    public static void autorisation_list_Cavalier(int Ax, int Ay, int x, int y, int usage) {

/*
Le but de cette fonction est de faire un calcul matématique en ajoutant/ retirant des valeur de façon à fait
les différente 4 diagonal  on prend pour Ax et Ay les tout premier valeur la ou est la piece sur le plateau
et x et y la premier valeur qui sera modifier pour ajouter les nouvel valeur en fesant les calcul
le usage permet de s'arreter de voir combien de diagonal on a fait ce qui permet de changer de diagonal par la suite








 */


        if (usage == 0) {
            //petit morceau de code qui permet de quand on reutilise le fou ça clear les
            //ancien coordonée "autoriser"

            System.out.println("ça clear " + usage);

            listeCavalier.clear();
            usage += 1;


        }


        System.out.println("APPEL FONCTION ");

        try {

            int piece_ancienn = Graphic.grilleEchecs[Ax][Ay];


            int piece_error = Graphic.grilleEchecs[x][y];

            System.out.println("DEBUT DU TRY ");

            switch (usage) {


                case 1:

                    System.out.println("USAGE a  ");


                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    usage += 1;
                    x += 1;
                    y += 2;

                    //     Graphic.buttons[x][y].setStyle("-fx-background-color: green;");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {


                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                       // usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);
                            System.out.println("On tombe sur une piece allier ");


                        } else {
                            System.out.println("ON Tombe sur une piece  ");


                            listeCavalier.add("" + x + "," + y + "");

                            System.out.println("" + x + "," + y + "");

                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                        }


                    } else {
                        System.out.println("On ajoute le bordel");
                        listeCavalier.add("" + x + "," + y + "");

                        System.out.println("" + x + "," + y + "");


                        autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                    }
                    break;


                case 2:

                    System.out.println("USAGE a  ");

                    // Graphic.buttons[x][y].setStyle("-fx-background-color: purple;");
                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    usage += 1;
                    x -= 1;
                    y += 2;

                    // Graphic.buttons[x][y].setStyle("-fx-background-color: red;");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        // usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);
                            System.out.println("On tombe sur une piece allier ");


                        } else {
                            System.out.println("ON Tombe sur une piece  ");


                            listeCavalier.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");

                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                        }


                    } else {


                        System.out.println("On ajoute le bordel");
                        listeCavalier.add("" + x + "," + y + "");

                        System.out.println("" + x + "," + y + "");

                        autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                    }
                    break;


                case 3:

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique
                    usage += 1;

                    x += 1;
                    y -= 2;

                    //   Graphic.buttons[x][y].setStyle("-fx-background-color: purple;");

                    // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");
                    System.out.println("DEBUT case 3  ");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {


                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        // usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                            System.out.println("on est tomber sur un allier :(");
                        } else {
                            System.out.println("on est tomber sur une piece  ");
                            listeCavalier.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);


                        }


                    } else {
                        System.out.println("tous ce passe comme preveu  ");
                        listeCavalier.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");

                        autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                    }
                    break;


                case 4:

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique


                    x -= 1;
                    y -= 2;
                    usage += 1;


                    //  Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");


                    System.out.println("case 4 ");


                    //   Graphic.buttons[x][y].setStyle("-fx-background-color: pink;");

                    piece_error = Graphic.grilleEchecs[x][y];


                    if (piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        //usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {
                            //on vérifie si il son de la meme couleur
                            //si c'est le cas ne pas ajouter à la liste et ajouter pour la diagonal suivante

                            System.out.println("On est tomber sur un piece allier :/ ");
                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);
                        } else {
//ici on ajouter les coordonée car c'est une piece adverse mais on continu pas donc on ajoute 1 si dessus


                            listeCavalier.add("" + x + "," + y + "");


                            System.out.println("" + x + "," + y + "");


                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                        }


                    } else {
//la tout ce passe comme prevu le truc fai son taff

                        listeCavalier.add("" + x + "," + y + "");


                        System.out.println("" + x + "," + y + "");

                        autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                    }
                    break;







                case 5:


                    x -= 2;
                    usage += 1;
                    y -= 1;


                    // Graphic.buttons[x][y].setStyle("-fx-background-color: blue;");
                    // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");
                    System.out.println("DEBUT case 3  ");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {


                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        // usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                            System.out.println("on est tomber sur un allier :(");
                        } else {
                            System.out.println("on est tomber sur une piece  ");
                            listeCavalier.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);


                        }


                    } else {
                        System.out.println("tous ce passe comme preveu  ");
                        listeCavalier.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");

                        autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);
                    }
                    break;


                case 6:


                    x += 2;
                    y -= 1;


                    //   Graphic.buttons[x][y].setStyle("-fx-background-color: black;");


                    usage += 1;
                    // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");


                    System.out.println("DEBUT case 3  ");


                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {


                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        //  usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                            System.out.println("on est tomber sur un allier :(");
                        } else {
                            System.out.println("on est tomber sur une piece  ");
                            listeCavalier.add("" + x + "," + y + "");

                            System.out.println("" + x + "," + y + "");
                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);


                        }


                    } else {

                        System.out.println("tous ce passe comme preveu  ");
                        listeCavalier.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");


                        autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                    }


                    break;


                case 7:
                    usage += 1;






                    x -= 2;
                    y += 1;


                    //  Graphic.buttons[x][y].setStyle("-fx-background-color: white;");


                    // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;")
                    // ;
                    System.out.println("DEBUT case 3  ");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {


                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                         // usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                            System.out.println("on est tomber sur un allier :(");
                        } else {
                            System.out.println("on est tomber sur une piece  ");
                            listeCavalier.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);


                        }


                    } else {
                        System.out.println("tous ce passe comme preveu  ");


                        listeCavalier.add("" + x + "," + y + "");



                        System.out.println("" + x + "," + y + "");


                        autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);
                    }





                    break;


                case 8:

                    usage += 1;


                    x += 2;
                    y += 1;

                 //   Graphic.buttons[x][y].setStyle("-fx-background-color: gray;");


                    System.out.println("DEBUT case 3  ");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {




                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                            System.out.println("on est tomber sur un allier :(");
                        } else {
                            System.out.println("on est tomber sur une piece  ");
                            listeCavalier.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);


                        }


                    } else {
                        System.out.println("tous ce passe comme preveu  ");


                        listeCavalier.add("" + x + "," + y + "");


                        System.out.println("" + x + "," + y + "");




                        autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

                    }




                    break;









            }










        } catch (Exception e) {




            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");

            //usage += 1;



           /*
           ici il y a eu une erreur car on a essayer de  appeler un piece erreur qui est pas dans le tableau
           donc on a depasse notre limite donc on ajoute à usage pour passer à la diagonal suivante et on remait
           tout à 0 et voila


            */


            if (usage < 9) {

                System.out.println("la on rapel encore");


                autorisation_list_Cavalier(Ax, Ay, Ax, Ay, usage);

            }


            else {

                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");


            }

        }

    }

public static void autorisation_list_Pion_Black(int Ax, int Ay, int x, int y, int usage) {




/*
Le but de cette fonction est de faire un calcul matématique en ajoutant/ retirant des valeur de façon à fait
les différente 4 diagonal  on prend pour Ax et Ay les tout premier valeur la ou est la piece sur le plateau
et x et y la premier valeur qui sera modifier pour ajouter les nouvel valeur en fesant les calcul
le usage permet de s'arreter de voir combien de diagonal on a fait ce qui permet de changer de diagonal par la suite



//


 System.out.println("APPEL FONCTION ");

 */


        System.out.println("________________________________");


        if (usage == 0) {
            //petit morceau de code qui permet de quand on reutilise le fou ça clear les
            //ancien coordonée "autoriser"


            listePionBlack.clear();
            usage += 1;


        }


        try {

            int piece_ancienn = Graphic.grilleEchecs[Ax][Ay];


            int piece_error = Graphic.grilleEchecs[x][y];


            switch (usage) {


                case 1:

                    System.out.println("USAGE a  ");


                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    usage += 1;

                    x += 1;

                    Graphic.buttons[x][y].setStyle("-fx-background-color: green;");
                    System.out.println("_____________________");
                    System.out.println("                        ");
                    System.out.println("le ancien y est " + Ay);
                    System.out.println("le ancien x est " + Ax);
                    System.out.println("                            ");
                    System.out.println("le nouveau y est " + y);
                    System.out.println("le nouveau  x est " + x);
                    System.out.println("                        ");
                    System.out.println("_____________________");


                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {


                        autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);

                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        // usage += 1;


                    } else {
                        System.out.println("On ajoute le bordel");
                        listePionBlack.add("" + x + "," + y + "");


                        System.out.println("" + x + "," + y + "");


                        autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);

                    }
                    break;


                case 2:

                    System.out.println("USAGE a  ");

                    // Graphic.buttons[x][y].setStyle("-fx-background-color: purple;");
                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    usage += 1;
                    x += 1;
                    y -= 1;

                    Graphic.buttons[x][y].setStyle("-fx-background-color: red;");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        // usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);
                            System.out.println("On tombe sur une piece allier ");


                        } else {
                            System.out.println("ON Tombe sur une piece  ");


                            listePionBlack.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");

                            autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);

                        }


                    } else {


                        System.out.println("" + x + "," + y + "");

                        autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);

                    }
                    break;


                case 3:

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique
                    usage += 1;

                    x += 1;
                    y += 1;

                    Graphic.buttons[x][y].setStyle("-fx-background-color: purple;");

                    // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");
                    System.out.println("DEBUT case 3  ");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {


                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        // usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);

                            System.out.println("on est tomber sur un allier :(");
                        } else {


                            System.out.println("on est tomber sur une piece  ");
                            listePionBlack.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);


                        }


                    } else {

                        System.out.println("" + x + "," + y + "");

                        autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);

                    }
                    break;


                case 4:

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique
                    usage += 1;

                    x += 2;


                    Graphic.buttons[x][y].setStyle("-fx-background-color: blue;");

                    // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");
                    System.out.println("DEBUT case 4  ");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (FirstMove(Ax, Ay)) {

                        if (piece_error != 0) {


                            //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                            //suivante
                            // usage += 1;
                            System.out.println("" + x + "," + y + "");

                            autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);


                        } else {


                            listePionBlack.add("" + x + "," + y + "");


                        }


                    } else {

                        autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);


                    }


                    break;


            }


        } catch (Exception e) {


            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");

            //usage += 1;



           /*
           ici il y a eu une erreur car on a essayer de  appeler un piece erreur qui est pas dans le tableau
           donc on a depasse notre limite donc on ajoute à usage pour passer à la diagonal suivante et on remait
           tout à 0 et voila


            */


            if (usage < 5) {

                System.out.println("la on rapel encore");


                autorisation_list_Pion_Black(Ax, Ay, Ax, Ay, usage);

            } else {

                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");


            }

        }

    }



    public static void autorisation_list_Pion(int Ax, int Ay, int x, int y, int usage){

/*
Le but de cette fonction est de faire un calcul matématique en ajoutant/ retirant des valeur de façon à fait
les différente 4 diagonal  on prend pour Ax et Ay les tout premier valeur la ou est la piece sur le plateau
et x et y la premier valeur qui sera modifier pour ajouter les nouvel valeur en fesant les calcul
le usage permet de s'arreter de voir combien de diagonal on a fait ce qui permet de changer de diagonal par la suite






 System.out.println("APPEL FONCTION ");

 */


        System.out.println("________________________________");


        if (usage == 0) {
            //petit morceau de code qui permet de quand on reutilise le fou ça clear les
            //ancien coordonée "autoriser"



            listePion.clear();
            usage += 1;


        }



        try {

            int piece_ancienn = Graphic.grilleEchecs[Ax][Ay];


            int piece_error = Graphic.grilleEchecs[x][y];



            switch (usage) {


                case 1:

                    System.out.println("USAGE a  ");


                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    usage += 1;

                    x -= 1;

                        Graphic.buttons[x][y].setStyle("-fx-background-color: green;");
                    System.out.println("_____________________");
                            System.out.println("                        ");
                        System.out.println("le ancien y est " + Ay);
                    System.out.println("le ancien x est " + Ax);
                    System.out.println("                            ");
                    System.out.println("le nouveau y est " + y);
                    System.out.println("le nouveau  x est " + x);
                    System.out.println("                        ");
                    System.out.println("_____________________");



                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {



                        autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);

                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        // usage += 1;



                    } else {
                        System.out.println("On ajoute le bordel");
                        listePion.add("" + x + "," + y + "");






                        System.out.println("" + x + "," + y + "");


                        autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);

                    }
                    break;



                case 2:

                    System.out.println("USAGE a  ");

                    // Graphic.buttons[x][y].setStyle("-fx-background-color: purple;");
                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    usage += 1;
                    x -= 1;
                    y -= 1;

                     Graphic.buttons[x][y].setStyle("-fx-background-color: red;");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        // usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);
                            System.out.println("On tombe sur une piece allier ");


                        } else {
                            System.out.println("ON Tombe sur une piece  ");


                            listePion.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");

                            autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);

                        }


                    } else {




                        System.out.println("" + x + "," + y + "");

                        autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);

                    }
                    break;


                case 3:

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique
                    usage += 1;

                    x -= 1;
                    y += 1;

                       Graphic.buttons[x][y].setStyle("-fx-background-color: purple;");

                    // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");
                    System.out.println("DEBUT case 3  ");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if (piece_error != 0) {


                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante
                        // usage += 1;
                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(piece_ancienn, newpiece)) {


                            autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);

                            System.out.println("on est tomber sur un allier :(");
                        } else {


                            System.out.println("on est tomber sur une piece  ");
                            listePion.add("" + x + "," + y + "");
                            System.out.println("" + x + "," + y + "");
                            autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);


                        }


                    } else {

                        System.out.println("" + x + "," + y + "");

                        autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);

                    }
                    break;






                case 4:

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique
                    usage += 1;

                    x -= 2;


                    Graphic.buttons[x][y].setStyle("-fx-background-color: blue;");

                    // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");
                    System.out.println("DEBUT case 4  ");
                    piece_error = Graphic.grilleEchecs[x][y];

                    if(FirstMove(Ax,Ay)) {

                        if (piece_error != 0) {


                            //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                            //suivante
                            // usage += 1;
                            System.out.println("" + x + "," + y + "");

                            autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);


                        } else {


                            listePion.add("" + x + "," + y + "");


                        }


                    }else{

                        autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);


                    }


                    break;
















            }










        } catch (Exception e) {




            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");
            System.out.println("la fin car voila voila ");

            //usage += 1;



           /*
           ici il y a eu une erreur car on a essayer de  appeler un piece erreur qui est pas dans le tableau
           donc on a depasse notre limite donc on ajoute à usage pour passer à la diagonal suivante et on remait
           tout à 0 et voila


            */


            if (usage < 5) {

                System.out.println("la on rapel encore");


                autorisation_list_Pion(Ax, Ay, Ax, Ay, usage);

            }


            else {

                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");


            }

        }

    }



public static void  autorisation_list_King(int Ax, int Ay, int x, int y, int usage){

/*
Le but de cette fonction est de faire un calcul matématique en ajoutant/ retirant des valeur de façon à fait
les différente 4 diagonal  on prend pour Ax et Ay les tout premier valeur la ou est la piece sur le plateau
et x et y la premier valeur qui sera modifier pour ajouter les nouvel valeur en fesant les calcul
le usage permet de s'arreter de voir combien de diagonal on a fait ce qui permet de changer de diagonal par la suite








 */


    if (usage == 0) {
        //petit morceau de code qui permet de quand on reutilise le fou ça clear les
        //ancien coordonée "autoriser"

        System.out.println("ça clear " + usage);

        listeKing.clear();
        usage += 1;


    }


    System.out.println("APPEL FONCTION ");

    try {

        int piece_ancienn = Graphic.grilleEchecs[Ax][Ay];


        int piece_error = Graphic.grilleEchecs[x][y];

        System.out.println("DEBUT DU TRY ");

        switch (usage) {


            case 1:

                System.out.println("USAGE a  ");


                //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                usage += 1;

                x += 1;


                // Graphic.buttons[x][y].setStyle("-fx-background-color: green;");





                piece_error = Graphic.grilleEchecs[x][y];

                if (piece_error != 0) {


                    //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                    //suivante
                    // usage += 1;
                    int newpiece = Graphic.grilleEchecs[x][y];

                    if (piecess.Same_Color(piece_ancienn, newpiece)) {


                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);
                        System.out.println("On tombe sur une piece allier ");


                    } else {
                        System.out.println("ON Tombe sur une piece  ");


                        listeKing.add("" + x + "," + y + "");

                        System.out.println("" + x + "," + y + "");

                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                    }


                } else {
                    System.out.println("On ajoute le bordel");
                    listeKing.add("" + x + "," + y + "");

                    System.out.println("" + x + "," + y + "");


                    autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                }
                break;


            case 2:

                System.out.println("USAGE a  ");


                //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                usage += 1;

                y += 1;

                // Graphic.buttons[x][y].setStyle("-fx-background-color: red;");
                piece_error = Graphic.grilleEchecs[x][y];

                if (piece_error != 0) {
                    //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                    //suivante
                    // usage += 1;
                    int newpiece = Graphic.grilleEchecs[x][y];

                    if (piecess.Same_Color(piece_ancienn, newpiece)) {


                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);
                        System.out.println("On tombe sur une piece allier ");


                    } else {
                        System.out.println("ON Tombe sur une piece  ");


                        listeKing.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");

                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                    }


                } else {


                    System.out.println("On ajoute le bordel");
                    listeKing.add("" + x + "," + y + "");

                    System.out.println("" + x + "," + y + "");

                    autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                }
                break;


            case 3:

                //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique
                usage += 1;

                x -= 1;


                //    Graphic.buttons[x][y].setStyle("-fx-background-color: purple;");

                // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");
                System.out.println("DEBUT case 3  ");
                piece_error = Graphic.grilleEchecs[x][y];

                if (piece_error != 0) {


                    //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                    //suivante
                    // usage += 1;
                    int newpiece = Graphic.grilleEchecs[x][y];

                    if (piecess.Same_Color(piece_ancienn, newpiece)) {


                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                        System.out.println("on est tomber sur un allier :(");
                    } else {
                        System.out.println("on est tomber sur une piece  ");
                        listeKing.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");
                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);


                    }


                } else {
                    System.out.println("tous ce passe comme preveu  ");
                    listeKing.add("" + x + "," + y + "");
                    System.out.println("" + x + "," + y + "");

                    autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                }
                break;


            case 4:

                //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique



                y -= 1;
                usage += 1;


                //    Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");


                System.out.println("case 4 ");


                //   Graphic.buttons[x][y].setStyle("-fx-background-color: pink;");

                piece_error = Graphic.grilleEchecs[x][y];


                if (piece_error != 0) {
                    //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                    //suivante
                    //usage += 1;
                    int newpiece = Graphic.grilleEchecs[x][y];

                    if (piecess.Same_Color(piece_ancienn, newpiece)) {
                        //on vérifie si il son de la meme couleur
                        //si c'est le cas ne pas ajouter à la liste et ajouter pour la diagonal suivante

                        System.out.println("On est tomber sur un piece allier :/ ");
                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);
                    } else {
//ici on ajouter les coordonée car c'est une piece adverse mais on continu pas donc on ajoute 1 si dessus


                        listeKing.add("" + x + "," + y + "");


                        System.out.println("" + x + "," + y + "");


                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                    }


                } else {
//la tout ce passe comme prevu le truc fai son taff

                    listeKing.add("" + x + "," + y + "");


                    System.out.println("" + x + "," + y + "");

                    autorisation_list_King(x, Ay, Ax, Ay, usage);

                }
                break;







            case 5:


                x -= 1;
                usage += 1;
                y -= 1;


                //  Graphic.buttons[x][y].setStyle("-fx-background-color: blue;");
                // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");
                System.out.println("DEBUT case 3  ");
                piece_error = Graphic.grilleEchecs[x][y];

                if (piece_error != 0) {


                    //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                    //suivante
                    // usage += 1;
                    int newpiece = Graphic.grilleEchecs[x][y];

                    if (piecess.Same_Color(piece_ancienn, newpiece)) {


                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                        System.out.println("on est tomber sur un allier :(");
                    } else {
                        System.out.println("on est tomber sur une piece  ");
                        listeKing.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");
                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);


                    }


                } else {
                    System.out.println("tous ce passe comme preveu  ");
                    listeKing.add("" + x + "," + y + "");
                    System.out.println("" + x + "," + y + "");

                    autorisation_list_King(Ax, Ay, Ax, Ay, usage);
                }
                break;


            case 6:


                x -= 1;
                y += 1;


                //  Graphic.buttons[x][y].setStyle("-fx-background-color: black;");


                usage += 1;
                // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;");


                System.out.println("DEBUT case 3  ");


                piece_error = Graphic.grilleEchecs[x][y];

                if (piece_error != 0) {


                    //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                    //suivante
                    //  usage += 1;
                    int newpiece = Graphic.grilleEchecs[x][y];

                    if (piecess.Same_Color(piece_ancienn, newpiece)) {


                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                        System.out.println("on est tomber sur un allier :(");
                    } else {
                        System.out.println("on est tomber sur une piece  ");
                        listeKing.add("" + x + "," + y + "");

                        System.out.println("" + x + "," + y + "");
                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);


                    }


                } else {

                    System.out.println("tous ce passe comme preveu  ");
                    listeKing.add("" + x + "," + y + "");
                    System.out.println("" + x + "," + y + "");


                    autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                }


                break;


            case 7:
                usage += 1;






                x += 1;
                y -= 1;


                //   Graphic.buttons[x][y].setStyle("-fx-background-color: white;");


                // Graphic.buttons[x][y].setStyle("-fx-background-color: yellow;")
                // ;
                System.out.println("DEBUT case 3  ");
                piece_error = Graphic.grilleEchecs[x][y];

                if (piece_error != 0) {


                    //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                    //suivante
                    // usage += 1;
                    int newpiece = Graphic.grilleEchecs[x][y];

                    if (piecess.Same_Color(piece_ancienn, newpiece)) {


                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                        System.out.println("on est tomber sur un allier :(");
                    } else {
                        System.out.println("on est tomber sur une piece  ");
                        listeKing.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");
                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);


                    }


                } else {
                    System.out.println("tous ce passe comme preveu  ");


                    listeKing.add("" + x + "," + y + "");



                    System.out.println("" + x + "," + y + "");


                    autorisation_list_King(Ax, Ay, Ax, Ay, usage);
                }





                break;


            case 8:

                usage += 1;


                x += 1;
                y += 1;

                //  Graphic.buttons[x][y].setStyle("-fx-background-color: gray;");


                System.out.println("DEBUT case 3  ");
                piece_error = Graphic.grilleEchecs[x][y];

                if (piece_error != 0) {




                    int newpiece = Graphic.grilleEchecs[x][y];

                    if (piecess.Same_Color(piece_ancienn, newpiece)) {


                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                        System.out.println("on est tomber sur un allier :(");
                    } else {
                        System.out.println("on est tomber sur une piece  ");
                        listeKing.add("" + x + "," + y + "");
                        System.out.println("" + x + "," + y + "");
                        autorisation_list_King(Ax, Ay, Ax, Ay, usage);


                    }


                } else {
                    System.out.println("tous ce passe comme preveu  ");


                    listeKing.add("" + x + "," + y + "");


                    System.out.println("" + x + "," + y + "");




                    autorisation_list_King(Ax, Ay, Ax, Ay, usage);

                }




                break;









        }










    } catch (Exception e) {




        System.out.println("la fin car voila voila ");
        System.out.println("la fin car voila voila ");
        System.out.println("la fin car voila voila ");
        System.out.println("la fin car voila voila ");
        System.out.println("la fin car voila voila ");
        System.out.println("la fin car voila voila ");

        //usage += 1;



           /*
           ici il y a eu une erreur car on a essayer de  appeler un piece erreur qui est pas dans le tableau
           donc on a depasse notre limite donc on ajoute à usage pour passer à la diagonal suivante et on remait
           tout à 0 et voila


            */


        if (usage < 9) {

            System.out.println("la on rapel encore");


            autorisation_list_King(Ax, Ay, Ax, Ay, usage);

        }


        else {

            System.out.print("FINI FINI ");
            System.out.print("FINI FINI ");
            System.out.print("FINI FINI ");


        }

    }

}







    public static  boolean AutorisationCoup_Colone(int Ax,int Ay) {

        if (listeColone.contains("" + Ax + "," + Ay + "")) {


            System.out.println("DIAGONALMRETURN EST : " + Ax + "," + Ay + "");


            return true;


        } else {

            System.out.println("NONNNN !");

            System.out.println("Votre position voulu est :" + "" + Ax + "," + Ay + "");

            for (String element : listeColone) {

                System.out.println(element);
            }

            return false;

        }


    }

        public static boolean AutorisationCoup_Diagonal ( int Ax, int Ay){

            if (listeDiagonal.contains("" + Ax + "," + Ay + "")) {


                System.out.println("DIAGONALMRETURN EST : " + Ax + "," + Ay + "");


                return true;


            } else {

                System.out.println("NONNNN !");

                System.out.println("Votre position voulu est :" + "" + Ax + "," + Ay + "");

                for (String element : listeDiagonal) {

                    System.out.println(element);
                }

                return false;

            }


        }




    public static boolean AutorisationCoup_Cavalier ( int Ax, int Ay){

        if (listeCavalier.contains("" + Ax + "," + Ay + "")) {


            System.out.println("DIAGONALMRETURN EST : " + Ax + "," + Ay + "");


            return true;


        } else {

            System.out.println("NONNNN !");

            System.out.println("Votre position voulu est :" + "" + Ax + "," + Ay + "");

            for (String element : listeCavalier) {

                System.out.println(element);
            }

            return false;

        }


    }


    public static boolean AutorisationCoup_King ( int Ax, int Ay){

        if (listeKing.contains("" + Ax + "," + Ay + "")) {


            System.out.println("DIAGONALMRETURN EST : " + Ax + "," + Ay + "");


            return true;


        } else {

            System.out.println("NONNNN !");

            System.out.println("Votre position voulu est :" + "" + Ax + "," + Ay + "");

            for (String element : listeKing) {

                System.out.println(element);
            }

            return false;

        }


    }

public static boolean AutorisationCoup_Pion_Black(int Ax,int Ay){



    if (listePionBlack.contains("" + Ax + "," + Ay + "")) {


        System.out.println("DIAGONALMRETURN EST : " + Ax + "," + Ay + "");


        return true;


    } else {

        System.out.println("NONNNN !");

        System.out.println("Votre position voulu est :" + "" + Ax + "," + Ay + "");

        for (String element : listePionBlack) {

            System.out.println("POSITION AUTORISER : " + element);
        }

        System.out.println("POSITION VOULU EST  en X : " + Ax + " est en Y " + Ay);

        return false;

    }

}
    public static boolean AutorisationCoup_Pion ( int Ax, int Ay){

        if (listePion.contains("" + Ax + "," + Ay + "")) {


            System.out.println("DIAGONALMRETURN EST : " + Ax + "," + Ay + "");


            return true;


        } else {

            System.out.println("NONNNN !");

            System.out.println("Votre position voulu est :" + "" + Ax + "," + Ay + "");

            for (String element : listePion) {

                System.out.println("POSITION AUTORISER : " + element);
            }

            System.out.println("POSITION VOULU EST  en X : " + Ax + " est en Y " + Ay);

            return false;

        }


    }

    public void promotion(int color , int x,int y ){
if(color == 0){



    //is white

    if(x == 7){
        //faire promo

    }


}else{

    if(x == 0){
        //faire promo

    }


}




    }


    public void prise_en_passant(int color, int x , int y ){

    /*
        quand le joueur le first move u pion  appeler la fonction  la fonction verifi la coulor avec un nombre
        0 c'est blanc et 1 noir par la suite il va voir sur y a pas un pion sà cotyer de l'autre si oui autoriser la prrise


        blanc joue E4

        la fonction regarde et voi c'est les blanc qui joue et que c'est un coup en deux

        la fonction regarde en D4 et F4 voir si y a un pion adverse



ajouter dans list du pion adverser la nouvelle coordonée autoriser  par exemple
je joue E4 y a un pion noir en F4 et bien prendre la potion du pion blanc enlever 1 pour "reculer le truc"
et avoir la bonne case qui est autoriser pour le pion noir donc ici E3 et activer une variable prochain tour

genre autorisation_passant_black puis tour suivant la désactiver





     */









    }











}









