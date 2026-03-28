package SimulacroPrimerParcial;

class Turno
{
    //Atributos de la clase
    Paciente paciente;
    String diagnostico,diaDelTurno;
    char asistio, finalizo;
    int diasDeTratamiento;
    double montoDelCoseguro;
    /*copiar atributos
    
    */
    
    //Constructores de la clase
    public Turno(Paciente paciente,String diagnostico, String diaDelTurno,char asistio, char finalizo,int diasDeTratamiento,double montoDelCoseguro)
    {
        this.paciente=paciente;
        this.asistio=asistio;
        this.diagnostico= diagnostico;
        this.finalizo= finalizo;
        this.diasDeTratamiento=diasDeTratamiento;
        this.diaDelTurno=diaDelTurno;
        this.montoDelCoseguro=montoDelCoseguro;
    }
    public Turno(Paciente paciente,String diagnostico, String diaDelTurno)
    {
        this.paciente=paciente;
        this.diagnostico= diagnostico;
        this.diaDelTurno=diaDelTurno;
    }
    public Turno(String diagnostico, String diaDelTurno)
    {
        this.diagnostico=diagnostico;
        this.diaDelTurno=diaDelTurno;
    }
    
    public Turno()
    {
        this.asistio='N';
        this.diagnostico= "";
        this.finalizo= 'N';
        this.diasDeTratamiento=0;
        this.diaDelTurno="";
        this.montoDelCoseguro=0;
        
    }
    
    //observadores de la clase
    public String getDiagnostico(){ return diagnostico;}
    public String getDiaTurno(){ return diaDelTurno;}
    public int getDiasDeTrat(){return diasDeTratamiento;}
    public double getMonto(){return montoDelCoseguro;}
    public char getAsis(){return asistio;}
    public char getFinAsis(){return finalizo;}    
    
    @Override
    public String toString()
    {
        return "Nombre del paciente: "+paciente.getNombre()+ " apellido: "+paciente.getApellido()+
                " Dni: "+ paciente.getDni() +
                " Obra social "+paciente.getObraSocial()
                ;
    }
    
    
    //modificadores
    public void setDiagnostico(String unDiagnostico){this.diagnostico=unDiagnostico;}
    public void setDiaTurno(String diaTurno){this.diaDelTurno=diaTurno;}
    public void setDiasDeTrat(int diasTrat){this.diasDeTratamiento=diasTrat;}
    public void setMonto(double montoCoseguro){this.montoDelCoseguro=montoCoseguro;}
    public void setAsis(char asistencia){this.asistio=asistencia;}
    public void setFinAsis(char finAsis){this.finalizo=finAsis;}
}

