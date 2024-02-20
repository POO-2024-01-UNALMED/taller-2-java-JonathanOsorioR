package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro=registro;
	}
	void asignarTipo(String tipo) {
		if ("electrico".equals(tipo) || "gasolina".equals(tipo)) {
			this.tipo=tipo;
		}
	}
}
