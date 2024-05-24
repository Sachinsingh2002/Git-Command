import java.util.Scanner;

public class hello {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");

        String name = sc.next();

        System.out.println("here is the string " + name);
        
    }
}