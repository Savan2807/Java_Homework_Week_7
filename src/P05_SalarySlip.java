import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */


public class P05_SalarySlip {


        public static double hra(double a) {//withreturntypewithoerameter method
            return a * 0.10;
        }

        public static double da(double a) {
            return a * 0.08;
        }//withreturntypewithoerameter method

        public static double ta(double a) {//withreturntypewithoerameter method
            return a * 0.09;
        }

        public static double pf(double a) {
            return a * 0.20;
        }//withreturntypewithoerameter method

        public static double grosssalary(double a) {
            return a + hra(a) + ta(a) + da(a) - pf(a);
        }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);//Scan user input

        System.out.println("Enter a Employee Id :");
        int EmployeeId = obj.nextInt();//EmployeeId object

        System.out.println("Enter a Employee name :");
        String Employeename = obj.next();//Employeename object

        System.out.println("Enter a Basic Salary:");
        float BasicSalary = obj.nextFloat();//BasicSalary object

        System.out.println(hra(BasicSalary));
        System.out.println(da(BasicSalary));
        System.out.println(ta(BasicSalary));
        System.out.println(pf(BasicSalary));
        System.out.println(grosssalary(BasicSalary));
    }
}
