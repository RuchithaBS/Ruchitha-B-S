package com.tandemloopassignment;

public class Program_2 {

	   public static void main(String[] args) {
	        
	        printOddSeries(1); 
	        printOddSeries(2); 
	        printOddSeries(3);
	        printOddSeries(4); 
	        printOddSeries(7);

	        
	        try {
	            printOddSeries(0);
	        } catch (IllegalArgumentException e) {
	            System.out.println("\nError: " + e.getMessage());
	        }
	    }

	    
	    public static void printOddSeries(int count) {
	        if (count < 1) {
	            throw new IllegalArgumentException("Input count must be at least 1.");
	        }

	        System.out.print("Input a = " + count + ", then output : ");
	        for (int i = 0; i < count; i++) {
	        
	            int oddNumber = 2 * i + 1;
	            System.out.print(oddNumber);

	            
	            if (i < count - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println(); 
	    }
	}
