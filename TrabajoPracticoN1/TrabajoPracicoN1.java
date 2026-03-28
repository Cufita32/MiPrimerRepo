
package TrabajoPracticoN1;
import java.util.Scanner; 
 
public class TrabajoPracicoN1 { 
    public static void limpiarArregloCaracteres(char[] caracteres) 
    {
//Modulo para limpiar el arreglo 
        int i; 
        for (i=0; i<caracteres.length; i++) { 
            caracteres[i] = ' '; 
        } 
    } 
    public static void cargarArregloCaracteres(char[] caracteres) { 
// Modulo para cargarle caracteres al arreglo 
        int i; 
        Scanner sca = new Scanner(System.in); 
        for (i=0; i<caracteres.length; i++) { 
            System.out.println("Ingrese un caracter para cargar el arreglo"); 
            char caract = sca.next().charAt(0); 
            caracteres[i] = caract; 
        } 
    } 
    public static void copiarArreglo(char[] caracteres, char[]copia) 
    {
// Modulo para copiar el arreglo original 
        int i; 
        for (i=0; i<caracteres.length; i++) { 
            copia[i] = caracteres[i]; 
        } 
    } 
    public static String mostrarArreglo(char[] arr) { 
// Modulo para mostrar el arreglo 
        int i; 
        String mostrar = " "; 
        for (i=0; i<arr.length; i++) { 
            mostrar += arr[i] + " "; 
        } 
        mostrar = mostrar.trim(); 
        return mostrar; 
    } 
    public static int verificarPosicion(int longitud) { 
// Modulo para verificar que la posicion ingresada esta dentro de los limites delarreglo 
        Scanner sc = new Scanner(System.in); 
        int posicion = sc.nextInt()-1; 
        while ((posicion >= longitud)||(posicion<0)) { 
            System.out.println("valor invalido, ingreselo nuevamente"); 
            posicion = sc.nextInt()-1; 
        } 
        return posicion; 
    } 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int longitud, posicion; 
        char caract; 
        char[] caracteres = new char[4]; 
        limpiarArregloCaracteres(caracteres); 
        longitud = caracteres.length; 
        char[] copia = new char[longitud]; 
        limpiarArregloCaracteres(copia); 
 
        cargarArregloCaracteres(caracteres); 
        copiarArreglo(caracteres, copia); 
 
        System.out.println("Ingrese una posicion"); 
        posicion = verificarPosicion(longitud); 
        System.out.println("Ingrese un caracter"); 
        caract = sc.next().charAt(0); 
        caracteres[posicion] = caract; 
 
 
   System.out.println("Arreglo original:"); 
        String mostrarArrOriginal = mostrarArreglo(copia); 
        System.out.println(mostrarArrOriginal); 
        System.out.println("Arreglo cambiado:"); 
        String mostrarArrCambiado = mostrarArreglo(caracteres); 
        System.out.println(mostrarArrCambiado); 
         
    } 
} 