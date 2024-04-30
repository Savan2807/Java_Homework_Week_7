import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 */

public class P03_MarkSheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the Student : "); //input  for a user
        String Studentname = sc.nextLine();

        System.out.println("Enter the roll number of the student : ");//input for a user
        int rollnum = sc.nextInt();

        System.out.println("Enter the marks of Math : ");//input for a user
        int mathmark = sc.nextInt();

        System.out.println("Enter the marks of Science : ");//input for a user
        int scimark = sc.nextInt();

        System.out.println("Enter the marks of English : ");//input wizard for a user
        int engmark = sc.nextInt();

        if (mathmark < 0 || mathmark > 100) {
            System.out.println("Invalid Input of Math's mark, Marks should between 0 to 100");
        } else if (scimark < 0 || scimark > 100) {
            System.out.println("Invalid Input of Science's mark, Marks should between 0 to 100");
        } else if (engmark < 0 || engmark > 100) {
            System.out.println("Invalid Input English's mar, Marks should between 0 to 100");
        } else {
            int total = mathmark + scimark + engmark;
            int percetage = ((total) * 100) / 300;

            System.out.println("|----------------------------------------------|");
            System.out.println("|          MARK SHEET                          |");
            System.out.println("|----------------------------------------------|");
            System.out.println("|  Name        :     " + Studentname +        "|");
            System.out.println("|  Roll No     :         " + rollnum +        "|");
            System.out.println("|----------------------------------------------|");
            System.out.println("|  Subject     :   Marks                       |");
            System.out.println("|----------------------------------------------|");
            System.out.println("|  Math        :     " + mathmark + "          |");
            System.out.println("|  Science     :     " + scimark + "           |");
            System.out.println("|  English     :     " + engmark + "           |");
            System.out.println("|----------------------------------------------|");
            System.out.println("|  TOTAL       :  " + total + "                |");
            System.out.println("|----------------------------------------------|");
            System.out.println("|  Percentage  :  " + percetage + " %          |");
            System.out.println("|  Result      :  " + passFail(percetage) +   "|");
            System.out.println("|  Grade       :  " + gradecheck(percetage) + "|");
            System.out.println("|----------------------------------------------|");
        }
    }
    public static String gradecheck(int a) {
        String grade;
        if (a >= 80) {
            grade = "A+";
        } else if (a >= 60 && a < 80) {
            grade = "A";
        } else if (a >= 50 && a < 60) {
            grade = "B";
        } else if (a >= 35 && a < 50) {
            grade = "C";
        } else {
            grade = "FAIL";
        }
        return grade;
    }

    public static String passFail(int a) {
        String cre;
        if (a >= 35) {
            cre = "PASS";
        } else {
            cre = "FAIL";
        }
        return cre;
    }
}

