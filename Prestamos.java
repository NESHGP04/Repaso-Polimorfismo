/* Ejercicio Polimorfismo
 * Marinés García 23391
 * HIJO Cliente
 */

public class Prestamos extends Cliente{

    private String idPrestamo;
    private String fechaInicio;
    private String fechaFin;

    //Constructor
    public Prestamos(String nombre, String idCliente, String direccion, String idPrestamo, String fechaInicio, String fechaFin){
        super(nombre, idCliente, direccion);
        this.idPrestamo = idPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    //Getters
    public String getIdPrestamo(){
        return this.idPrestamo;
    }

    public String getFechaInicio(){
        return this.fechaInicio;
    }

    public String getFechaFin(){
        return this.fechaFin;
    }

    //Setters
    public void setIdPrestamo (String idPrestamo){
        this.idPrestamo=idPrestamo;
    }

    public void setFechaInicio (String fechaInicio){
        this.fechaInicio=fechaInicio;
    }

    public void setFechaFin(String fechaFin){
        this.fechaFin=fechaFin;
    }

    
}
