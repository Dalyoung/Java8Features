package lambda;

public class RunnableLambda {
	public static void main(String[] args) {
		System.out.println("=== Runnable Test ===");
		
		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable r1 is running!");
			}
		};
		
		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Runnable r2 is running!");
		
		// Run
		r1.run();
		r2.run();
	}
}
