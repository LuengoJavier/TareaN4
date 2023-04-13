public class Launcher {

	public static void main(String[] args) {
		inicializar();
	}
	public static void inicializar(){
		GestionBanco gestionBanco = new GestionBanco();
		//Se crea una nueva sucursal
		gestionBanco.agregarSucursal(new SucursalBancaria("0000012","4780000"));
		//Se agrgan clientes
		Cliente cliente = new Cliente("José","14.865.789-4",46);
		Cliente cliente1 = new Cliente("Mario","12.346.654-8", 50);
		gestionBanco.agregarCliente(cliente);
		gestionBanco.agregarCliente(cliente1);
		CuentaDeAhorro cuenta = new CuentaDeAhorro(cliente,0001345,200000, 1.25);
		CuentaCorriente corriente = new CuentaCorriente(cliente,000433,30000, 2000000);
		gestionBanco.asociarCuentaBancaria(cuenta,cliente,gestionBanco.getSucursalesBancarias().get(0));
		gestionBanco.asociarCuentaBancaria(corriente,cliente,gestionBanco.getSucursalesBancarias().get(0));

		gestionBanco.mostrarCuentasCliente(cliente);




	}
}