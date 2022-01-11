/**There is a water tank of capacity 100 litres. 
Water is filled into it using bucket which have capacity of 10 litres.
Write a program which fills the tank to its capacity using these 
buckets. Also include a mechanism in your program to stop the tank 
from over flowing.**/

package loopAssignment;

public class Question2part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int actualFilledCapacityOfTank = 0;

		int counter = 1;

		while (counter < 10) {

			actualFilledCapacityOfTank = actualFilledCapacityOfTank + 10;
			counter++;
			
			if (actualFilledCapacityOfTank==80) {
				System.out.println("Tank is full with " + actualFilledCapacityOfTank
						+ " liters. Stop!!! Otherwise it will Overflow");
				break;
			}

		}

	}

}
