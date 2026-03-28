package TrabajoPracticoN1;
import java.util.Scanner;
public class Ejercicio2 
{
     public static void cargarArreglo(int [] arregloM, int numero)
    {
        //Declaracion de variables 
        int i, largo;
        largo= arregloM.length;
        //Asigno la longitud de el arreglo de caracteres
        for (i=0; i<largo; i++)
        {
            arregloM [i] = numero*(i+1);
        }
    }
// Diseñar un algoritmo que lea un valor entero (N) y genere un arreglo con los M primeros múltiplos del mismo (pidiendole al usuario ese valor M también).
//Por ejemplo para N=7 y M=10 deberá guardar en el arreglo: 7 14 21 28 35 42 49 56 63 70
    public static void mostrarArreglo (int [] arregloAMostrar)
    {
        int i, LongiArreglo;
        LongiArreglo = arregloAMostrar.length;
        for (i=0; i< LongiArreglo; i++)
        {
            System.out.println(arregloAMostrar[i]);
        }
    }
     
     public static void main (String args[])
     {
         Scanner sc= new Scanner(System.in);
         int [] multiplos;
         int valorN, cantM;
         System.out.println("Ingrese un numero:");
         valorN= sc.nextInt();
         System.out.println("Ingrese la cantidad de multiplos que desee ver en pantalla de ese mismo numero:");
         cantM= sc.nextInt(); 
         multiplos = new int[cantM];    
         cargarArreglo(multiplos, valorN);
         mostrarArreglo(multiplos);
     }
}
