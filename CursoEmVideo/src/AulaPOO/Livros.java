package AulaPOO;

public class Livros implements Publicacao {
    private String autor, titulo;
    private int totpag, pagatual;
    private boolean open;
    private Pessoa leitor;

    public Livros(String autor, String titulo, Pessoa leitor, int totpag, int pagatual, boolean open) {
        this.autor = autor;
        this.titulo = titulo;
        this.leitor = leitor;
        this.totpag = totpag;
        this.pagatual = pagatual;
        this.open = open;
    }

    public String detalhes() {
        return "Livro " + "Título= " +"{"+ titulo + "}" + " \n Autor= " + autor + 
               "\n Total de Páginas=" + totpag + "  Página Atual= " + pagatual + 
               "\n Aberto= " + open + "\n  Leitor= " + leitor.getNome()+","+ 
               " Sexo=" + leitor.getSexo()+","
               + " Idade=" + leitor.getIdade();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotpag() {
        return totpag;
    }

    public void setTotpag(int totpag) {
        this.totpag = totpag;
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    @Override
    public void abrir() {
        this.open = true;
    }

    @Override
    public void fechar() {
        this.open = false;
    }

    @Override
    public void folhear(int pagina) {
       if (pagina > this.totpag) {
    	   this.pagatual = 0;
    	   System.out.println("Livro possui somente 300 paginas.");
        }else {
        	this.pagatual = pagina;
        }
    }

    @Override
    public void avancarPag(int i) {
        if (pagatual < totpag) {
            pagatual++;
        }
    }

    @Override
    public void voltarPag() {
        if (pagatual > 0) {
            pagatual--;
        }
    }

    @Override
    public String toString() {
        return "Livro [Título=" + titulo + ", Autor=" + autor + ", Total de Páginas=" + totpag + 
               ", Página Atual=" + pagatual + ", Aberto=" + open + ", Leitor=" + leitor + "]";
    }

	

	

}

