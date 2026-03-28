package Recursividad;
public class Ejercicio7 
{
    public static void recorrerMatriz(int [][]mat, int i, int j,int laSuma)
    {
        int suma;
        if(i>=mat.length)
            return;
        
        if(j>=mat[0].length)
        {
            suma=sumaFila(j,i,mat,laSuma);
            recorrerMatriz(mat, i+1, 0,laSuma);   
        }
        else
        {
            recorrerMatriz(mat, i,j+1,laSuma);
        }
        
    }
    public static int sumaFila(int j,int i, int[][]mat,int laSuma)
    {
        
        if(i>=mat.length)//Caso Base (Cuando j lega al final de la fila)
        {
            return laSuma;
        } 
        
        if(j>=mat[0].length)
        {
            return sumaFila(0,i+1, mat,laSuma);
        }
       laSuma+=mat[i][j];//suma lo que se encuentra en la posicion [i][j]
       System.out.println("La suma de la fila["+j+"] es "+laSuma);
        return sumaFila(j+1,i, mat,laSuma);
    }
    public static void main (String agrs[])
    {
        int [][]mat =new int [2][2];
        int i=0,j=0,laSuma=0;
        mat[0][0]=1;
        mat[0][1]=2;
        mat[1][0]=3;
        mat[1][1]=4;
        recorrerMatriz(mat, i,j,laSuma);
    }
     
}
