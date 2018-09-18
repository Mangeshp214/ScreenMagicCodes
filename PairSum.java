
import java.util.*;
import java.lang.*;

class PairSum
{  
    
    public static int pairs[][];
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        int sum;
        System.out.println("Enter the sum value");
        sum = scan.nextInt();
        
        int n;
        System.out.println("Enter the number of elements"); 
        n = scan.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
        
            a[i] = scan.nextInt();
        
        }
        
        pairs= new int[n][2];
        int v = 0;
        
        for(int i=0; i<n; i++){
        
            for(int j=i; j<n; j++){
            
                if(sum == (a[i]+a[j])){
                
                    if(!exists(a[i], a[j], n)){
                    
                        pairs[v][0] = a[i];
                        pairs[v][1] = a[j];
                        v++;
                    
                    }
                
                }
            
            }
           
        }
         for(int i=0; i<n; i++){
            
                if(pairs[i][0] == 0 && pairs[i][1] == 0)
                    break;
                
                System.out.println(pairs[i][0] + " and " + pairs[i][1]);
            
            }
        
    }
    
    public static boolean exists(int a1, int a2, int n){
    
        for(int k=0; k<n; k++){
        
            if(pairs[k][0] == a1 && pairs[k][1] == a2)
                return true;
        
        }
        
        return false;
    
    }
}