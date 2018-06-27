

public class Herencia {

	public static void main(String[] args) {
		Ejecutivo jefe = new Ejecutivo("Aquiles Meto", 1000, jerarquia.L4);
		jefe.asignarPresupuesto(1500);
	jefe.aumentarSueldo(50);
	jefe.colocarCargo("Gerente Informatica");
	System.out.println("El sueldo del ejecutivo es " + jefe.obtenerSueldo());
	System.out.println("La jerarquia del ejecutivo es " + jefe.traigoJerarquia());
	
	Emleado2 dos = new Empleado2(jerarquia.L3);
	
	System.out.println("Jerarquia empleado2: " + dos.jerar);
	System.out.println(jefe);
	Ejecutivo gerente = new Ejecutivo("Susana Horia", 1500, jerarquia.L2);
	System.out.println(gerente);
	}

}
