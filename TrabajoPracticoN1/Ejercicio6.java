package TrabajoPracticoN1;
import java.util.Scanner;
public class Ejercicio6 
{
    public static void cargarArreglo(char [] arr)
    {
        Scanner sc= new Scanner(System.in);
        String continuar="N", nWord;
        int cantLetras=0;
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Ingrese el siguiente caracter: ");
            char carACargar = sc.next().charAt(0);
            
            Character.isLetter(carACargar);
            
            if(Character.isLetter(carACargar)== true)
            {
                arr[i]= carACargar;
                    cantLetras++;
            }
            else
            {
                System.out.println("caracter invalido, no se almacenara en el arreglo.");
            }
            
            System.out.println("Desea seguir cargando caracteres? Si(s) No(n)");
            nWord = sc.next(); 
            
            if(nWord.equalsIgnoreCase(continuar))
            {
                arr= new char[i];
            }
        }
        System.out.println("La cantidad de letras que se encontraron en el arreglo son: "+cantLetras);
    }
    
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int longi;
        char [] arr;
        System.out.println("Ingrese la longitud del arreglo, como maximo (100 caracteres de longitud del arreglo: ");
        longi = sc.nextInt();
        arr = new char[longi];
        
        cargarArreglo(arr);
    }
}
