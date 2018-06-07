package repasoIF;

public class EjercicioRepasoIF {

	public static void main(String[] args) {

		pago(7.5, 35);
		pago(8.2, 47);
		pago(10.0, 73);

	}

	public static void pago(double valorBase, int horas) {

		if (valorBase < 8.0) {
			System.out.println("Se le debe pagar por lo menos $8.00/hora");
		} else if (horas > 60) {
			System.out.println("No puede trabajar mas de 60 horas semanales");
		} else {
			int horasExtra = 0;
			if (horas > 40) {
				horasExtra = horas - 40;
				horas = 40;
			}
			double pago = valorBase * horas;
			pago += horasExtra * valorBase * 1.5;
			System.out.println("Pagar a este empleado $" + pago);
		}
	}

}