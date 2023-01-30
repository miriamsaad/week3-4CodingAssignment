package weekThreeFourCodingProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codingProject {
	
		static Scanner s = new Scanner(System.in);
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			
			List<Integer> ages = new ArrayList<Integer>();
			ages.add(3);
			ages.add(9);
			ages.add(64);
			ages.add(2);
			ages.add(8);
			ages.add(28);
			ages.add(93);

			//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
			
			System.out.println(ages.get(ages.size() - 1) - ages.get(0));
			
			//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
			ages.add(200);
			
			System.out.println(ages.get(ages.size() - 1) - ages.get(0));
			
			//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			 
			int sumNumber = 0;
			
			for (int age : ages) {
				sumNumber += age;
			}
			int averageNumber = sumNumber / ages.size();
			
			System.out.println(averageNumber);
			
			
			
			//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			
			String[] names = new String[6];
			
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";
			names[4] = "Buck";
			names[5] = "Bob";
			
			//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			
			int sumName = 0;
			
			for (String name : names) {
				sumName += name.length();
			}
			
			int averageName = sumName / names.length;
			
			System.out.println(averageName);
			
			//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			
			for (String name : names) {
				System.out.print(name + " ");
			}
			
			//3.	How do you access the last element of any array?
			//example of finding the last element in the names array
			
			String lastElement = names[names.length - 1];
		
			//4.	How do you access the first element of any array?
			//example of finding the first element in the names array
			
			String firstElement = names[0];
			
			//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			
			int[] nameLengths = new int[6];
			
			
			for (int i = 0; i < nameLengths.length; i++) {
				String name = names[i];
				nameLengths[i] = name.length();	
			}
			
			//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
			int sumNameLength = 0;
			
			for (int nameLength : nameLengths) {
				sumNameLength += nameLength;
			}
			System.out.println();
			System.out.println(sumNameLength);
		
		
			//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			
			System.out.println("enter a word");
			String word = s.next();
			System.out.println("enter an integer");
			int n = s.nextInt();
			System.out.println(concatenateWord(word, n));
			
			
			//code to execute problem 8
			fullName();
			
			//code to execute problem 9
			isSumGreaterThan100();
			
			//code to execute problem 10
			System.out.println("the average is: " + averageElements());
			
			//code to execute problem 11
			twoArrays();
			
			//code to execute problem 12
			willBuyDrink();
			
			//code to execute problem 13
			howMuchToFeedDog();
			
			
			
			
		}
			
			public static String concatenateWord(String word, int n) {
				
				String result = "";
				for (int i = 0; i < n; i++) {
					result += word;
				}
				return result;
			}
				
			//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			
			public static void fullName() {
				System.out.println("enter first name");
				String firstName = s.next();
				System.out.println("enter last name");
				String lastName = s.next();
				
				System.out.println(firstName + " " + lastName);
			}
			
			//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			
			public static Boolean isSumGreaterThan100() {
				
				int numbers[] = new int[3];
						
				for (int i = 0; i <= 2; i++) {
				System.out.println("enter a number");
				int userNumber = s.nextInt();
			    numbers[i] = userNumber;
				}
				
				int sum = 0;
				for (int number : numbers) {
					sum += number;
				}
				if (sum > 100) {
					System.out.println("sum is greater than 100");
					return true;

				}
				else {
					System.out.println("sum is not greater than 100");
					return false;
				}
			}
			
			
			//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
			
			  public static int averageElements() {
				  
			  
				  double numbers[] = new double[3];
					
					for (int i = 0; i <= 2; i++) {
					System.out.println("enter a number");
					double userNumber = s.nextDouble();
				    numbers[i] = userNumber;
					}
					
					int sum = 0;
					for (double number : numbers) {
						sum += number;
						
					} return sum / numbers.length;
					
			  }
			
			//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			
			  public static Boolean twoArrays() {
				  
				  double numbers[] = new double[3];
				  
					for (int i = 0; i <= 2; i++) {
					System.out.println("enter a number");
					double userNumber = s.nextDouble();
				    numbers[i] = userNumber;
					}
					
					int sum = 0;
					for (double number : numbers) {
						sum += number;
						
					}
					
				double numbersTwo[] = new double[3];
				for (int i = 0; i <= 2; i++) {
					System.out.println("enter a number");
					double userNumberTwo = s.nextDouble();
				    numbersTwo[i] = userNumberTwo;
					}
					
					int sum2 = 0;
					for (double numberTwo : numbersTwo) {
						sum2 += numberTwo;
					}
					
					if (sum > sum2) {
						System.out.println("average of elements in first array is greater than average of elements in second array.");
						return true;
					}
					else {
						System.out.println("average of elements in first array is not greater than average of elements in second array.");
						return false;
					}
					
			  }
			
			//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			
			public static Boolean willBuyDrink() {
				
				System.out.println("is it hot outside? type true if it is, false if not.");
				Boolean isHotOutside = s.nextBoolean();
				System.out.println("how much money is in your pocket?");
				double moneyInPocket = s.nextDouble();
				
				if (isHotOutside && moneyInPocket > 10.50) {
				
				System.out.println("it is hot outside and you have more than $10.50, you will buy a drink.");
				return true;
			} else {
				
				System.out.println("it is not hot outside or you do not have more than $10.50, you will not buy a drink.");
				return false;
			}
			}
			
			//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			//I created code to calculate how much food to feed a dog based on how much they weigh. I created it because I currently have a growing puppy and it is an easy way to figure out how much to feed him as he grows in weight.
			public static double howMuchToFeedDog() {
				System.out.println("how much does your dog weigh in lbs?");
				double dogWeight = s.nextDouble();
				

				if (dogWeight >= 5 && dogWeight <= 15) {
					System.out.println("you should feed your dog 1 cup of food per day.");
				}
				
				else if (dogWeight >= 16 && dogWeight <= 25) {
					System.out.println("you should feed your dog 1.5 cups of food per day.");
					
				}
				else if (dogWeight >= 26 && dogWeight <= 50) {
					System.out.println("you should feed your dog 2 cups of food per day.");
					
				}
				else if (dogWeight >= 51 && dogWeight <= 75) {
					System.out.println("you should feed your dog 3 cups of food per day.");
					
				}
				else if (dogWeight >= 76 && dogWeight <= 100) {
					System.out.println("you should feed your dog 4 cups of food per day.");
					
				}
				else if (dogWeight >= 101) {
					System.out.println("you should feed your dog 5 cups of food per day.");
					
				}
				else {
					System.out.println("please enter a valid weight.");
				}
				return dogWeight;
		
		}
		
	


	}


