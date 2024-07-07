package 자료구조;

public class 연결리스트 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        list.remove(2);
        list.remove(4);
        list.print();
        list.remove(4);
    }

    public static class LinkedList<T>{
        private Node<T> head;

        public LinkedList(){
            head = null;
        }

        public void add(T data){
            Node<T> newNode = new Node<>(data);

            if(head == null){
                head = newNode;
            } else {
                Node<T> temp = head;

                while(temp.getNext() != null){
                    temp = temp.getNext();
                }

                temp.setNext(newNode);
            }
        }

        public void remove(T data){
            Node<T> temp = head;
            Node<T> prev = null;

            if(!contains(data)){
                System.out.println(data + " is not found");
                return;
            }

            while(temp != null){
                if(temp.getData().equals(data)){
                    prev.setNext(prev.getNext().getNext());
                    break;
                }
                prev = temp;
                temp = temp.getNext();
            }
        }

        public boolean contains(T data){
            Node<T> temp = head;
            while(temp != null){
                if(temp.getData().equals(data)){
                    return true;
                }
                temp = temp.getNext();
            }
            return false;
        }

        public void print(){
            Node<T> temp = head;

            if (temp == null){
                System.out.println("List is empty");
            }

            while(temp != null){
                System.out.print(temp.getData());
                temp = temp.getNext();

                if(temp != null){
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
