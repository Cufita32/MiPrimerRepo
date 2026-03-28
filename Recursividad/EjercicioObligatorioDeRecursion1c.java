package Recursividad;
import java.util.Scanner;

public class EjercicioObligatorioDeRecursion1c 
{
    public static int apareceNumDigito(int num, int numABuscar)
    {
        int contador=0;
        if(num!=0) // Caso Base
        {
            
            if(numABuscar== num%10)
            {
                //Paso recursivo
                contador = 1+apareceNumDigito(num/10, numABuscar);
            }
            else
            {
                // Paso recursivo
                contador=0+apareceNumDigito(num/10, numABuscar);
            }
        }
        return contador;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int digito, cantidad, numABuscar;
        System.out.println("Que numero desea buscar?");
        numABuscar= sc.nextInt();
        sc.nextLine();
        digito=12322;
        cantidad = apareceNumDigito(digito, numABuscar);
        System.out.println("Las veces que se encontro el digitro ["+numABuscar+"] fueron ["+cantidad+"]");
    }
}
