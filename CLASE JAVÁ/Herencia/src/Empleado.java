
public abstract class Empleado {
	
	private String nombre, cargo;
	private int numEmpleado , sueldo;
	
	static private int contador = 0;
	
	public Empleado(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		numEmpleado = contador++;
	}
	public void aumentarSueldo(int porcentaje) {
		sueldo = sueldo + sueldo * (porcentaje/100);
	}
	public String toString() {
		return "Num. empleado
	}
	}
