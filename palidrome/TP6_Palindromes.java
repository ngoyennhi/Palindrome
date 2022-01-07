package palidrome;

import java.util.Scanner;

public class TP6_Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       String mot, mot_inverse = "";
	       Scanner in = new Scanner(System.in);
	  
	       System.out.println("Entrer un mot ");
	       mot = in.nextLine();
	  
	       if (pal(mot))
	          System.out.println("'"+mot + "' est un palindrome");
	       else
	          System.out.println("'"+mot + "' n'est pas un palindrome");
	    }
	    
	    public static boolean pal(String mot){
	       int i=0, longueur=mot.length()-1;
	       boolean egale=true;
	       /*tester le premier caractère avec le dernier
	        *et s'ils sont égaux, le programme continu
	        *à dérouler la boucle while et tester
	        *le caractère suivant(i+1 avec longeur-(i+1))
	        *jusqu'à i soit égale à longueur/2,
	        *, sinon le booléen egale reçoit false
	        *donc, la fonction pal retourne false
	        */
	        while(i<longueur/2 && egale){
	           if(mot.charAt(i)==mot.charAt(longueur-i))
	              egale = true;
	           else
	              egale = false;
	           i++;
	        }
	        return egale;
	    }
	}


