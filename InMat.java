import java.util.*;
import java.lang.*;

class InMat
{  
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of matriz m and n");
        int m = scan.nextInt();
        int n = scan.nextInt();
        
        System.out.println("Enter elements in matrix");
        
        int[][] a = new int[m][n];
        for(int i=0; i<m; i++){
        
            for(int j=0; j<n; j++){
            
                a[i][j] = scan.nextInt();
            
            }
        
        }
        
        for(int i=0; i<n; i++){
        
            for(int j=0; j<n; j++){
            
                if(i < j){
                
                    a[i][j] = a[i][j] * -1;
                
                }
                
            }
        
        }
        
        for(int i=0; i<m; i++){
        
            for(int j=0; j<n; j++){
            
                System.out.print(a[i][j]);
            
            }
            System.out.println();
        
        }
        
    }
}