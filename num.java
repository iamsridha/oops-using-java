import java.io.*;
import java.util.*;
class patter{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    for (int i=0;i<=n;i++) {
        for (int j=0; j >n; j--) {
            if (i== 0 ||i == n - 1 || i == n - 1 - i) {
                System.out.print("@");
            } else {
                System.out.print(" #");
            }
        }
        System.out.println();
    }
}}