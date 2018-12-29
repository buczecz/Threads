
public class livelock {


 
    public static void  foo() {

                System.out.println("foo");
            
    }
    
    public static void  bar() {

                System.out.println("bar");
            }
 
    
    
    public static void start() {
    	Thread t1 =  new Thread(new Runnable() {
    		public void run() {
    			foo();
    		}
    	});
    	
    	Thread t2= new Thread(new Runnable() {
    		public void run() {
    			bar();
    		}
    	});
    	
		long timer = System.currentTimeMillis();

    	while(true) {

    	
    	if (t2.isAlive())
    		t1.start();
    	else
    		System.out.println("Czekanie na drugi watek");
    	
    	if (t1.isAlive())
    		t2.start();
    	else
    		System.out.println("Czekanie na pierwszy  watek");
    	
		if(System.currentTimeMillis()-5000>timer) 
			System.exit(0);
    	}
    	
    	}
    	
    	
    	
    	
    	
    	
    }
	