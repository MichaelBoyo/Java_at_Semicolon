package C16_Java;

import C8_Java.Time1;

import java.util.Comparator;

public class TimeComparator implements Comparator<Time1> {
    @Override
    public int compare(Time1 time1, Time1 time2) {
        int hourDifference = time1.getHour() - time2.getHour();

        if (hourDifference != 0) { // test the hour first
            return hourDifference;

        }
        int minuteDifference = time1.getMinute() - time2.getMinute();
        if (minuteDifference != 0) { // then test the minute
            return minuteDifference;
        }
        return time1.getSecond() - time2.getSecond();
    }
}
