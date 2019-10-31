package bibao;

public class NestedClassAndFinal {
    public static void main(String[] args) {
        int answer = 42;
        answer ++; // don't do this !
        int finalAnswer = answer;
        Thread t = new Thread(
                () -> System.out.println("The answer is: " + finalAnswer)
        );
    }
}
