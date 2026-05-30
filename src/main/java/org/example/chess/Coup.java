package org.example.chess;

public class Coup {


    public static  int Coup_piece = -1;





    public int GetCoup(){

        WhoPlayed();


//

        return Coup_piece;
    }



    public void SetCoup(int value){

        WhoPlayed();

        Coup_piece = value;




    }
    public static  boolean CanPlay(int piece){
//
        if(piece > 0){

            if(Coup_piece == 1 || Coup_piece == -1){

                return true;
            }else{


                Value.reset("a");
                System.out.println("C'est au NOIR de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au NOIR de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au NOIR de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au NOIR de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au NOIR de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au NOIR de jouer car couppiece est à " + Coup_piece);


            }

        }else{


            if(Coup_piece == 0 ){

                return true;

            }else{

                Value.reset("a");
                System.out.println("C'est au BLANC de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au BLANC de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au BLANC de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au BLANC de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au BLANC de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au BLANC de jouer car couppiece est à " + Coup_piece);
                System.out.println("C'est au BLANC de jouer car couppiece est à " + Coup_piece);


            }



        }





        return false;
    }

    public void WhoPlayed(){




        switch(Coup_piece){
            case 1:
                System.out.println("C'est au blanc  de jouer");

                break;

            case 0:
                System.out.println("C'est au noir de jouer ");
                break;


            case -1:
                System.out.println("Debut de parti");



                break;


            default:

                System.out.println("Un problème est survenue");
                System.out.println("Un problème est survenue");
                System.out.println("Un problème est survenue");
                System.out.println("Un problème est survenue");

                break;



        }

    }












}
