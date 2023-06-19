// Name = Movaliya Romil Rajeshbhai 
// Enrollment no. 202103103510247
// Roll no. 25
// Practical no. 5 -- linkedlist


class LL{
    public static class SinglyLinkedList {
        private Node head;
    
        private class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        public void insertAtFront(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    
        public void insertInAscendingOrder(int data) {
            Node newNode = new Node(data);
            if (head == null || head.data >= data) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    
        public void deleteFirst() {
            if (head == null) {
                return;
            }
            head = head.next;
        }
    
        public void deleteBefore(int pos) {
            if (head == null || head.next == null || pos <= 2) {
                deleteFirst();
                return;
            }
            Node current = head;
            int count = 1;
            while (current.next.next != null && count < pos - 1) {
                current = current.next;
                count++;
            }
            current.next = current.next.next;
        }
    
        public void deleteAfter(int pos) {
            if (head == null || head.next == null) {
                return;
            }
            Node current = head;
            int count = 1;
            while (current.next != null && count < pos) {
                current = current.next;
                count++;
            }
            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    
        public void display() {
            if (head == null) {
                System.out.println("The list is empty.");
                return;
            }
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    } 
                public static void main(String[] args) {
                    SinglyLinkedList list = new SinglyLinkedList();
            
                    // Inserting nodes at the front of the linked list
                    list.insertAtFront(5);
                    list.insertAtFront(10);
                    list.insertAtFront(15);
            
                    // Inserting nodes at the end of the linked list
                    list.insertAtEnd(20);
                    list.insertAtEnd(25);
                    list.insertAtEnd(30);
            
                    // Inserting nodes in ascending order
                    list.insertInAscendingOrder(18);
                    list.insertInAscendingOrder(8);
                    list.insertInAscendingOrder(28);
            
                    // Deleting the first node of the linked list
                    list.deleteFirst();
            
                    // Deleting the node before the specified position
                    list.deleteBefore(4);
            
                    // Deleting the node after the specified position
                    list.deleteAfter(3);
            
                    // Displaying the linked list
                    list.display();
                }
            }
            
    
