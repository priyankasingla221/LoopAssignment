/**There is a water tank of capacity 100 litres. 
Water is filled into it using bucket which have capacity of 10 litres.
Write a program which fills the tank to its capacity using these 
buckets. Also include a mechanism in your program to stop the tank 
from over flowing.**/


package loopAssignment;

public class Question2part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int actualFilledCapacityOfTank = 0;

		for (int counter = 1; counter < 10; counter++) {
			actualFilledCapacityOfTank = actualFilledCapacityOfTank + 10;
			if (actualFilledCapacityOfTank == 80) {
				System.out.println("Tank is full with " + actualFilledCapacityOfTank
						+ " liters. Stop!!! Otherwise it will Overflow");
				break;
			}

		}

	}
}
