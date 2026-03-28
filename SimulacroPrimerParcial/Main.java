package SimulacroPrimerParcial;
import java.util.Scanner;
public class Main 
{
    public static Paciente cargarPaciente()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre del paciente:");
        String nombrePaciente = sc.nextLine();
        System.out.println("Ingrese el apellido del paciente:");
        String apellidoPaciente = sc.nextLine();
        System.out.println("Ingrese el DNI del paciente (Sin puntos ni espacios):");
        int dniPaciente=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la obra social del paciente:");
        String obraSocialPac= sc.nextLine();
        
        Paciente nuevoPaciente= new Paciente(nombrePaciente, apellidoPaciente, obraSocialPac, dniPaciente);
       
        return nuevoPaciente;
    }
    
    public static Turno cargarPacienteATurno(Paciente paci)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el dia del turno:");
        String diaTurno = sc.nextLine();
        System.out.println("Ingrese el diagnostico del paciente:");
        String diag = sc.nextLine();
        Turno unTurno= new Turno(paci, diag, diaTurno);
        
        return unTurno;
    }
    
    public static void main (String args[])
    {
        Turno [] turnos= new Turno[16];
        String [][] grilla= new String [5][16];
        Scanner sc=new Scanner (System.in);
        int rta,i=0;
        Paciente paci;
        System.out.println("Añadir un paciente");
        paci = cargarPaciente();
        //System.out.println("3: ");
        //System.out.println("4: ");
        //System.out.println("5: ");
        
        System.out.println("Menu");
        System.out.println("1: Añadir un paciente");
        System.out.println("2: Añadir turno");
        System.out.println("0: Salir del menu");
        rta = sc.nextInt();
        sc.nextLine();
        
        while(rta!=0)
        {
            
            switch(rta){
                case 1:
                    paci = cargarPaciente();
                break;
                case 2:
                   
                    Turno nuevo;
                    nuevo= cargarPacienteATurno(paci);
                    turnos[i] =nuevo;
                    i++;
                    break;
                
            } 
            
        }
        
        
    }
}