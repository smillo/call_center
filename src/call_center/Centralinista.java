package call_center;


public class Centralinista extends Thread{
	PersistentSignal signal;
	String nome;
	public Centralinista(String nome, PersistentSignal signal){
		
		this.nome=nome;
		this.signal=signal;
	}
	
	public void run(){
		
		for ( int i =0; i<10; i++){
			
			try {
				Thread.sleep((long)((Math.random()*10)));
				
			
			
			
			if(this.signal.watch()){
				System.out.println(nome +" chiamata in corso");
				Thread.sleep((long)((Math.random()*10)));
				
			}
			else
				System.out.println(nome + " e riposo");
				Thread.sleep((long)((Math.random()*10)));
			}
				catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			
			}
		System.out.println(nome +" vado a casa");
			 }
	}

