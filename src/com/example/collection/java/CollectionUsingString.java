package com.example.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class CollectionUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> values = new ArrayList<>();
		values.add("A");
		values.add("M");
		values.add("A");
		values.add("Z");
		values.add("O");
		values.add("N");
		System.out.println("\t\t\t++++++++++Menu+++++++++\t\t");
		System.out.println("Enter choice !!! \n");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if (choice == 0){
			//Collections.reverse(values);
			for (String i : values){
			System.out.println("\n"+i);}
			}
		else if (choice == 1){
		Collections.reverse(values);
		for (String i : values){
		System.out.println("\n"+i);}
		}
		else if(choice == 2){
		Collections.sort(values);
		for(String i : values){
			System.out.println("\n"+i);
		}
		}
		else{
			System.out.println("Enter correct Choice  either 0, 1 or 2 ");
		}
		sc.close();
	}

}
