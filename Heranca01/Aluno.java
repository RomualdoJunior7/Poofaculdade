package CursoEmVideo;

public class Aluno extends Pessoa {
	
private int mat; 
private String Curso;

public void CancelarMatricula() {
	System.out.println("Matrcricula será cancelada.");
}

public int getMat() {
	return mat;
}

public void setMat(int mat) {
	this.mat = mat;
}

public String getCurso() {
	return Curso;
}

public void setCurso(String curso) {
	Curso = curso;
}

	}
