package Recursividad;
public class probandoMod 
{
    public static void main (String args[])
    {
        int num=1001;
        boolean lol=veriNum(num);
    }
    
    public static boolean veriNum(int num)
    {
        boolean rta;
        int aux = num%10;
        int ulti=num%10, sigNum=(num/10)%10;
        
        if(ulti==sigNum)
        {
            System.out.println("Son iguales");
            rta =true;
        }
        else
        {
            System.out.println("no son iguales");
            rta=false;
        }
        return rta;
    }
}
