package com.tandemloopassignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program_4 {

	 public static void main(String[] args) {
	     
	        List<Integer> inputNumbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

	    
	        Map<Integer, Integer> resultCounts = new HashMap<>();

	       
	        for (int divisor = 1; divisor <= 9; divisor++) {
	            int currentDivisorCount = 0; 

	  
	            for (int num : inputNumbers) {
	            
	                if (num % divisor == 0) {
	                    currentDivisorCount++;
	                }
	            }
	          
	            resultCounts.put(divisor, currentDivisorCount);
	        }

	       
	        System.out.println("Input: " + inputNumbers);
	        System.out.println("Output: " + resultCounts);

	       
	        List<Integer> anotherList = Arrays.asList(7, 14, 21, 28, 35);
	        Map<Integer, Integer> anotherResult = new HashMap<>();
	        for (int divisor = 1; divisor <= 9; divisor++) {
	            int currentDivisorCount = 0;
	            for (int num : anotherList) {
	                if (num % divisor == 0) {
	                    currentDivisorCount++;
	                }
	            }
	            anotherResult.put(divisor, currentDivisorCount);
	        }
	        System.out.println("\nInput: " + anotherList);
	        System.out.println("Output: " + anotherResult);
	    }
	}
