import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of subjects:");
        int Total_Subjects = sc.nextInt();
        float Max_marks = 100;
        float Total_Marks = 0;
        float Sum = 0;
        float Sub_Marks = 0;
        for (int i = 1; i <= Total_Subjects; i++) {
            System.out.println("Marks obtained in Sub" + i + ":");
            Sub_Marks = sc.nextInt();
            Sum = Sum + Sub_Marks;
        }
        Total_Marks = Sum;

        float Average_Percentage = (Total_Marks) / (Total_Subjects);
        System.out.println(Total_Marks);
        System.out.println(Average_Percentage);

        if (Average_Percentage <= 100 && Average_Percentage >= 90) {
            System.out.println("total marks obtained are: " + Total_Marks);
            System.out.println("Average percentage obtained is:  " + Average_Percentage);
            System.out.println("Grade obtained by student is: " + "S");
        } else if (Average_Percentage < 90 && Average_Percentage >= 80) {
            System.out.println("total marks obtained are: " + Total_Marks);
            System.out.println("Average percentage obtained is:  " + Average_Percentage);
            System.out.println("Grade obtained by student is: " + "A");
        } else if (Average_Percentage < 80 && Average_Percentage >= 70) {
            System.out.println("total marks obtained are: " + Total_Marks);
            System.out.println("Average percentage obtained is:  " + Average_Percentage);
            System.out.println("Grade obtained by student is: " + "B");
        } else if (Average_Percentage < 70 && Average_Percentage >= 60) {
            System.out.println("total marks obtained are: " + Total_Marks);
            System.out.println("Average percentage obtained is:  " + Average_Percentage);
            System.out.println("Grade obtained by student is: " + "C");
        } else if (Average_Percentage < 60 && Average_Percentage >= 50) {
            System.out.println("total marks obtained are: " + Total_Marks);
            System.out.println("Average percentage obtained is:  " + Average_Percentage);
            System.out.println("Grade obtained by student is: " + "E");
        } else {
            System.out.println("total marks obtained are: " + Total_Marks);
            System.out.println("Average percentage obtained is:  " + Average_Percentage);
            System.out.println("Grade obtained by student is: " + "F");
        }

    }

}
