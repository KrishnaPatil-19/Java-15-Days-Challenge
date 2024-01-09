public class Main {
	public static void main(String[] args) {
		System.out.println("Loops demo : ");
		int n = 5;
		System.out.println("For loop : ");
		for(int i = 1; i <= n; i++){
			System.out.println(i);	
		}
		boolean wLoop = (n>6);
		while(wLoop){
			System.out.println("While loop ran");
		}
		System.out.println();
		do {
			System.out.println("Do-While loop ran");
		} while (wLoop);
	}
}