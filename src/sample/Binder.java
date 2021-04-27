package sample;

import java.io.File;
import javafx.scene.control.Label;
import  javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Binder {

    private static final File estrellaAnime = new File("src/Imagenes/img_4.png");
    private static final Image estrellaAnime2 = new Image(estrellaAnime.toURI().toString());

    private static final File estrellaNoAnime = new File("src/Imagenes/img_3.png");
    private static final Image estrellaNoAnime2 = new Image(estrellaNoAnime.toURI().toString());

    public static void binderTarea(Tarea tarea, Label l, ImageView estrella){

        if (tarea.esFavorito){
            estrella.setImage(estrellaAnime2);
        } else {
            estrella.setImage(Binder.estrellaNoAnime2);
        }
        l.setText(tarea.texto);
    }

}