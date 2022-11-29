package ListaDuplaEncadeada;

import listaEncadeadaGenerica.NoLista;

public class Lista_DuplaEncadeada {
	private NoLista2 lista;
	private NoLista2 fim;
	private int tamanho;
	
	public Lista_DuplaEncadeada(){
		tamanho=0;
	}
	public boolean adiciona(String elemento) {
		NoLista2 novo = new NoLista2(elemento);
		if(this.tamanho==0) {
			this.lista = novo;
			this.fim=novo;
			this.tamanho++;
			return true;
			
			
		}else {
			this.fim.setProx(novo);
			novo.setAnt(this.fim);
			this.fim=novo;
			
		}
		this.tamanho++;
		return true;
	}
	
	public boolean adiciona(int posicao, String elemento) {
			if (posicao < 0)
				return false; // posicao inválida
		
			if (posicao >= this.tamanho) { // adiciona no final
				adiciona(elemento);
				return true;
			}
			// adiciona no meio
			NoLista2 p = this.lista; // p aponta para o inicio da lista
			NoLista2 ant = null;
			int pos = 0;
			while (pos < posicao) {
				ant = p;
				p = p.getProx();
				pos++;
			}
			NoLista2 novoNo = new NoLista2(elemento);
			novoNo.setProx(p);
			ant.setProx(novoNo);
			this.tamanho++;
			return true;
		}
	
	@Override
	public String toString() {
		String str = "";
		NoLista2 p = this.lista;
		if(this.tamanho == 0) {
			return "";
		}
		
		while(p!=null) {
			str = str + " " + p.getInf();
			p=p.getProx();	
		}
		return str;
	}
	
	
	

}
