package TPOGrupal;

class Terreno {
   private int codigo;
   private int manzana;
   private double base;
   private double altura;

   public Terreno() {
      this.codigo = 0;
      this.manzana = 0;
      this.base = 0.0D;
      this.altura = 0.0D;
   }

   public Terreno(int unCodigo) {
      this.codigo = unCodigo;
      this.manzana = 0;
      this.base = 0.0D;
      this.altura = 0.0D;
   }

   public Terreno(int unCodigo, double laBase, double laAltura, int laManzana) {
      this.codigo = unCodigo;
      this.base = laBase;
      this.altura = laAltura;
      this.manzana = laManzana;
   }

   public int getCodigo() {
      return this.codigo;
   }

   public double getBase() {
      return this.base;
   }

   public double getAltura() {
      return this.altura;
   }

   public int getManzana() {
      return this.manzana;
   }
   
   @Override
   public String toString() {
      return "Terreno {codigo = " + this.codigo + ", base = " + this.base + ", altura = " + this.altura + ", manzana = " + this.manzana + "}";
   }

   public Boolean equals(Terreno unTerreno) {
      return this.codigo == unTerreno.codigo;
   }

   public void setBase(double laBase) {
      this.base = laBase;
   }

   public void setAltura(double laAltura) {
      this.altura = laAltura;
   }

   public void setManzana(int laManzana) {
      this.manzana = laManzana;
   }

   public double perimetro() {
      double perimetro = 2.0D * (this.base + this.altura);
      return perimetro;
   }

   public double superficie() {
      double superficie = this.base * this.altura;
      return superficie;
   }

   public double valorM2(double precioM2) {
      double superficie = this.superficie();
      double valorM2 = precioM2 * superficie;
      return valorM2;
   }
}