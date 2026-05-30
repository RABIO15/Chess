package org.example.chess;

import java.util.ArrayList;

import static org.example.chess.Value.piecess;

public class Echec {

    //variable qui dit par false or true si le roi est en echecs


    public static Boolean EchecsN;

    public static Boolean EchecsB;

    public static int NombreEchec;
//Cette variable va  permettre de compter les echecs ce qui va permettre de voir ou non si on peut mettre un piece entre les 2
    //par edxemple il va vérifier si le nombre dechec et plus que 2 va devoir obligatoirement devoir bouger son rois


    public static ArrayList<String> CoupEchec = new ArrayList<>();


    public static void Colone_Echecs(int Ax, int Ay, int x, int y, int usage, int color, int tour, int piece) {



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


        System.out.println("APPEL FONCTION ");


        try {

            int piece_ancienn = Graphic.grilleEchecs[Ax][Ay];

            int piece_error = Graphic.grilleEchecs[x][y];

            System.out.println("DEBUT DU TRY ");


            System.out.println("ZiiiiiiiiiiiiiiIBBBB " + usage);
            System.out.println("ZiiiiiiiiiiiiiiIBBBB " + usage);


            switch (usage) {


                case 1:


                    System.out.println("RHAAAAAAAAAAAAAAAAA" + usage);
                    //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique

                    tour += 1;



                    piece_error = Graphic.grilleEchecs[x][y];


                    //le piece error acrémente jusqu'a tomber sur un piece donc pas egale à 0

                    if (piece_error != 0) {
                        //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                        //suivante


                        //vérifier le piece que on a


                        //Nous avons un rois noir ou blanc

                        int newpiece = Graphic.grilleEchecs[x][y];

                        if (piecess.Same_Color(1, 5)) {


                            usage += 1;

                            Colone_Echecs(Ax, Ay, Ax, Ay, usage, color, 0, piece);
                            // 1 c'est balnc et 0 c'est noir
                            System.out.println("On tombe sur une piece allier ");

                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");  System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");
                            System.out.println("On tombe sur une piece allier ");





                            Graphic.buttons[x][y].setStyle("-fx-background-color: red;");


                        } else {
                            //si on est rois est que on tombe sur une piece ennemie


                            int ANx = Ax;
                            //noter lancienne position de x


                            for (int i = 0; i <= tour; i++) {


                                ANx += 1;

                                CoupEchec.add("" + ANx + "," + y + "");
                                //ajouter dans un liste en fesant une boucle la ou passe l'échec du rois
                                //grace à ça on pourras voir si on peut interposer un piece entre les deux

                                Graphic.buttons[ANx][y].setStyle("-fx-background-color: blue;");


                            }

                            if (piece == 1 || piece == -1) {

                                if (color == 1) {
                                    EchecsB = true;

                                } else {

                                    EchecsN = true;
                                }
                            }


                            System.out.println("" + x + "," + y + "");
                            usage += 1;

                            Colone_Echecs(Ax, Ay, Ax, Ay, usage, color, tour, piece);

                        }


                    } else {



/*
                        if(tour > 20){

                            usage += 1;
                        }


*/                      x += 1;

                        Colone_Echecs(Ax, Ay, x, y, usage, color, tour, piece);

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


            if (usage < 2) {

                System.out.println("la on rapel encore");

                usage += 1;
                Colone_Echecs(Ax, Ay, Ax, Ay, usage, color, tour, piece);

            } else {

                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");
                System.out.print("FINI FINI ");


            }


        }


    }







}
