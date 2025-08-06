package JavaProject;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class employee_program {
    public static void main(String[] args) {
        LocalTime s = LocalTime.of(9, 0);
        LocalTime e = LocalTime.of(18, 0);
        LocalTime in = LocalTime.of(9, 15);
        LocalTime out = LocalTime.of(17, 45);
        System.out.println("In: " + in);
        System.out.println("Out: " + out);
        if (!in.isBefore(s) && !out.isAfter(e)) {
            System.out.println("In time");
        } else {
            System.out.println("Out of time");
        }
        long h = Duration.between(in, out).toHours();
        long m = Duration.between(in, out).toMinutesPart();
        System.out.println("Worked: " + h + "h " + m + "m");
    } 	
}
