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
        "\t[2] - Agregar a lista de publicaciones\n" +
        "\t[3] - Préstamos \n"+
        "\t[4] - Devoluciones "+
        "\t[4] - Información de los libros \n"+
        "\t[5] - Información de revistas \n> " + 
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
            ArrayList<Tipo> tipoList = new ArrayList<Tipo>();

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

                    clienteList.toString();
                    System.out.println("\nCliente agregado con éxito! ");
                    break;

                case 2: 
                    System.out.println("\n==Agregar==");
        
                    System.out.println("\nIngrese la opción que desea agregar: \n1.Libro \n2.Artículo \n3.Revista \n4.Regresar"); //ver como regresar
                    int opcAgregar = sc.nextInt();

                    switch(opcAgregar){
                        case 1:
                        System.out.println("\n<<Libros>>");

                        //Ingresa info de libros
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
                        // System.out.println("\nIngrese la fecha que se devolverá del libro: ");
                        // String devolucionLibro = sc.nextLine();

                        //Crea lista de tipos con Libro
                        tipoList.add(new Libro(idLibro, tituloLibro, materialibro, cantLibro, autorLibro, editorialLibro));

                            //REVISAR
                        boolean disponibleLib = tipoList.contains(idLibro);
                        if(disponibleLib){
                            System.out.println("Ya se encuentra en existencia, volver a intentar");
                        } else{
                            System.out.println("Libro agregado con éxito");
                        }

                        // int indice = tipoList.indexOf(idLibro);
                        // if(indice != -1){
                        //     System.out.println("Ya se encuentra en existencia, volver a intentar");
                        // }else{
                        //      System.out.println("Libro agregado con éxito");
                        //  }
                        break;

                        case 2:
                        System.out.println("\n<<Artículos>>");

                        //Ingresa info de artículos
                        System.out.println("\nIngrese el ID del artículo: ");
                        String idArt = sc.nextLine();
                        System.out.println("\nIngrese el Título del artículo: ");
                        String tituloArt = sc.nextLine();
                        System.out.println("\nIngrese la materia del artículo: ");
                        String materiaArt = sc.nextLine();
                        System.out.println("\nIngrese la cantidad de ejemplares del artículo: ");
                        int cantArt = sc.nextInt();
                        System.out.println("\nIngrese el árbitro del artículo: ");
                        String arbitroArt = sc.nextLine();

                        //Crea lista de tipo con Articulo
                        tipoList.add(new Articulo(idArt, tituloArt, materiaArt, cantArt, arbitroArt));

                         //REVISAR
                        boolean disponibleArt = tipoList.contains(idArt);
                        if(disponibleArt){
                            System.out.println("Ya se encuentra en existencia, volver a intentar");
                        } else{
                            System.out.println("Libro agregado con éxito");
                        }
                        break;

                        case 3:
                        System.out.println("\n<<Revistas>>");

                        //Ingresa info de artículos
                        System.out.println("\nIngrese el ID de la revista: ");
                        String idRev = sc.nextLine();
                        System.out.println("\nIngrese el Título de la revista: ");
                        String tituloRev = sc.nextLine();
                        System.out.println("\nIngrese la materia de la revista: ");
                        String materiaRev = sc.nextLine();
                        System.out.println("\nIngrese la cantidad de ejemplares de la revista: ");
                        int cantRev = sc.nextInt();
                        System.out.println("\nIngrese el año de la revista: ");
                        String yearRev = sc.nextLine();
                        System.out.println("\nIngrese el número de la revista: ");
                        int numRev = sc.nextInt();

                        //Crea lista de tipo con Articulo
                        tipoList.add(new Revista(idRev, tituloRev, materiaRev, cantRev, yearRev, numRev));

                         //REVISAR
                        boolean disponibleRev = tipoList.contains(idRev);
                        if(disponibleRev){
                            System.out.println("Ya se encuentra en existencia, volver a intentar");
                        } else{
                            System.out.println("Libro agregado con éxito");
                        }
                        break;

                        case 4:
                        System.out.println("Regresar...");
                    }
                    break;
                case 3: 
                System.out.println("\n==Préstamos==");  

                System.out.println("\nIngrese la fecha de hoy: ");
                String fecha = sc.nextLine();  

                for(int i=0; i<=5; i++){
                    System.out.println("\nIngrese el ID del documento que desea: ");
                    String idPrestamo = sc.nextLine(); 

                    boolean buscar = tipoList.contains(idPrestamo);
                        if(buscar){
                            System.out.println("Si está en existencia! Puede adquirirlo");
                            //Agregar prestamo al usuario
                            //Prestamos p1 = new Prestamos (fecha, idPrestamo);

                        } else{
                            System.out.println("No se encuentra en el sistema, favor buscar otro.");
                        }
                        
                    System.out.println("\n¿Desea adquirir otro documento? \n1.Si \n2.No: ");
                    int opt = sc.nextInt();

                    if(opt == 1){
                        continue;
                    } if (opt == 2) {
                        System.out.println("Regresar a menú...");
                        break; //Ver como regresar sin break
                    } else {
                        System.out.println("Ingrese una opción correcta");
                    }
                }
                break;

            }
            sc.close();
        }
        
    }