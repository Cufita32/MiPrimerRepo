package TrabajoPracticoN1;
import java.util.Scanner;

public class Ejercicio9 
{
     public static void cargarArregloCaracteres(char [] arregloM)
     {
        //Declaracion de variables y scanner
        Scanner sc = new Scanner(System.in);
        int i, longitudArr;
        longitudArr = arregloM.length;
        //Asigno la longitud de el arreglo de caracteres
        for (i=0; i<longitudArr; i++)
        {
            System.out.println("Ingrese el proximo caracter a cargar: ");
            char caracter= sc.next().charAt(0);
            arregloM[i]= caracter;
        }
     }
     
     public static void verificacionChar(char[]arr, char letra)
     {
         char letraDelArreglo;
         int vecesEncontrado=0;
         for(int i=0;i<arr.length;i++)
         {
             letraDelArreglo=arr[i];
             
             if(letraDelArreglo==letra)
             {
                 vecesEncontrado++;
                 System.out.println("Esta letra se encuentra en el arreglo");
                 System.out.println("Las veces que esta letra fue encontrada fueron: "+vecesEncontrado);
             }
             else
             {
                 System.out.println("Esa letra no se encuentra en el arreglo");
                 i=arr.length;
            }
         }
     }
     public static void llamador(char []arr, char letra)
     {
         verificacionChar(arr, letra);
     }
    
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        char [] arregloCaracteres= new char [4];
        char letraAVerificar;
        cargarArregloCaracteres(arregloCaracteres);
        
        System.out.println("Ingrese la letra que quiere verificar si ya esta en el arreglo y cuantas veces: ");
        letraAVerificar = sc.next().charAt(0);
        verificacionChar(arregloCaracteres, letraAVerificar);
    }
}
