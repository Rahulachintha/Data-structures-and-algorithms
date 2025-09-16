import java.util.Deque;
import java.util.LinkedList;
class LIFOQueue {
    Deque<Integer> deque = new LinkedList<>();
    public void push(int x) { deque.addLast(x); }
    public int pop() { return deque.removeLast(); }
}