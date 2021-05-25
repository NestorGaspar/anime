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

    Tarea aux;

    @FXML
    Label label1, label2;

    @FXML
    TextArea textArea1;

    @FXML
    TextField textField1;

    public void recibirTarea(Tarea tarea){

        textField1.setText(tarea.texto);
        label1.setText(tarea.creacion);
        aux = tarea;
    }

    public void cambioDeNombre(){

        Long tiempoM = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoM);
        String tiempo =formatoF.format(fecha);
        label2.setText(""+tiempo);
        label2.setVisible(!textField1.getText().equals(aux.texto));

    }

    public void cambioDeDetalles(){

        Long tiempoM = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoM);
        String tiempo =formatoF.format(fecha);
        label2.setText(""+tiempo);
        label2.setVisible(!textArea1.getText().equals(aux.detalles));

    }

}
