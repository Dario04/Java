
public class Motor {
private int cantidadCaballosFuerza;
private String tipoCombustion;

public Motor(int cantidadCaballosFuerza, String tipoCombustion) {
	super();
	this.cantidadCaballosFuerza = cantidadCaballosFuerza;
	this.tipoCombustion = tipoCombustion;
}
public int getCantidadCaballoFuerza() {
	return cantidadCaballosFuerza;
}
public String getTipoCombustion() {
	return tipoCombustion;
}
@Override
public String toString() {
	return "Motor [cantidadCaballosFuerza=" + cantidadCaballosFuerza + ", tipoCombustion=" + tipoCombustion + "]";
}
}