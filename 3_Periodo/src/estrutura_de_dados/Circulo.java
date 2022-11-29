package estrutura_de_dados;

public class Circulo {
	private Ponto centro;
	private int raio;
	public Circulo() {
		raio=0;
		centro = new Ponto(0,0);
	}
	public Circulo(Ponto centro, int raio) {
		
		this.centro = centro;
		this.raio = raio;
	}
	
	public String toString() {
		return " [" + centro + "," + raio + "]";
	}

	public Ponto getCentro() {
		return centro;
	}
	public void setCentro(Ponto centro) {
		this.centro = centro;
	}
	public int getRaio() {
		return raio;
	}
	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	
	
	
	
	
	

	
	

}
