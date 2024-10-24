package principal;

import java.util.ArrayList;
import java.util.Random;


public class Populacao {
	static int nPopulacao = 100;
	static double tMutacao = 0.0005;
	static double valorMaximo = 27042.36;
	ArrayList<Individuo> populacao = new ArrayList<>();
	
	//Gera uma populacao aleatoria
	public Populacao() {
		for(int i = 0; i < nPopulacao; i++)
        {
        	Individuo individuo = new Individuo();
        	populacao.add(individuo);
        }
	}
	
	public void recriaPopulacao() {
		Roleta roleta = new Roleta(fitnessTotal());
		Individuo ind = roleta.retornaIndividuo(populacao);
		populacao.clear();
		for(int i = 0; i < nPopulacao; i++)	{
			//Faz cópia do indivíduo e do arraylist pra evitar alterações erradas
			ArrayList<Objetos> listaDeObjetos2 = new ArrayList<Objetos>(ind.listaDeObjetos);
			double x = ind.valorTotal; double y = ind.volumeTotal;
			Individuo ind2 = new Individuo(listaDeObjetos2, y, x);
			populacao.add(ind2);
		}
	}
	
	public void treinaPopulacao()
	{
		for(Individuo i : populacao) {
			Random random = new Random();
			double x = random.nextDouble();
			if(x < tMutacao)
			{
				i.geraMutacao();
			}
		}
	}
	
	public double fitnessTotal()
	{
		double fitnessTotal = 0.0;
		for(Individuo i : populacao)
		{
			fitnessTotal += i.calculaFitness();
		}
		return fitnessTotal;
	}
}
