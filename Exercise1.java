/**
 * 
 * @author M. Sai Harini
 *Desc: Create a method to find the sum of the cubes of the digits
 */
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int sum;
	sum=sumOfCubes(n);
	System.out.println("Sum of Cubes ="+sum);

	}
	public static int sumOfCubes(int n) {
		int sum;
		for(sum=0; n!=0;n/=10)
		{
			int digit, cube;
			digit=n%10;
			cube= digit*digit*digit;
			sum += cube;
		}
		return sum;
	}

}
