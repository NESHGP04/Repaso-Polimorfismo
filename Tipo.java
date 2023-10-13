/* Ejercicio Polimorfismo
 * Marinés García 23391
 * CLASS padre
 */

public class Tipo {

    protected String solicitud;
    protected String devolucion;
    protected String id;
    protected String titulo;
    protected String materia;
    protected int cant;
    protected boolean estado;

    //Constructor
    // public Tipo(String solicitud, String devolucion, String id, String materia, int cant, boolean estado) {
    //     this.solicitud = solicitud;
    //     this.devolucion= devolucion;
    //     this.id = id;
    //     this.materia = materia;
    //     this.cant = cant;
    //     this.estado = estado;
    // }

    public Tipo( String id, String titulo, String materia, int cant) {
        this.id = id;
        this.titulo = titulo;
        this.materia = materia;
        this.cant = cant;
    }

    //Getters
    public String getSolicitud(){
        return this.solicitud;
    }

    public String getDevolucion(){
        return this.devolucion;
    }

    public String getId(){
        return this.id;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getMateria(){
        return this.materia;
    }

    public int getCant(){
        return this.cant;
    }

    public boolean getEstado(){
        return this.estado;
    }

    //Setters
    public void setSolicitud(String solicitud){
        this.solicitud=solicitud;
    }

    public void setDevolucion(String devolucion){
        this.devolucion=devolucion;
    }

    public void setId(String id){
        this.id=id;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setMateria(String materia){
        this.materia=materia;
    }

    public void setCant(int cant){
        this.cant=cant;
    }

    public void setEstado(boolean estado){
        this.estado=estado;
    }

    public String toString(){
        return this.titulo + ": " + this.id + " (Materia: " + this.materia + ") está: " + this.estado;
    }
}
