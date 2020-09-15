import java.util.Scanner;

/**
 *Puts two integers in ascending order
 * @author Cole G.
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for an integer
    System.out.println("Please enter an integer:");
    //Get the integer from the user
    int userNumber1 = input.nextInt();
    
    //ask the user for another integer
    System.out.println("Please enter another integer:");
    //Get the second integer from the user
    int userNumber2 = input.nextInt();

    //Check to see which number is larger 
    if(userNumber1 >= userNumber2){
      //if the first number is larger than the second
      System.out.println("Your numbers in ascending order are " + userNumber2 + ", " + userNumber1);
    }else{
      //if the second number is larger than the first
      System.out.println("Your numbers in ascending order are " + userNumber1 + ", " + userNumber2);
    }
  }
}
