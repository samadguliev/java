class CircularListElement {
    int data;
    CircularListElement next;
    CircularListElement prev;
}

class CircularList {
    private CircularListElement head;
    private CircularListElement tail;
    
    int length = 0;    

    
    void addFront(int data) {
        CircularListElement a = new CircularListElement();
        a.data = data;
        
        if(head == null) {
            head = a;
            tail = a;
            length++;
        }
        else {
            a.next = head;
            head.prev = a;
            a.prev = tail;
            head = a;
            length++;
        }
    }
    
    void addBack(int data) {
        CircularListElement a = new CircularListElement();
        a.data = data;
        
        if(tail  == null) {
            head = a;
            tail = a;
            length++;
        }
        else {
            tail.next = a;
            a.next = head;
            a.prev = tail;
            tail = a;
            length++;
        }
    }
    
    void printList() {
        CircularListElement t = head;
        while(t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
    
    CircularListElement find(int value){
    CircularListElement pv = head;//установка на начало списка
        while(pv!=null){
            if(pv.data == value) break;//если нашли элемент, то выйти из списка
            pv=pv.next;//переход к следующему элементу списка
        }
        return pv;
    }
    
    void search() {
        CircularListElement t = head;
        CircularListElement first = head;
        CircularListElement last = head;
        boolean isTrue = false;
        for(int i = 0; i < length; i++) {
            CircularListElement q = t.next;
            for(int j = i+1; j < length; j++) {  
                if (t.data == q.data) {
                    first = t;
                    last = q;
                    isTrue = true;       
                    break;
                }
                q = q.next;
            }
            t = t.next;
        }
        
        
        if (isTrue) {
            t = head;
            
            //System.out.println(tail.data);
            for(int i = 1; i < length; i++) {
               //if (t != first.next) continue;
               int temp = t.data;
               t.data = t.next.data;
               t.next.data = temp;
              
               
               t = t.next; 
            }
            
            
//            CircularListElement begin = first.next;
//            while(begin != last) {
//                int temp = begin.data;
//                begin.data = begin.next.data;
//                begin.next.data = temp;
//                begin = begin.next;
//            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CircularList L = new CircularList();
        
        L.addBack(10);
        L.addFront(5);
        L.addFront(4);
        L.addFront(3);
        L.addFront(2);
        L.addFront(4);
        L.addFront(1);
        L.printList();
        L.search();
        
        //System.out.println(L.find(4).data);
    }
}
