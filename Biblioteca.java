/* Ejercicio Polimorfismo
 * Marinés García 23391
 * MAIN
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca{

    public static void Menu(){
        System.out.println("<<<BIENVENIDO A LA BIBLIOTECA VIRTUAL>>>");
        System.out.print("\n\t[1] - Agregar cliente nuevo\n" +
        "\t[2] - Agregar libro, artículo o revista\n" +
        "\t[3] - Buscar un libro, artículo o revista \n"+
        "\t[4] - Ver lista de libros \n"+
        "\t[5] - Cantidad de documentos \n> " + 
        "\t[6] - Salir \n");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while(!salir){}

            Menu();
            System.out.println("\nIngrese la opción que desea: ");
            int opc = sc.nextInt();
            System.out.println();

            switch(opc){
                case 1:
                    //Datos clientes
                    System.out.println("\nIngrese su nombre: ");
                    String name = sc.nextLine();
                    System.out.println("\nIngrese su ID: ");
                    String idClient = sc.nextLine();
                    System.out.println("\nIngrese su dirección: ");
                    String direction = sc.nextLine();

                    //Crea lista de clientes
                    ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
                    clienteList.add(new Cliente(name, idClient, direction));

                    System.out.println("\nCliente agregado con éxito! ");
                    break;

                case 2: 
                    System.out.println("\n==Agregar==");
                    System.out.println("\nIngrese la fecha de hoy: ");
                    String fecha = sc.nextLine();
                    System.out.println("\nIngrese la opción que desea: \n1.Libro \n2.Artículo \n3.Revista");
                    int opcAgregar = sc.nextInt();

                    switch(opcAgregar){
                        case 1:
                        System.out.println("\n<<Libros>>");

                        System.out.println("\nIngrese el ID del libro: ");
                        String idLibro = sc.nextLine();
                        System.out.println("\nIngrese el Título del libro: ");
                        String tituloLibro = sc.nextLine();
                        System.out.println("\nIngrese la materia del libro: ");
                        String materialibro = sc.nextLine();
                        System.out.println("\nIngrese la cantidad de ejemplares del libro: ");
                        int cantLibro = sc.nextInt();
                        System.out.println("\nIngrese el autor del libro: ");
                        String autorLibro = sc.nextLine();
                        System.out.println("\nIngrese la editorial del libro: ");
                        String editorialLibro = sc.nextLine();
                        System.out.println("\nIngrese la fecha que se devolverá del libro: ");
                        String devolucionLibro = sc.nextLine();

                        //Crea lista de libros
                        ArrayList<Tipo> tipoList = new ArrayList<Tipo>();
                        tipoList.add(new Libro(fecha, devolucionLibro, idLibro, tituloLibro, materialibro, cantLibro, autorLibro, editorialLibro));

                        boolean disponible = tipoList.contains(idLibro);
                        if(disponible){
                            System.out.println("Ya se encuentra en existencia, volver a intentar");
                        } else{
                            System.out.println("Libro agregado con éxito");
                        }
                        
                        // for(Tipo profilo : tipoList){
                        //     if(profilo.getTitulo().equals(tituloLibro) && profilo.getId().equals(idLibro)){
                        //         System.out.print("Este libro ya existe!");
                        //         disponible = false; //creo q no tiene ningún efecto
                        //     } else{
                        //         System.out.println("Libro agregado con éxito");
                        //     }
                        // }
                    }
                    break;
            }
            sc.close();
        }
        
    }