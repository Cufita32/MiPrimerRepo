package TrabajoPracticoN2;
import java.util.Scanner;
public class Ejercicio1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int [][] tabla;
        int cantFil, cantCol;
        System.out.println("Ingrese la cantidad de filas que quiere que su matriz tenga:");
        cantFil= sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas que quiere que su matriz tenga:");
        cantCol= sc.nextInt();
        tabla = new int [cantFil][cantCol];
        
        
        cargarMatriz(tabla, cantFil, cantCol);
        mostrarMatriz(tabla, cantFil, cantCol);
    }
    
    public static void cargarMatriz(int[][] tabla, int cantFila, int cantColum)
    {
        
        Scanner sc= new Scanner(System.in);
        int fila,colum,valorC;
        for(fila=0; fila<cantFila;fila++)
        {
            for(colum=0; colum<cantColum;colum++)
            {
                System.out.println("Ingrese un valor para la matriz:");
                valorC= sc.nextInt();
                tabla [fila] [colum]= valorC;
            }
        }
    }
    public static void mostrarMatriz(int[][] tabla, int cantFila, int cantColum)
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
}