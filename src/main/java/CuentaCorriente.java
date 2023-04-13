import java.util.Date;

public class CuentaCorriente extends CuentaBancaria {
	private int lineaSobreGiro;

	public CuentaCorriente(Cliente cliente, int numeroCuenta, int saldo, int lineaSobregiro) {
		super(cliente,numeroCuenta,saldo);
		this.lineaSobreGiro = lineaSobregiro;
	}

	public int getLineaSobreGiro() {
		return this.lineaSobreGiro;
	}

	public void setLineaSobreGiro(int lineaSobreGiro) {
		this.lineaSobreGiro = lineaSobreGiro;
	}

	public String getTipo() {
		return "Cuenta Corriente";
	}

	public String toString() {
		return "Cliente: "+getCliente().getNombre()+"\nCuenta: "+getTipo()+"\nN° cuenta: "+getNumeroCuenta()+
				"\nSaldo: "+getSaldo()+"\nLínea sobregiro: "+getLineaSobreGiro()+"\n";
	}
}