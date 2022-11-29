package AulaPilha17mai;

public class ListaEncadeada<T> {
	NoLista<T> lista;
	int tamanho;

	public ListaEncadeada() {
		this.lista = null;
		this.tamanho = 0;
	}
	// m�todos com assinaturas iguais aos da classe vetor
	//adiciona no in�cio
	public boolean adicionaInicio(T elemento) {
		NoLista<T> novoNo = new NoLista(elemento);
		novoNo.setProx(this.lista);
		this.lista = novoNo;
		this.tamanho++;
		return true;
	}
	public boolean adiciona(T elemento) { //adiciona no final
		// testar casos: lista vazia
		if (this.lista == null) {
			adicionaInicio(elemento);
			return true;
		}
		// percorrer at� o �ltimo elemento
		NoLista<T> novoNo = new NoLista(elemento);
		NoLista<T> p = this.lista;
		while ((p.getProx() != null)) {
			p = p.getProx();
		}
		p.setProx(novoNo);
		this.tamanho++;
		return true;
	}
	public boolean adiciona(int posicao, T elemento) {
		if (posicao < 0) return false; //posicao inv�lida
		if (this.tamanho == 0) { //lista vazia
			adicionaInicio(elemento);
			return true;
		}
		if (posicao >= this.tamanho) { //adiciona no final
			adiciona(elemento);
			return true;
		}
		if (posicao == 0) { //adicionar no in�cio
			adicionaInicio(elemento);
			return true;
		}
		//adiciona no meio
		NoLista<T> p = this.lista; //p aponta para o inicio da lista
		NoLista<T> ant = null;
		int pos = 0;
		while ( pos < posicao ) {
			ant = p;
			p = p.getProx();
			pos++;
		}
		NoLista<T> novoNo = new NoLista(elemento);
		novoNo.setProx(p);
		ant.setProx(novoNo);
		this.tamanho++;
		return true;
	}
	public T busca(int posicao) {
		if (this.tamanho == 0) return null; //lista vazia
		if (posicao < 0 || posicao >= this.tamanho) return null; //posicao inv�lida
		NoLista<T> p = this.lista; //p aponta para o in�cio da lista
		int pos = 0;
		while (pos < posicao) {
			p = p.getProx();
			pos++;
		}
		//p aponta para o n� da posicao
		return p.getInfo();
	}
	/*
	 * Busca por elemento. Retorna a posi��o ou -1 caso n�o encontre
	 */
	public int busca(T elemento) {
		if (this.tamanho == 0) return -1; //lista vazia
		NoLista<T> p = this.lista; //p aponta para o in�cio da lista
		int pos = 0;
		while ( p!=null ) {
			if (p.getInfo().equals(elemento)) return pos;
			pos++;
			p = p.getProx();
		}
		//p � null: chegou no final da lista e n�o encontrou elemento
		return -1;
	}
	public int tamanho() {
		return this.tamanho;
	}
	public void remove(int posicao) {
		if (this.tamanho == 0) return; //lista vazia
		if (posicao < 0 || posicao >= this.tamanho) return; //posicao inv�lida
		NoLista<T> p = this.lista; //p aponta para o in�cio da lista
		NoLista<T> ant = null;
		int pos = 0;
		while (pos < posicao) {
			ant = p;
			p = p.getProx();
			pos++;
		}
		//p aponta para o n� que vai ser removido
		if (ant == null) { //remove o primeiro da lista
			this.lista = this.lista.getProx();
		} else {
			ant.setProx(p.getProx());
		}
		this.tamanho--;
	}
	public String toString() {
		String str = "";
		NoLista p = this.lista;
		while (p != null) {
			str = str + " " + p.getInfo();
			p = p.getProx();
		}
		return str;
	}

}