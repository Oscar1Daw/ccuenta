
public class Ccuenta {


	    // Atributos de cuenta
	    private String nombre;
	    private static String cuenta;
	    private static double saldo;
	    private double tipoInteres;



	    public Ccuenta (String nom, String cue, double sal, double tipo)
	    {
	        nombre =nom;
	        cuenta=cue;
	        saldo=sal;
	    }

	   //Para probar Junit
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("Cantidad negativa");
	        saldo = saldo + cantidad;
	    }

	    //Para probar JUnit
	    public void retirar (double cantidad) throws Exception
	    {
	        if (cantidad < 0)
	            throw new Exception ("Cantidad Negativa");
	        if (this.getSaldo()< cantidad)
	            throw new Exception ("Saldo insuficiente");
	        saldo = saldo - cantidad;
	    }

	    // M�todo que me devuelve el n�mero de cuenta
	    public static String getCuenta ()
	    {
	        return cuenta;
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getTipoInteres() {
			return tipoInteres;
		}

		public void setTipoInteres(double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}

		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		 public static double getSaldo (){
			 
		        return saldo;
		    }
	}
