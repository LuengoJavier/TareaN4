import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String rut;
	private int edad;
	private ArrayList<CuentaBancaria> cuentas;

	public Cliente(String nombre, String rut, int edad) {
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.cuentas = new ArrayList<>();
	}

	public ArrayList<CuentaBancaria> getCuentas(){
		return this.cuentas;
	}
	public String getNombre() {
		return this.nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}