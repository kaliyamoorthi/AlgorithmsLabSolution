package com.greatlearning.currencydenomination;

import java.util.Arrays;
public class MergeSortImplementation {
	
	
		int [] Currencydenominations;
	    int [] counter;
	    int amount;
	    int index;
	    public void sortCurrencyDenominations(){
	        //Sort in Ascending order
	        Arrays.sort(Currencydenominations);
	        counter = new int[Currencydenominations.length];
	    }

	    public void CurrencyDenominations(){
	        //Using Recursion instead of loops
	        if(amount>0){
	            if(index<0){
	                System.out.println("Not payable");
	            }
	            else {

	                while (Currencydenominations[index] > amount) {
	                    //If the remaining amount is less than the next higher Currencydenomination
	                    // find next lesser denomination
	                    index--;
	                }
	                // System.out.println(Currencydenominations[index] + ":" + amount / Currencydenominations[index]);
	                counter[index] = amount/Currencydenominations[index];
	                amount = amount - Currencydenominations[index] * (amount /Currencydenominations[index]);
	                index--;
	                CurrencyDenominations();
	            }
	        }
	       // System.out.println("index after calling:"+ index);
	    }
	    public void printCurrencyDenominations(){
	    	CurrencyDenominations();
	        if(amount==0) {
	            for (int i = 0; i < Currencydenominations.length; i++) {
	                if (counter[i] > 0) {
	                    System.out.println(Currencydenominations[i] + ":" + counter[i]);
	                }
	            }
	        }
	    }

		public void Sort(int[] notes, int i, int j) {
			// TODO Auto-generated method stub
			
		}

	}





