public class Main {
    import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulacaoLotoFacil {

    // Método que gera a lista de bolas conforme a distribuição nos tubos
    public static List<String> gerarBolas() {
        List<String> bolas = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            bolas.add("Vermelha " + i);
            bolas.add("Amarela " + i);
            bolas.add("Verde " + i);
            bolas.add("Marrom " + i);
            bolas.add("Azul " + i);
        }
        bolas.add("Rosa 1");
        bolas.add("Rosa 2");
        bolas.add("Preta 1");
        bolas.add("Preta 2");
        bolas.add("Cinza 1");
        bolas.add("Cinza 2");
        bolas.add("Laranja 1");
        bolas.add("Laranja 2");
        bolas.add("Branca 1");
        bolas.add("Branca 2");
        return bolas;
    }

    // Método que simula o giro do globo
    public static void girarGlobo(int giros, boolean velocidade) {
        String vel = velocidade ? "rápida" : "lenta";
        System.out.println("O globo gira " + giros + " vezes a " + vel + " velocidade.");
    }

    // Método que sorteia uma bola aleatoriamente
    public static String sortearBola(List<String> bolas) {
        Random random = new Random();
        int indice = random.nextInt(bolas.size());
        return bolas.remove(indice);
    }

    // Método que executa a simulação completa do sorteio
    public static void simularSorteio() {
        List<String> bolas = gerarBolas();
        List<String> bolasSorteadas = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            girarGlobo(40, false); // Globo gira devagar 40 vezes
            girarGlobo(6, true); // Globo gira rápido 6 vezes
            String bola = sortearBola(bolas); // Sorteia uma bola
            System.out.println("Bola sorteada: " + bola);
            bolasSorteadas.add(bola);
        }

        System.out.println("\nBolas sorteadas: " + bolasSorteadas);
    }

    // Método principal que inicia a simulação
    public static void main(String[] args) {
        simularSorteio();
    }
}

}
