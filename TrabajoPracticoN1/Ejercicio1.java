package TrabajoPracticoN1;
import java.util.Scanner;

public class Ejercicio1
{
    public static void cargarArreglo(char [] arregloM)
    {
        //Declaracion de variables y scanner
        Scanner sc = new Scanner(System.in);
        int i, longitudArr;
        longitudArr = arregloM.length;
        //Asigno la longitud de el arreglo de caracteres
        for (i=0; i<longitudArr; i++)
        {
            System.out.println("Ingrese el proximo caracter a cargar: ");
            char caracter= sc.next().charAt(0);
            arregloM[i]= caracter;
        }    
    }
    public static void mostrarArreglo (char [] arregloAMostrar)
    {
        int i, LongiArreglo;
        LongiArreglo = arregloAMostrar.length;
        for (i=0; i< LongiArreglo; i++)
        {
            System.out.print(arregloAMostrar[i]);
        }
    }
    public static void inversionArreglo(String rta, char [] arregloNoInvertido)
    {
        Scanner sc= new Scanner(System.in);
        String rta2= "n";
        char[] arregloInvertido;
        int longi = arregloNoInvertido.length, i=0;
        arregloInvertido = new char[longi];
       
        //agregar condicion en caso de no ser un caracter valido
        
      while(longi!=0)
      {
            arregloInvertido[i]=arregloNoInvertido[longi-1];
            longi=longi-1;
            i++;
      }
        if (rta.equalsIgnoreCase("n") || rta.equalsIgnoreCase("s"))
        {
              if (rta.equalsIgnoreCase(rta2))
                {
                    System.out.println(arregloNoInvertido);
                }
                else 
                {
                    System.out.println(arregloInvertido);
                }
        }
        else
        {
            System.out.println("Valor ingresado no valido");
        }
    }
    
    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in); 
       //Declaro Variables
       String rta;
       int longitudArreglo;
       char [] arr;
       //Pregunto al usuario la cantidad de caracteres
       System.out.println("Ingrese la cantidad de caracteres que quiere cargar: ");
       longitudArreglo= sc.nextInt();
       //Asigno la longitud al arreglo que el usuraio quiere
       arr = new char [longitudArreglo];
       
       cargarArreglo(arr);
       
       System.out.println("Desea ver su arreglo Invertido? No(n) Si(s)");
       rta = sc.next();
       inversionArreglo(rta, arr);
        }
}
