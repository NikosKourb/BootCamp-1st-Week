package cb;

import java.util.Scanner;

public class Weekly_Project_easy {

	public static void main(String[] args) {
		
		//Initializing the variable with which the user will determine 
		//when the loop will stop and the program will end
		String answer="";
		
		//Starting the Scanner
		Scanner userInput=new Scanner(System.in);
		
		//Starting the Do...While Loop (because it is guaranteed to run at least once even if 
		//the requirements are not met from the beginning, e.x. answer="")
		do {
			//Asking the user for input and initializing the boolean and double variable
			System.out.println("Please enter one number : ");
			boolean bool1=userInput.hasNextDouble();
			double num1=0;
			
			//Determine the value of the 1st number if the user has inputed text or number
			if(bool1==true) {
				num1=userInput.nextDouble();
				}
			else {
				String str1=userInput.next();
				num1=0;
			}
			
			
			//Asking the user for input and initializing the other boolean and other double variable
			System.out.println("Please enter another number : ");
			boolean bool2=userInput.hasNextDouble();
			double num2=0;
			
			//Determine the value of the 2st number if the user has inputed text or number
			if(bool2==true) {
				num2=userInput.nextDouble();
				}
			else {
				String str2=userInput.next();
				num2=0;
				}
			
			
			//If both booleans are false it adds the given numbers and prints the sum.
			if((bool1==false)&&(bool2==false)) {
				double sum=num1+num2;
				System.out.println("The sum of the two numbers is : "+sum);
				}
			
			//If both booleans are true it prints the message "Both boolean values are True".
			if((bool1==true)&&(bool2==true)) {
				System.out.println("Both boolean values are True");
				}
			
			/*If at least one of the booleans is false 
			 *it subtracts the 2nd number from the 1st
			 *and prints the result. */
			if((bool1==false)||(bool2==false)) {
				double diff=num1-num2;
				System.out.println("The result from substracting the 2nd number from the 1st is :"+diff);
				}
			
			/*If the 1st boolean is false and 1st number is larger than 20 
			 * it multiplies the numbers and prints the result, 
			 * else it just divides the 1st number from the 2nd number. */
			if((bool1==false)&&(num1>20)) {
				double multi=(num1*num2);
				System.out.println("Multiplying the two numbers gives us : "+multi);
				}
			else {
				double div1=(num2/num1);
				}
			
			/*If 2nd booleYan is true and the Sum of the two numbers is over 44 
			 * and the remainder from the previous division is 0 it shows a message 
			 * saying "I hope you liked this program" */
			if((bool2==true)&&(num1+num2>44)&&(num2%num1==0)) {
				System.out.println("I hope you liked this program");
				} 
			
			//Asks the user if he wants to continue inputing numbers
			//if the User inputs "N" it stops, else it continues
			System.out.print("Do You want to continue? (Y/N) : ");
			answer=userInput.next();
		
		} while(!answer.equals("N"));
		//The Do...While loop that continues unless the input is "N"
		
		userInput.close();
		
		}
	}
	

