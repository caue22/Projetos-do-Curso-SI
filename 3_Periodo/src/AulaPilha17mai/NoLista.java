package AulaPilha17mai;

public class NoLista<T> {
	private T info;
	private NoLista<T> prox;
	
	public NoLista() {
		this.info = null;
		this.prox = null;
	}
	public NoLista(T info) {
		this.info = info;
		this.prox = null;
	}
	@Override
	public String toString() {
		return  info +  " ";
	}
	@Override
	public boolean equals(Object obj) {
		NoLista<T> aux = (NoLista) obj;
		if (this.getInfo() == aux.getInfo()){
			return true;
		}
		return false;
	}
	
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public NoLista getProx() {
		return prox;
	}
	public void setProx(NoLista prox) {
		this.prox = prox;
	}
	
}