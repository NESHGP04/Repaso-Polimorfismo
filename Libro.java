/* Ejercicio Polimorfismo
 * Marinés García 23391
 * CLASS hijo
 */

public class Libro extends Tipo {
    protected String autor;
    protected String editorial;

    //Constructor
    // public Libro(String solicitud, String devolucion, String id,  String titulo, String materia, int cant, String autor, String editorial){
    //     super(solicitud, devolucion, id, titulo, materia, cant);
    //     this.autor = autor;
    //     this.editorial = editorial;
    // }
    public Libro(String id,  String titulo, String materia, int cant, String autor, String editorial){
        super(id, titulo, materia, cant);
        this.autor = autor;
        this.editorial = editorial;
    }

    //Getters
    public String getAutor(){
        return this.autor;
    }

    public String getEditorial(){
        return this.editorial;
    }

    //Setters
    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setEditorial(String editorial){
        this.editorial=editorial;
    }
}
