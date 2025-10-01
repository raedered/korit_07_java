package coding_test.javatest;

import java.util.HashSet;
import java.util.Set;

public class MeetingAttendees {
    public static void main(String[] args) {
        Set<String> attendees = new HashSet<>();
        HashSet<String> setList = new HashSet<>();

        setList.add("김철수");
        setList.add("이영희");
        setList.add("박지성");
        setList.add("김철수");
        attendees.addAll(setList);

        System.out.println("박지성 참석여부: " + attendees.contains("박지성"));

        System.out.println("최종 참석자 수: " + attendees.size());
        System.out.println("전체 명단: " + attendees);
    }
}
