package Coding;

class TestSessionWithoutPublic {
    void display() {
          System.out.println("This is a class without public modifier and a default access method");
    }

    public static void main(String[] args) {
        TestSessionWithoutPublic obj = new TestSessionWithoutPublic();
        obj.display();
    }
}
