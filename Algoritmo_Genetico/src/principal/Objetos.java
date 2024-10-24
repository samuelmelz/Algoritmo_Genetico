package principal;

public class Objetos {
	int posicao;
	double valor;
	double volume;
	String nome;
	
	
	public Objetos(int x) {
		switch(x) {
		case 0: this.nome = "Geladeira Dako"; this.volume = 0.751; this.valor = 999.90; posicao = x; break;
        case 1: this.nome = "Iphone 6"; this.volume = 0.0000899; this.valor = 2911.12; posicao = x; break;
        case 2: this.nome = "TV 55"; this.volume = 0.400; this.valor = 4346.99; posicao = x; break;
        case 3: this.nome = "TV 50"; this.volume = 0.290; this.valor = 3999.90; posicao = x; break;
        case 4: this.nome = "TV 42"; this.volume = 0.200; this.valor = 2999.00; posicao = x; break;
        case 5: this.nome = "Notebook Dell"; this.volume = 0.00350; this.valor = 2499.90; posicao = x;break;
        case 6: this.nome = "Ventilador Panasonic"; this.volume = 0.496; this.valor = 199.90; posicao = x; break;
        case 7: this.nome = "Microondas Eletrolux"; this.volume = 0.0424; this.valor = 308.66; posicao = x; break;
        case 8: this.nome = "Microondas LG"; this.volume = 0.0544; this.valor = 429.90; posicao = x; break;
        case 9: this.nome = "Microondas Panasonic"; this.volume = 0.0319; this.valor = 299.29; posicao = x; break;
        case 10: this.nome = "Geladeira Brastemp"; this.volume = 0.0635; this.valor = 849.00; posicao = x; break;
        case 11: this.nome = "Geladeira Consul"; this.volume = 0.870; this.valor = 1199.90; posicao = x; break;
        case 12: this.nome = "Notebook Lenovo"; this.volume = 0.498; this.valor = 1999.90; posicao = x; break;
        case 13: this.nome = "Notebook Asus"; this.volume = 0.0527; this.valor = 3999.00; posicao = x; break;
        
        }
	}
	
	public double getValor(){
		return this.valor;
	}
	
	public double getVolume(){
		return this.volume;
	}	
	public String getNome() {
		return this.nome;
	}
}