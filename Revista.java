public class Revista extends Tipo {
    private String year;
    private int numero;

    //Constructor
    public Revista(String solicitud, String devolucion, String id,  String titulo, String materia, int cant,String year, int numero){
        super(solicitud, devolucion, id, titulo, materia, cant);
        this.year = year;
        this.numero = numero;
    }
    
    //Getter
    public String getYear(){
        return this.year;
    }

    public int getNumero(){
        return this.numero;
    }

    //Setter
    public void setArbitro (String year){
        this.year=year;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }
}
