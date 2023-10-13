/* Ejercicio Polimorfismo
 * Marinés García 23391
 * CLASS
 */

public class Cliente {
    protected String nombre;
    protected String idCliente;
    protected String direccion;
    protected int prestamos;

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

    //Préstamos
    public int solicitarPrestamo(){
        return ++this.prestamos;
    }

    //public boolean solicitarPrestamo (Libro l, Banco b) {
        // if (!l.isDisponible())
        // {
            //            System.out.println("\nEl libro no está disponible.");
            //            System.out.print("¿Desea realizar un préstamo? [S/N]: ");
            //            char respuesta = teclado.next().charAt(0);
            //            while (!(respuesta == 's' || respuesta == 'S'))
            //            {
                //                System.err.println("[ERROR] Respuesta inválida");
                //                    System.out.print("Respuesta: S/N: ");
                //                        respuesta = teclado.next().charAt(0);
                //                            }
                //                                System.out.println();
                //                                    if ((respuesta=='s')||(respuesta=='S')){
                    //                                        try{
                        //                                                    LibrosDAO librosdao = new LibrosDAOImpl();
                        //                                                    Prestamo p = new Prestamo(this,b,"",l);
                        //                                            b.agregarClienteConPrestamo(this);
                        //                                            System.out.println("\nSe ha agregado el cliente con éxito.");
                        //                                            System.out.println("\nSe ha agregado el cliente con éxito.");
                        //                                            l.setDisponibilidad(false);
                        //                                                    ++prestamos;
                        //                                                        System.out.println("Se ha realizado el préstamo del libro " + l.getTitulo() +" al cliente "+
                        //                                                    System.out.println("\n¡Gracias por tu preferencia!");
                        //                                                                System.out.printf("%d clientes con %d préstamos\n",b.getClientesConPrestamo(),prestamos
                        //                                                        System.out.println("\nSe ha concedido el préstamo correctamente.");
                        //                                                                }catch(Exception e){}
                        //                                                    System.out.printf("Se le ha concedido el préstamo al cliente %s.\n",
                        //                                                                return true;}catch(Exception e){}
                        //                                                        return true;}
                        //                                        catch(Exception e){System.err.println("Error al agregar el cliente con préstamo:"

}
