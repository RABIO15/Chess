package org.example.chess;

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




}
