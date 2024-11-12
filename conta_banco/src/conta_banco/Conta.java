package conta_banco;

public class Conta {
public static void main(String [] args) {
	ContaBanco p1 = new ContaBanco();
	p1.setNumconta(77377);
	p1.setDono("Romualdo");
	p1.AbrirConta("CC");
	p1.Depositar(200);
	p1.Sacar(20);
	p1.FecharConta();
	p1.estadoAtual();
}
}
