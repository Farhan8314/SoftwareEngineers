package enumeration;

public class Week {
    Day day;

    public Week() {
    }

    public Week(Day day) {
        this.day = day;
    }

    public void whatToDo(Day day) {
        switch(day) {
            case MONDAY:
                System.out.println("Study all day");
                break;
            case TUESDAY:
                System.out.println("Go to work");
                break;
            case WEDNESDAY:
                System.out.println("Study with the group");
                break;
            case THURSDAY:
                System.out.println("Work on homework");
                break;
            case FRIDAY:
                System.out.println("Continue working on hw with group");
                break;
            case SATURDAY:
                System.out.println("Go to class");
                break;
            case SUNDAY:
                System.out.println("Take midterm");
                break;
            default:
                System.out.println("Keep studying to become a tester");
        }

    }
}
