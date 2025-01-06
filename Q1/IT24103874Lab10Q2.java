import java.util.Scanner;

public class IT24103874Lab10Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mark (from 0 to 100) : ");
        int mark = input.nextInt();
        assert(mark<=100 && mark>=0) : "Invalid mark";
        System.out.println();
        System.out.println("Marks are valid");

        if (mark >= 75) {
            Grade = 'A';
        } else if (mark >= 60){
            Grade = 'B';
        } else if (mark >= 50){
            Grade = 'C';
        } else if (mark >= 40) {
            Grade = 'D';
        } else {
            Grade = 'F';
        }

        assert (Grade==A && mark>=75 && mark<=100 ||
                Grade==B && mark>=60 && mark<75 ||
                Grade==C && mark>=50 && mark<60 ||
                Grade==D && mark>=40 && mark<50 ||
                Grade==F && mark>=0 && mark<40) : "Incorrect grade assigned";

        System.out.println();
        System.out.println("Valid grade assigned");
    }
}
