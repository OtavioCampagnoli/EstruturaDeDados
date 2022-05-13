package aula10;

public class Exercicio01 {
	public static void main(String[] args) {
		new Exercicio01();
	}

 	public Exercicio01() {
		Queue f = new Queue();

		if (f.isEmpty()) {
			System.out.println("Inicialmente: a fila está vazia");
		}
		f.enqueue("livro");
		f.enqueue("caneta");
		f.enqueue("borracha");
		
		Object ob = f.dequeue(); // tira da cabeca e armazena no objeto instanciando
		// Sendo assim a fila ficará---> 
		System.out.println("Step 01: " + f.toString());
		f.enqueue("clip");
		System.out.println("Step 02: " + f.toString());
		f.enqueue(f.peek());
		System.out.println("Step 03: " + f.toString());
		f.enqueue(ob);
		System.out.println("Step 04: " + f.toString());

		/*
		 * if( !f.isEmpty() ) { System.out.println("Agora a fila não está vazia: " +
		 * f.toString()); }
		 * 
		 * System.out.println("O valor na cabeça da fila é " + f.peek());
		 * 
		 * while( !f.isEmpty() ) { int valor = (Integer)f.dequeue();
		 * System.out.println("Retirando o valor " + valor + " da fila"); }
		 * 
		 * System.out.println("Finalmente: " + f.toString());
		 */
	}
}
