package call_center;

 public class c  {
 public static void main( String [] args ) {
	 
 PersistentSignal callCenter = new PersistentSignal() ;
 
 new Centralinista("c1",callCenter).start();
 new Centralinista("c2",callCenter).start();
 new Centralinista("c3",callCenter).start();
 
 
 for(int i=0;i<10;i++){
	 try {
		 	System.out.println("Chiamata in arrivo");
		    callCenter.send();
			Thread.sleep((long)((Math.random()*10)));
	 }
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		
 }
 }
}
 