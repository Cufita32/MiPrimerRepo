package Recursividad;

public class Ejercicio13 
{
    public static int mayorDeMatriz(int [][]mat, int i, int j)
    {
        int aux, m=0,elMayor;
        aux=m;
        if(i>=mat.length)
        {
            return aux;
        }
        else
        {
            if(j>=mat[0].length)
            {
                elMayor=mayorDeMatriz(mat,i+1,0);
                aux=mat[i][j];
                if(aux<elMayor)
                {
                    aux=elMayor;
                }
             else
                {
                    aux=m;
                }
            } 
            j++;
        }
        return m;
    }
    public static void main (String args[])
    {
        int [][]mat =new int [2][2];
        int i=0,j=0,elMayor;
        mat[0][0]=1;
        mat[0][1]=2;
        mat[1][0]=3;
        mat[1][1]=4;
        elMayor=mayorDeMatriz(mat, i,j); 
        System.out.println("El numero mayor es: "+elMayor);
    }
}
