package tarea1_dennissanchez;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Recursividad 
{
    ////////////////// Problema 1 //////////////////
    
    public boolean validarNumeroDeTresDigitosPublico(int numero_de_tres_digitos)
    {
        return validarNumeroDeTresDigitos(numero_de_tres_digitos);
    }
    
    private boolean validarNumeroDeTresDigitos(int numero_de_tres_digitos) 
    {
        return numero_de_tres_digitos >= 100 && numero_de_tres_digitos <= 999;
    }
    
    public int invertirNumeroPublico(int numero_de_tres_digitos) 
    {
        return invertirNumero(numero_de_tres_digitos);
    }
    
    private int invertirNumero(int numero_de_tres_digitos) 
    {        
        int ultimaCifra;
        int cifrasRestantes;
        int longitud;
        
        if (numero_de_tres_digitos < 10) 
        {
            return numero_de_tres_digitos;
        } 
        else 
        {
            ultimaCifra = numero_de_tres_digitos % 10;
            cifrasRestantes = numero_de_tres_digitos / 10;
            longitud = (int) Math.log10(cifrasRestantes) + 1;
            
            return ultimaCifra * (int) Math.pow(10, longitud) + invertirNumero(cifrasRestantes);
        }
    }
    
    ////////////////// Problema 2 //////////////////
    
    public void imprimirLetraPorLetraPublico(String cadenaImprimir, int posicionActual) 
    {
        imprimirLetraPorLetra(cadenaImprimir, posicionActual);
    }
    
    private void imprimirLetraPorLetra(String cadenaImprimir, int posicionActual) 
    {
        if (posicionActual >= cadenaImprimir.length()) 
        {
            return;
        }

        System.out.println(cadenaImprimir.charAt(posicionActual));  

        imprimirLetraPorLetra(cadenaImprimir, posicionActual + 1); 
    }
    
    ////////////////// Problema 3 //////////////////
    
    public void mostrarContenidoVectorPublico(int vector[], int indice, int i) 
    {
        mostrarContenidoVector(vector, indice, i);
    }

    private void mostrarContenidoVector(int vector[], int indice, int i) 
    {
        if (i < indice) 
        {
            System.out.print(vector[i] + " ");
            mostrarContenidoVector(vector, indice, i + 1);
        }
    }

    public void llenarVectorPublico(int vector[], int tamano, int indice) 
    {
        llenarVector(vector, tamano, indice);
    }

    private void llenarVector(int vector[], int tamano, int indice) 
    {
        if (indice < tamano) 
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el elemento en la posicion " + indice + ": ");
            
            vector[indice] = scanner.nextInt();

            llenarVector(vector, tamano, indice + 1);
        }
    }
    
    public int buscarValorMayorPublico(int vector[], int tamano) 
    {
        return buscarValorMayor(vector, tamano, 0, 0);
    }
    
    private int buscarValorMayor(int vector[], int tamano, int indice, int valorActual) 
    {
        if (indice < tamano) 
        {
            if (vector[indice] > valorActual) 
            {
                valorActual = vector[indice];
            }
            
            valorActual = buscarValorMayor(vector, tamano, indice + 1, valorActual);
        }
        
        return valorActual;
    }
    
    ////////////////// Problema 4 //////////////////
    
    public void llenarVectorNumerosPublico(int vectorSumarNumeros[], int tamanno, int indiceN) 
    {
        llenarVectorNumeros(vectorSumarNumeros, tamanno, indiceN);
    }
    
    private void llenarVectorNumeros(int vectorSumarNumeros[], int tamanno, int indiceN) 
    {
        if (indiceN < tamanno) 
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el numero en la posicion " + indiceN + ": ");
            
            vectorSumarNumeros[indiceN] = scanner.nextInt();

            llenarVector(vectorSumarNumeros, tamanno, indiceN + 1);
        }
    }
    
    public int sumarNumeros(int vectorSumarNumeros[], int tamanno) 
    {
        return sumarNumerosRecursiva(vectorSumarNumeros, tamanno, 0);
    }

    private int sumarNumerosRecursiva(int vectorSumarNumeros[], int tamanno, int indiceN) 
    {
        if (indiceN == tamanno) 
        {
            return 0;
        } 
        else 
        {
            return vectorSumarNumeros[indiceN] + sumarNumerosRecursiva(vectorSumarNumeros, tamanno, indiceN + 1);
        }
    }
    
    public void mostrarContenidoNumerosPublico(int vectorSumarNumeros[], int indiceN, int i) 
    {
        mostrarContenidoNumerosVector(vectorSumarNumeros, indiceN, i);
    }

    private void mostrarContenidoNumerosVector(int vectorSumarNumeros[], int indiceN, int i) 
    {
        if (i < indiceN) 
        {
            System.out.print(vectorSumarNumeros[i] + " ");
            mostrarContenidoVector(vectorSumarNumeros, indiceN, i + 1);
        }
    }
    
    ////////////////// Problema 5 //////////////////
    
    public void tablasDeMultiplicarPublico(int tabla, int limite, int resultado) 
    {
        tablasDeMultiplicar(tabla, limite, resultado);
    }
    
    private void tablasDeMultiplicar(int tabla, int limite, int resultado) 
    {
        if (limite >= 1) 
        {
            resultado = tabla * limite;

            System.out.println(tabla + " x " + limite + " = " + resultado);

            tablasDeMultiplicar(tabla, limite - 1, resultado);
        }
    }
    
    ////////////////// Problema 6 //////////////////
    
    public int sumarDigitoDeNumeroPublico(int numero)
    {
        return sumarDigitosDeNumero(numero);
    }
    
    private int sumarDigitosDeNumero(int numero) 
    {
        if (numero < 10) 
        {
            return numero;
        } 
        else 
        {
            int ultimoDigito = numero % 10;
            int restoDelNumero = numero / 10;

            return ultimoDigito + sumarDigitosDeNumero(restoDelNumero);
        }
    }          
}
