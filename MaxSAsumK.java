import java.util.*;
public class MaxSAsumK {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int arr[] =new int[n];
        int WinSum=0, result=0, i;
        for(i=0;i<n;i++){
           arr[i]= sc.nextInt();
        }
        int k=sc.nextInt();

           for(i=0; i<k; i++){
            WinSum=WinSum+arr[i];
           }

           for(i=k; i<n; i++){
            WinSum +=arr[i]-arr[i-k];
           
           result=Math.max(result,WinSum);
           }
           
        
        System.out.print(result);
    }
}
