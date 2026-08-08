import java.util.*;

class MyCalendarTwo {

    ArrayList<int[]> kk = new ArrayList<>();

    public MyCalendarTwo() {
    }

    public boolean book(int startTime, int endTime) {

        for (int[] a : kk) {

            if (startTime < a[1] && a[0] < endTime) {

                int overlapStart = Math.max(startTime, a[0]);
                int overlapEnd = Math.min(endTime, a[1]);

                for (int[] b : kk) {

                    if (b == a) {
                        continue;
                    }

                    if (overlapStart < b[1] &&
                        b[0] < overlapEnd) {

                        return false;
                    }
                }
            }
        }

        kk.add(new int[]{startTime, endTime});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */