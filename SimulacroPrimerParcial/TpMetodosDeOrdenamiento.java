package SimulacroPrimerParcial;
public class TpMetodosDeOrdenamiento 
{
    public static void mian(String args[])
    {
        int []arr={2,4,6,8,10,12};
        int num=10, numE;
        numE= busquedaSecuencial(arr, num);
        System.out.println("El numero a encontrar es["+numE+"]");
    }
    
    public static int busquedaSecuencial(int [] arr, int num)
    {
        int f, numerito=0;
        for(int i=0; i<arr.length;i++)
        {
            f= arr[i];
            if(f==num)
            {
                numerito =f;
            }
        }
        return numerito;
    }
    
    public static int busquedaSecuencialInv(int [] arr, int num)
    {
        int f, numerito=0;
        for(int i=arr.length; i==0;i--)
        {
            f= arr[i];
            if(f==num)
            {
                numerito =f;
            }
        }
        return numerito;
    }
}