package C12_Java;

public class TimeConversion {
    public static void main(String[] args) {
        String time = "12:23:45PM";
        String _24HourTime = convert(time);
        System.out.println(_24HourTime);
    }

    private static String convert(String time) {
        String[] components = time.split(":");
        String hour = components[0];
        String minute = components[1];
        String second = components[2];
        String sec = second.substring(0,2);
        String meri = second.substring(2);

        if(meri.equalsIgnoreCase("AM")){
            if(hour.equals("12"))hour = "00";
        }else if(meri.equalsIgnoreCase("PM")){
            if(Integer.parseInt(hour)< 12){
                int a = Integer.parseInt(hour) + 12;
                hour = String.valueOf(a);
            }
        }
        return hour.concat(":")+ minute.concat(":")+sec;
    }
}
