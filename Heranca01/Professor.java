package CursoEmVideo;

public class Professor extends Pessoa{
	
	private String especialidade;
	private double Salario;
	
	public void Rceberaumento(double aumento) {
		this.Salario += aumento;	
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
}
