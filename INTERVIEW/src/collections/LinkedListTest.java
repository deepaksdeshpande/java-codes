package collections;

public class LinkedListTest<X extends Object> {
    
    private X x;
    
    public LinkedListTest(X x) {
        this.x = x;
    }
    
    private double getDouble() {
        return ((Integer) x).doubleValue();
    }
    
    public static void main(String args[]) {
        LinkedListTest<Integer> a = new LinkedListTest<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }
}