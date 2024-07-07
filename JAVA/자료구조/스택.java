package 자료구조;

public class 스택 {

    public static void main(String[] args){
        Stack<Stack> stack = new Stack<Stack>(5);
        Stack<Integer> intStack = new Stack<Integer>(3);
        Stack<String> strStack = new Stack<String>(3);

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        strStack.push("hello");
        strStack.push("world");
        strStack.push("!!");

        stack.push(intStack);
        stack.push(strStack);

        strStack.pop();
        strStack.pop();
        strStack.pop();
        Stack<String> temp = stack.pop();
        temp.show();
    }

    public static class Stack<T>{
        private T[] items;
        int top; // 현재 인덱스 위치
        int size;

        @SuppressWarnings("unchecked")
        public Stack(int size){
            items = (T[]) new Object[size];
            top = -1;
            this.size = size;
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public boolean isFull(){
            return top >= size - 1;
        }

        public void push(T item){
            if(!isFull()) {
                top++;
                items[top] = item;
                show();
            } else {
                System.out.println("stack is full");
            }
        }

        public T pop(){
            if(!isEmpty()){
                T temp = items[top];
                items[top--] = null;
                show();
                return temp;
            } else {
                System.out.println("stack is empty");
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
