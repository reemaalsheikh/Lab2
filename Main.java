import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

   Scanner input = new Scanner(System.in);


 /*1.Write a program to find all of the longest word in a given dictionary.
 *  Example:
{ "cat", "dog", "red", "is", "am" }
* Expected Output:"cat", "dog", "red"*/

   /*    String [] dictionary = {"cat","dog","red","is","am"};
        System.out.println("Original Array:  "+Arrays.toString(dictionary));

       int longest = dictionary[0].length();

        for (String word : dictionary) {
            if(word.length()>=longest){
                System.out.print(word + " ");

            }
        }
        */



/* 2. Write a program that displays the number of occurrences of an element in the array.
 Original Array: [1,1,1,3,3,5]
 Sample Output:
  3 occurs 2 times
  1 occurs 3 times
  9 occurs 0 time*/

/*
   int [] originalArray = {1,1,1,3,3,5};
   System.out.println("Enter a number to check occurrence:");
   int checknumber = input.nextInt();
   int countingelement = 0;

    for(int number : originalArray) {
        if(number == checknumber) {
            countingelement++;
        }
        }
    System.out.println(checknumber+ " occurs " + countingelement+" times");

*/



 /*3.Write a program to find the k largest elements in a given array.
Elements in the array can be in any order.
Original Array:
[1, 4, 17, 7, 25, 3, 100]
Expected Output: 3 largest elements of the said array are: 100 25 17  */

/*
       Integer [] originalArray = {1,4,17,7,25,3,100};
       System.out.println("Original Array: "+Arrays.toString(originalArray));
       System.out.println("Please enter the k largest elemnts: ");
       int k =input.nextInt();
       klargest(originalArray,k);
*/




/*4. Create a method to reverse an array of integers.
 Implement the method without creating a new array.
 Original Array: [5,4,3,2,1] Expected Output: Reversed Array: 1 2 3 4 5
 */

     /*   int [] originalArray = {5,4,3,2,1};
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        reverseArray(originalArray); */



/*5. Write a menu driven Java program with following option:
1. Accept elements of an array
2. Display elements of an array
3. Search the element within array
4. Sort the array
5. To Stop
the size of the array should be entered by the user.*/

/*
 //Get the array size from the user
        System.out.print("Please enter the size of the array: ");
        int arraySize = input.nextInt();

 //Create the array
        int[] array = new int[arraySize];

   int choice;
   do{
       //display menu
       System.out.println("1. Accept elements of an array\n" +
                          "2. Display elements of an array\n" +
                          "3. Search the element within array\n" +
                          "4. Sort the array\n" +
                          "5. To Stop");
       System.out.println();

       // let the user input a choice
       System.out.print("Please enter your choice: ");
               choice = input.nextInt();

       switch (choice){
           case 1:
            acceptElements(array);
            break;

            case 2:
             displayElements(array);
             break;

             case 3:
              searchElement(array);
              break;

              case 4:
               sort(array);
               break;

               case 5:
                   System.out.println("Exiting the program ...!");
                   System.out.println();
               break;

           default: System.out.println("Invalid choice");

       }

   }while(choice!= 5); */




/*6. Create a method that generates a random number within a given range.
Allow the user to specify the range and call the method to display random numbers.
Hint: use Random class
Sample Output:
Enter the minimum value of the range: 10
Enter the maximum value of the range: 100
Enter the number of random numbers to generate: 5
Random numbers within the specified range: 71 - 98 - 96 - 71 - 71
 */

   /*
        System.out.print("Enter the minimum value of the range: ");
        int min = input.nextInt();
        System.out.print("Enter the maximum value of the range: ");
        int max = input.nextInt();

        System.out.print("Enter the number of random numbers to generate: ");
        int random = input.nextInt();

        System.out.println("Random numbers within the specified range:  ");
        for (int i = 0; i < random ; i++) {
            int randomNumber = generateRandomNumber(min,max);
           System.out.println( randomNumber + " ");
        }

    */




 /*7. Write a program that checks the strength of a password.
 Create a method that evaluates a password based on criteria like length, inclusion of special characters, and uppercase/lowercase letters.
- We have three methods: checkLength, checkSpecialCharacters, and checkUpperCaseLowerCase,
   each of which assigns a score based on specific criteria.
- The totalScore is calculated by adding the scores from these methods.
- Classify the password as strong (8 or more), moderately strong (5 or more), or weak
based on the totalScore.
- The criteria for scoring:
• Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters (3 points).
• Special characters: Absence (0 points), Presence (2 points).
• Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
points).
 Example:
Enter a password: 3456 Expected Output: Password is weak.*/

