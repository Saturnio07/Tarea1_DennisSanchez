package tarea1_dennissanchez;

import javax.swing.JOptionPane;


public class Tarea1_DennisSanchez {

    
    public static void main(String[] args) 
    {
        boolean salir = false;
        
        while (!salir) 
        {
            JOptionPane.showMessageDialog(null, "             ----- MENÚ -----\n" + "1. Invertir cifras\n" + "2.String Letra por Letra\n" + "3.Vector\n" 
                                                                                 + "4.Suma de números\n" + "5.Tablas de multiplicar\n" + "6.Suma de digitos\n" 
                                                                                 + "7.Salir");
            
            try 
            {
                int opcion;
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar: "));
                
                switch (opcion) 
                {
                    case 1:
                        
                        int numero_de_tres_digitos;
                        int numeroInvertido;
                        
                        numero_de_tres_digitos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 100 y 999: "));
                        
                        Recursividad ejem1 = new Recursividad();
                        
                        if (ejem1.validarNumeroDeTresDigitosPublico(numero_de_tres_digitos)) 
                        {
                            numeroInvertido = ejem1.invertirNumeroPublico(numero_de_tres_digitos);
                            JOptionPane.showMessageDialog(null,"Número con cifras invertidas: " + numeroInvertido);
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(null,"El número ingresado no tiene 3 dígitos.");
                        }
                        
                        break;
                        
                    case 2:
                        
                        String cadenaImprimir = JOptionPane.showInputDialog("Ingrese una cadena que desea imprimir: ");
                        
                        Recursividad ejem2 = new Recursividad();
                        
                        ejem2.imprimirLetraPorLetraPublico(cadenaImprimir, 0);
                        
                        System.out.println("-------");
                        
                        break;
                        
                    case 3:  
                        
                        int[] vector;
                        int tamano;

                        Recursividad ejem3 = new Recursividad();

                        tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector: "));

                        vector = new int[tamano];

                        ejem3.llenarVectorPublico(vector, tamano, 0);

                        System.out.println("---------------------------------");
                        System.out.println("Mostrando contenido del vector...");
                        System.out.println("---------------------------------");

                        ejem3.mostrarContenidoVectorPublico(vector, tamano, 0);
                        
                        System.out.println("\n---------------------------------");
                        
                        int valorMayor = ejem3.buscarValorMayorPublico(vector, tamano);
        
                        System.out.println("El valor mayor del vector es: " + valorMayor);
                        
                        break;
                        
                    case 4:
                        
                        int[] vectorSumarNumeros;
                        
                        int tamanno;

                        Recursividad ejem4 = new Recursividad();

                        tamanno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector: "));

                        vectorSumarNumeros = new int[tamanno];

                        ejem4.llenarVectorNumerosPublico(vectorSumarNumeros, tamanno, 0);

                        int sumaTotalNumeros = ejem4.sumarNumeros(vectorSumarNumeros, tamanno);
                        
                        System.out.println("Los numeros son: ");
                        
                        ejem4.mostrarContenidoNumerosPublico(vectorSumarNumeros, tamanno, 0);
                        
                        System.out.println("\n---------------------------------");
                        
                        System.out.println("La suma de los numeros es: " + sumaTotalNumeros);
                        
                        System.out.println("---------------------------------");
                        
                        break;
                        
                    case 5:
                        
                        int tabla;
                        int limite = 10;
                        
                        tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de las tablas que quiere visualizar: "));
                        
                        Recursividad ejem5 = new Recursividad();
                        
                        System.out.println("---------------------------------");
                        
                        System.out.println("Tablas de multiplicar de: " + tabla);
                        
                        System.out.println("---------------------------------");
                        
                        ejem5.tablasDeMultiplicarPublico(tabla, limite, 0);
                        
                        break;
                        
                    case 6:
                        
                        int numero;
                        
                        Recursividad ejem6 = new Recursividad();
                        
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea sumar sus cifras: "));
                        
                        int sumaDeNumeros = ejem6.sumarDigitoDeNumeroPublico(numero);
                        
                        JOptionPane.showMessageDialog(null, "La suma de los digitos es: " + sumaDeNumeros);
                        
                        break;
                        
                    case 7:
                        
                        JOptionPane.showMessageDialog(null,"Saliendo del programa...");
                        salir = true;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null,"Opción inválida. Por favor, seleccione una opción válida.");
                }
            }
            catch (Exception ex01) 
            {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error. Por favor, inténtelo nuevamente.");
            }
        }
    }
}
