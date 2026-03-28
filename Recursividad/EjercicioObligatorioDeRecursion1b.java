package Recursividad;
public class EjercicioObligatorioDeRecursion1b 
{
   public static int apareceNumDigito(int num)
    {
        int contador=0;
        if(num!=0) // Caso Base
        {
            
            if(((num%10)%2)!=0)
            {
                //Paso recursivo
                contador = 1+apareceNumDigito(num/10);
            }
            else
            {
                // Paso recursivo
                contador=0+apareceNumDigito(num/10);
            }
        }
        return contador;
    }
    public static void main (String args[])
    {
        int digito, cantidad;
        digito=23572;
        cantidad = apareceNumDigito(digito);
        System.out.println("La cantidad de numeros impares que se encontraron en el digitro fueron ["+cantidad+"]");
    }
}
