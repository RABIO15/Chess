package org.example.chess;

import java.util.ArrayList;

import static org.example.chess.Value.piecess;

public class Echec {

    //variable qui dit par false or true si le roi est en echecs


    public static Boolean EchecsN;

    public static Boolean EchecsB;

    public static int NombreEchec;

    /*
    NombreEchec;
    VARIABLE TRES IMPORTANT

    elle va permettre de savoir ou on a est par à port à l'échec 0 c'est aucun echecs on cherche 1 ça va etre inerposer une piece
    2 ça va etre de manger  la piece qui casse les couilles





     */







    /*

    Ces 4 variable vont pêrmettre de sauvegarder un etats spécifique des piece elles font servire pour savoir ou est le roi
    et  ou est la piece ennemi qui menace ce qui permettre par la suite de reset et de faire des modification et des vérification sp^'acifique


     */
    public static int Piece_echecs_x;

    public static int Piece_echecs_y;


    public static int SPiece_echecs_x;

    public static int SPiece_echecs_y;






//Cette variable va  permettre de compter les echecs ce qui va permettre de voir ou non si on peut mettre un piece entre les 2
    //par edxemple il va vérifier si le nombre dechec et plus que 2 va devoir obligatoirement devoir bouger son rois





    /*
    Cette variable va juste dire si on peut bloquer l'echec oui ou non ou oui mais il peut pas car sinon il se mais en echecs doncdouble echecs


    0 pour non

    1 pour oui

    2 pour pour oui mais en fesant ça il se mais en echecs donc NON






     */


    public static ArrayList<String> CoupEchecKing = new ArrayList<>();
    //ça va permettrre de connaitre les coup dechecs du rois par ou il est en echecs


    public static ArrayList<String> CoupEchec= new ArrayList<>();

    //parreil mais pour la piece ennemie


