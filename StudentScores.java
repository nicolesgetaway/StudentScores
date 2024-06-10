import java.util.*;
/** Add Class comment and @ tags
@author: Brooke Harris
@version: 1.0
Purpose: The purpose of this project is to use loops to prompt the user for students and score and display the name and score of the highest student.
 */
public class StudentScores {

    /**
     * @param args not used
     */
    public static void main(String[] args) {
        
        //Declare a new Scanner object
        Scanner in = new Scanner(System.in);

        //Prompt to enter the number of students and read value in
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        //Validate num of students using while loop. Must be >= 1.
        while (numStudents < 1){                                  //with input validation, the conditions of the while loop should be the invalid values, so that it loops until the user inputs a valid input; in this case, # of students most be greater than 0.
           System.out.println ("Number of students must be at least 1");         //error message
           System.out.print ("Please renter number of students >> ");         //reprompting the user for a valid input
           numStudents = in.nextInt();
        }
        
        //Get the first student's name
        System.out.print ("Enter a student name: ");              //name prompt (print instead of println for formatting reasons)
        String studentName = in.next();                  
        
        //Get the first student's score
        System.out.print ("Enter a student score: ");       //score prompt
        double score = in.nextDouble();
        //Validate the score using while loop. Must be positive.
        while (score < 0){                         //the invalid scores are any negative scores, so this will trap the user in this loop if they enter any negative values
           System.out.println ("Score cannot be negative");             //error message
           System.out.print ("Please renter the student score >> ");          //reprompting
           score = in.nextDouble();
        }

        //To handle remaining names and scores use a for loop to read
        //in the next student name and score (other than first student)
        double highestScore = score;            //initializing variables for the top student and score with the inputs of the first student for comparison, since they will be the highest until another student with a higher score is entered 
        String topStudent = studentName;
        for (int i = 0; i < numStudents - 1; i++){              //counter i is set to 0; in order for the loop to run, the counter must be less than the # of students - 1 (since we already have the first student's info) 
            System.out.print ("Enter a student name: ");             //name prompt
            studentName = in.next();
            System.out.print ("Enter a student score: ");            //score prompt
            score = in.nextDouble();
            //Validate the score. Must be positive.
            while (score < 0){                  //input validation with the range of invalid values as the condition
            System.out.println ("Score cannot be negative");               //error message
            System.out.print ("Please renter the student score >> ");         //reprompt
            score = in.nextDouble();
            }
            
            //Test to see if new score is higher than first score.
            if (score > highestScore){          //this compares the current stored score with that of the highest student's and updates the topStudent and highestScore variable if condition is true
               highestScore = score;
               topStudent = studentName;
            }

        //Output the top student's information
        }
        System.out.println("\nTop student");          //output of top student name and their score
        System.out.println(topStudent + "'s score is " + highestScore);
        
        //Close the Scanner object
        in.close();
    }
}
