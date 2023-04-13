public class CuentaDeAhorro extends CuentaBancaria {
	private double reajusteAnual;

	public CuentaDeAhorro(Cliente cliente, int numeroCuenta, int saldo, double reajusteAnual) {
		super(cliente, numeroCuenta, saldo);
		this.reajusteAnual = reajusteAnual;
	}

	public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}

	public String getTipo() {
		return "Cuenta de Ahorro";
	}
	@Override
	public String toString() {
		return "Cliente: "+getCliente().getNombre()+"\nCuenta: "+getTipo()+"\nN° cuenta: "+getNumeroCuenta()+
				"\nSaldo: "+getSaldo()+"\nReajuste Anual: "+getReajusteAnual()+"\n";
	}
}