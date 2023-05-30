package gestaoHospital;

public class ListaEncad<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;
	public ListaEncad() {
		this.size = 0;
	}
	
	public void InserirPrim(T val) {
		Node<T> node = new Node<>(val);
		node.setNext(head);
		head = node;
		
		if (tail == null) {
			tail = head;
		}
		size += 1;
	}
	
	public void Inserir(T val, int index) {
		if (index == 0) {
			InserirPrim(val);
			return;
		}
		if (index == size) {
		InserirUlt(val);
		return;
		}
		Node<T> temp = head;
		for (int i = 1; i<index; i++) {
			temp = temp.getNext();
		}
		Node<T> node = new Node<>(val, temp.getNext());
		temp.setNext(node);
		
		size++;
	}
	
	public void InserirUlt(T val) {
		if (tail == null) {
			InserirPrim(val);
			return;
		}
		Node<T> node = new Node<>(val);
		tail.setNext(node);
		tail = node;
		size++;
	}
	
	public void DeletarPrim() {
		if(size == 0){
			System.out.println("lista vazia");
			return;
		}
		head = head.getNext();
		if (head == null) {
		tail = null;
		}
		size--;
		return;
		
	}
	public void deletar(int index) {
		if (index == 0) {
			DeletarPrim();
			return;
		}
		if (index == size-1) {
			DeletarUlt();
			return;
		}
		Node<T> ante = get(index-1);
		ante.setNext(ante.getNext().getNext());
		return;
	}
	
	public void DeletarUlt() {
		if(size<=1) {
			DeletarPrim();
			return;
		}
		Node<T> penultimo = get(size-2);
		tail = penultimo;
		tail.setNext(null);
		return;
	}
	
	public Node<T> find(T value) {
		Node<T> node = head;
		while(node != null) {
			if (node.getValue() == value) {
				return node;
			}
			node = node.getNext();
		}
		return node;
	}
	
	public Node<T> get(int index) {
		Node<T> node = head;
		for(int i = 0; i<index; i++) {
			node = node.getNext();
		}
		return node;
	}
	
	public void Vizualizar() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.getValue()+" -> ");
			temp = temp.getNext();
		}
		System.out.println("END");
	}

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public int getSize() {
		return size;
	}
	
}
