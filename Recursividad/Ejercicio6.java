package Recursividad;
public class Ejercicio6 
{
    public static int miMayor(int [] arr, int i)
    {
        int aux, supMayor;
        aux= arr[i];
        if(i==arr.length-1)//CASO BASE
        {
            return aux;
        }
        else//CASO RECURSIVO
        { 
            supMayor=miMayor(arr, i+1);
            if(supMayor>aux)
            {
                aux=supMayor;
            }
        }
        return aux;
    }
    public static void main (String args[])
    {
        int [] arrNum={3,8,50,2,1};
        int i=0, elMayor;
        elMayor=miMayor(arrNum, i);
        System.out.println("El numero mayor es: "+elMayor);
    }
}
