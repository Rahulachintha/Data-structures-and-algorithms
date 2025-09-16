class FIFOQueue {
    Deque<Integer> deque = new LinkedList<>();
    public void enqueue(int x) { deque.addLast(x); }
    public int dequeue() { return deque.removeFirst(); }
}