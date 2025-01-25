package January2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SimpleMeetingScheduler {

//    problem statement:
//    find the first available meeting time slot that is suiting all participants' calendar availabilities.
//
//    input: list of participants, each one containing list of meeting details (starting time - ending time)
//    Assume every meeting duration is divisible by 30 min, all calendar are starting  at 09:00
//    Assume different people are having different calendars entries
//    Assume that meeting details are ordered
//
//    output: the first free for all participants slot or "no slot" if None

//    Трябва да намерим първия свободен времеви интервал, който е подходящ за всички участници, базирано на техните календари с заетост.

    public static void main(String[] args) {
        // Входни данни: календари на участниците
        List<List<int[]>> calendars = new ArrayList<>();
        calendars.add(Arrays.asList(new int[]{540, 600}, new int[]{720, 780})); // Участник 1
        calendars.add(Arrays.asList(new int[]{570, 630}, new int[]{780, 840})); // Участник 2

        int meetingDuration = 30; // Продължителност на срещата (в минути)
        String result = findFirstFreeSlot(calendars, meetingDuration);
        System.out.println(result); // Очакван резултат: 10:30 - 11:00
    }

    public static String findFirstFreeSlot(List<List<int[]>> calendars, int duration) {
        // Работен ден: от 09:00 (540 минути) до 17:00 (1020 минути)
        int startOfDay = 540;
        int endOfDay = 1020;

        // 1. Събираме всички интервали в един общ списък
        List<int[]> allBusyTimes = new ArrayList<>();
        for (List<int[]> calendar : calendars) {
            allBusyTimes.addAll(calendar);
        }

        // 2. Сортираме интервалите по начало
        allBusyTimes.sort(Comparator.comparingInt(a -> a[0]));

        // 3. Търсим свободен интервал
        int freeStart = startOfDay;
        for (int[] busy : allBusyTimes) {
            if (busy[0] - freeStart >= duration) {
                // Намерен е свободен интервал
                return formatTime(freeStart) + " - " + formatTime(freeStart + duration);
            }
            // Преместваме свободното начало след текущия зает интервал
            freeStart = Math.max(freeStart, busy[1]);
        }

        // 4. Проверка след последния зает интервал
        if (endOfDay - freeStart >= duration) {
            return formatTime(freeStart) + " - " + formatTime(freeStart + duration);
        }

        return "No slot"; // Ако няма свободен интервал
    }

    private static String formatTime(int minutes) {
        int hours = minutes / 60;
        int mins = minutes % 60;
        return String.format("%02d:%02d", hours, mins);
    }
}