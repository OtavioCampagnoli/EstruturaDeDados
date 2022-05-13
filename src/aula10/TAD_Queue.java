package aula10;

public interface TAD_Queue { // tipo abstrato de dado que descreve a Fila
	// Retornam se a fila est� vazia ou cheia:
	public boolean isEmpty();

	public boolean isFull(); // n�o ser� implementado na fila din. encadeada
	// Insere um elemento no final da fila:

	public Object enqueue(Object x);

	// Remove um elemento do in�cio da fila:
	public Object dequeue();

	// Retorna o objeto no in�cio da fila (o primeiro da fila), sem eliminar:
	public Object peek();

	// Retorna o conte�do (todos os elementos) da Queue:
	public String toString();

}
