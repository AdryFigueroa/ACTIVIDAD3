package entradas1;

import java.util.Scanner;

public class AppEntradas {

	private static int entradasDisponibles = 30;
    private static int entradasVendidas = 0;
    private static float cantidadRecaudada = 0;
    private static int opcion;

    public final static int OPCION_MENU_ENTRADAS_DISPONIBLES = 1;
    public final static int OPCION_MENU_COMPRAR_ENTRADAS = 2;
    public final static int OPCION_MENU_ENTRADAS_VENDIDAS = 3;
    public final static int OPCION_MENU_CANTIDAD_RECAUDADA = 4;
    public final static int OPCION_MENU_SALIR = 5;


    public static void main(String[] args) {
            
    do {
            opcion = menu();
                    switch (opcion) {
                    case OPCION_MENU_ENTRADAS_DISPONIBLES:
                            entradasDisponibles();
                            break ;
                    case OPCION_MENU_COMPRAR_ENTRADAS :
                            comprarEntradas();
                            break;         
                    case OPCION_MENU_ENTRADAS_VENDIDAS:
                            entradasVendidas();
                            break;         
                    case OPCION_MENU_CANTIDAD_RECAUDADA:
                            verCantidadRecaudada();
                            break;
                    
                    } 
                                            
            }while (opcion != OPCION_MENU_SALIR);
            
    }

    private static int menu() {
            
    Scanner sc = new Scanner(System.in);
    
    System.out.println("------\n MENU EVENTO \n------" );
    System.out.println("[1.] ENTRADAS DISPONIBLES ");
    System.out.println("[2.] COMPRAR ENTRADAS ");
    System.out.println("[3.] ENTRADAS VENDIDAS");
    System.out.println("[4.] CANTIDAD RECAUDADA");
    System.out.println("[5.] SALIR ");
    System.out.println("\n******************************\n");
    System.out.println("[Elija la opción]");
    
    int opcion = sc.nextInt();
    
    return opcion;
    
    }

    public static void verCantidadRecaudada() {
        System.out.println("Cantidad Recaudada : " + cantidadRecaudada );
    }

    public static void entradasVendidas() {
            System.out.println("Entradas Vendidas : " + entradasVendidas + " Entradas");
    }

    public static void entradasDisponibles() {
            System.out.println("Entradas Disponibles: " + entradasDisponibles + " Entradas disponibles");
    }

    public static void comprarEntradas() {
            
            Scanner sc = new Scanner(System.in);
                    
            float precio = 5000;
                    
                    if (entradasDisponibles == 0) {
                            System.out.println("NO HAY ENTRADAS DISPONIBLES");
                    } else {
                            System.out.println("Indique la cantidad de entradas: ");
                            int cantidadEntradas = sc.nextInt();
                            if (cantidadEntradas > entradasDisponibles) {
                                    System.out.println("ENTRADAS DISPONIBLES");
                            } else {
                                            precio = (precio * cantidadEntradas);
                                            System.out.println("VENTA REALIZADA. PRECIO FINAL: " + precio);
                                    }
                                    entradasDisponibles = entradasDisponibles - cantidadEntradas;
                                    entradasVendidas = entradasVendidas + cantidadEntradas;
                                    cantidadRecaudada = precio * entradasVendidas; // CORRECCION SOLICITADA EN REVISION
                                    
                                    System.out.println("QUEDAN " + entradasDisponibles + " entradas.");
                                    
                            }
            
                    }

}
