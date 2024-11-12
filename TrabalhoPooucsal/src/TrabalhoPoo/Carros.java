package TrabalhoPoo;

import java.util.Random;

public class Carros {
	private String nome;
    private int distanciaP;

    public Carros(String nome) {
        this.nome = nome;
        this.distanciaP = 0;
    }

    public void mover() {
        Random random = new Random();
        this.distanciaP += random.nextInt(3) + 1;
    }

    public String getNome() {
        return nome;
    }

    public int getDistanciaPercorrida() {
        return this.distanciaP;
    }
}