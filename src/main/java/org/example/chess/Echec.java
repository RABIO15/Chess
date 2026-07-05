package org.example.chess;

import java.util.ArrayList;

import static org.example.chess.Value.piecess;

public class Echec {

    //variable qui dit par false or true si le roi est en echecs


    public static Boolean EchecsN;

    public static Boolean EchecsB;

    public static boolean ECHEC;

    public static int  INTERCEPTION_ECHEC;
    public static boolean  Piece_ennemie;



    /*
    INTERCEPTION_ECHEC

    0 on peut pas

    1 on peut

    2 entre les deux


     */






    /*
    NombreEchec;
    VARIABLE TRES IMPORTANT

    elle va permettre de savoir ou on a est par à port à l'échec 0 c'est aucun echecs on cherche 1 ça va etre inerposer une piece
    2 ça va etre de manger  la piece qui casse les couilles

La variable Usage_echec va permttre de savoir de quel "coter on est en echec" cela va permettre
d'autoriser ou non le fait de faire une raser la ou on pourra interposer une piece ou non



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


    public void Colone_Echecs(int Ax, int Ay, int x, int y, int usage, int color, int tour, int piece,int tour_echec) {



        if(usage == 0){


            usage += 1;


            SPiece_echecs_x = x;
            SPiece_echecs_y = y;
            //permet de sauvegarder l'état de ou est le rois de base


        }







        try {


            int piece_error = Graphic.grilleEchecs[x][y];
            //servira pour plus tard


            System.out.println("DEBUT DU TRY ");




    switch (usage) {



        case 1:





            //permet de ajouter un cordonnée en forme de string  pour que ça soit plus pratique



            tour += 1;
            //les tour tour fond permettre de savoir ou on a est pour pouvoir l'utiliser après pour connaitre les coordonée ou traversse lechecss

            piece_error = Graphic.grilleEchecs[x][y];


            //le piece error acrémente jusqu'a tomber sur un piece donc pas egale à 0

            if (piece_error != 0) {
                //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                //suivante






                int newpiece = Graphic.grilleEchecs[x][y];
                /*

                on crée une variable qui va recupérer les coordonée ou on a une piece pour pouvoir la comparé par la suite

                 */



                if(ECHEC){

                    x += 1;

                    newpiece = Graphic.grilleEchecs[x][y];
                    /*

                    ici on fait expré de augmenter la valeur de x vu que on est en colone du bas pour cibler les zone du bas

                    en gros on fait ça car quand le rois est en echec et bien on va par la suite comparé les piece suivante
                    en partant du bas  et voir si y a une piece est compatible pour arreter lechec ou non

                    en gros en fesant ça permet de pas prendre le rois en premier et de faire nimporte quoi
                    car par defaut il commence la ou le rois est ce qui fous la merde car c'est pas ce que on veut enfaite



                     */


                }




                if (piecess.Same_Color(piece, newpiece) ) {


                    //ici on verifier la piece est de la meme couleur et que y a pas 2 echec en meme temps sinon
                    /*
                    bah on pourra pas contré lechec


                     */





                    //le tour echec va permettre de savoir on esque on est au niveau des echecs
                    /*
                    par exemple genre j'ai déjà mis le rois en echecs donc la on voie si les autre piece dans le bordel
                    peutvent etre echec



                     */

                    if (ECHEC && piece != 1 && tour_echec != 400) {


                        /*


                        UTILISATION quand on est en echec et que on tombe sur une piece allier qui peut nous aider




                         */



                        /*

                        le if est placé que on tombe sur un piece allier quand on est en echec et que la piece allier n'est pas le rois


                         */


                        Graphic.buttons[x][y].setStyle("-fx-background-color: brown;");



                        /*
                        On doit faire la vérification que la piece allier n'est pas CLOUER


                         */

                                tour_echec = 400;
                                tour = 0;
                                /*

                                on réinistialise un peu tout dans pour voir dans ce case si la piece est en echec ou non
                                et on mais tour echec à 400 pour connaitre le fait que c'estr juste une verificatrion de passage

                                 */



                        piece = Graphic.grilleEchecs[x][y];

                        //ici on dit que la piece et  notre piece allier qui peut nous sauver
                        //car elle peut aller sur le trajet de lehec ce que on souhait





                        Colone_Echecs(x, y, x, y, usage, color, tour, piece, tour_echec);

                        /*

                        ici on rappel la fonction pour regarder desormer si notre piece qui peut stoper l'echec est elle meme
                        en echec si c'est le cas cela foudra dire que nous somme clouer et donc perdu

                         */




                    }








                    else {



                        /*


                        Utilisation normal quand tous ce passe bien


                         */

                        if(newpiece != 1  ) {


                            usage += 1;

                            Colone_Echecs(Ax, Ay, Ax, Ay, usage, color, tour, piece, 0);

                            // 1 c'est balnc et 0 c'est noir


                            System.out.println("On tombe sur une piece allier ");


                            Graphic.buttons[x][y].setStyle("-fx-background-color: red;");
                        }else{

                            System.out.println("Un probléme est survenu ");

                        }

                    }


                }

