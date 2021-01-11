/**
 * 
 * @author M. Sai Harini
 * Desc: Write a java program that simulates a traffic light.
 * The program lets the user select one of three lights: red, yellow, green
 * on entering the choice,
 * an appropriate message with "stop" or "ready" or "go" should apply
 * Initially there is no messages shown.
 *
 */
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String signal = sc.nextLine();
		String color;
		switch(signal) {
		case "red":
			System.out.println("stop");
			break;
		case "yellow" :
			System.out.println("ready");
			break;
		case "green" :
			System.out.println("go");
			break;
		}
		

	}

}
