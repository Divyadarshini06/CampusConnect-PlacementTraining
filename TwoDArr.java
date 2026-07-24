import java.util.Scanner;

public class TwoDArr {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array Elements...");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}