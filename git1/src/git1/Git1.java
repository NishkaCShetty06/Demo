package git1;

public class Git1 {
	int sum (int a , int b){
		return a+b;
		
	}
	
	
	int sum (int a , int b , int c){
		return a+b+c;
		
	}

	
	public static void main(String[] args) {
		Git1 git1 = new Git1();
		System.out.println(git1.sum(01, 2));
		System.out.println(git1.sum(5, 6, 8));
	}
}


