package luta;

public class Lutador {
	private String Nome;
	private String Nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		Nome = nome;
		Nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " Anos ");
		System.out.println("Pesando: " + this.getPeso());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Vitorias: " + this.getVitorias());
		System.out.println("Empates: " + this.getEmpates());
		System.out.println("Derrotas: " + this.getDerrotas());
	}

	public void status() {
		System.out.println(this.getNome());
		System.out.println("É um peso: " + this.getCategoria());
		System.out.println(this.getVitorias() + " Vitorias");
		System.out.println(this.getDerrotas() + " Derrotas");
		System.out.println(this.getEmpates() + " Empates");
	}

	public void Categoria() {
		this.categoria = categoria;

	}

	public void ganharluta() {
		this.setVitorias(getVitorias() + 1);
	}

	public void PerderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getNacionalidade() {
		return Nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		Nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;

	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";

		} else if (this.peso < 83.9) {
			this.categoria = "Médio";

		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";

		} else {
			this.categoria = "Invalido";
		}

	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
