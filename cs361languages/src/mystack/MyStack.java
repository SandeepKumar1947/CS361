package mystack;

/**
 * @author Sandeep Kumar
 */

// Stack using generics

public class MyStack<T> {

    private class MyNode<T1> {
        T1 val;
        MyNode<T1> next;

        MyNode(T1 v, MyNode<T1> n) {
            val = v;
            next = n;
        }
    }

    private MyNode<T> theStack = null;

    /**
     * Constructor
     */
    public MyStack() {
    }

    public T pop() {
        if (theStack == null) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = theStack.val;
        theStack = theStack.next;
        return value;
    }

    public void push(T v) {
        theStack = new MyNode<>(v, theStack);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create a stack of Integer
        MyStack<Integer> intStack = new MyStack<>();
        
        // Push 1 and 2
        intStack.push(1);
        intStack.push(2);
        
        // Pop
        System.out.println("Popped: " + intStack.pop());
        
        // Push 5
        intStack.push(5);
        
        // Create a stack of Person
        MyStack<Person> personStack = new MyStack<>();
        
        // Push a person p1 with your name
        Person p1 = new Person("Sandeep Kumar");
        personStack.push(p1);
        
        // Push a person p2 with my name
        Person p2 = new Person("ABC XYZ");
        personStack.push(p2);
        
        // Demonstrate the personStack
        System.out.println("Popped from personStack: " + personStack.pop().getName());
        System.out.println("Popped from personStack: " + personStack.pop().getName());
    }
    
    private static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}