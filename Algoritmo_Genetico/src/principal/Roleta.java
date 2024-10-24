package principal;
import java.util.ArrayList;
import java.util.Random;
public class Roleta {
	
	double fitnessTotal;
	
	public Roleta(double fitness) {
		this.fitnessTotal = fitness;
	}
	
	public Individuo retornaIndividuo(ArrayList<Individuo> populacao) {
		Random random = new Random();
		double i = random.nextDouble() * this.fitnessTotal;
		//Percorre a população diminuindo o fitness de cada um do valor de i. Quando chega a 0, retorna
		for(Individuo ind : populacao) {
			i -= ind.calculaFitness();
			if(i<=0) {
				return ind;
			}
		}
		//Teoricamente nao retorna aqui, é só pra parar de dar erro de retorno
		return null;
	}
}

