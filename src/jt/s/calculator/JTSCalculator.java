/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jt.s.calculator;

/**
 *
 * @author James Holmes
 */
import java.util.Scanner;
import java.util.ArrayList;

public class JTSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to JT's calculator!\n");

        
        while(true){
            ArrayList<Calculator> historicalEquations = new ArrayList<>();
            int i = 0;
            System.out.println("Please select from one of the following:\n 1 = addition\n 2 = subtraction\n 3 = multiplication\n 4 = division\n 5 = exit");
            String selection = reader.nextLine();
            if(selection.equals("5")){
                break;
            } else{
                System.out.println("Please enter the two numbers you would like to operate on (whole numbers only please): ");
                int one = Integer.parseInt(reader.nextLine());
                int two = Integer.parseInt(reader.nextLine());
                Calculator test = new Calculator(one, two, selection);   
                test.getResult();
                System.out.println(test.toString());
                historicalEquations.add(test);

            }
            
            System.out.print("Historical equations: ");
                
            for(Calculator equations : historicalEquations){
                System.out.println(equations);
            }
        

        }
    }
    
}
