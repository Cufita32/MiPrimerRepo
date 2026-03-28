package Recursividad;
import java.util.Scanner;
public class Ejercicio12 
{
    public static char arrChar(int i, char []arr, char letra)
    {
        char letraABuscar=letra, laLetra=' ';
        if(letraABuscar!=arr[i])
        {
            
            arrChar(i+1, arr, letra);
            if(i==arr.length)//corta recursividad
            {
            }  
            
        }
        else
        {
            laLetra=letraABuscar; 
            return laLetra;
        }
        return laLetra;
            
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        char [] arr={'a','b','c','d','f','g','h','i','j'};
        int i=0;
        char letra, letraEncontrada;
        System.out.println("Escriba la letra que quiere buscar en el arreglo:");
        letra= sc.nextLine().charAt(0);
        letraEncontrada=arrChar(i, arr, letra);
        System.out.print("La letra["+letraEncontrada+"] se encuentra en el Arreglo");
    }
}
