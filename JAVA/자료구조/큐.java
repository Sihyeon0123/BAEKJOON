package 자료구조;

public class 큐 {
    public static void main(String[] args){
        Queue<Integer> queue = new Queue<Integer>(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }

    public static class Queue<T>{
        T items[];
        int front;
        int rear;
        int size;

        public Queue(int size){
            items = (T[]) new Object[size];
            front = 0;
            rear = 0;
            this.size = size;
        }

        public boolean isEmpty(){
            return front == rear;
        }

        public boolean isFull(){
            return front == size;
        }

        public void enqueue(T item){
            if(!isFull()) {
                items[front++] = item;
                show();
            } else {
                System.out.println("queue is full");
            }
        }

        public T dequeue(){
            if(!isEmpty()) {
                T temp = items[rear];
                items[rear++] = null;
                show();
                return temp;
            } else {
                System.out.println("queue is empty");
                return null;
            }
        }

        public void show(){
            System.out.print("[");
            for(int i = 0; i < size; i++){
                System.out.print(items[i] + " ");
            }
            System.out.println("]");
        }
    }
}
