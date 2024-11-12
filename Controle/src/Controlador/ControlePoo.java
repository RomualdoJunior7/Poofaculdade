package Controlador;

public class ControlePoo {
	protected int volume;
	protected boolean ligado;
	protected boolean tocando;

	public ControlePoo() {

		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}

	public void ligar() {
		this.setLigado(true);
	}

	public void desligar() {
		this.setLigado(false);
	}

	public void abrirmenur() {
		System.out.println("-----Menu-----");
		System.out.println("Esta ligado? " + this.getLigado());
		System.out.println("Esta tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print("|");
		}
	}

	public void fecharmenu() {
		System.out.println("fechando menu...");
	}

	public void maisvolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Impossível aumentar volume.");
		}
	}

	public void menosvolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossível diminuir volume.");
		}
	}

	public void ligarmudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	public void desligarmudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("Nao consigo reproduzir.");
		}
	}

	public void pause() {
		if (this.getTocando() && this.getTocando()) {
			this.setTocando(false);
		}
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private boolean setLigado(boolean ligado) {
		return this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

}
