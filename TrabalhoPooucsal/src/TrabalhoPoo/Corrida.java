package TrabalhoPoo;

public class Corrida {
    private static int distanciam = 25;  // Distância da corrida

    public static void main(String[] args) throws InterruptedException {
        Carros carro1 = new Carros("Ayrton Senna");
        Carros carro2 = new Carros("Alonso");

        int rodada = 0;

        while (carro1.getDistanciaPercorrida() < distanciam && carro2.getDistanciaPercorrida() < distanciam) {
            rodada++;
            System.out.println("Rodada " + rodada);

            carro1.mover();
            carro2.mover();

            Posicoes(carro1, carro2);

            Thread.sleep(1000);
        }

        Vencedor(carro1, carro2);
    }

    private static void Posicoes(Carros carro1, Carros carro2) {
        System.out.println(carro1.getNome() + " esta na posicao: " + carro1.getDistanciaPercorrida());
        System.out.println(carro2.getNome() + " esta na posicao: " + carro2.getDistanciaPercorrida());
    }

    private static void Vencedor(Carros carro1, Carros carro2) {
        if (carro1.getDistanciaPercorrida() >= distanciam && carro2.getDistanciaPercorrida() >= distanciam) {
            System.out.println("Empate!");
        } else if (carro1.getDistanciaPercorrida() >= distanciam) {
            System.out.println(carro1.getNome() + " venceu!");
        } else {
            System.out.println(carro2.getNome() + " venceu!");
        }
    }
}
