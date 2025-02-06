package februalry2025;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingScheduler {
    public static void main(String[] args) {

        List<int[]> participant1 = Arrays.asList(new int[]{540, 570}, new int[]{600, 630},new int[]{720, 750});
        List<int[]> participant2 = Arrays.asList(new int[]{570, 600}, new int[]{750, 780});
        List<int[]> participant3 = Arrays.asList(new int[]{540, 570}, new int[]{600, 630});

        List<int[]> allMeetings = new ArrayList<>();
        allMeetings.addAll(participant1);
        allMeetings.addAll(participant2);
        allMeetings.addAll(participant3);

        String availableSlots = findFirstFreeSlot(allMeetings);

        System.out.println(availableSlots);

    }

    public static String findFirstFreeSlot(List<int[]> allMeetings) {
        int startDay = 540;
        int endDay = 1020;
        int slotDuration = 30;

        boolean[] busySlots = new boolean[(endDay - startDay) / slotDuration];

        for (int[] meeting : allMeetings) {
            int startTime = meeting[0];
            int endTime = meeting[1];
            int startSlot = (startTime - startDay) / slotDuration;
            int endSlot = (endTime - startDay) / slotDuration;

            Arrays.fill(busySlots, startSlot, endSlot,true);
        }

        for (int i = 0; i < busySlots.length; i++) {
            if (!busySlots[i]) {
                int slotStart = startDay + (i * slotDuration);
                return formatTime(slotStart) + "-" + formatTime(slotStart + slotDuration);
            }
        }
           return "No slots found";
    }

    public static String formatTime(int minutes) {
        int hour = minutes / 60;
        int minute = minutes % 60;

        return String.format("%02d:%02d", hour, minute);
    }
}
