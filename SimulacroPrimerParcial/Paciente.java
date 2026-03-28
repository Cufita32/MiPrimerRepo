package SimulacroPrimerParcial;
class Paciente 
{
    //Atributos de la clase
    private String nombre, apellido, obraSocial;
    private int dni;
    
    //Constructores de la clase (Inicializa valores vacios para su uso)
    public Paciente(String nombre, String apellido, String obraSocial, int dni)
    {
        this.nombre=nombre;
        this.apellido= apellido;
        this.obraSocial=obraSocial;
        this.dni=dni;
    }
    public Paciente()
    {
        this.nombre="";
        this.apellido= "";
        this.obraSocial="";
        this.dni=0;
    }
    
    public Paciente(int dni, String nombre, String apellido, String obraSocial) 
     {
      this.dni = dni;
      this.nombre = nombre;
      this.apellido = apellido;
      this.obraSocial=obraSocial;
     }
    
    
    //Observadores de la clase (Seria como para leer)
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public String getObraSocial(){return this.obraSocial;}
    public int getDni(){return this.dni;}
    
    //Modificadores (Seria para Setear)
    public void setNombre(String nombrePac){this.nombre=nombrePac;}
    public void setApellido(String apellidoPac){this.apellido=apellidoPac;}
    public void setObraSocial(String obraSocialPac){this.obraSocial=obraSocialPac;}
    public void setDni(int dniPac){this.dni=dniPac;}
}   
