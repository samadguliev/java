class ListElement {
    ListElement next;
    char data;
}

class List {
    private ListElement head;
    private ListElement tail;
    
    void addFront(char data) {
        ListElement a = new ListElement();
        a.data = data;
        
        if(head == null) {
            head = a;
            tail = a;
        }
        else {
            a.next = head;
            head = a;
        }
    }
    
    void addBack(char data) {
        ListElement a = new ListElement();
        a.data = data;
        
        if(tail  == null) {
            head = a;
            tail = a;
        }
        else {
            tail.next = a;
            tail = a;
        }
    }
    
    void printList() {
        ListElement t = head;
        while(t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
    
    boolean sort () {
        if(head == null) {
            return false;
        }
        ListElement t = head;
        boolean  isTrue = false;
        while(t != null) {
            isTrue = false;
            ListElement q = t;
            while(q.next != null) {
                if(t.data < q.next.data) {
                    isTrue = true;
                    q.next = q.next.next;
                }
                else {
                    isTrue = false;
                    break;
                }
            }
            if (!isTrue) break;
            t = t.next;
        }
        return isTrue;
    }
}

public class Main {
    public static void main(String[] args) {
        List L = new List();
        
        L.addBack('a');
        L.addBack('a');
        L.addBack('a');
        L.addBack('a');
        L.addFront('b');
        L.addFront('b');
        L.addFront('c');
        L.addFront('b');
        L.addFront('d');
        L.addFront('d');
        

        L.printList();
        System.out.println();
        System.out.println("Элементы расположены по алфавиту: " + L.sort());
        
    }
}
