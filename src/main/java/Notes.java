
class Notes {
	public static void main(String[] args) {
		System.out.println(fib(3));
	}

  	public static int fib(int n) {

		// base case: how we stop

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		// recursive call: 
		return fib(n - 1) + fib(n - 2);
	}
}
