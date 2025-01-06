import java.util.Scanner;

public class IT24103874Lab10Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mark (from 0 to 100) : ");
        int mark = input.nextInt();
        assert(mark<=100 && mark>=0) : "Invalid mark";
        System.out.println();
        System.out.println("Marks are valid");
    }
}