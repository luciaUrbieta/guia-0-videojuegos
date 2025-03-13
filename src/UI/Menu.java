package UI;

import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public static void ejecutarMenu(){

        char seleccion='0';

        do{
            seleccion = mostrarOpciones();
            switch(seleccion){
                case '1':

                    break;
                case '2':

                    break;
                case '3':

                    break;
                case '4':

                    break;
                case '5':

                    break;
                case '6':

                    break;
                case '7':

                    break;
                case '8':

                    break;
                case '9':
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
        }while(seleccion!=9);

    }

    public static char mostrarOpciones(){

        char seleccion='0';

        System.out.println("Bienvenido al menu principal.\n");
        System.out.println("1. Presione 1 para añadir un juego\n");
        System.out.println("2. Presione 2 para añadir una expansion\n");
        System.out.println("3. Presione 3 para eliminar un juego \n");
        System.out.println("4. Presione 4 para eliminar una expansión \n");
        System.out.println("5. Presione 5 para mostrar todos los items\n");
        System.out.println("6. Presione 6 para filtrar por genero \n");
        System.out.println("7. Presione 7 para modificar un juego \n");
        System.out.println("8. Presione 8 para modificar una expansión \n");
        System.out.println("9. Presione 9 para salir\n");
        seleccion = scanner.next().charAt(0);

        return seleccion;
    }

}
