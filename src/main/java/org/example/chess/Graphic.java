package org.example.chess;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.*;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class Graphic extends Application {


  public static Button[][] buttons = new Button[8][8];






    private static final int TAILLE_CASE = 75;

    // PIÈCES BLANCHES
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



    private Map<Integer, Image> imagesPieces = new HashMap<>();



    public static int[][] grilleEchecs = {
            {-5, -4, -3, -2, -1, -3, -4, -5},
            {-6, -6, -6, -6, -6, -6, -6, -6},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {6, 6, 6, 6, 6, 6, 6, 6},
            {5, 4, 3, 2, 1, 3, 4, 5}
    };

    @Override
    public void start(Stage primaryStage) {

        chargerImages();

        GridPane gridPane = new GridPane();

        Value v = new Value();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {


                Button button = new Button();

                button.setMinSize(TAILLE_CASE, TAILLE_CASE);
                button.setMaxSize(TAILLE_CASE, TAILLE_CASE);
                button.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);

                buttons[i][j] = button;

                int ligne = i;
                int colonne = j;


                System.out.println("la ligne debut est " + ligne + "est la colone est " + colonne );




                button.setOnAction(e -> v.coordonnees(ligne, colonne));

                //ici on mais les coordonée du bouton que on a selection et on appel la fonction coordonée

                int idPiece = grilleEchecs[i][j];

                if (idPiece != 0) {
                    button.setGraphic(creerImagePiece(idPiece));
                }

                if ((i + j) % 2 == 0) {
                    button.setStyle("-fx-background-color: #F0D9B5; -fx-padding: 0;");
                } else {
                    button.setStyle("-fx-background-color: #B58863; -fx-padding: 0;");
                }

                gridPane.add(button, j, i);
            }
        }

        Scene scene = new Scene(gridPane, 600, 600);
        primaryStage.setTitle("Jeu d'échecs");
        primaryStage.setScene(scene);
        primaryStage.show();
    }






    private void chargerImages() {

        imagesPieces.put(PION, new Image(getClass().getResource("/images/pionblanc.png").toExternalForm()));
        imagesPieces.put(CAVALIER, new Image(getClass().getResource("/images/cavalier.png").toExternalForm()));
        imagesPieces.put(FOU, new Image(getClass().getResource("/images/foublanc.png").toExternalForm()));
        imagesPieces.put(TOUR, new Image(getClass().getResource("/images/tourblanche.png").toExternalForm()));
        imagesPieces.put(REINE, new Image(getClass().getResource("/images/dameblanche.png").toExternalForm()));
        imagesPieces.put(ROI, new Image(getClass().getResource("/images/roisblanc.png").toExternalForm()));

        imagesPieces.put(PIONNOIR, new Image(getClass().getResource("/images/pionnoir.png").toExternalForm()));
        imagesPieces.put(CAVALIERNOIR, new Image(getClass().getResource("/images/cavaliernoir.png").toExternalForm()));
        imagesPieces.put(FOUNOIR, new Image(getClass().getResource("/images/founoir.png").toExternalForm()));
        imagesPieces.put(TOURNOIR, new Image(getClass().getResource("/images/tournoir.png").toExternalForm()));
        imagesPieces.put(REINENOIR, new Image(getClass().getResource("/images/damenoir.png").toExternalForm()));
        imagesPieces.put(ROINOIR, new Image(getClass().getResource("/images/roinoir.png").toExternalForm()));
    }

    public ImageView creerImagePiece(int idPiece) {

        Image img = imagesPieces.get(idPiece);
        if (img == null) return null;

        ImageView imageView = new ImageView(img);
        imageView.setFitWidth(TAILLE_CASE - 5);
        imageView.setFitHeight(TAILLE_CASE - 5);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);

        return imageView;
    }








    public static void main(String[] args) {
        launch();
    }







}
