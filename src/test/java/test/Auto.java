package test;

public class Auto {
	String modelo;
	int precio;
	int registro;
	Asiento [] asientos;
	String marca;
	Motor motor;
	
	int cantidadCreados;
	
	int cantidadAsientos(){
		return asientos.length;
	}
	String verificarIntegridad(){
		if (this.motor.registro==this.registro){
			for (int i=0; i<asientos.length;i++) {
				if (asientos[i].registro!=registro) {
					return "Las piezas no son originales";
				}
			}
		    return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}
