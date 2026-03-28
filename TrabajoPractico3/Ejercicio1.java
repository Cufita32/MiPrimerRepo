package TrabajoPractico3;

 class Terreno2 //UML
{
    /*--------------------------------------------------------------------------------------------------------------------*/
    //variables de clase
    // tambien llamados atributos
    private int codigo, manzana;
    private double base,altura;
    
    /*--------------------------------------------------------------------------------------------------------------------*/
    
    //constructores
    public Terreno2(int unCodigo)
    {
        this.codigo=unCodigo;
        this.base=0;
        this.altura=0;
    }
    
    public Terreno2(int unCodigo, double laBase, double laAltura, int laManzana)
    {
        this.codigo=unCodigo;
        this.base=laBase;
        this.altura=laAltura;
        this.manzana=laManzana;
    }
    
    /*--------------------------------------------------------------------------------------------------------------------*/
    
    //observadores
    
    public int getCodigo()
    {return codigo;}
    public double getBase()
    {return base;}
    public double getAltura()
    {return altura;}
    public int getManzana()
    {return manzana;}
    @Override
    public String toString()
    {
        return "Terreno[codigo"+codigo+", base= "+base+", altura= "+altura+", manzana= "+manzana+"]";
    }
    public boolean equals(Terreno2 unTerreno)
    {return this.codigo==unTerreno.getCodigo();}
    /*--------------------------------------------------------------------------------------------------------------------*/
    //Modificadores
    public void setBase(double laBase)
    {
        this.base=laBase;
    }
    public void setAltura(double laAltura)
    {
        this.altura=laAltura;
    }
    public void setManzana(int laManzana)
    {
        this.manzana=laManzana;
    }
    
 }

