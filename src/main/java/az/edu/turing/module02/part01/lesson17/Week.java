package az.edu.turing.module02.part01.lesson17;

public final class Week {
    private final DaysOfWeek days;


    public Week(DaysOfWeek days) {
        this.days = days;
    }

    public DaysOfWeek getDays() {
        return days;
    }
//    }
//
//    public void setDays(DaysOfWeek days) {
//        this.days = days;
//    }

    @Override
    public String toString() {
        return "Week{" +
                "days=" + days +
                '}';
    }
}
