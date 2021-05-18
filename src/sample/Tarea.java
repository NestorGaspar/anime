
package sample;

public class Tarea {
    public boolean esFavorito;
    public String texto;
    public String creacion;
    public String modificacion;
    public String detalles;

    public Tarea (String texto, boolean esFavorito, String creacion, String modificacion, String detalles){
        this.texto = texto;
        this.esFavorito = esFavorito;
        this.creacion = creacion;
        this.detalles = detalles;
        this.modificacion = modificacion;
    }

}