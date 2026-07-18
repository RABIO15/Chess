package org.example.chess;

import java.util.ArrayList;
import java.util.HashMap;

import static org.example.chess.Value.piecess;

public class Echec {

    //variable qui dit par false or true si le roi est en echecs


    public static Boolean EchecsN;

    public static Boolean EchecsB;

    public static boolean ECHEC;



    public static boolean  Piece_ennemie;

    public static boolean Piece_Allier_Echec;

    private static boolean DOUBLE_VERIFICATION;

    //Variable qui va nous dire si oui ou non on a déjà fait une vérification des echec
    //permettra de refaire un tour ou non pour faire les vérifition de case diposnible exmple concrait
    //vers les lignes 600



















    /*

    Ces 4 variable vont pêrmettre de sauvegarder un etats spécifique des piece elles font servire pour savoir ou est le roi
    et  ou est la piece ennemi qui menace ce qui permettre par la suite de reset et de faire des modification et des vérification sp^'acifique


     */

    public static int  newpiece;

    //variable recupératrice de piece pour permettre de comparer les piece entre elle permet de connaitre
    //si les piece sont de la meme couleur ou si la piece est un rois ou non etc ..



    public static int Piece_echecs_x;
    //Variable qui va servire de conteneur pour récupérer la position en X de la piece qui mais en echec




    public static int Piece_echecs_y;
    //Variable qui va servire de conteneur pour récupérer la position en Y de la piece qui mais en echec








    public static int SPiece_echecs_x;
    //sont des variable de conteneur qui sauvegardera l'état de ou est le rois en position X

    public static int SPiece_echecs_y;
    //sont des variable de conteneur qui sauvegardera l'état de ou est le rois en position Y






    public static int SAUV_Allier_Piece_echecs_x;
    //sont des variable de conteneur qui sauvegardera l'état de ou est la piece allier qui peut s'interposer entre lechec en position X

    public static int SAUV_Allier_SPiece_echecs_y;
    //sont des variable de conteneur qui sauvegardera l'état de ou est la piece allier qui peut s'interposer entre lechec en position Y











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

    public static ArrayList<Direction> directions  = new ArrayList<>();


