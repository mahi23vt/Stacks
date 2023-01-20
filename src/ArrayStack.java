import java.util.EmptyStackException;

import static com.sun.tools.javac.jvm.ByteCodes.pop;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        // check if the array is full, before entering any further data
        if (top == stack.length) {
            // The array is already full, and we need to increase the size of the array
            Employee[] newEmployee = new Employee[2 * stack.length];// increased the size of the array by twice its size
            // Need to copy all the items from the stack to the new array
            System.arraycopy(stack, 0, newEmployee, 0, stack.length);
            // Now stack will be equal to the resized array
            stack = newEmployee;
        }
        stack[top++] = employee;
    }

    public Employee pop()
    {
        // Check if the array is already empty
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top]=null;
        return employee;
    }
    public Employee peek()
    {
        // check if the array is empty
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public void printStack()
    {
        for(int i = top-1;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }
    public boolean isEmpty()
    {
        return top==0;
    }
}
