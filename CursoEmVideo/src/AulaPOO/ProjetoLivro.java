package AulaPOO;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livros[] l = new Livros[3];  

        p[0] = new Pessoa("Romualdo", 19, "M");
        p[1] = new Pessoa("Lucas", 18, "M");

        l[0] = new Livros("Gustavo Guanabara", "Aprendendo POO", p[0], 300, 0, false);
        l[1] = new Livros("Romualdo", "Aprendendo Front-end", p[1], 154, 0, false);
        l[2] = new Livros("Maria Candidata", "Java Avançado", p[0], 800, 0, false);

        l[0].folhear(100);
        l[0].abrir();
        l[0].avancarPag();
        l[0].fechar();
        System.out.println(l[0].detalhes());  
    }
}
