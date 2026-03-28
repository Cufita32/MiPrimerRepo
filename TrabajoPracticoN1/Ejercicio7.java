package TrabajoPracticoN1;
import java.util.Scanner;

public class Ejercicio7 
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
    
    public static String[] inversion(String[]arr){
     
    int j, longi=arr.length;
    
    j=longi;

    String [] arrI;
    arrI = new String [longi];
    for(int i=0;i<arr.length;i++)
    {
        j--;
        arrI[i] = arr[j];
    }
    return arrI;
    }
    
    public static String genCadeNorm(String [] arr) 
    { String cadena=" "; 
    for(int i=0; i<arr.length;i++) 
    { 
        cadena +=arr[i]+" "; 
    }
    return cadena; 
    }
    
    public static String genCadeInv(String [] arr) 
    { 
        String cadena=""; 
        for(int i=0; i<arr.length;i++) 
        { 
            cadena +=arr[i]+"-"; 
        } 
        return cadena; 
    }

    public static void main(String args[])
    {
    String [] arrPalabra, inv;
    arrPalabra= new String[3];
    String cadenaN, cadenaI;
    
    cargarPalabraArreglo(arrPalabra);
    inv=inversion(arrPalabra);
    cadenaN= genCadeNorm(arrPalabra);
    cadenaI=genCadeInv(inv);
    System.out.println("Cadena normal "+cadenaN);
    System.out.println("Cadena Inversa "+cadenaI);
    }
}
