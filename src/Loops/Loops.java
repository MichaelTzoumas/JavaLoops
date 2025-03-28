package Loops;


import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		System.out.println("Hello World\n");                  //Τυπώνει Hello World
		Scanner in = new Scanner(System.in);		      // Παίρνει δεδομένα απο το πληκτρολόγιο και τα βάζει στην μεταβλητη S
		/*	Scanner s = new Scanner();  ----->           //2ος τρόπος να δουλέψει το Scanner()*/
		String s=in.nextLine();				     //Παίρνει δεδομένα απο το πληκτρολόγιο και τα βάζει στην μεταβλητη S Τύπου String
		
/*---------------------------------------------------------------ΒΡΟΧΟΙ------------------------------------------------------------------------*/ 
/*---------------------------------------------------------------IF----------------------------------------------------------------------------*/ 
		System.out.println("\n---------IF---------");
		if (20> 18) {
			  System.out.println("20 is greater than 18");
			}
		
/*---------------------------------------------------------------IF ELSE----------------------------------------------------------------------*/ 

		System.out.println("\n---------IF-ELSE---------");
		System.out.println("Tell us your name\n");         	//Τυπώνει Hello World
		Scanner name = new Scanner(System.in);			// Παίρνει δεδομένα απο το πληκτρολόγιο και τα βάζει στην μεταβλητη S
		String na=name.nextLine();				//κάνει έλεγχο, αν του δώσω το όνομα Mike ή Nick μου λέει hello Mike/hello Nick,
		if (na.equals("Nick")) {
		  System.out.println("hello Nick");
		} else if (na.equals("Mike")){
		  System.out.println("hello Mike");
		} else {						// αλλιως αν του δώσω αλλο όνομα λεει οτι δεν ειμαστε στην λίστα
		  System.out.println("Dear,"+na + " Your name is not on the list\n"); 
		}
		// Outputs "Good evening."
		
/*---------------------------------------------------------------FOR--------------------------------------------------------------------------*/ 

		System.out.println("\n---------(FOR)--------- \n");      //Τυπώνει "(if)You wrote: "
	    	for (int i = 0; i < 5; i++) {				 //for ---> τυπώνει αυτο που έγραψα 5 φορές
	    		System.out.println(na+i);
	    	}
	    	
/*---------------------------------------------------------------WHILE------------------------------------------------------------------------*/ 
	    	
		System.out.println("\n---------(WHILE)---------\n");       //Τυπώνει "(while)You wrote: "

	    	int i=0;
	    	while (i < 5) {						   //while --->τυπώνει αυτο που έγραψα 5 φορές
	    		  System.out.println(na+i);
	    		  i++;
	    		}
	    	
/*---------------------------------------------------------------DO-WHILE---------------------------------------------------------------------*/ 
	    	
		System.out.println("\n---------(DO-WHILE)---------\n");    

	    	int j = 0;						 //do while --->τυπώνει αυτο που έγραψα 5 φορές
	    	do {
	    		  System.out.println(na+i);
	    	  j++;
	    	}
	    	while (j < 5);

/*---------------------------------------------------------------SWITCH------------------------------------------------------------------------*/ 

		System.out.println("\n---------(SWITCH)---------\nGive me a number: ");    
		Scanner number = new Scanner(System.in);			 		 
		String dayStr=number.nextLine();			//Παίρνει δεδομένα απο το πληκτρολόγιο και τα βάζει στην μεταβλητη dayStr
		int day = Integer.parseInt(dayStr);			//Μετατρέπει το dayStr σε integer
	    	/* Ένας άλλος τρόπος ειναι να παρω δεδομένα Integer απευθειας απο το πλητρολόγιο 
      		int day=nextInt(); */

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
	    	}																//Tυπώνει Thursday
	    	
/*Η διαφορά ανάμεσα στην while και στην do-while ειναι οτι η do-while επειδη έχει τον έλεγχο στο τέλος εκτελείται τουλάχιστον 1 φορα, ακόμα και 
 * αν η συνθήκη της ειναι FALSE */
	    
/*-------------------------------------------------------ΤΕΛΟΣ ΤΩΝ ΒΡΟΧΩΝ-----------------------------------------------------------------------*/	    
	    	
	    	
	    in.close();                                   						 //κλείνω το Scanner για να μη καταναλώνει τζαμπα μνήμη
	}

}

