package aula10;

class Queue {

	private Node head = null, tail = null;

	public Queue() {
		head = null;
		tail = null;
	}

	public Object enqueue(Object x) {
		if (x == null)
			return null;
		try { // para casos de mem�ria insuficiente
			Node novo = new Node();
			novo.setValue(x);
			novo.setNext(null);
			if (tail == null) {
				head = novo;
				tail = novo;
			} else {
				tail.setNext(novo);
				tail = novo;
			}
			return x;
		} catch (Exception ex) {
			return null;
		}
	}

	public Object dequeue() {
		if (head == null)
			return null;
		Object value = head.getValue();
		Node temp = head; // opcional
		head = head.getNext();
		if (head == null)
			tail = null;
		temp.setNext(null);
		temp = null; // opcional
		return value;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public Object peek() { // retorna o objeto no in�cio da fila
		if (head == null)
			return null;
		else
			return head.getValue();
	}

	// Retorna o conte�do da fila din�mica encadeada (Queue) no formato f: [ head,
	// a, b, c, ..., tail ]
	public String toString() { // retorna o conte�do da fila din�mica
		if (!isEmpty()) {
			String saida = "";
			Node aux = head;
			while (aux != null) { // o ponteiro aux percorre a lista
				saida += aux.getValue().toString(); // ou separar os objetos com \n
				aux = aux.getNext();
				if (aux != null)
					saida += ", "; // ver coment�rio anterior
			}
			return ("f: [ " + saida + " ]");
		} else
			return ("f: [ ]"); // fila vazia
	}

}