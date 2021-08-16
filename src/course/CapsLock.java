package course;

import java.util.Scanner;

public class CapsLock {
	public static void main(String[] args) {
		String check="";
		// TODO Auto-generated method stub
	       Scanner sc=new Scanner(System.in);	       
	       String text = sc.next();	      

	       char []arr = text.toCharArray();
	              		
	        		for(int i=1; i<arr.length ;i++)
	        	    {
	        	        check=check+arr[i];
	        	    }
	        		
	        if((check.toUpperCase().equals(check) && Character.isUpperCase(arr[0])))    	          
	        	System.out.print(Character.toLowerCase(arr[0])+check.toLowerCase());	              
	        else if (check.toLowerCase().equals(check) && Character.isUpperCase(arr[0]))
	        	System.out.print(Character.toUpperCase(arr[0])+check);
	        else if (check.toUpperCase().equals(check) && Character.isLowerCase(arr[0]))
	            {System.out.print(Character.toUpperCase(arr[0])+check.toLowerCase());}
	        else 
	            {System.out.print(arr[0]+check);
}
	        	
	}
}
