package Task1;
public class Main {
    public static void main(String[] args) {
            Staff staff = new Staff();/*AnatoliiShcherbak63570*/
            staff.initialize1();
            staff.print1();

        double hoursWorked/*AnatoliiShcherbak63570*/ = 80.4;
        double hourlyRate/*AnatoliiShcherbak63570*/ = 10.2;

        System.out.println("Salary to Pay: " + staff.salaryToPay(hoursWorked, hourlyRate));
        System.out.println("Overtime Salary: " + staff.salaryForOvertime(hoursWorked, hourlyRate));
        System.out.println("Bonus Eligibility: " + Salary.shouldReceiveBonus(3));
    }
}