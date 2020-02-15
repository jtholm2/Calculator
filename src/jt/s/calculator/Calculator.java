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
public class Calculator {
    
    private String modeOfOperation;
    private int intOne;
    private int intTwo;
    private double result;
    
    public Calculator(int uno, int dos, String mode){
        this.intOne = uno;
        this.intTwo = dos;
        this.modeOfOperation = mode;  
        this.result = 0;
    }
    
    public void setMode(String mode){
        this.modeOfOperation = mode;
    }
    
    public double getResult(){
        if(this.modeOfOperation.equals("1")){
            this.result = (double)this.intOne + (double)this.intTwo;
            this.modeOfOperation = "+";
        } else if (this.modeOfOperation.equals("2")){
            this.result = (double)this.intOne - (double)this.intTwo;
            this.modeOfOperation = "-";
        } else if (this.modeOfOperation.equals("3")){
            this.result = (double)this.intOne * (double)this.intTwo;
            this.modeOfOperation = "*";
        } else if (this.modeOfOperation.equals("4")){
            this.result = (double)this.intOne / (double)this.intTwo;
            this.modeOfOperation = "/";
        }
        return this.result;
    }
    
    public String toString(){
        return this.intOne + " " + this.modeOfOperation + " " + this.intTwo + " = " + this.result;
    }
    
}
