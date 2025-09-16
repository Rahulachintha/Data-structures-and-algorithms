import java.util.Stack;
class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void enqueue(int x) {
        while (!s1.isEmpty()) s2.push(s1.pop());
        s1.push(x);
        while (!s2.isEmpty()) s1.push(s2.pop());
    }
    public int dequeue() { return s1.pop(); }
}