    public void Colone_Echecs(int Ax, int Ay, int x, int y, int usage, int color, int tour, int piece,int tour_echec) {



        if(usage == 0){


            usage += 1;


            SPiece_echecs_x = Ax;
            SPiece_echecs_y = Ay;
            //permet de sauvegarder l'état de ou est le rois de base


        }







        try {


            int PIECE_PRESENTE = Graphic.grilleEchecs[x][y];
            //servira pour plus tard


            System.out.println("DEBUT DU TRY ");




    switch (usage) {



        case 1:









            tour += 1;
            //les tour tour fond permettre de savoir ou on a est pour pouvoir l'utiliser après pour connaitre les coordonée ou traversse lechecss

            PIECE_PRESENTE = Graphic.grilleEchecs[x][y];


            //le piece error acrémente jusqu'a tomber sur un piece donc pas egale à 0

            if (PIECE_PRESENTE  != 0) {
                //cette verif permet de voir si on tombe sur une piece et bien on  s'arret et on passe à la diagonal
                //suivante

                 newpiece = Graphic.grilleEchecs[x][y];
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

                    /*

                    SHEMA

                    LEGENDE:
                    1 = rois BLANC
                    -2 = RENNE NOIR
                    X = la ou est NewPiece
                    5 = TOUR


                    ********1*****-2
                    *********X*****
                    ****************
                    ************5***
                    ici la piece piece verificatrice va voir au tien il y a rien donc elle va continuer

                    *********1*****-2
                    ***************
                    *********X******
                    ************5***



                    ********1*****-2
                    ***************
                    ****************
                    *********X**5***

                    puis on va decaler par a port à case qui sont en echec en ajoute en x+1 pour le bas


                    ********1*X***-2
                    ***************
                    ****************
                    ************5***

                    puis

                    ********1*****-2
                    **********x****
                    ****************
                    ************5***


                    etc etc.. jusqu'a trouver notre piece allier !


                     */



                }









                    //ici on verifier la piece est de la meme couleur et que y a pas 2 echec en meme temps sinon
                    /*
                    bah on pourra pas contré lechec


                     */





                    //le tour echec va permettre de savoir on esque on est au niveau des echecs
                    /*
                    par exemple genre j'ai déjà mis le rois en echecs donc la on voie si les autre piece dans le bordel
                    peutvent etre echec



                     */










                /*

                CAS NOUS SOMME EN ECHEC

                 */
                if (piecess.Same_Color(piece, newpiece) ) {


                    Same_color_Execute(Ax, Ay,  x,  y,  usage,  color,  tour,  piece, tour_echec, this::Colone_Echecs);



                }


                else {


                    //si on est rois est que on tombe sur une piece ennemie



                    //noter lancienne position de x


                    //récupére ou est la piece ennemie

                    if (!ECHEC || Piece_Allier_Echec) {




                        if(Piece_Allier_Echec){

                            /*

                            CAS DOUBLE ECHEC

                            LA PIECE QUE ON A TROUVER ET ELLE  MEME CLOUER

                             */


                            //la ça veut dire que notre piece qui pouvait bloquer lechec peut etre en echec et c'es vrm pas bon

                           DoubleEchecDetected(SPiece_echecs_x, SPiece_echecs_y, SPiece_echecs_x, SPiece_echecs_y, usage, color, tour, 1, 0,this::Colone_Echecs);




                        }


                        /*
                        CAS ON VIEN DETRE MIS EN ECHEC DE CE COTER
                        pour le premier fois attention ici bien noter les coordonnée


                         */

                        directions.add(Direction.DOWN);
                        /*
                        Le fait de mettre une direction va permettre de savoir si c'est nous qu'il
                        avait mis en echec ou non ce qui va permettre de quand on appel à nouveau la fonction
                        pour dire de mettre la piece ennemi en jou bah de oas confondre avec un double
                        echec vu que c'est déjà en echec

                         */




                        FirstCheck( Ax,  Ay, x,  y,  usage, color, tour,  piece, tour_echec,this::Colone_Echecs,"COLONE");



                        /*
                        ici on va récupérer la position de la piece qui fait echecs au rois elle va nous servire plus tard
                        pour pouvoirs faire une vérification si cette piece peut etre mangé ou non et donc pouvoirs contrer lechec ou NON !



                         */







                        // la ici  on est en échec  donc on rapel le meme truc pour voir si on peut sinterposer

                    }





                    else{


                        /*
                        CAS nous somme en echec et nous avons aucun piece pour faire
                        l'interception






                         */



                        if(directions.contains(Direction.DOWN)) {


                            /*
                            cela serait un double appel en quelque sorte

                            je suis en echec cotter du bas

                            ******+1******
                            **************
                            ******-2******
                            **************
                            **************
                            ******+5******

                            sur les autre coter on a rien à trouver donc on retourn sur le coter
                            original donc ici down on  detected que c'est lui et fait ce qu'il faut
                            donc la il se dit ok on va bouffer la piece ennemie





                             */





                            if (piece == 1 || piece == -1 && !Piece_ennemie) {

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


                                Piece_ennemie = true;
                                // cela veut juste dire que on s'attaque désormer à la piece


                                piece = Graphic.grilleEchecs[Piece_echecs_x][Piece_echecs_y];


                                //ici devoir mettre position de la piece qui fait chier

                                Colone_Echecs(Piece_echecs_x, Piece_echecs_y, Piece_echecs_x, Piece_echecs_y, usage, color, tour, piece, tour_echec);


                                //sur notre trajet on tombe sur une piece ennemie donc ça sert plus a rien on passe au miammaim trouver quelque chose pour ce faire manger

                            }


                            if (Piece_ennemie) {


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


                                //en gros la c'est la partie reset qui va permettre de remettre un peu tout ancien état de lechec decouverte pour regarde les autre colone quoi si y aeche ou non


                            }


                        }else{


                            /*
                            cela veut juste dire que on est en echec mais que l'echec ne vien pas de nous
                            et que nous avon pas de piece qui peuve intersepter on se retrouve en double
                            echec dans ce cas la



                             */

                            if(KingEscape(Ax,Ay)){




                            }




                            /*
                            Nous somme en double echec car de base on est en echec et la piece qui vient de  nous donne ce nouveaux echec de ce
                            coter la
                            ne vien pas de nous et ne nous pouvons pas intercepter l'echec doncv


                           cas FUITE

                           faire fonction si le rois peut fuir
                           sinon CHECK MATE




                             */






                        }








                    }

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







            if(ECHEC){

                    /*
                    nous somme en echec mais nous ne  sommes tomber sur aucune piéce ennemie
                    ou allier


                     */

                usage += 1;

                Colone_Echecs(Ax,Ay,x,y,usage,color,tour,piece,tour_echec);



                /*
                ajoute 1 à usage et continuer de regarder si on tombe sur quelque chose
                si c'est déjà à 4 remttre un couche de vérification pour peut etre tomber sur un truc



                 */

                if(!DOUBLE_VERIFICATION){

                    usage = 0;

                    DOUBLE_VERIFICATION = true;

                    Colone_Echecs(Ax,Ay,x,y,usage,color,tour,piece,tour_echec);



                }






            }else if(Piece_Allier_Echec){

                /*
                la piec allier n'est pas menacer donc ça vaaaaaaaaaaaaaaaa
                 */






            }else if(Piece_ennemie){
                /*


                la piece ennemie na pas de truc qui la menace alors continuer
                 */



            }





           /*
           ici il y a eu une erreur car on a essayer de  appeler un piece erreur qui est pas dans le tableau
           donc on a depasse notre limite donc on ajoute à usage pour passer à la diagonal suivante et on remait
           tout à 0 et voila


            */


            if (usage < 5) {

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

    private boolean KingEscape(int Ax, int Ay) {









        return false;
    }


    public void Same_color_Execute(int Ax, int Ay, int x, int y, int usage, int color, int tour, int piece,int tour_echec,FonctionDeFonction fonction){

        if (ECHEC && piece != 1 && !Piece_Allier_Echec) {


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

            Piece_Allier_Echec = true;

            tour = 0;



            piece = Graphic.grilleEchecs[x][y];

            //ici on dit que la piece et  notre piece allier qui peut nous sauver
            //car elle peut aller sur le trajet de lehec ce que on souhait





            fonction.apply(x, y, x, y, usage, color, tour, piece, tour_echec);

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

                fonction.apply(x, y, x, y, usage, color, tour, piece, tour_echec);

                // 1 c'est balnc et 0 c'est noir


                System.out.println("On tombe sur une piece allier ");


                Graphic.buttons[x][y].setStyle("-fx-background-color: red;");

            }else{

                System.out.println("Un probléme est survenu ");

            }

        }



    }

    public void DoubleEchecDetected( int Ax, int Ay, int x, int y, int usage, int color, int tour, int piece,int tour_echec,FonctionDeFonction fonction){




        usage += 1;
        //la va falloir ajouter 1 à usage car dans le sens colone du bas ça peut pas marcher c'est
        //pas posible car le truc est clouer et mettre les ancienne coordonée du rois


        if(color == 1) {

            fonction.apply(SPiece_echecs_x, SPiece_echecs_y, SPiece_echecs_x, SPiece_echecs_y, usage, color, tour, 1, 0);
        }else{
            fonction.apply(SPiece_echecs_x, SPiece_echecs_y, SPiece_echecs_x, SPiece_echecs_y, usage, color, tour, -1, 0);



        }





    }







    public void FirstCheck(int Ax, int Ay, int x, int y, int usage, int color, int tour, int piece,int tour_echec,FonctionDeFonction fonction,String type){



        Piece_echecs_x = x;
        Piece_echecs_y = y;

        x = Ax;
        y= Ay;



        //le fait de faire ça sauvegarde l'été



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



            CoupEchecKing.add("" + Ax + "," + Ay + "");





            //ajouter dans un liste en fesant une boucle la ou passe l'échec du rois
            //grace à ça on pourras voir si on peut interposer un piece entre les deux





            Graphic.buttons[Ax][Ay].setStyle("-fx-background-color: green;");




            //pour gérer les opération c'est a dire si c'est coter du bas o fait ax +1 si c'est du heaut ax -1
            //on utilise les usage pour déterminer cela


            switch (type) {

                case "COLONE":


                switch (usage) {
                    case 1:
                        Ax += 1;
                        break;
                    case 2:
                        Ax -= 1;
                        break;
                    case 3:
                        Ay += 1;
                        break;

                    case 4:

                        Ay -= 1;
                        break;


                    default:

                        break;

                }
                ///////////////////////////////

                break;


                case "DIAGONALE":


                    switch (usage) {
                        case 1:
                            Ax += 1;
                            Ay +=1;
                            break;
                        case 2:
                            Ax -= 1;
                            Ay -= 1;
                            break;

                        case 3:
                            Ay += 1;
                            Ax -= 1;
                            break;

                        case 4:

                            Ay -= 1;
                            Ax += 1;
                            break;


                        default:

                            break;

                    }

                    break;










                default:

                    break;

            }





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
Ax = x;
Ay = y;

//c'est pour remettre en etat origine que j'ai fait ça pour pouvoirs modifier
        //et mettre en coleur ce qui traverse lechec avec Ax et Ay qui sont les coordonée du rois

        //j'aurait pu utiliser x ou y mais jsp si elles sont été modifier ce code est trop une usine à gaz


        fonction.apply(Ax, Ay, Ax, Ay, usage, color, tour, piece, tour_echec);
                        /*


                        partie teste j'ai remplacer tour par tour_eche car y a une verif en bas qui peut faiure merder
                         */


        // la ici  on est en échec  donc on rapel le meme truc pour voir si on peut sinterposer











}







}
