package variablesPrint;

public class PrimerPrint {

	// aca comienza el método MAIN
	public static void main(String[] args) {

		int horasTrab = 40;
		String nombreEmpleado = "Ramon";
		char sexoEmp = 'f';
		int sueldo = 0;
		int valorHora = 200;

		if (horasTrab <= 40) {
			sueldo = horasTrab * valorHora;
			System.out.println("El empleado: " + nombreEmpleado + 
					" va a cobrar un sueldo de: " + sueldo + 
					", y se siente " + sexoEmp);
		} else if (horasTrab > 60) {
			System.err.println("No puede trabajar más "
					+ "de 60 horas semanales");
		}

	}// acá termina el método MAIN

}// acá termina la clas PRIMERPRINT