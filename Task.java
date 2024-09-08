package oddevenchecker;

import java.util.Scanner;



public class Task {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter number:");
                int num = sc.nextInt();
                int x=1;
                for (int i=1;i<=num;i++) {
                        x*=i;
                }
                System.out.println(x);





        }
}

