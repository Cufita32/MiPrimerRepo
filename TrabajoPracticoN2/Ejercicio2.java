package TrabajoPracticoN2;
import java.util.Scanner;

public class Ejercicio2 
{
    public static void cargarMatriz(char [][] tabla, int cantFila, int cantColum)
    {
        
        Scanner sc= new Scanner(System.in);
        int fila,colum;
        char  valorC;
        for(fila=0; fila<cantFila;fila++)
        {
            for(colum=0; colum<cantColum;colum++)
            {
                System.out.println("Ingrese un valor para la matriz:");
                valorC= sc.next().charAt(0);
                tabla [fila] [colum]= valorC;
            }
        }
    }
    public static void mostrarMatriz(char[][] tabla, int cantFila, int cantColum)
    {
        int fila,colum;
        for(fila=0; fila<cantFila;fila++)
        {
            for(colum=0; colum<cantColum;colum++)
            {
                if(fila==colum)
                {
                System.out.print(tabla[fila][colum]);
                }
            }
            System.out.println("");
        }
    }
    
    public static void main(String args[])
    {
        char [][] tabla = new char [3][3];
        int filas, colum;
        filas = tabla.length;
        colum = tabla [0].length;
        
        
        cargarMatriz(tabla, filas, colum);
        mostrarMatriz(tabla, filas, colum);
    }
}