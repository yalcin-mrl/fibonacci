import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0,n2 = 1,sum = 0,n3;
        System.out.print(n1 +" ");
        System.out.print(n2+ " ");
        while (n-1>0){
            sum = (n1 +n2);
            System.out.print(sum + " ");
            n1 = n2;
            n2 = sum;
            n--;
        }
    }
}
