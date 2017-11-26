package basic;

public class Lab1 {
	public static void main(String[] args){
		sum(10);
		//System.out.println("factorial: " + factorial(5));
		
		int[] numbers = {5,-2, 0, 234,-438, 63};
		//System.out.println("Min: " + findMin(numbers));
		//System.out.println("Max: " + findMax(numbers));
		//System.out.println("Avg: " + findAvg(numbers));
	}
	
	public static void consoleN(int num){
		System.out.println(num);
	}
	
	public static int Min(int[] arr){
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
			if ( arr[i] < min ){
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int Max( int[] arr){
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int Avg(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i]; 
		}
		System.out.println("Sum: " + sum );
		return sum/arr.length;
	}
	
	public static int sum(int n){
		// sum initial value of zero.
		int sum = 0;
		// loop each number if sum value is greater than zero.
		for(int i = 1; i <= n; i++){
			System.out.print(sum + " + " + i);
			// add increment of one to the sum value.
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}
	
	public static int factorial(int n){
		if(n == 0){
			return 1;
		}
		consoleN(n);
		return factorial(n-1) * n;
	}
}
