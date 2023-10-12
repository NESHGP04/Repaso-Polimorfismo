/* Ejercicio Polimorfismo
 * Marinés García 23391
 * CLASS
 */

public class Cliente {
    private String nombre;
    private String idCliente;
    private String direccion;
    private int prestamos;

    //Constructor
    // public Cliente(String nombre, String idCliente, String direccion, int prestamos){
    //     this.nombre = nombre;
    //     this.idCliente = idCliente;
    //     this.direccion = direccion;
    //     this.prestamos = prestamos;
    // }

    public Cliente(String nombre, String idCliente, String direccion){
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.direccion = direccion;
    }

    //Getters
    public String getIdCliente(){
        return this.idCliente;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public int getPrestamos(){
        return this.prestamos;
    }

    public String toString(){
        return nombre + ": ID(" + this.idCliente + "), Dirección(" + this.direccion + ").";
    }

    //Setters
    public void setIdCliente(String idCliente){
        this.idCliente=idCliente;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public void setPrestamos(int prestamos){
        this.prestamos=prestamos;
    }
}
