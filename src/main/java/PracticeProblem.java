public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static int sumOfDigits(int x){
		//base case
		if (x < 0){
			x = x*-1;
		}
		if (x <= 9){
			return x;
		}
		
		//recursive call
		return sumOfDigits(x/10) + sumOfDigits (x%10);
	}

	public static int factorial (int n){
		//base case
		if (n<0){
			return 0;
		}
		if (n==0){
			return 1;
		}
		
		//recursive call
		return n*factorial(n-1);
	}

}
