import java.util.*;
public class MinSAsumK {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        int WinSum=0, result =0,i;
   
             int n = sc.nextInt();
             int arr[] = new int[n];
             for(i=0;i<n;i++){
                arr[i] = sc.nextInt();
             }
             int k=sc.nextInt();

             for(i=0;i<k;i++){
                WinSum=WinSum+arr[i];
                result=WinSum;
             }

             for(i=k;i<n;i++){
                WinSum +=arr[i]-arr[i-k];
            
             result=Math.min(result,WinSum);
            }
            System.out.println(result);
        }
      }