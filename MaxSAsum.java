import java.util.*;
public class MaxSAsum{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        int n,i;
        n=sc.nextInt();
        int arr[]= new int[n];
        for(i=0;i<n;i++){
        arr[i]= sc.nextInt();
        }

        int currentSum= arr[0];
        int MaxSum= arr[0];

        for(i=1;i<n;i++){
            currentSum= Math.max(arr[i],currentSum+arr[i]);
            MaxSum=Math.max(currentSum,MaxSum);
        }

        System.out.println(MaxSum);
    }
}