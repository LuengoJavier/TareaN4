import java.util.ArrayList;

public class SucursalBancaria {
	private String codigoSucursal;
	private String codigoPostal;
	private ArrayList<CuentaBancaria> cuentas;

	public SucursalBancaria(String codigoSucursal, String codigoPostal) {
		this.codigoSucursal = codigoSucursal;
		this.codigoPostal = codigoPostal;
		this.cuentas = new ArrayList<>();
	}
	public ArrayList<CuentaBancaria> getCuentas(){
		return this.cuentas;
	}

	public String getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}
}