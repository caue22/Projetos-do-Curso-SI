package ListaDuplaEncadeada;

public class NoLista2 {
	private String inf;
	
	private NoLista2 ant;
	private NoLista2 prox;
	
	
	public NoLista2() {
		
	}
	public NoLista2(String info) {
		this.inf = info;
		this.ant = null;
		this.prox = null;
		
		
	}
	protected String getInf() {
		return inf;
	}
	protected void setInf(String inf) {
		this.inf = inf;
	}
	protected NoLista2 getAnt() {
		return ant;
	}
	protected void setAnt(NoLista2 ant) {
		this.ant = ant;
	}
	protected NoLista2 getProx() {
		return prox;
	}
	protected void setProx(NoLista2 prox) {
		this.prox = prox;
	}
	@Override
	public String toString() {
		return "NoLista2 [inf=" + inf + "]";
	}
	
	

}
