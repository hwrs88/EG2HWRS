package spai.egit2;

import java.util.ArrayList;
import java.util.List;

public class ColeccionDecimales {
	private List<Double> coleccion;

	public ColeccionDecimales(double[] coleccion) {
		this.coleccion = new ArrayList<Double>();
		for (double item : coleccion) {
			this.coleccion.add(item);
		}
	}

	public ColeccionDecimales() {
		this(new double[0]);
	}

	public Double suma() {
		double suma = 0;
		for (double item : this.coleccion) {
			suma += item;
		}
		return suma;
	}

	public double mayor() {
		double mayor = Double.NEGATIVE_INFINITY;
		for (double item : this.coleccion) {
			if (item > mayor)
				mayor = item;
		}
		return mayor;
	}

	// Este metodo debe multiplicar la colecci�n de decimales y devolver el
	// valor.
	public double multiplicar() {
		boolean primero = true;
		double total = Double.NEGATIVE_INFINITY;
		for (double item : this.coleccion) {
			if (primero) {
				total = item;
				primero = false;
				continue;
			}
			total = total * item;
		}
		return total;
	}
}