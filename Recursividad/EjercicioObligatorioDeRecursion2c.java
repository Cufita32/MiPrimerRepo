package Recursividad;
public class EjercicioObligatorioDeRecursion2c 
{
    public static boolean recorreMat(int [][] mat, int i, int j)
    {
        boolean rta;
      if(i>=mat.length)
        // Caso Base
        //Terminaria de leer matriz y no encuentra numero negativo
      {
          rta=false;
      }
      else
      {
          if(j>=mat[0].length)//Termina de leer la fila y salta a la siguiente
          {
              rta=recorreMat(mat,i+1,0);
          }
          else
          {
              if((mat[i][j])<0) //Si encuentra valor negativo devuelve verdadero
              {
                  rta=true;
              }
              else
              {
                  //Paso recursivo
                  rta=recorreMat(mat,i,j+1);
              }
          }
      }
      return rta;
    }
    public static void main (String args[])
    {
        boolean rta;
        int i=0,j=0;
        int[][] mat=
        {
            {1,0,10},
            {7,2,3},
            {11,-5,8}
        };
        rta=recorreMat(mat,i,j);
        System.out.println("Es negativo? "+rta);
    }
}
