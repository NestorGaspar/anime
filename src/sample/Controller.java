package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Controller {

    @FXML
    Tarea t1, t2, t3, t4, t5, t6;

    @FXML
    RadioButton rB1, rB2, rB3, rB4, rB5, rB6;

    @FXML
    ImageView sT1, sT2, sT3, sT4, sT5, sT6;

    @FXML
    Label l1, l2, l3, l4, l5, l6;

    @FXML
    Label lAgregar;

    @FXML
    TextField tfAgregar;


    ArrayList<Label> lstLabel = new ArrayList();
    ArrayList<Tarea> lstTarea = new ArrayList();
    ArrayList<ImageView> lstImage = new ArrayList();

    final ToggleGroup group = new ToggleGroup();

    @FXML
    public void initialize(){

        t1 = new Tarea("Hacer Práctica 2 PSP", false);
        t2 = new Tarea("Hacer Práctica 1 PSP", false);
        t3 = new Tarea("Hacer Práctica 2 DI", false);
        t4 = new Tarea("Hacer Práctica 1 DI", false);
        t5 = new Tarea("Hacer Práctica 2 PMDP", false);
        t6 = new Tarea("Hacer Práctica 1 PMDP", false);

        rB1.setToggleGroup(group);
        rB2.setToggleGroup(group);
        rB3.setToggleGroup(group);
        rB4.setToggleGroup(group);
        rB5.setToggleGroup(group);
        rB6.setToggleGroup(group);

        lstLabel.add(l1);
        lstLabel.add(l2);
        lstLabel.add(l3);
        lstLabel.add(l4);
        lstLabel.add(l5);
        lstLabel.add(l6);

        lstTarea.add(t1);
        lstTarea.add(t2);
        lstTarea.add(t3);
        lstTarea.add(t4);
        lstTarea.add(t5);
        lstTarea.add(t6);

        lstImage.add(sT1);
        lstImage.add(sT2);
        lstImage.add(sT3);
        lstImage.add(sT4);
        lstImage.add(sT5);
        lstImage.add(sT6);

        Binder.binderTarea(t1, l1, sT1);
        Binder.binderTarea(t2, l2, sT2);
        Binder.binderTarea(t3, l3, sT3);
        Binder.binderTarea(t4, l4, sT4);
        Binder.binderTarea(t5, l5, sT5);
        Binder.binderTarea(t6, l6, sT6);

    }

    @FXML
    public void rBMouseClick1() {
        t1.texto="";
        Binder.binderTarea(t1, l1, sT1);
        lAgregar.setDisable(false);
        ActivacionDeAñadicionDeTarea();

    }

    @FXML
    public void rBMouseClick2() {
        t2.texto="";
        Binder.binderTarea(t2, l2, sT2);
        lAgregar.setDisable(false);
        ActivacionDeAñadicionDeTarea();
    }

    @FXML
    public void rBMouseClick3() {
        t3.texto="";
        Binder.binderTarea(t3, l3, sT3);
        lAgregar.setDisable(false);
        ActivacionDeAñadicionDeTarea();
    }

    @FXML
    public void rBMouseClick4() {
        t4.texto="";
        Binder.binderTarea(t4, l4, sT4);
        lAgregar.setDisable(false);

        ActivacionDeAñadicionDeTarea();
    }

    @FXML
    public void rBMouseClick5() {
        t5.texto="";
        Binder.binderTarea(t5, l5, sT5);
        lAgregar.setDisable(false);
        ActivacionDeAñadicionDeTarea();
    }

    @FXML
    public void rBMouseClick6() {
        t6.texto="";
        Binder.binderTarea(t6, l6, sT6);
        lAgregar.setDisable(false);
        ActivacionDeAñadicionDeTarea();
    }

    @FXML
    public void sTMouseClick1(){
        t1.esFavorito = !t1.esFavorito;
        Binder.binderTarea(t1, l1, sT1);
    }
    @FXML
    public void sTMouseClick2(){
        t2.esFavorito = !t2.esFavorito;
        Binder.binderTarea(t2, l2, sT2);
    }

    @FXML
    public void sTMouseClick3(){
        t3.esFavorito = !t3.esFavorito;
        Binder.binderTarea(t3, l3, sT3);
    }

    @FXML
    public void sTMouseClick4(){
        t4.esFavorito = !t4.esFavorito;
        Binder.binderTarea(t4, l4, sT4);
    }
    @FXML
    public void sTMouseClick5(){
        t5.esFavorito = !t5.esFavorito;
        Binder.binderTarea(t5, l5, sT5);
    }

    @FXML
    public void sTMouseClick6(){
        t6.esFavorito = !t6.esFavorito;
        Binder.binderTarea(t6, l6, sT6);
    }

    public void ActivacionDeAñadicionDeTarea() {
        if (!lAgregar.isDisabled()) {
            tfAgregar.setDisable(false);
        }
    }

    public void AñadicionDeTarea() {
        for (Label l : lstLabel) {
            if (l.getText().contentEquals("")) {
                l.setText(tfAgregar.getText());
                break;
            }
        }
        tfAgregar.setDisable(false);
        tfAgregar.setText("");

    }

}

