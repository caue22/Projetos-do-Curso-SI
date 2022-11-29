package AulaPilha17mai;

public class Fila {
	private ListaEncadeada <T> lista;
	
	
	public Fila() {
		lista = new ListaEncadeada <> ();
		
	}
	public T remove() {
		if(this.isEmpty()) return null;
		T obj = this.lista.busca(0);
		this.lista.remove(0);
		return obj;
	}
	
	public boolean isEmpty() {
		return this.lista.tamanho()==0;
		
	}
	public T first() {
		if(this.isEmpty()) return null;
		return this.lista.busca(0);	
	}
	
	public T last() {
		if(this.isEmpty()) {
			return null;
			return this.lista.busca(this.lista.tamanho() - 1);
			
		}
	}
	@Override
	public String toString() {
		return "Fila [lista = " + lista + "]";
	}
	
	}
	


