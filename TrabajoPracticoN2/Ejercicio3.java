package TrabajoPracticoN2;
import java.util.Scanner;

public class Ejercicio3 
{
    public static void cargarMatriz(String[][] tabla, int cantFila, int cantColum)
    {
        
        Scanner sc= new Scanner(System.in);
        int fila,colum;
        String frase;
        
        
        for(fila=0; fila<cantFila;fila++)
        {
            System.out.println("Ingrese una oracion para la matriz:");
            frase = sc.nextLine();
            String [] filaDePalabras = frase.split(" ");
            
            for(colum=0; colum<cantColum;colum++)
            {
                tabla [fila] [colum]= filaDePalabras[colum];
            }
        }
    }
     public static void mostrarMatriz(String [][] tabla, int cantFila, int cantColum)
    {
        int fila,colum;
        for(fila=0; fila<cantFila;fila++)
        {
            for(colum=0; colum<cantColum;colum++)
            {
                System.out.print(tabla[fila][colum]);
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int filas, colum;
        String [][] tabla ;
        System.out.println("Ingrese la cantidad de filas que quiere para su matriz de Strings:");
        filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas que quiere para su matriz de Strings, (distinto de las filas)");
        colum= sc.nextInt();
        tabla = new String [filas][colum];
        
        cargarMatriz(tabla, filas, colum);
        mostrarMatriz(tabla, filas, colum);
    }
}