package Task1;

public interface Salary {
    double salaryToPay/*AnatoliiShcherbak63570*/(double hours, double rate);
    default double salaryForOvertime/*AnatoliiShcherbak63570*/(double hours, double rate) {
        return hours * rate * 0.5;
    }
    static boolean shouldReceiveBonus/*AnatoliiShcherbak63570*/(int yearsOfExperience) {
        return yearsOfExperience >= 5;
    }
}

