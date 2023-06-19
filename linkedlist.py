class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None

    # Insert a node at the beginning of the linked list
    def insertAtBeginning(self, data):
        newNode = Node(data)
        newNode.next = self.head
        self.head = newNode

    # Insert a node at the end of the linked list
    def insertAtEnd(self, data):
        newNode = Node(data)
        if self.head is None:
            self.head = newNode
            return
        lastNode = self.head
        while lastNode.next:
            lastNode = lastNode.next
        lastNode.next = newNode

    # Insert a node in ascending order
    def insertInAscendingOrder(self, data):
        newNode = Node(data)
        if self.head is None:
            self.head = newNode
            return
        elif self.head.data > data:
            newNode.next = self.head
            self.head = newNode
            return
        tempNode = self.head
        while tempNode.next and tempNode.next.data < data:
            tempNode = tempNode.next
        newNode.next = tempNode.next
        tempNode.next = newNode

    # Delete the first node of the linked list
    def deleteFirstNode(self):
        if self.head is None:
            return
        tempNode = self.head
        self.head = tempNode.next
        tempNode = None

    # Delete a node before a specific position
    def deleteBeforePosition(self, position):
        if self.head is None or position == 0:
            return
        tempNode = self.head
        if position == 1:
            self.head = tempNode.next
            tempNode = None
            return
        for i in range(position - 2):
            if tempNode is None:
                return
            tempNode = tempNode.next
        if tempNode is None or tempNode.next is None:
            return
        nodeToDelete = tempNode.next
        tempNode.next = nodeToDelete.next
        nodeToDelete = None

    # Delete a node after a specific position
    def deleteAfterPosition(self, position):
        if self.head is None:
            return
        tempNode = self.head
        if position == 0:
            self.head = tempNode.next
            tempNode = None
            return
        for i in range(position - 1):
            if tempNode is None:
                return
            tempNode = tempNode.next
        if tempNode is None or tempNode.next is None:
            return
        nodeToDelete = tempNode.next
        tempNode.next = nodeToDelete.next
        nodeToDelete = None

    # Print the linked list
    def printLinkedList(self):
        currentNode = self.head
        while currentNode:
            print(currentNode.data, end=" ")
            currentNode = currentNode.next

# Create a linked list object
linkedlist = LinkedList()

# Insert nodes at the beginning
linkedlist.insertAtBeginning(3)
linkedlist.insertAtBeginning(2)
linkedlist.insertAtBeginning(1)


# Insert nodes at the end
linkedlist.insertAtEnd(4)
linkedlist.insertAtEnd(5)

# Insert node in ascending order
linkedlist.insertInAscendingOrder(2.5)
linkedlist.insertInAscendingOrder(1.5)

# Print the linked list
linkedlist.printLinkedList() 

#linkedlist.deleteFirstNode()
#linkedlist.printLinkedList()

#linkedlist.deleteAfterPosition(2)
#linkedlist.deleteBeforePosition(5)
#linkedlist.printLinkedList() 