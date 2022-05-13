package aula10;

public class Fila01 {
	
	 public static void main(String[] args) {
	        new Fila01();
	    }
	    
	    public Fila01() {
	        Queue fila = new Queue();
	        
	     	if( fila.isEmpty() ) {
	    		System.out.println("Inicialmente: a fila est� vazia");
	    	}
	    	
	    	fila.enqueue(5);
	    	fila.enqueue(12);
	    	fila.enqueue(6);
	   		fila.enqueue(4);
	    	if( !fila.isEmpty() ) {
	    	   System.out.println("Agora a fila n�o est� vazia: " + fila.toString());
	    	}
	    	
	        System.out.println("O valor na cabe�a da fila � " + fila.peek());

	    	while( !fila.isEmpty() ) {
	    	  int valor = (Integer)fila.dequeue();
	    	  System.out.println("Retirando o valor " + valor + " da fila");	
	    	}
	  
	        System.out.println("Finalmente: " + fila.toString());
	    }

}