/*
 System.out.println("Enter a password:");
 String password = input.nextLine();

 int lengthScore = checkLength(password);
 int specialCharScore = checkSpecialCharacters(password);
 int caseScore= checkUpperCaseLowerCase(password);
 int totalScore = lengthScore + specialCharScore + caseScore;
 String strength = classifyPassword(totalScore);


  System.out.println("Password is " + strength);

 */



 /*8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
 and each subsequent number in the sequence is the sum of the two preceding ones.
 Example:
Enter the number of Fibonacci terms to generate: 10
Expected Output:
Fibonacci sequence with 10 terms:
0 1 1 2 3 5 8 13 21 34 */

/*
 System.out.print("Enter the number of Fibonacci terms to generate: ");
 int numberOfTerms =input.nextInt();
 int [] fibonscciSequence = generateFibonacciSequence(numberOfTerms);

  System.out.println("Fibonacci sequence with "+numberOfTerms + " terms: ");

  for (int num :fibonscciSequence){
    System.out.print(num + " ");}
*/



    } // End of main



//Method of Q3
public static void klargest (Integer[] array, int k){
   Arrays.sort(array, Collections.reverseOrder());

    for (int i = 0; i < k; i++) {
        System.out.println(array[i]+ " ");

    }

}



//Q4
    public static void reverseArray(int[] originalArray) {
        for (int i = 0; i < originalArray.length / 2; i++) {
            int temp = originalArray[i];
            originalArray[i] = originalArray[originalArray.length - i - 1];
            originalArray[originalArray.length - i - 1] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
    }



//Q5
  public static void acceptElements(int[] array){
        Scanner input = new Scanner(System.in);
      System.out.println("Elements of the array: ");
      for (int i = 0; i < array.length; i++) {
          System.out.print("Element: " + (i+1)+" : " + "  ");
          array[i] = input.nextInt();

      }
      System.out.println();
  }

    public static void displayElements(int[] array){
        System.out.println("Elements of the array: "+" ");
        for(int num : array){
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static void searchElement (int[] array){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        int element = input.nextInt();

        boolean found = false;
        for(int num : array){
            if(num == element){
                found = true;
                System.out.println("Element found :)!");
                break;
            }
        }
        if(!found){
            System.out.println("Element not found ..");
            System.out.println();
    }}

    public static void sort (int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }

        }
        System.out.println("The Array is sorted: " + Arrays.toString(array));
        System.out.println();

    }



  // Q6
    public static int generateRandomNumber(int min, int max){
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }



  //Q7
  public static int checkLength (String password){
        int length = password.length();
        if (length >=8) {
            return 3;
        }else if (length >=6) {
            return 2;
        }else {
            return 0;
        }
  }

  public static int checkSpecialCharacters (String password){
        for(char c : password.toCharArray()){
         if(!Character.isLetterOrDigit(c)){
             return 2;
         }
      } return 0;
  }

  public static int checkUpperCaseLowerCase (String password){
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for(char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                hasUpperCase = true;
            }else if(Character.isLowerCase(c)){
                hasLowerCase = true;
            }
            if(hasUpperCase && hasLowerCase){
                return 3;
            }
        }
        return 0;
    }

    public static String classifyPassword (int totalScore){
        if (totalScore >= 8) {
            return "Strong";
        }else if (totalScore >= 5) {
            return "Moderately Strong";
        }else{
            return "Weak";
        }

    }



    //Q8
    public static int [] generateFibonacciSequence(int numberOfTerms) {
        if (numberOfTerms <= 0) {
            return new int [0];
        }
        int [] fibonacciSequence = new int[numberOfTerms];
        if (numberOfTerms >= 1) {
            fibonacciSequence[0] = 0;
        }
        if (numberOfTerms >= 2) {
            fibonacciSequence[1] = 1;
        }
        for (int i = 2; i < numberOfTerms; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }return fibonacciSequence;
        }


}



