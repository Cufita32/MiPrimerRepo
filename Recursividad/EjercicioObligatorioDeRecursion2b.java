package Recursividad;
public class EjercicioObligatorioDeRecursion2b 
{
    public static int recorreMat(int [][] mat, int i)
    {
        int suma;
        if(i>=mat.length)
        {
            suma=0;
        }
        else
        {
            suma=mat [i][i]+recorreMat(mat, i+1);
        }
        return suma;
    }
    public static void main (String args[])
    {
        int i=0,rta;
        int[][] mat=
        {
            {2,80,40},
            {20,2,10},
            {40,60,2}
        };
        rta=recorreMat(mat,i);
        System.out.println("La diagonal principal suma "+rta);
    }
}
