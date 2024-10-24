package principal;
import java.util.Random;
public class Main {
	static double volumeFurgao = 4.79;
	static int nGeracoes = 1000;
	
	
	public static void main(String[] args) {
        Populacao populacao = new Populacao();
        for(int i = 0; i < nGeracoes; i++) {
        	populacao.recriaPopulacao();
        	populacao.treinaPopulacao();
        }   
        System.out.println("RESULTADO FINAL");
        System.out.println("População: ");
        Random random = new Random();
        int tamanho = populacao.populacao.size();
        Individuo i = populacao.populacao.get(random.nextInt(tamanho));
        double valor = 0;
        double volume = 0;
        for (Objetos o : i.listaDeObjetos) {
        	System.out.println(o.nome);
        	valor += o.getValor();
        	volume += o.getVolume();
        }
        System.out.println("Valor: " + valor);
        System.out.println("Volume: " + volume);
    }
}
