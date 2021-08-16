package course;

import java.util.*;
import java.math.*;

public class VanyaAndLanterns {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double minD=0, maxD=0,x=0;
		int d = sc.nextInt();
		double [] arr = new double[n];
		Double [] v = new Double[n-1];
		
		for(int i= 0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
			minD=(double) arr[0] - 0;
			maxD=(double) d - arr[n-1];
		
			double t = (Math.max(minD,maxD));	
		
		for(int i= 0;i<arr.length-1;i++) {
			v[i]=arr[i+1]-arr[i];
		}
		
		if (n !=1) {
          x = Collections.max(Arrays.asList(v));
		}
		
		double z = x/2.0;	
		
		if (t > z)
		System.out.print(t);
		else 
		System.out.print(z);
 
			
	}

}
