package TPOGrupal;

public class Propietario {
   private int dni;
   private String nombre;
   private String cuit;
   private int nrotel;
   private String apellido;
   private String email;
   public Terreno[] terrenos = new Terreno[10];

   public Propietario() {
      this.dni = 0;
      this.cuit = "";
      this.nombre = "";
      this.apellido = "";
      this.email = "";
      this.nrotel = 0;
      Terreno t = new Terreno();

      for(int i = 0; i < this.terrenos.length; ++i) {
         this.terrenos[i] = t;
      }

   }

   public Propietario(int dni) {
      this.dni = dni;
   }

   public Propietario(int dni, String cuit) {
      this.dni = dni;
      this.cuit = cuit;
   }

   public Propietario(int dni, String cuit, String nombre, String apellido, String email, int nrotel) {
      this.dni = dni;
      this.cuit = cuit;
      this.nombre = nombre;
      this.apellido = apellido;
      this.email = email;
      this.nrotel = nrotel;
   }

   public int getDni() {
      return this.dni;
   }

   public String getCuit() {
      return this.cuit;
   }

   public String getNombre() {
      return this.nombre;
   }

   public String getApellido() {
      return this.apellido;
   }

   public String getEmail() {
      return this.email;
   }

   public int getNrotel() {
      return this.nrotel;
   }

   public String toString() {
      return "el nombre del propietario es: " + this.nombre + " su dni es: " + this.dni + " su cuit es: " + this.cuit + " su numero de telefono es: " + this.nrotel + " su emial es: " + this.email;
   }

   public boolean equals(Propietario otroPropietario) {
      return this.dni == otroPropietario.dni;
   }

   public void setDni(int dni) {
      this.dni = dni;
   }

   public void setCuit(String cuit) {
      this.cuit = cuit;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setNrotel(int nrotel) {
      this.nrotel = nrotel;
   }

   public void setTerreno(Terreno terreno, int indice) {
      this.terrenos[indice] = terreno;
   }

   public boolean validacionNro(int cuit) {
      Boolean retorno = false;
      int longitud = Integer.toString(cuit).length();
      if (longitud == 11) {
         retorno = true;
      }

      return retorno;
   }
}