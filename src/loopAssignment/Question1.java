/**A thermostat is used in home cooling /heating system.  
 * Write a program to set temperature of the thermostat by taking 
 * input from user from console. i.e. if the user wants to set the 
 * temp to 21 degrees Celsius, he will enter this value in console,
 *  your program should read it from console and  print              
 * “Temp set to <value>” where value = temp entered by user in console.
 **/

package loopAssignment;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temprature= 18;
		System.out.println("Enter temprature");
		Scanner sc =new Scanner(System.in);
		
		 temprature = sc. nextInt();
		
		System.out.println("Temp set to " +temprature+ " degree Celsius");

	}

}
