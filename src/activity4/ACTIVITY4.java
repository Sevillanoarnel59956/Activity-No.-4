//activity by arnel
package activity4;
import java.util.Scanner;

public class ACTIVITY4 {
    
   
    public static void main(String[] args) {
    double entrancescore, gpa;
                
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Entrance Score: ");
           entrancescore = scan.nextDouble();
           

        System.out.println("Enter GPA");   
           gpa = scan.nextDouble();
       
           
                      if (entrancescore >= 75 && gpa >= 3.5){
               System.out.println("You are eligible to university");
           }else{
              System.out.println("Fail");
   }    

                 
                 
                 
                
  }  
 }
