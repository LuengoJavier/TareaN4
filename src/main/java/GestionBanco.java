import java.util.ArrayList;

public class GestionBanco {
	private ArrayList<SucursalBancaria> sucursalesBancarias;
	private ArrayList<Cliente> clientes;

	public GestionBanco(){
		this.sucursalesBancarias = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}
	public ArrayList<SucursalBancaria> getSucursalesBancarias(){
		return sucursalesBancarias;
	}
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}

	public Cliente agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		return cliente;
	}
	public Cliente buscarCliente(Cliente cliente) {
		for (Cliente cliente1 : this.clientes){
			if (cliente1.equals(cliente)){
				return cliente;
			}
		}
		return null;
	}

	public SucursalBancaria agregarSucursal(SucursalBancaria sucursalBancaria) {
		this.sucursalesBancarias.add(sucursalBancaria);
		return sucursalBancaria;
	}

	public CuentaBancaria asociarCuentaBancaria(CuentaBancaria cuentaBancaria, Cliente cliente, SucursalBancaria sucursalBancaria) {
		cliente.getCuentas().add(cuentaBancaria);
		sucursalBancaria.getCuentas().add(cuentaBancaria);
		return cuentaBancaria;
	}

	public void mostrarCuentasCliente(Cliente cliente) {
		for (CuentaBancaria cuenta : cliente.getCuentas()){
			System.out.println(cuenta);
		}
	}

	public ArrayList<CuentaBancaria> listaCuentasAhorro(SucursalBancaria sucursalBancaria) {
		ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
		for (CuentaBancaria cuentaBancaria : sucursalBancaria.getCuentas()){
			if (cuentaBancaria.getTipo().equals("Cuenta de Ahorro")){
				cuentas.add(cuentaBancaria);
			}
		}
		return cuentas;
	}

	public ArrayList<CuentaBancaria> listaCuentasCorrientes(SucursalBancaria sucursalBancaria) {
		ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
		for (CuentaBancaria cuentaBancaria : sucursalBancaria.getCuentas()){
			if (cuentaBancaria.getTipo().equals("Cuenta Corriente")){
				cuentas.add(cuentaBancaria);
			}
		}
		return cuentas;
	}


}