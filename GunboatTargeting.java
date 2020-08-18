import java.util.*;
import java.math.*;


public class GunboatTargeting {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double height;
		double vel;
		double dist;
		double plus;
		double minus;
		double thetaOne;
		double thetaTwo;
		double a;
		double b;
		double c;
		
		
		
		System.out.println("How high is the battery from the water line?");	
		height = input.nextDouble();
		System.out.println("What is the initial velocity of the shell?");
		vel = input.nextDouble();
		System.out.println("How far is the target?");
		dist = input.nextDouble();
		
		
		a = -9.8*(Math.pow(dist, 2))/(2*Math.pow(vel,2));
		b = dist;
		c = height + a;
		plus = (0-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
		thetaOne = Math.atan(plus);
		
		System.out.println(thetaOne);
		
		
	}
}