package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller2 {

    public void initialize(){
    }

    @FXML
    Label label1, label2;

    @FXML
    TextArea textArea1;

    @FXML
    TextField textField1;

    public void recibirTarea(Tarea tarea){

        textField1.setText(tarea.texto);
        label1.setText(tarea.creacion);

    }

    public void cambioDeNombre(){

        Long tiempoReal = System.currentTimeMillis();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoReal);
        String tiempo =formatoFecha.format(fecha);
        label2.setText(""+tiempo);

    }

    public void cambioDeDetalles(){

        Long tiempoReal = System.currentTimeMillis();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoReal);
        String tiempo =formatoFecha.format(fecha);
        label2.setText(""+tiempo);

    }

}
