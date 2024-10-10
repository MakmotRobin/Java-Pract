import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Phone {
    void call();
    void text();
    void showCallHistory();
    void showTextHistory();
}

abstract class OnePhone implements Phone {
    protected List<String> callHistory = new ArrayList<>();
    protected List<String> textHistory = new ArrayList<>();
    protected Scanner scanner = new Scanner(System.in);

    @Override
    public void call() {
        System.out.print("Who do you want to call? ");
        String contact = scanner.nextLine();
        callHistory.add(contact);
        System.out.println("Calling " + contact + "...");
    }

    @Override
    public void text() {
        System.out.print("Who do you want to text? ");
        String contact = scanner.nextLine();
        System.out.print("What is your message? ");
        String message = scanner.nextLine();
        textHistory.add("Text to " + contact + ": " + message);
        System.out.println("Text sent to " + contact + ".");
    }

    @Override
    public void showCallHistory() {
        System.out.println("Call History:");
        for (String call : callHistory) {
            System.out.println(call);
        }
    }

    @Override
    public void showTextHistory() {
        System.out.println("Text History:");
        for (String text : textHistory) {
            System.out.println(text);
        }
    }
}

class RobinPhone extends OnePhone {
    public void usePhone() {
        System.out.println("Using RobinPhone:");
        call();
        text();
        showCallHistory();
        showTextHistory();
    }
}

public class Main {
    public static void main(String[] args) {
        RobinPhone myPhone = new RobinPhone();
        myPhone.usePhone();
    }
}