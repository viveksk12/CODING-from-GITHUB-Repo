package Coding;

public class TestSession {
    public void display() {
        System.out.println("This is a public class with public method");
    }

    public static void main(String[] args) {
        TestSession obj = new TestSession();
        obj.display();
    }
}