    public static void Colone_Echecs(int Ax, int Ay, int x, int y, int usage, int color, int tour, int piece,int tour_echec) {







/*

    14/05/26

    pour prochain session

    refaire le truc colone et intégrer system de liste qui ajoute chaque case dans la colone et regarde si y a echec
    c'est a dire x +1 il va faire encore encore et encore et ajoute dans la liste si y a echecs comment?
    en comptent le nombre de appel donc exemple je suis position rois x1 y1 je fait x+1 pendant 5 fois 5fois c'est un exemple ici on part
    du principe que au bout de 5 fois on est tomber sur un echec

    ma variable compte le nombre de fois que je fait x+1 jusqu'a tomber sur piece noir qui menace rois
    ici 5 fois donc il prend l'anceine position ax et ay et rajoute dans la liste Ax + 1  5 fois car il a fallu
    5 fois avant que on tombe sur un echecs donc il va enregistre les position  x2 y1,puis x3 puis x4 etcc..
    jusqu'a tomber sur la piece qui fait l'echecs par la suite il continura et refera le nombre de fois naissaire

   si y a plus de 2 echecs alors eliminer la posibilité d'intervention    ou de miam miam de piece donc que la fuite






    si y a echec on aura un liste de position ou on pourra interposer une piece blanche ou sinon avec la liste trouver la
    coordonée de la piece qui menace le rois  et refaire exactement pareil la meme fonction qui regarde si une piece est menacé
    parcontre si y a pas d'échecs clear la liste  pour le fuite du rois regarder les piece ou le rois peut aller avec
     autorisation_list_King et regarder pour chauque case ou le rois veut aller si y a une piece ennemie ou  pas

     si y a piece ennemie la il veut fuir  que dans les case ou on peut eterposer des piece on peut pas et
     que on peut manger la piece ennemie alors déclarer comme echecs et mat








 */

        if(usage == 0){


            usage += 1;


            SPiece_echecs_x = x;
            SPiece_echecs_y = y;
            //permet de sauvegarder l'état de ou est le rois de base


        }




        System.out.println("APPEL FONCTION ");


        try {


            int piece_error = Graphic.grilleEchecs[x][y];

            System.out.println("DEBUT DU TRY ");




    switch (usage) {



        case 1:



                for (int j = 0; j < 1000; j++) {

                    System.out.println("|||||  " + NombreEchec);

                }






            //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique



            tour += 1;
            //les tour tour fond permettre de savoir ou on a est pour pouvoir l'utiliser après pour connaitre les coordonée ou traversse lechecss

            piece_error = Graphic.grilleEchecs[x][y];


            //le piece error acrémente jusqu'a tomber sur un piece donc pas egale à 0

            if (piece_error != 0) {
                //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                //suivante


                //vérifier le piece que on a


                //Nous avons un rois noir ou blanc

                if(NombreEchec == 1) {

                    for (int j = 0; j < 1000; j++) {

                        System.out.println("-----------  " + NombreEchec);

                    }

                }

                int newpiece = Graphic.grilleEchecs[x][y];

                if(NombreEchec == 1){

                    x += 1;

                    newpiece = Graphic.grilleEchecs[x][y];
                }

                /*



                LE PROBLEME EST LA POUR LE 2 EMEM TRUC §§§§§§
                LE PROBLEME EST LA POUR LE 2 EMEM TRUC §§§§§§
                 */


                if (piecess.Same_Color(piece, newpiece) && NombreEchec < 2) {



                    if(NombreEchec == 1) {

                        for (int j = 0; j < 1000; j++) {

                            System.out.println("&&&&&&&& " + NombreEchec);

                        }

                    }




                    //le tour echec va permettre de savoir on esque on est au niveau des echecs
                    /*
                    par exemple genre j'ai déjà mis le rois en echecs donc la on voie si les autre piece dans le bordel
                    peutvent etre echec



                     */

                    if (NombreEchec == 1 && piece != 1 ) {

                        /*
                        Ici on fait la vérification que la quand on est en echecs  si on tombe sur une piece allier
                        et bien fait ça  est exclure le rois car quand il est en echecs premier fois il reboucle
                        sur les meme coordonée ce qui fait qui se prend lui meme pour une piece allier et ça fou le bordel




                         */

                        //si on constante un echec et que dans le trajet de lechec il y a une piece allier qui peut sinterposer
                        // et bien dire que cette piece peut s'interposer
                        Graphic.buttons[x][y].setStyle("-fx-background-color: brown;");


                        usage += 1;






                        for(int i = 0; i < 1000; i++){

                            System.out.println("NOMBRE ECHEC :  " + NombreEchec);
                        }

                        Colone_Echecs(Ax, Ay, Ax, Ay, usage, color, tour, piece, tour_echec);

                    } else {

                        if(newpiece != 1 ) {


                            usage += 1;

                            Colone_Echecs(Ax, Ay, Ax, Ay, usage, color, tour, piece, 0);

                            // 1 c'est balnc et 0 c'est noir

                            System.out.println("On tombe sur une piece allier ");


                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");


                            Graphic.buttons[x][y].setStyle("-fx-background-color: red;");
                        }

                    }


                } else {
                    //si on est rois est que on tombe sur une piece ennemie

                    int ANx = Ax;

                    //noter lancienne position de x


                    //récupére ou est la piece ennemie

                    if(NombreEchec == 1) {

                        for (int j = 0; j < 1000; j++) {

                            System.out.println("=====  " + NombreEchec);

                        }

                    }

                    if (NombreEchec == 0) {



                        Piece_echecs_x = x;
                        Piece_echecs_y = y;

                        for(int i = 0; i < 1000; i++) {

                            System.out.println("POSITION X " + x);
                            System.out.println("POSITION Y " + y);
                        }
                        /*
                        ici on va récupérer la position de la piece qui fait echecs au rois elle va nous servire plus tard
                        pour pouvoirs faire une vérification si cette piece peut etre mangé ou non et donc pouvoirs contrer lechec ou NON !



                         */



                        for (int i = 0; i <= tour; i++) {


                            tour_echec += 1;

                                CoupEchecKing.add("" + ANx + "," + y + "");





                            //ajouter dans un liste en fesant une boucle la ou passe l'échec du rois
                            //grace à ça on pourras voir si on peut interposer un piece entre les deux

                            Graphic.buttons[ANx][y].setStyle("-fx-background-color: green;");



                            ANx += 1;
                            //va permettre de compter le nombre de tour pour déjà vérifier si on peut interpose une piece avant
                            //puis si on peut manger ou non enfaite ça va etre un compteur elle va faire la meme fonction que tour mais pour lecehc


                        }


                        if (piece == 1 || piece == -1) {

                            if (color == 1) {
                                EchecsB = true;

                            } else {

                                EchecsN = true;
                            }
                        }


                        System.out.println("" + x + "," + y + "");



                        NombreEchec += 1;

                        for(int j = 0; j < 1000; j++){

                            System.out.println("LE NOMBRE VIEN DAUGMENTER : " + NombreEchec);

                        }


                        Colone_Echecs(Ax, Ay, Ax, Ay, usage, color, tour, piece, tour_echec);
                        /*


                        partie teste j'ai remplacer tour par tour_eche car y a une verif en bas qui peut faiure merder
                         */


                        // la ici  on est en échec  donc on rapel le meme truc pour voir si on peut sinterposer

                    }else{














                        if(NombreEchec == 1){


                            for(int j = 0; j < 1000; j++){

                                System.out.println("111111111111111111111111111111111111111111111   ");

                            }

                            NombreEchec += 1;

                            if(color == 1){
                                //si de base il est blanc le mettre en noir et invesement
                                color = 0;
                            }else{


                                color = 1;
                            }

                            piece = Graphic.grilleEchecs[Piece_echecs_x][Piece_echecs_y];

                            Colone_Echecs(Piece_echecs_x, Piece_echecs_y, Piece_echecs_x, Piece_echecs_y, usage, color, tour, piece, tour_echec);



                            //sur notre trajet on tombe sur une piece ennemie donc ça sert plus a rien on passe au miammaim trouver quelque chose pour ce faire manger

                        }


                        if(NombreEchec == 2) {


                            for(int j = 0; j < 1000; j++){

                                System.out.println("222222222222222222222222222222222   ");

                            }

                            ANx = SPiece_echecs_x;


                                int i = 0;

                                tour_echec -= 2;

                                //le moin 2f permet de camoufler le surplus


                                while (i  < tour_echec){


                                    CoupEchec.add("" + ANx + "," + y + "");


                                //ajouter dans un liste en fesant une boucle la ou passe l'échec du rois
                                //grace à ça on pourras voir si on peut interposer un piece entre les deux

                                Graphic.buttons[ANx][y].setStyle("-fx-background-color: black");

                                ANx += 1;

                                i++;


                            }







                            //en gros la c'est la partie reset qui va permettre de remettre un peu tout ancien état de lechec decouverte pour regarde les autre colone quoi si y aeche ou non
                            NombreEchec  -= 1;

                            if(color == 1){
                                //si de base il est blanc le mettre en noir et invesement
                                color = 0;
                            }else{


                                color = 1;
                            }
                            usage += 1;
                            piece = Graphic.grilleEchecs[SPiece_echecs_x][SPiece_echecs_y];

                            Colone_Echecs(SPiece_echecs_x, SPiece_echecs_y, SPiece_echecs_x, SPiece_echecs_y, usage, color, 0, piece, tour_echec);






                        }








                        //ici le rois et en echec donc



                    }

                }




            } else {




                x += 1;

                if(tour_echec == 0 && NombreEchec == 1){



                    for(int i = 0; i < 1000; i++) {

                        System.out.println("CE4SY LA BOOOOOC+UCLE" );

                    }

                   NombreEchec += 1;

                   if(color == 1){
                       //si de base il est blanc le mettre en noir et invesement
                       color = 0;
                   }else{


                       color = 1;
                   }

                   piece = Graphic.grilleEchecs[Piece_echecs_x][Piece_echecs_y];

                    Colone_Echecs(Piece_echecs_x, Piece_echecs_y, Piece_echecs_x, Piece_echecs_y, usage, color, tour, piece, tour_echec);


                }else {
                    if(NombreEchec == 2){
                        for(int i = 0; i < 1000; i++) {
                            System.out.println("AZERTY");
                        }


                    }

                    Colone_Echecs(Ax, Ay, x, y, usage, color, tour, piece, tour_echec);

                }

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




            if(tour_echec == 0 && NombreEchec == 1){

                NombreEchec += 1;

                if(color == 1){
                    //si de base il est blanc le mettre en noir et invesement
                    color = 0;
                }else{


                    color = 1;
                }

                piece = Graphic.grilleEchecs[Piece_echecs_x][Piece_echecs_y];

                Colone_Echecs(Piece_echecs_x, Piece_echecs_y, Piece_echecs_x, Piece_echecs_y, usage, color, tour, piece, tour_echec);


            }else {
                /*

                zib zob
                 */

        if(NombreEchec == 2){


         NombreEchec  -= 1;
            for(int i = 0; i < 1000; i++) {
                System.out.println("AZERTY");
            }



            if(color == 1){
                //si de base il est blanc le mettre en noir et invesement
                color = 0;
            }else{


                color = 1;
            }
            usage += 1;
            piece = Graphic.grilleEchecs[SPiece_echecs_x][SPiece_echecs_y];

            Colone_Echecs(SPiece_echecs_x, SPiece_echecs_y, SPiece_echecs_x, SPiece_echecs_y, usage, color, tour, piece, tour_echec);



    }
                usage += 1;

            }









           /*
           ici il y a eu une erreur car on a essayer de  appeler un piece erreur qui est pas dans le tableau
           donc on a depasse notre limite donc on ajoute à usage pour passer à la diagonal suivante et on remait
           tout à 0 et voila


            */


            if (usage < 2) {

                System.out.println("la on rapel encore");

                usage += 1;
                Colone_Echecs(Ax, Ay, Ax, Ay, usage, color, tour, piece,tour_echec);



            } else {

                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");


            }







        }


    }







}
