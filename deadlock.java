
public class deadlock {

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
 
    public static void  foo() {
        synchronized (lock1) {
            synchronized (lock2) {
                System.out.println("foo");
            }
        }
    }
    
    public static void  bar() {
        synchronized (lock2) {
            synchronized (lock1) {
                System.out.println("bar");
            }
        }
    }
    
    
    public static void start() {
 
    	
    		for (int i = 0; i < 10; i++) {
    			new Thread(new Runnable() {
    				public void run() {
    					foo();
    				}
    				}).start();
    			}
    	
    		for (int i = 0; i < 10; i++) {
    			new Thread(new Runnable() {
    				public void run() {
    					bar();
    				}
    				}).start();
    			
    	

    		}


	
}
    
}