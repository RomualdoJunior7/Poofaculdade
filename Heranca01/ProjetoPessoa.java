package CursoEmVideo;

public class ProjetoPessoa {

	public static void main(String[] args) {
	Pessoa p1 = new Pessoa();
	Aluno p2 = new Aluno();
	Professor p3 = new Professor();
	Funcionario p4 = new Funcionario();
	
	p1.setNome("Romualdo");
	p2.setNome("Lucas"); 
	p3.setNome("Helena"); 
	p4.setNome("João");
	
	p1.setSexo("M");
	p2.setSexo("M");
	p3.setSexo("F");
	p4.setSexo("M");
	
	p2.setCurso("BES");
	p3.setSalario(2075.24);
	p4.setSetor("Dev");
	p3.Rceberaumento(500);
	
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}
	

}
