// This code demonstrates unsynchronized printing of text.
public class UnsynchronizedExample {

    public static void main(String[] args) {
        new PrintStringsThread("Hello ", "there.");
        new PrintStringsThread("My name is ", "Mehmet");
        new PrintStringsThread("How are ", "You");
    }
}
