package Recursividad;
public class Ejercicio11 
{
    public static void sumaArr(int []arr, int pares, int impares, int i)
    {
       
        if(i==arr.length)
        {
            System.out.println("Suma posiciones pares: " + pares);
            System.out.println("Suma posiciones impares: " + impares);
            return;
        }
        if (i % 2 == 0)
        {
            pares = pares + arr[i];
        }
        else
        {
            impares =impares+ arr[i];
        }
        
        sumaArr(arr, pares, impares, i+1);
    }
    public static void main (String args[])
    {
        int pares=0, impares=0,i=0;
        int [] arrNum ={0,1,2,3,4,5,6,7,8,9};
        sumaArr(arrNum, pares, impares, i);
    }
}
