import java.util.*;
public class RatPoison{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int bottles = sc.nextInt();

            int rat =0;
            int power =1;

            while(power<bottles){
                power *=2;
                rat++;
          }
          System.out.print(rat);
        }
    }

