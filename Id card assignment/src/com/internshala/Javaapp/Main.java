package com.internshala.Javaapp;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner id = new Scanner(System.in);
        System.out.print("Enter your name :");
        String Name = id.nextLine();

        System.out.print("Enter your bloodgroup :");
        String bloodgroup =id.nextLine();

        System.out.print("Enter your age :");
        int age=id.nextInt();

	    System.out.println("-----------------------");
        System.out.println("Your Name is  "+Name);
        System.out.println("Your age is "+age);
        System.out.println("Your blood group is "+bloodgroup);

        id.close();

	    String group ;
	    if (age>=20){
		    group = "Red";
        }else if (age>=15 & age <20){
	    	group = "Blue";
        }else if (age>=10 & age<15){
	    	group = "Yellow";
	    } else{
	    	group = "";
	    }
	    System.out.println("-----------------------");
	    System.out.println("Your group is "+group);
	    System.out.println("-----------------------");



    }
}
