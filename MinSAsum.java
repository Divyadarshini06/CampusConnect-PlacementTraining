import java.util.*;
public class MinSAsum{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        int n,i;
        n=sc.nextInt();
        int arr[]= new int[n];
        for(i=0;i<n;i++){
        arr[i]= sc.nextInt();
        }

        int currentSum= arr[0];
        int MinSum= arr[0];

        for(i=1;i<n;i++){
            currentSum= Math.min(arr[i],currentSum+arr[i]);
            MinSum=Math.min(currentSum,MinSum);
        }

        System.out.println(MinSum);
    }
}
