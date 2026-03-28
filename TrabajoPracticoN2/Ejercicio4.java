package TrabajoPracticoN2;
import java.util.Scanner;

public class Ejercicio4 
{
    public static void cargarMatriz(int[][] tabla)
    {
        Scanner sc= new Scanner(System.in);
        int fila,colum,valorC, cantFila, cantColum;
        cantFila=tabla.length;
        cantColum=tabla[0].length;
        
        for(fila=0; fila<cantFila;fila++)
        {
            for(colum=0; colum<cantColum;colum++)
            {
                System.out.println("Ingrese la "+colum+1+" nota del alumno "+fila+1+" la matriz:");
                valorC= sc.nextInt();
                tabla [fila] [colum]= valorC;
            }
        }
    }
    //Calcular el promedio de todos sus alumnos y mostrarlos por pantalla
    public static void calcularPromedio(int mat[][])
    {
        int nag,feb, nota=0;
        double promedio=0;
        nag = mat.length; //FILAS
        feb = mat [0].length; //COLUMNAS
        // Promedio es: la nota de las materias divididas las cantidad
        for(int i=0; i<nag; i++)//recorre filas
        {
            nota=0;
            
            for(int j=0; j<feb;j++ )//recorre columnas
            {
                nota += mat[i][j];
            }
            promedio=(double) nota/feb;
        }
    }
    
    public static void mostrarPromedioDeNotas(int [][] mat, int alum)
    {
        for(int i=0; i<mat[0].length;i++)
        {
            System.out.print(mat[alum][i]);
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int [][] matrizNota= new int [2][2];
        int alum;
        cargarMatriz(matrizNota);
        
        System.out.println("Ingrese el alumno del 1 al 10, para saber su promedio de notas: ");
        alum = sc.nextInt();
        
        calcularPromedio(matrizNota);
        mostrarPromedioDeNotas(matrizNota, alum);
        
    }
    
}
