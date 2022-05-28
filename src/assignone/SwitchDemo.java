package assignone;

public class SwitchDemo {

    public static void main(String[] args) {

        String day = "etaetaet";

        switch (day) {
            case "mon":
                System.out.println("Monday");
                break;
            case "tue":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            case "thu":
                System.out.println("Thursday");
                break;
            case "fri":
                System.out.println("Friday");
                break;
            default:
                System.out.println("party time");
                // break not necessary
        }

        System.out.println("done");
    }
}
