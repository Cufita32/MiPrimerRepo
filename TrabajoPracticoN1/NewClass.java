/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPracticoN1;
import java.util.Scanner;
/**
 *
 * @author elcuf
 */
public class NewClass 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        String pruebaS;
        System.out.print("probando: ");
       pruebaS = sc.nextLine();
        System.out.println(pruebaS);
        num1 = 1;
        for (int i=15; i>num1; i++)
        {
            num1 = num1+2;
            System.out.print(" " +num1);
        }  
    }
    
}
