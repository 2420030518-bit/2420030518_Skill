package JavaProject;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class age_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);
        System.out.println(age.getYears());
    }
}
