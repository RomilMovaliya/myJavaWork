// Name = Movaliya Romil Rajeshbhai 
// Enrollment no. 202103103510247
// Roll no. 25
// Practical no. 5 -- linkedlist


class linkedlist{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
        public void addFirst(String data) {
            Node newNode=new Node(data);

            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void addLast(String data) {
            Node newNode=new Node(data);

            if(head==null){
                head=newNode;
                return;
            }
            Node currNode=head;

            while (currNode.next!=null) {
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }

        public void printlist() {
            Node currNode=head;
            if(head==null){
                System.out.println("list is empty");
            }

            while (currNode !=null) {
                System.out.print(currNode.data+" -> ");
                currNode=currNode.next;
            }
            System.out.print("Null");

            }

        public void removeFirst(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            head=head.next;
        }
        
        public Node removeBefore(Node head, int value) {
            if (head == null || head.next == null) {
                return null;
            }
            if (head.next.data == value) {
                return head;
            }
            Node curr = head.next;
            Node prev = head;
            while (curr.next != null && curr.next.data != value) {
                prev = curr;
                curr = curr.next;
            }
            if (curr.next == null) {
                return null;
            }
            prev.next = curr.next;
            return head;
        }
    

    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.addFirst("romil");
        list.addLast("movaliya");
        list.printlist();

    }
}
