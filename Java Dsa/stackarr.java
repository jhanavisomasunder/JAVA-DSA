public class stackarr {
    static class stack {
        int[] arr;
        int top;
        int size;

        stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }

        void push(int value) {
            if (top == size - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = value;
        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

        void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stack s = new stack(7); // ✅ Correct constructor call

        System.out.println("Stack is:");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        s.display();

        System.out.println("Peek: " + s.peek());
        System.out.println("Pop: " + s.pop());
        s.display();

        System.out.println("Pop: " + s.pop());
        System.out.println("Pop: " + s.pop());
        System.out.println("Pop: " + s.pop());
        System.out.println("Peek: " + s.peek());
    }
}
