import java.util.Arrays;

public class NMeetingOneRoom {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 10 },
              end[] = { 2, 4, 5, 7, 9, 9 };
        meetings(start, end);

    }

    static void meetings(int a[], int b[]) {
        Meeting m[] = new Meeting[a.length];
        for (int i = 0; i < a.length; i++) {

            m[i] = new Meeting(i, a[i], b[i]);
        }

        Arrays.sort(m, (c, d) -> c.end - d.end);
        for (Meeting meeting : m) {
            System.out.println(meeting.index + " " + meeting.end + " " + meeting.start);
        }
        int i = 0, j = 1;
        int c = 1;
        while (j < m.length) {

            if (m[i].end < m[j].start) {
                System.out.println(m[i].index);
                c++;
                i = j;
                j++;

            } else {
                j++;
            }
        }
        System.out.println(c);
    }

}

class Meeting {
    int index;
    int start;
    int end;

    Meeting(int index, int start, int end) {
        this.index = index;
        this.start = start;
        this.end = end;
    }
}
