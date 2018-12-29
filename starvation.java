import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class starvation {
    public synchronized  static void func() {
        String name = Thread.currentThread().getName();
        String fileName = name + ".txt";
 
        try (
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        ) {
            writer.write(name + " napisal te wiadomosc");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
 
        while (true) {
            System.out.println(name + " pracuje");
        }
    }
    
    public static void start() {
    	
		for (int i=0;i<10;i++) {
    	new Thread(new Runnable() {
    			public void run() {
    				func();
    			}
    			
    			
    		}).start();

    	
    		
    	}
    		
    }
    	
    }


