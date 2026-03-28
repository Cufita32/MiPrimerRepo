package Recursividad;
public class Ejercicio1 
{
    public static int func(int n)
    { //precondicion: n es un entero positivo
        int aux;
        if (n==0)
        {
            aux = 0;
        }
        else
        {
            aux = n + func(n-1);
        }
        System.out.print(aux);
        return aux;
                
    }
    public static void main(String args[])
    {
        int muestra=3;
        muestra=func(muestra);
        
    }
}
