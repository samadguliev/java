class QueueElement {
    double data;
    QueueElement next;
    
    QueueElement(double value) {
        data = value;
    }
}

class Queue{
    private QueueElement head = null;
    private QueueElement tail = null;
    
    void add(double value) {
        QueueElement i = new QueueElement(value);
        
        if (head == null) {
            head = i;
            tail = i;
        }
        else {
            i.next = null;
            tail.next = i;
            tail = i;
        }
    }
    
    void del() {
        head = head.next;
    }
    
    void printQueue() {
        QueueElement i = head;
        while(i != null) {
            System.out.print(i.data + " ");
            i = i.next;
        }
        System.out.println();
    }
    
    void search(double data) {
        if (head.data == data) {
            System.out.println("В очереди содержится искомый элемент");
        }
        else {
            QueueElement i = head.next;
            while (true) {
                if (i.data == data) {
                    System.out.println("В очереди содержится искомый элемент");
                    break;
                }
                else if(i.next == null) {
                    System.out.println("В очереди нет искомого элемента");
                    break;
                }
                i = i.next;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Queue Q = new Queue();
        
        Q.add(1.0);
        Q.add(1.0);
        Q.add(2.0);
        Q.add(3.0);
        Q.add(4.0);
        Q.add(5.0);
        
        Q.printQueue();
        
        Q.del();
        
        Q.printQueue();
        
        Q.search(3.0);
        Q.search(3.5);
    }
}
