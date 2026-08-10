import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {

        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}

Input
date1 =
"2019-06-29"
date2 =
"2019-06-30"
Output
1
Expected
1

  input
date1 =
"2020-01-15"
date2 =
"2019-12-31"
Output
15
Expected
15
