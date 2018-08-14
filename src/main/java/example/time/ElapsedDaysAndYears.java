/* Josef Chlachula (c) 2018 MIT license */

package example.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public class ElapsedDaysAndYears {
    private static void elapsedYearsFromEvent(int yyyy, int mm, int dd, LocalDate today, String event) {
        LocalDate localDate = LocalDate.of(yyyy, mm, dd);
        System.out.println(YEARS.between(localDate, today) + " years from : " + event + " : " + localDate);
    }

    public static void main(String[] args) {
        System.out.println("Now: " + LocalDateTime.now());
        System.out.println();

        LocalDate today = LocalDate.now();
        LocalDate localDateThisYearJan1 = LocalDate.of(today.getYear(), 1, 1);
        LocalDate localDateThisYearDec31 = LocalDate.of(today.getYear(), 12, 31);
        System.out.print("Today is " + DAYS.between(localDateThisYearJan1, today) + " days from beginning of the year (" + localDateThisYearJan1 + ") ");
        System.out.println("and " + DAYS.between(today, localDateThisYearDec31) + " days remains till end of the year (" + localDateThisYearDec31 + ") ");
        System.out.println();

        elapsedYearsFromEvent(476, 9, 4, today, "Fall of the Roman Empire");
        elapsedYearsFromEvent(1440, 1, 1, today, "Johannes Gutenberg developed printing press with movable type");
        elapsedYearsFromEvent(1492, 8, 3, today, "Christopher Columbus Discovers America");
        elapsedYearsFromEvent(1776, 7, 4, today, "The United States Declaration of Independence");
        elapsedYearsFromEvent(1969, 7, 20, today, "Lunar module of the Apollo 11 landed on the Moon");

    }
}
