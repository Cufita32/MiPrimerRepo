package TrabajoPracticoN1;
import java.util.Scanner;

public class Ejercicio8 
{
    public static void cargarPalabraArreglo(String [] arrPal)
    {//compila bien
    Scanner sc = new Scanner(System.in);
    String pal;
    
    for(int i=0; i<arrPal.length;i++)
    {
        
        System.out.println("Ingrese una palabra: ");
        pal = sc.next();
        arrPal[i] = pal;
        
    }
    }
    
    public static int busquedaPalabra(String[]arr)
    {
        int palabra=0, palabraG=0;
        
        for(int i=0;i<arr.length;i++)
        {
            palabra = arr[i].length();
            
            if(palabra>palabraG)
            {
                palabraG=palabra;
            }
        }
        return palabraG;
    }
    
    public static void main (String args[])
    {
        String [] arrPal;
        arrPal= new String [3];
        int largoPal;
        
        cargarPalabraArreglo(arrPal);
        
        largoPal=busquedaPalabra(arrPal);
        System.out.print("La palabra mas larga encontrada fue de ("+largoPal+") de longitud");
    }
}
