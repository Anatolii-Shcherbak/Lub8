package Task1;

import java.util.Scanner;

public class Person {
    String surname,/*AnatoliiShcherbak63570*/ firstname,/*AnatoliiShcherbak63570*/ street,/*AnatoliiShcherbak63570*/ zipCode,/*AnatoliiShcherbak63570*/ city;/*AnatoliiShcherbak63570*/
    Scanner scan/*AnatoliiShcherbak63570*/ = new Scanner(System.in);


    public void initialize()/*AnatoliiShcherbak63570*/
    {
        System.out.println("Write Surname");
        surname/*AnatoliiShcherbak63570*/ = scan.nextLine();
        System.out.println("Write Name");
        firstname/*AnatoliiShcherbak63570*/ = scan.nextLine();
        System.out.println("Write Street");
        street/*AnatoliiShcherbak63570*/ = scan.nextLine();
        System.out.println("Write zipCode");
        zipCode/*AnatoliiShcherbak63570*/ = scan.nextLine();
        System.out.println("Write City");
        city/*AnatoliiShcherbak63570*/ = scan.nextLine();
    }

    public void print()/*AnatoliiShcherbak63570*/
    {
        System.out.println(surname + " " + firstname + " " + street + " " + zipCode + " " + city);
    }
}