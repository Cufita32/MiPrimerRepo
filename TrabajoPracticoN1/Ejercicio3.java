
package TrabajoPracticoN1;
import java.util.Scanner;
public class Ejercicio3 
{
    public static void cargarArreglo(int[]arr)
    {
        int i,longitudArr;
        longitudArr = arr.length;
        for(i=0; i<longitudArr; i++)
        {
            arr [i]=+i;
        }
    }
    
    public static int[] intercambio(int[]arr, int num)
    {
       for (int i=0;i<arr.length;i++)
       {
           if ((i)%2==0)
           {
               arr[i]=num;
           }
       }
        return arr;
    }
    
    
    
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
        Scanner sc = new Scanner(System.in);
        int num;
        int [] arrEnteros= new int [10];
        System.out.println("Ingrese un numero entero:");
        num = sc.nextInt();
        cargarArreglo(arrEnteros);
        intercambio(arrEnteros, num);
        mostrarArreglo(arrEnteros);
    }
}
