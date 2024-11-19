package CursoEmVideo;

public class Funcionario extends Pessoa {
private String Setor;
private boolean trabalhando;

public void mudatrabalho() {
	this.trabalhando = ! this.trabalhando;
	
}

public String getSetor() {
	return Setor;
}

public void setSetor(String setor) {
	Setor = setor;
}

public boolean isTrabalhando() {
	return trabalhando;
}

public void setTrabalhando(boolean trabalhando) {
	this.trabalhando = trabalhando;
}

}
