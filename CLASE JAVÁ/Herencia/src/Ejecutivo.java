
public class Ejecutivo extends Empleado{

		int presupuesto;
		private jerarquia jerar;
		
		public Ejecutivo (String n, int s, jerarquia jerar) {
		super (n,s);
		this.jerar = jerar;
		
	}

	public void asignarPresupuesto(int p) {
		presupuesto = p;
	}
	
	public jerarquia traigoJerarquia() {
		return jerar;
	}
}
