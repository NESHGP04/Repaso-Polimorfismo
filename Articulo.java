public class Articulo extends Tipo {
    private String arbitro;

    //Constructor
    public Articulo(String solicitud, String devolucion, String id,  String titulo, String materia, int cant, String arbitro){
        super(solicitud, devolucion, id, titulo, materia, cant);
        this.arbitro = arbitro;
    }
    
    //Getter
    public String getArbitro(){
        return this.arbitro;
    }

    //Setter
    public void setArbitro (String arbitro){
        this.arbitro=arbitro;
    }
}
