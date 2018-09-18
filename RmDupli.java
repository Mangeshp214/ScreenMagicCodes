

import java.util.*;
import java.lang.*;

class RmDupli
{  	
    static int d[];

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int a[] = new int[n];

		d = new int[n];	

		System.out.println("Enter the elements of array");
		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();

		int v = 0;

		for(int i=0; i<n; i++){

			for(int j=i+1; j<n; j++){

				if(a[i] == a[j]){
			
					System.out.println("Duplicate element found " + a[j]  + " at index "+ (j+1));
					d[v] = a[j];
					v++;
				}

			}

		}		

	}
}