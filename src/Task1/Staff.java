package Task1;

import java.util.Scanner;

public class Staff extends Person implements Salary {
    String education/*AnatoliiShcherbak63570*/, pozition;/*AnatoliiShcherbak63570*/
    Scanner scan/*AnatoliiShcherbak63570*/ = new Scanner(System.in);

    public void initialize1()/*AnatoliiShcherbak63570*/
    {
        initialize();/*AnatoliiShcherbak63570*/
        System.out.println("Write Education");
        education/*AnatoliiShcherbak63570*/ = scan.nextLine();
        System.out.println("Write Pozition");
        pozition/*AnatoliiShcherbak63570*/ = scan.nextLine();
    }

    public void print1()/*AnatoliiShcherbak63570*/
    {
        print();/*AnatoliiShcherbak63570*/
        System.out.println(education + " " + pozition);
    }

    @Override/*AnatoliiShcherbak63570*/
    public double salaryToPay(double hours, double rate) {
        return hours * rate;
    }
}
