package TrabajoPracticoN1;
public class Ejercicio5 
{

    public static void promedio(int [] arreglo)
    {
        double  cantN=0,cant, promedio=0;
        int i;
        
        //arreglo cualquiera para verificar el promedio
        
        arreglo[0]=15;
        arreglo[1]=33;
        arreglo[2]=28;
        arreglo[3]=14;
        
        for(i=0; i<arreglo.length;i++)
        {
            cant=(arreglo[i]);
            cantN=cant+cantN;
            promedio= cantN/(arreglo.length);
        }
        System.out.println("el promedio de "+arreglo.length+" es "+ promedio);
    }
    public static void main (String args[])
    {
        int [] arr;
        arr = new int [4];
        promedio(arr);
    }
}
