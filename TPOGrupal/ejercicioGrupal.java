package TPOGrupal;

import java.io.PrintStream;
import java.util.Scanner;

public class ejercicioGrupal 
{
    public static void añadirTerreno(Propietario propietario, int codigo, int manzana, double altura, double base, int indiceT) 
    {
      Terreno t = new Terreno(codigo, base, altura, manzana);
      if (indiceT < 10) {
         propietario.setTerreno(t, indiceT);
      } else {
         System.out.println("Se llego al limite de terrenos.");
      }
   }

   public static void crearPropietario(int dni, String cuit, String nombre, String apellido, String email, int nroTel, Propietario[] propietarios) 
   {
      int contador = 0;

      for(int i = 0; i < propietarios.length; ++i) {
         if (propietarios[i].getDni() != 0) {
            ++contador;
         }
      }

      Propietario nuevoPropietario = new Propietario(dni, cuit, nombre, apellido, email, nroTel);
      propietarios[contador] = nuevoPropietario;
   }

   public static void mostrarTerrenosProp(Propietario propietario) 
   {
      for(int i = 0; i < propietario.terrenos.length; ++i) {
         System.out.println(propietario.terrenos[i].toString());
      }
   }

   public static double calcularPrecioVentaTotal(double precioM2, Propietario p) 
   {
      double acumulador = 0.0D;

      for(int i = 0; i < p.terrenos.length; ++i) {
         acumulador += p.terrenos[i].valorM2(precioM2);
      }

      return acumulador;
   }

   public static Propietario encontrarPropietario(int dni, Propietario[] propietarios) 
   {
      int contador = 0;
      Propietario propietarioEncontrado = new Propietario();
      int longitud = propietarios.length;
      Boolean existe = false;

      for(int i = 0; i < longitud; ++i) {
         if (propietarios[i].getDni() != 0) {
            ++contador;
         }

         if (propietarios[i].getDni() == dni) {
            propietarioEncontrado = propietarios[i];
            existe = true;
         }
      }

      if (!existe) {
         propietarioEncontrado = new Propietario(dni);
         propietarios[contador] = propietarioEncontrado;
      }

      return propietarioEncontrado;
   }

   public static Boolean validarCuit(String cuit) 
   {
      int suma = 0;
      int[] coeficientes = new int[]{2, 3, 4, 5, 6, 7, 2, 3, 4, 5};
      if (cuit.length() != 11) {
         return false;
      } else {
         for(int i = 0; i < 10; ++i) {
            int digito = Character.getNumericValue(cuit.charAt(i));
            suma += digito * coeficientes[i];
         }

         int ultDigito = Character.getNumericValue(cuit.charAt(10));
         int resto = suma % 11;
         int DV = 11 - resto;
         return DV != ultDigito && resto != 1 && resto != 0 ? false : true;
      }
   }

   public static Propietario seleccionarPropietario(Propietario[] propietarios, int dni) 
   {
      Propietario propietarioSeleccionado = new Propietario();
      Boolean encontrado = false;

      for(int i = 0; encontrado = false && i < propietarios.length; ++i) {
         if (propietarios[i].getDni() == dni) {
            propietarioSeleccionado.setDni(propietarios[i].getDni());
            propietarioSeleccionado.setCuit(propietarios[i].getCuit());
            propietarioSeleccionado.setNombre(propietarios[i].getNombre());
            propietarioSeleccionado.setApellido(propietarios[i].getApellido());
            propietarioSeleccionado.setEmail(propietarios[i].getEmail());
            propietarioSeleccionado.setNrotel(propietarios[i].getNrotel());
            encontrado = true;
         }
      }

      if (!encontrado) {
         System.out.println("Ese dni no corresponde a ningun propietario");
      }

      return propietarioSeleccionado;
   }

   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      Propietario p1 = new Propietario();
      Propietario[] propietarios = new Propietario[]{p1, p1, p1, p1, p1, p1, p1, p1, p1, p1};
      int indiceT = 0;
      System.out.println("Menu");
      System.out.println("1: Añadir un terreno");
      System.out.println("2: Añadir propietario");
      System.out.println("3: Mostrar todos los terrenos de un propietario");
      System.out.println("4: Mostrar el precio de todos los terrenos de un propietario");
      System.out.println("5: Verificar si el cuit ingresado es valido");
      int resp = sc.nextInt();

      while(resp != 0) {
         Propietario propietarioSeleccionado;
         int dni;
         String cuit;
         switch(resp) {
         case 1:
            System.out.println("Ingrese el codigo del terreno");
            int codigo = sc.nextInt();
            System.out.println("Ingrese la manzana del terreno");
            int manzana = sc.nextInt();
            System.out.println("Ingrese la altura del terreno");
            double altura = sc.nextDouble();
            System.out.println("Ingrese la base del terreno");
            double base = sc.nextDouble();
            System.out.println("Ingrese el dni del propietario del terreno");
            dni = sc.nextInt();
            Propietario propietarioEncontrado = encontrarPropietario(dni, propietarios);
            añadirTerreno(propietarioEncontrado, codigo, manzana, altura, base, indiceT);
            resp = sc.nextInt();
            ++indiceT;
            break;
         case 2:
            System.out.println("Ingrese el nombre");
            String nombre = sc.next();
            System.out.println("Ingrese el apellido");
            String apellido = sc.next();
            System.out.println("Ingrese el dni");
            dni = sc.nextInt();
            System.out.println("Ingrese el cuit");
            cuit = sc.next();
            System.out.println("Ingrese el email");
            String email = sc.next();
            System.out.println("Ingrese el nro de telefono");
            int nroTel = sc.nextInt();
            crearPropietario(dni, cuit, nombre, apellido, email, nroTel, propietarios);
            resp = sc.nextInt();
            break;
         case 3:
            System.out.println("Ingrese el dni del propietario deseado");
            dni = sc.nextInt();
            propietarioSeleccionado = seleccionarPropietario(propietarios, dni);
            System.out.println("propietarioSeleccionado: " + propietarioSeleccionado.toString());
            mostrarTerrenosProp(propietarioSeleccionado);
            PrintStream var10000 = System.out;
            String var10001 = p1.getNombre();
            var10000.println("Estos son todos los terrenos del propietario: " + var10001 + p1.getApellido());
            resp = sc.nextInt();
            break;
         case 4:
            System.out.println("Ingrese el dni del propietario deseado");
            dni = sc.nextInt();
            propietarioSeleccionado = seleccionarPropietario(propietarios, dni);
            System.out.println("Ingrese el valor del M2");
            double valorMCuadrado = sc.nextDouble();
            double valorNeto = calcularPrecioVentaTotal(valorMCuadrado, propietarioSeleccionado);
            System.out.println("Todos sus terrenos tienen un precio total de: $" + valorNeto);
            resp = sc.nextInt();
            break;
         case 5:
            System.out.println("Ingrese el cuit");
            cuit = sc.next();
            Boolean cuitValido = validarCuit(cuit);
            System.out.println("El cuit es valido: " + cuitValido);
            resp = sc.nextInt();
            break;
         default:
            System.out.println("Fin.");
         }
      }
   }
}