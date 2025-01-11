package az.edu.turing.tasks.exceptionTask;

public class AgeApp {

    private static final int MAX_AGES = 50;

    public static void main(String[] args) {

        AgeManager ageManager = new AgeManager(MAX_AGES);
        int count = ageManager.collectAges();

        if (count == 0) {
            System.out.println("No ages were entered.");
        } else {
            ageManager.displayAges(count);
            ageManager.processAges(count);
        }
    }
}
