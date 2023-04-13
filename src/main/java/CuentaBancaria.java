
public abstract class CuentaBancaria {
	private int numeroCuenta;
	private int saldo;
	private Cliente cliente;

	public CuentaBancaria(Cliente cliente, int numeroCuenta, int saldo) {
		this.cliente = cliente;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	public Cliente getCliente(){
		return this.cliente;
	}

	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}


	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public abstract String getTipo();
}