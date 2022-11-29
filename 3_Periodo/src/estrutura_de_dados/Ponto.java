package estrutura_de_dados;

public class Ponto {
	private int x;
	private int y;
	
	public static int cont = 0;
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public Ponto() {
		cont++;
	}
	public Ponto(int x,int y) {
		cont ++;
		this.x=x;
		this.y=y;
		
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
