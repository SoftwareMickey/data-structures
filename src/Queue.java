/*
    How to implement stack and queues using Arrays

    GROUP MEMBERS

    COM/B/01-00117/2022
    COM/B/01-00084/2022
    COM/B/01-00142/2022
    COM/B/01-00125/2022
 */

public class Queue<T>
{
    private Node<T> frontNode;
    private Node<T> rearNodeNode;

    private int length;

    private static class Node<T>
    {
        private final T data;
        private Node<T> next;
        public Node(T data)
        {
            super();
            this.data = data;
            this.next = null;
        }
    }
    public void enQueue(T data)
    {
        if(frontNode == null)
        {
            rearNodeNode = new Node<T>(data);
            frontNode = rearNodeNode;
        }
        else
        {
            rearNodeNode.next = new Node<T>(data);
            rearNodeNode = rearNodeNode.next;
        }
        length++;
    }
    public T deQueue()
    {
        if(frontNode != null)
        {
            T result = frontNode.data;
            frontNode = frontNode.next;
            length--;
            return result;
        }
        return null;
    }
    public int size()
    {
        return length;
    }
    public void displayQueue()
    {
        Node<T> currentNode = frontNode;
        while (currentNode != null)
        {
            System.out.print(currentNode.data+"  ");
            currentNode = currentNode.next;
        }
    }
    public static void main(String[]args)
    {
        Queue<Integer> queue = new Queue<>();

        queue.enQueue(528);
        queue.enQueue(426);
        queue.enQueue(401);

        queue.displayQueue() ;

        System.out.println("Size of the Queue::" + queue.size());
        System.out.println("Item dequeued ::" + queue.deQueue());
    }
}
