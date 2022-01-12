/**Write a program that prompts the user to input a positive integer. 
 *It should then output a message
 *indicating whether the number is a prime number or not.**/
/** number should be greater than 1
 * it can only have 2 factors 1 and themselves
 * it should not have more than two factors
 */
package loopAssignment;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isPrime = false;
			for (int i = 2; i< number/i; i++) {
				//condition for non prime number
				if (number % i == 0)
				{
					isPrime= true;
					break;
				}
			}
					if(!isPrime) {
						System.out.println("number is prime");
					}else
					{
						System.out.println("number is not prime");
					}
			
			
				

		} 
	}


