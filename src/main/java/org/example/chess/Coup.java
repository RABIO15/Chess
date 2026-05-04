package org.example.chess;

public class Coup {


    public static  int Coup_piece = -1;


    public Coup(int Coup_piece){


        Coup.Coup_piece = Coup_piece;
    }


    public int GetCoup(){
        WhoPlayed();


//

        return Coup_piece;
    }



    public void SetCoup(int value){
        WhoPlayed();

        Coup_piece = value;




    }

    public void WhoPlayed(){




        switch(Coup_piece){
            case 1:
                System.out.println("C'est au balnc de jouer");

                break;

            case 0:
                System.out.println("C'est au noir de jouer ");
                break;


            case -1:
                System.out.println("Debut de parti");

                break;



        }

    }












}
