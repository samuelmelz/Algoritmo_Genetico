package principal;
import java.util.ArrayList;
import java.util.Random;

public class Individuo {
	ArrayList<Objetos> listaDeObjetos = new ArrayList<>();
	double volumeTotal;
	double valorTotal;
	
	public Individuo()
	{
		Random random = new Random();
		for(int i = 0; i < 14; i++)
		{
			addObjeto(random.nextInt(14));
		}
	}
	
	public Individuo(ArrayList<Objetos> listaDeObjetos, double volumeTotal, double valorTotal) {
		this.listaDeObjetos = listaDeObjetos;
		this.volumeTotal = volumeTotal;
		this.valorTotal = valorTotal;
	}
	
	public void addObjeto(int x)
	{
		Objetos objeto = new Objetos(x);
		//Se nao excede o volume e não já está presente
		if(objeto.getVolume() + volumeTotal <= Main.volumeFurgao && !contemObjeto(x)) {
			listaDeObjetos.add(objeto);
			this.volumeTotal += objeto.getVolume();
			this.valorTotal += objeto.getValor();
		}
	}
	
	public boolean contemObjeto(int x)
	{
		for(Objetos o : this.listaDeObjetos) {
			if(o.posicao == x) {
				return true;
			}
		}
		return false;
	}
	
	public void removeObjeto(int x)
	{
		volumeTotal -= listaDeObjetos.get(x).getVolume();
		valorTotal -= listaDeObjetos.get(x).getValor();
		listaDeObjetos.remove(x);
	}
	
	public double calculaFitness() {
		return this.valorTotal/Populacao.valorMaximo;
	}
	
	public void geraMutacao(){
		Random random = new Random();
		for(int i = 0; i < 2; i++) {
			removeObjeto(random.nextInt(listaDeObjetos.size()));
		}
		
		for(int i = 0; i < 5; i++) {
			addObjeto(random.nextInt(14));
		}
	}
}