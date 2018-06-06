package Variables;

public class PrimerPrint {

	// aca empieza el metodo MAIN
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horastrab = 40;
		String nombreEmpleado = "Ramon";
		char GeneroEmpleado = 'M';
		int valorhora = 200;
		int sueldo = 0;
		if (horastrab <= 40) {
			sueldo = horastrab * valorhora;
			System.out.println("El empleado "  + nombreEmpleado +  " va a cobrar un sueldo de "  + sueldo +  ", y se siente "  + GeneroEmpleado);
		} else if (horastrab > 60) {
			System.err.println("No puede trabajar de 60 horas semanales");
		}

	}// aca termina el metodo MAIN
		// Si 'horastrab' fue - de 40 entonces -> 'horastrab'x'valor'=Sueldo
		// Si no -> 'horastrab' - 40 ='horExt' entonces ->
		// 'sueldo'=(40x200)+('HorExt'x300)
		// Operandos: '<=''>=''==''=''!=''&&''||'
}// aca termina la clase PrimerPrint