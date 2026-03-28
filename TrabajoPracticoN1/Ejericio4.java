
package TrabajoPracticoN1;
import java.util.Scanner;
public class Ejericio4 
{
    public static void cargarArreglo(int [] arrACargar)
    {
        Scanner sc = new Scanner(System.in);
        int i, valorNumerico,mayor,menor;
        System.out.println("Ingrese valores numericos enteros:");
        valorNumerico = sc.nextInt();
//condicion mayor o menor
        mayor = valorNumerico;
        menor = valorNumerico;
        arrACargar[0]=valorNumerico;
        for(i=1; i<arrACargar.length;i++)
        {
            System.out.println("Ingrese valores numericos enteros:");
            valorNumerico = sc.nextInt();
            //condicion mayor o menor
            if(valorNumerico>mayor)
            {
                mayor=valorNumerico;
                  
            }
            if(valorNumerico<menor)
            {
                menor = valorNumerico;
            }

            arrACargar[i]=valorNumerico;
        }
        System.out.print("El numero mas grande de el arreglo es ("+mayor+") y el numero mas chico de el arreglo es ("+menor+")");
    }
    
    public static void recorrerArregloDeEnteros(int []arr)
    {
        int comp, menor=0;
        for(int i=0; i<arr.length;i++)
        {
            comp = arr[i];
            if (comp>menor)
            {
                System.out.println(comp);
            }
        }
    }
    
    public static void mostrarArreglo(int [] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.println("---");
            System.out.println(arr[i]);
        }
    }
    
    public static void main (String args[])
    {
        int[] arr;
        arr = new int [6];
        cargarArreglo(arr);
        mostrarArreglo(arr);
        //recorrerArregloDeEnteros(arr);
        
    }
}
