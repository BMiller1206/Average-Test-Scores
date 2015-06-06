//*****************************************************************************
//Name: Brent Miller
//Date: 060515
//Project Name: Average Test Scores
//Description: Prompt the user to enter five test scores and then 
//prints the average test score.
//*****************************************************************************
package averagetestscores;

import java.util.Scanner;//Scanner class which allows the user to read values of various types.

//Name of program
public class AverageTestScores 
{    
    //Main
    public static void main(String[] args) 
    {
        //Declaration and initialization of variables
        Scanner in = new Scanner(System.in);
        double testScore1 = 0;
        double testScore2 = 0;
        double testScore3 = 0;
        double testScore4 = 0;
        double testScore5 = 0;
        double averageScore = 0;
        
        //Ask the user to input 5 test scores
        System.out.println("Please enter 5 test scores separated with a space or return");
        
        //Read in values
        testScore1 = in.nextDouble();
        testScore2 = in.nextDouble();
        testScore3 = in.nextDouble();
        testScore4 = in.nextDouble();
        testScore5 = in.nextDouble();
        
        //Calculate the average test score
        averageScore = (testScore1 + testScore2 + testScore3 + testScore4 + testScore5) / 5;
        
        //Display to the user the average score
        System.out.println("The average test score is: " + averageScore);
       
    }//End main    
}//End program
