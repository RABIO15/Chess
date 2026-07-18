package org.example.chess;

public enum Direction {


    /*

            Coter TOUR GAUCHE DROITE HAUT BAS
     */
        UP,
        DOWN,
        LEFT,
        RIGHT,

    /*

    COTER FOU DIAGANAL HAUT DROIT etc...

     */

        DIAG_UP_LEFT,
        DIAG_UP_RIGHT,
        DIAG_DOWN_LEFT,
        DIAG_DOWN_RIGHT,


    /*

    COTER CAVALIER


     */

        KNIGHT_UP_LEFT,
        KNIGHT_UP_RIGHT,
        KNIGHT_DOWN_LEFT,
        KNIGHT_DOWN_RIGHT


}
