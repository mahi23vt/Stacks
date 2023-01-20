public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Mahesh","Kumar",1));
        stack.push(new Employee("Maharshi","Murlidhar",2));
        stack.push(new Employee("Manoj","Kumar",3));
        stack.push(new Employee("Meera","Kumari",4));
        stack.push(new Employee("Mandvi","Kumari",5));
        stack.push(new Employee("Sneha","Shalini",6));

//        stack.printStack();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println("Printing Stack");
        stack.printStack();

    }
}