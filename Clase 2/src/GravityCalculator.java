
public class GravityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Operandos:
		// '+=' Sumarle a la variable de la izquierda a la derecha
		// sin borrar lo anterior (no es un operando)

		// '-=' Restarle a la variable de la izquierda a la derecha
		// sin borrar lo anterior (no es un operando)

		// '++' Aumenta la variable en 1 (si empezamos en 0)

		// '--' Disminuye la variable en 1, si valia 10, ahora vale 9

		// '<=' Significa : Menor o igual (no es un operando)

		// '>=' Significa : Mayor o igual (no es un operando)

		// '==' Se utiliza para comparar dos valores enteros (no es un operando)

		// '=' Asigna un valor de derecha a izquierda

		// '!=' Se utiliza para preguntar si es distento (no es un operando)

		// '&&' Es el 'y' logico. Une dos condiciones y para que sea verdadero,
		// ambas deben serlo (no es un operando)

		// '||' Es el 'o' logico. Une dos condiciones y para que sea verdadero,
		// una almenos debe serlo (no es un operando)
		// double gravity = -9.81;
		// double initialVelocity = 0.0;
		// double fallingTime = 10.0;
		// double initialPosition = 0.0;
		// double finalPosition = 0.0;
		// System.out.println("La pocision del objeto despues de " + fallingTime + "
		// seconds is " + finalPosition + "m");
		// X(t) = 0.5 x at² + vit + xi (Formula de distancia)

		double gravity = -9.81;
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;

		finalPosition = 0.5 * gravity * (fallingTime * fallingTime) + (initialVelocity * fallingTime) + initialPosition;

		System.out.println("La pocision del objeto despues de " + fallingTime + " seconds is " + finalPosition + " m");
	}
}