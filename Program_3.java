package com.tandemloopassignment;

public class Program_3 {

    public static void main(String[] args) {
        
        printConditionalOddSeries(1); 
        printConditionalOddSeries(2);
        printConditionalOddSeries(3); 
        printConditionalOddSeries(4); 
        printConditionalOddSeries(5); 
        printConditionalOddSeries(6); 
        printConditionalOddSeries(7); 

       
        try {
            printConditionalOddSeries(0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }

  
    public static void printConditionalOddSeries(int inputA) {
        if (inputA < 1) {
            throw new IllegalArgumentException("Input 'a' must be at least 1.");
        }

     
        int effectiveCount;
        if (inputA % 2 == 0) { // If inputA is even
            effectiveCount = inputA - 1;
        } else { // If inputA is odd
            effectiveCount = inputA;
        }

        System.out.print("Input a = " + inputA + ", then output : ");

      
        for (int i = 0; i < effectiveCount; i++) {
          
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);

           
            if (i < effectiveCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
    }
}
