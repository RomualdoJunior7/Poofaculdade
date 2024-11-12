package conta_banco;

public class ContaBanco {
	public int numconta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}

	public void estadoAtual() {
		System.out.println("------------------------------");
		System.out.println("Conta: " + this.getDono());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	public void AbrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);

		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso.");
	}

	public void FecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro, nao pode ser fechada.");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em debito, nao pode ser fechada.");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso.");
		}
	}

	public void Depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realido na conta de: " + this.getDono());
		} else {
			System.out.println("Impossivel depositar em uma conta fechada.");
		}
	}

	public void Sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
			} else {
				System.out.println("Saldo Insuficiente.");
			}
		} else {
			System.out.println("Impossivel sacar.");
		}
	}

	public void PagarMensal() {
		int v = 0;
		if (this.setTipo("CC")) {
			v = 12;
		} else if (this.setTipo("CP")) {
			v = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Impossivel pagar");
		}
	}

	public int getNumconta() {
		return numconta;
	}

	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean setTipo(String tipo) {
		this.tipo = tipo;
		return status;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		 this.status = status;

	}


}
