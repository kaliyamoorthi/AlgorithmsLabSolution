package com.greatlearning.currencydenomination;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.currencydenomination.MergeSortImplementation ;
import com.greatlearning.NotesCount.NotesCount;

public class main {


	public static void main(String[] args) {
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("enter the size of currency denominations");
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		int [] notes = new int[size];
		System.out.println("enter the currency denomination value ");
		for (int i=0; i < size; i++) {
			notes [i] = sc.nextInt ();
			
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.Sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes, amount);
		
	

	}

}
