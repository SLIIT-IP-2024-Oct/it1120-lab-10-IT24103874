import java.util.Scanner;

public class IT24103874Lab10Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mark (from 0 to 100) : ");
        int mark = input.nextInt();
        assert(mark<=100 && mark>=0) : "Invalid mark";
        System.out.println();
        System.out.println("Marks are valid");

        System.out.print("Enter the mark correspondant grade : ");
        char grade = input.next().charAt(0);
        char aGrade;

        if (mark > 75) {
            aGrade = 'A';
        } else if (mark > 60){
            aGrade = 'B';
        } else if (mark > 50){
            aGrade = 'C';
        } else if (mark > 40) {
            aGrade = 'D';
        } else {
            aGrade = 'F';
        }

        assert grade==aGrade : "Incorrect grade assigned";

        System.out.println();
        System.out.println("Valid grade assigned");
    }
}