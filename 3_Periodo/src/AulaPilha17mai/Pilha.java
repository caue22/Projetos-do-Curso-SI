package AulaPilha17mai;

public class Pilha <T> {
	private int topo;
	private ListaEncadeada <T> lista;

	public Pilha() {
		this.topo = -1;
		this.lista = new ListaEncadeada <>();

	}

	public boolean push(T elemento) {
		this.topo++;
		return this.lista.adiciona(this.topo, elemento);

	}

	public T pos() {
		T elemento;
		elemento = this.lista.busca(topo);
		this.lista.remove(topo);
		this.topo--;
		return elemento;
	}

	public boolean isEmpty() {
		return this.topo == -1;

	}

	public T top() {
		return this.lista.busca(this.topo);
	}

	@Override
	public String toString() {
		return "Pilha [topo=" + topo + ", lista" + lista + "]";
	}

}