                /*

                CAS NOUS SOMME EN ECHEC

                 */


                else {


                    //si on est rois est que on tombe sur une piece ennemie

                    int ANx = Ax;

                    //noter lancienne position de x


                    //récupére ou est la piece ennemie

                    if (!ECHEC || tour_echec == 400) {


                        if(tour_echec == 400){

                            /*

                            CAS DOUBLE ECHEC

                            LA PIECE QUE ON A TROUVER ET ELLE  MEME CLOUER

                             */


                            //la ça veut dire que notre piece qui pouvait bloquer lechec peut etre en echec et c'es vrm pas bon

                            usage += 1;
                           //la va falloir ajouter 1 à usage car dans le sens colone du bas ça peut pas marcher c'est
                            //pas posible car le truc est clouer et mettre les ancienne coordonée du rois
                            if(color == 1) {

                                Colone_Echecs(SPiece_echecs_x, SPiece_echecs_y, SPiece_echecs_x, SPiece_echecs_y, usage, color, tour, 1, 0);
                            }else{
                                Colone_Echecs(SPiece_echecs_x, SPiece_echecs_y, SPiece_echecs_x, SPiece_echecs_y, usage, color, tour, -1, 0);



                            }


                        }


                        /*
                        CAS ON VIEN DETRE MIS EN ECHEC DE CE COTER


                         */




                        Piece_echecs_x = x;
                        Piece_echecs_y = y;

                        /*
                        ici on va récupérer la position de la piece qui fait echecs au rois elle va nous servire plus tard
                        pour pouvoirs faire une vérification si cette piece peut etre mangé ou non et donc pouvoirs contrer lechec ou NON !



                         */



                        for (int i = 0; i <= tour; i++) {


                            tour_echec += 1;

                            /*

                            LE tour echec compte les coup pour après quand on va devoir
                            verifier chaque position ou traverse l'echec pour chercher un piece qui peut
                            s'interposer ou non


                             */



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



                        ECHEC = true;



                        usage += 1;


                        /*

                        ici j'ai bien compris on rappel la fonction pour voir si on peut se tirer de cette

                        echec mais nous somme les premiers sur lechec donc cela veut dire que on peut pas trouver
                        sur la meme vois une piece qui peut s'interposer donc dans ce cas

                        usage +1
                        pour que les autre colone

                                                 */



                        Colone_Echecs(Ax, Ay, Ax, Ay, usage, color, tour, piece, tour_echec);
                        /*


                        partie teste j'ai remplacer tour par tour_eche car y a une verif en bas qui peut faiure merder
                         */


                        // la ici  on est en échec  donc on rapel le meme truc pour voir si on peut sinterposer

                    }



                    else{




                                    /*

                                    CAS ON CROISSE UNE PIECE ENNEMI ET ON EST DEJA EN ECHECS
                                    CAR SI CEST LA PREMIER FOIS BAH IL VA LIGNORER
                                    ET SI CES PAS LA PREMIER FOIS CA VEUT SOIS DIRE QUE CEST UN AUTRE QUI
                                    A DECOUVERT LECHEC ET CE COTER A DECOUVERT UN AUTRE ECHEC DONC DOUBLE
                                    ECHEC CEST FINI OU A FAIT DEJA TOUT LES CAS


                                    faire un etats qui dit que on est entrain de chercher une piece qui peut bouffer
                                    la piece qui met en echec le rois


                                     */



                          /*

                            CAS NOUS SOMME EN ECHEC ET NOUS NE POUVON PAS INTERCEPTER LECHEC


                            ET NE NOUS POUVON PAS DEPLACER LE ROIS DANS UN  ENDROIT SAFE !

                                        -POUR LENDROIT SAFE FAIRE APRES AVOIR FINI LES ECHEC ET INTERCEPTION DECHEC
                                        CAR ON VA UTILISER COLONE ECHEC ET DIAGONAL ECHEC ET CAVALIER ECHEC  POUR LES CASE DISPO




                             */









/*


si on est en echec et que on a pas de piece allier sur le passage et que on tombe sur une piece ennemie

 */


                        /*
                        parti illogique  on dit que si on est en echec  et que on retombe sur une piece
                        ennemie faire d'inverser les couleur



                         */





                            /*

                            il y a un probléme c'est que il regarde que de son coter

                            c'est a dire si il est en echec du coté gauche il va regarder au bas pour voi
                            mais il trouve une piéce ennemi il va la target ce qui est bon
                            quand c'est le premier et que c'est lui a l'echec mais si c'est pas le cas
                            cela va poser des probléme soudain  crée un variable pour évaluer cela ?



                             */


                            /*

                            la logique n'est pas logique

                            ce que on doit faire c'est regarder si lechec vien de nous si c'est le cas  genre de se coter et bien lignorer


                             */


                            /*
                            si c'est n'est pas le cas et que on tombe sur une piece ennemie  et que c'est un tour ou une dame
                            et bien mettre en double echec


                            si c'est seulement une piece noir ramdom et bien lignore


                            la partie du bas ne sert à rien et le echec 2 ne sert a rien on peut le faire directement  quand il est en eche la premier fois
                            aussi regarder quand on tombe sur piece allier




                             */

                            /*


                            CAS NOUS TOMBON SUR UNE PIECE ENNEMI qui nous mennace et nous somme déjà en echec
                           Dans ce cas DOUBLE ECHEC

                             */





                         if(piece ==1 || piece == -1) {

                             /*
                                cette verification permet de dire si la piece est le rois ou pas pour éviter
                                des erreur par exemple quand on regarde si y a un piece qui peut manger la piece ennemie



                              */



                             if (color == 1) {
                                 //si de base il est blanc le mettre en noir et invesement
                                 color = 0;
                             } else {


                                 color = 1;
                             }

                             piece = Graphic.grilleEchecs[Piece_echecs_x][Piece_echecs_y];


                             //ici devoir mettre position de la piece qui fait chier

                             Colone_Echecs(Piece_echecs_x, Piece_echecs_y, Piece_echecs_x, Piece_echecs_y, usage, color, tour, piece, tour_echec);


                             //sur notre trajet on tombe sur une piece ennemie donc ça sert plus a rien on passe au miammaim trouver quelque chose pour ce faire manger

                         }


                        if(Piece_ennemie) {


                            /*

                            faire un truc pour dire que aussi on peut bouffer la piece meme si on peut interposer aussi
                            genre une varible color inervese pour dire que on la on chercher si on peut bouffer ou non la piece
                             */


                            /*

                            CAS NOUS SOMME EN ECHEC ET NOUS NE POUVON PAS INTERCEPTER LECHEC


                            ET NE NOUS POUVON PAS DEPLACER LE ROIS DANS UN  ENDROIT SAFE !

                                        -POUR LENDROIT SAFE FAIRE APRES AVOIR FINI LES ECHEC ET INTERCEPTION DECHEC
                                        CAR ON VA UTILISER COLONE ECHEC ET DIAGONAL ECHEC ET CAVALIER ECHEC  POUR LES CASE DISPO


                                CAS ON A TROUVER UN ECHEC POUR LA PIECE ENNEMI !!



                             */


                            Graphic.buttons[x][y].setStyle("-fx-background-color: black");

                            /*

                            mettre en lumiére la piece qui peut bouffer notre piece ennemi


                             */

                            Graphic.buttons[Ax][y].setStyle("-fx-background-color: purple");
                            /*

                            mettre la piece ennemie en violet pour dire que c'est cette piece qu'il faut bouffer
                             */


                            CoupEchec.clear();
                            //ici pour retirer les ancien position qui peut avoir et après ajouter la position de lennemie

                            CoupEchec.add("" + Ax + "," + y + "");





                                //le moin 2 permet de camoufler le surplus

                            //car enfaite il va prendre de tour qui prend le rois est la tour en compte
                            /*
                            mais pour pouvoir contrer lechec nous il nous faut que les case en noir entre en gros



                             */









                            //en gros la c'est la partie reset qui va permettre de remettre un peu tout ancien état de lechec decouverte pour regarde les autre colone quoi si y aeche ou non





                        }












                    }

                }




            } else {




                x += 1;





    if (tour_echec == 0 && ECHEC) {


        NombreEchec += 1;

        if (color == 1) {
            //si de base il est blanc le mettre en noir et invesement
            color = 0;
        } else {


            color = 1;
        }

        piece = Graphic.grilleEchecs[Piece_echecs_x][Piece_echecs_y];

        Colone_Echecs(Piece_echecs_x, Piece_echecs_y, Piece_echecs_x, Piece_echecs_y, usage, color, tour, piece, tour_echec);


    } else {


        if (NombreEchec == 2) {
            for (int i = 0; i < 1000; i++) {
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




            if(tour_echec == 0 && ECHEC){

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
