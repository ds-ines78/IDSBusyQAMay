package assignone;

public class ConditionalStatements {

    public static void main(String[] args) {

        int marks = 78;

        if(marks > 90) {
            System.out.println("good");
        } else if(marks > 50 && marks <= 80) {
            System.out.println("average");
        } else {
            System.out.println("fail");
        }

        System.out.println("bye!");
    }
}
