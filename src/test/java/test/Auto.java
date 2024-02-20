package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;	
	static int cantidadCreados;
	
	int cantidadAsientos(){
		int totalAsientos = 0;
		for (int i=0; i<asientos.length;i++) {
			if (asientos[i] != null) {
				totalAsientos++;
			}
		} 
		return totalAsientos;
	}
	public String verificarIntegridad() {
	    if (this.motor == null || this.asientos == null || this.asientos.length == 0) {
	        return "Las piezas no son originales";
	    }

	    if (this.motor.registro != this.registro) {
	        return "Las piezas no son originales";
	    }

	    for (int i = 0; i < asientos.length; i++) {
	        if (asientos[i] == null || asientos[i].registro != registro) {
	            return "Las piezas no son originales";
	        }
	    }

	    return "Auto original";
	}
