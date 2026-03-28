package TrabajoPractico3;
class Propietario 
{
    private int dni; 
    private String nombre; 
    private int cuit; 
    private int nrotel;
    private String apellido; 
    private String email;  

    //constructores

    public Propietario (int dni, int cuit){
        this.dni = dni; 
        this.cuit = cuit; 
    }
    public Propietario (int dni, int cuit, String nombre, String apellido, String email, int nrotel){
        this.dni = dni;
        this.cuit = cuit; 
        this.nombre = nombre; 
        this.apellido = apellido; 
        this.email = email;
        this.nrotel = nrotel;  
    }

    //observadores 

    public int getDni(){
        return this.dni; 
    }
    public int getCuit(){
        return this.cuit; 
    }
    public String getNombre(){
        return this.nombre; 
    }
    public String getApellido(){
        return this.apellido; 
    }
    public String getEmail(){
        return this.email; 
    }
    public int getNrotel(){
        return this.nrotel;
    }
    
    public String toString(){
        return "el nombre del propietario es: " + this.nombre + "su dni es: " + this.dni + "su cuit es: " + this.cuit + 
        "su numero de telefono es: " + this.nrotel + "su emial es: " + this.email; 
    }
    //Modificadores 

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEmail(String email){
        this.email = email; 
    }
    public void setNrotel(int nrotel){
        this.nrotel = nrotel; 
    }

}