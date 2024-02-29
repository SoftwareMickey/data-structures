/*
    How to implement stack, and all queues using arrays

    GROUP MEMBERS

    COM/B/01-00117/2022
    COM/B/01-00084/2022
    COM/B/01-00142/2022
    COM/B/01-00125/2022
 */
import java.util.Scanner;

public class StackArray {
    private static final int size = 10;
    private static final int[] stack = new int[size];
    private static int top = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // push
        System.out.println("Enter elements to push onto the stack  " );
        while (top < size - 1) {
            int number = scanner.nextInt();
            push(number);
        }
        //  This is a pop method that has been called to be executed inside the main function
        pop();
        //  This is a display method that has been called to be executed inside the main function
        display();
    }

    static void push(int x) {
        if (top >= size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            stack[top] = x;
            System.out.println("Element pushed into the stack is: " + x);
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack  Underflow");
        } else {
            System.out.println("Deleted Element is: " + stack[top]);
            top = top - 1;
        }
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is Underflow");
        } else {
            System.out.println("Elements displayed are:");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
