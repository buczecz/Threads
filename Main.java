
public class Main {

	public static void main(String[] args) {
		if(args.length !=1 ) {
			System.out.println("Zła ilość parametrów. NALEZY PODAC JEDEN ARGUMENT");
			return;
		}

		
		try {

			String wybor;


			wybor = String.valueOf(args[0]);
			switch(wybor) {
			
			case "d":
				deadlock.start();
				break;
			
			case "l":
				livelock.start();
				break;
			
			case "s":
				starvation.start();
				break;
				
			
			
			}
			
			}
		catch(Exception e){
			System.out.println("Wystąpił błąd");
			System.exit(1);
		}
		
		
		long start = System.currentTimeMillis();
		while (true) {
			if(System.currentTimeMillis()-5000>start) 
				System.exit(0);
			
		}

	}


}
