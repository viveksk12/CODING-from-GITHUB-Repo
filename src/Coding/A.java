package Coding;

class A {
	public static void main(String[] args) {
        A objA = new A();
        objA.displayA();

        B1 objB = new B1();
        objB.displayB1();
    }
    public void displayA() {
        System.out.println("This is class A");
    }
}

class B1 {
    public  void displayB1() {
        System.out.println("This is class B");
    }

    
}