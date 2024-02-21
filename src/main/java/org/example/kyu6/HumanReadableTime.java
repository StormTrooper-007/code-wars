package org.example.kyu6;


public class HumanReadableTime {
    public String makeReadable(int seconds) {
            if (seconds < 0) return null;
            int hrs = (int)Math.floor((double) seconds / 3600);
            int mins = Math.min((int)Math.floor(((double)seconds/3600 - hrs) * 60),59);
            int secs = Math.min(((int)Math.round((((double)seconds/3600 - hrs) * 60 - mins)*60)), 59);

        System.out.println(Math.min(((int)Math.floor((((double)seconds/3600 - hrs) * 60 - mins)*60)), 59));
        System.out.println(hrs);
           return (hrs > 9 ? hrs : "0" + hrs) +
                ":" +(mins > 9 ? mins : "0" + mins)+
                ":" +(secs > 9 ? secs : "0" + secs);
    }
}
