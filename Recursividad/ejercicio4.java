package Recursividad;
public class Ejercicio4 
{
    public static boolean veri(int dig)
    {
        if(dig<10){return true;}
        int anteUlt,peUlt;
        anteUlt= dig%10;
        peUlt=(dig/10)%10;
        if(anteUlt!=peUlt){return false;}
        return veri(dig/10);
        
    }
    public static void main (String args[])
    {
        int n=1911;
        boolean rta;
        rta= veri(n);
        if(rta!=true)
        {
            System.out.println("El numero no es igual");
        }
        else
        {
         System.out.println("El numero es igual");
        }
    }
}
