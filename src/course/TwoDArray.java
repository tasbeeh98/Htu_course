package course;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter size : ");
	       Scanner sc=new Scanner(System.in);
	       int rows=sc.nextInt();
	       int columns=sc.nextInt();
	       
	       System.out.println("Enter elements : ");    
	        
	       int twoD[][]=new int[rows][columns];  
	       for(int i=0; i<rows;i++){
	    	   for(int j=0; j<columns;j++){
	    		   twoD[i][j]=sc.nextInt();}
	         }
	       
	        // print element  
	        System.out.print("\nData you entered : \n");
	        for (int n = 0; n <rows ; n++){
	            for (int m = 0; m <columns; m++){
	                System.out.print(twoD[n][m] + " ");}
	            
	            System.out.println("");
	           }
	        
	        //rotate element
	        System.out.print("\nRotate by 90 degrees : \n");
	        for (int x = 0; x <rows; x++){
	            for (int y = columns-1; y >=0; y--){
	                System.out.print(twoD[y][x] + " ");}
	            
	            System.out.println("");
	        }
	}//end main     


}
