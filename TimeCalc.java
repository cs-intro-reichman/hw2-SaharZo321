public class TimeCalc {
    public static void main(String[] args) {
        String timeInput = args[0];
        int hoursInput = Integer.parseInt(timeInput.substring(0, 2));
        int minutesInput = Integer.parseInt(timeInput.substring(3));
        int additionInput = Integer.parseInt(args[1]);

        int minutesOutput = (additionInput + minutesInput) % 60;
        int additionalHours = (additionInput + minutesInput) / 60;
        int hoursOutput = (hoursInput + additionalHours) % 24;

        System.out.printf("%02d:%02d\n", hoursOutput, minutesOutput);
    }
}
