package Loops;


import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		System.out.println("Hello World");               //Τυπώνει Hello World
		Scanner in = new Scanner(System.in);			 // Παίρνει δεδομένα απο το πληκτρολόγιο και τα βάζει στην μεταβλητη S
		/*	Scanner s = new Scanner(System.in);  ----->  //2ος τρόπος να δουλέψει το Scanner()*/
		String s=in.nextLine();							 //Παίρνει δεδομένα απο το πληκτρολόγιο και τα βάζει στην μεταβλητη S Τύπου String
		
/*---------------------------------------------------------------ΒΡΟΧΟΙ----------------------------------------------------------------------------------*/ 
/*---------------------------------------------------------------IF----------------------------------------------------------------------------------*/ 
		System.out.println("IF");
		if (20> 18) {
			  System.out.println("20 is greater than 18");
			}
		
/*---------------------------------------------------------------IF ELSE----------------------------------------------------------------------------------*/ 

		System.out.println("IF-ELSE");
		int time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		
/*---------------------------------------------------------------FOR----------------------------------------------------------------------------------*/ 

		System.out.println("(FOR)You wrote: ");           //Τυπώνει "(if)You wrote: "
	    	for (int i = 0; i < 5; i++) {				//for ---> τυπώνει αυτο που έγραψα 5 φορές
	    		System.out.println(s);
	    	}
	    	
/*---------------------------------------------------------------WHILE----------------------------------------------------------------------------------*/ 
	    	
		System.out.println("(WHILE)You wrote: ");       //Τυπώνει "(while)You wrote: "

	    	int i=0;
	    	while (i < 5) {								//while --->τυπώνει αυτο που έγραψα 5 φορές
	    		  System.out.println(s);
	    		  i++;
	    		}
	    	
/*---------------------------------------------------------------DO-WHILE----------------------------------------------------------------------------------*/ 
	    	
		System.out.println("(DO-WHILE)You wrote: ");    //Τυπώνει "(do-while)You wrote: "

	    	int j = 0;									//do while --->τυπώνει αυτο που έγραψα 5 φορές
	    	do {
	    		  System.out.println(s);
	    	  j++;
	    	}
	    	while (j < 5);

/*---------------------------------------------------------------SWITCH----------------------------------------------------------------------------------*/ 

		System.out.println("(SWITCH)You wrote: ");    //Τυπώνει "(switch)You wrote: "

	    	int day = 4;
	    	switch (day) {
	    	  case 1:
	    	    System.out.println("Monday");
	    	    break;
	    	  case 2:
	    	    System.out.println("Tuesday");
	    	    break;
	    	  case 3:
	    	    System.out.println("Wednesday");
	    	    break;
	    	  case 4:
	    	    System.out.println("Thursday");
	    	    break;
	    	  case 5:
	    	    System.out.println("Friday");
	    	    break;
	    	  case 6:
	    	    System.out.println("Saturday");
	    	    break;
	    	  case 7:
	    	    System.out.println("Sunday");
	    	    break;
	    	}											//Tυπώνει Thursday
	    
/*-------------------------------------------------------ΤΕΛΟΣ ΤΩΝ ΒΡΟΧΩΝ--------------------------------------------------------------------------------*/	    
	    	
	    	
	    in.close();                                    //κλείνω το Scanner για να μη καταναλώνει τζαμπα μνήμη
	}

}
