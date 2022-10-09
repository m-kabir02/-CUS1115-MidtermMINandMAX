import java.util.Scanner;
public class mini_grade_program {
    public static void main(String[] args) {

        int grade;
        Scanner kb= new Scanner (System.in);
        System.out.print("Enter your grade: ");
        grade=kb.nextInt();

        if(grade>=95)
            System.out.println("You get an A");
        else
            System.out.println("Maybe you'll get an A next time.");

    }
}
/*
Enter your grade: 95
You get an A

Enter your grade: 80
Maybe you'll get an A next time.
 */
