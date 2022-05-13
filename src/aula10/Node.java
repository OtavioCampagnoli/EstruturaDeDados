package aula10;

public class Node {

	// lista de atributos
	private Object value;
	private Node next;
	//metodos acessores
	public Object getValue() {
		return this.value;

	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
