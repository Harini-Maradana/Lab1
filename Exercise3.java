import java.util.Scanner;

/**
 * 
 * @author M. Sai Harini
 *
 */
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int nRecursive, nNonRecursive;
		nRecursive = recursive(n-1);
		System.out.println("nth value is "+nRecursive);
		nNonRecursive = nonRecursive(n-1);
		System.out.println("nth value is "+nNonRecursive);
		

	}
public static int recursive(int n) {
	if(n==0 || n==1) {
		return n;
	}
	return(recursive(n-1)+recursive(n-2));
}
public static int nonRecursive(int n) {
	int first = 0, second = 1, third=0;
	if(n==1) {
		return first;
		
	}
	if(n==2) {
		return second;
	}
	for(int i=2; i<=n;i++) {
		third = first+second;
		first = second;
		second = third;
	}
	return third;
}
}
