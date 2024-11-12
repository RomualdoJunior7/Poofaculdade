package luta;

public class Ultraemojicombat {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[3];

		l[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Puts Script", "Brasil", 29, 1.72f, 67.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "Eua", 21, 1.82f, 86.7f, 21, 5, 4);
		System.out.println("---------------------");
		System.out.println("H O R A   D A   L U T A");
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.Lutar();
		l[0].status();
		l[1].status();

	}

}
