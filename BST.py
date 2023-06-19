 # Name = Movaliya Romil Rajeshbhai 
 # Enrollment no. 202103103510247
 # Roll no. 25
 # Practical no. 6 -- Binary Search Tree
 # Time complexity for insertion --> o(Hight)
 # Time complexity for search    --> o(Hight)
 # Time complexity for deletion  --> o(Hight) || Adobe interview asked...


class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

class BST:
    def __init__(self):
        self.root = None

    def insert(self, val):
        if not self.root:
            self.root = Node(val)
            return
        curr = self.root
        while True:
            if val < curr.val:
                if not curr.left:
                    curr.left = Node(val)
                    break
                else:
                    curr = curr.left
            else:
                if not curr.right:
                    curr.right = Node(val)
                    break
                else:
                    curr = curr.right

    def search(self, val):
        curr = self.root
        while curr:
            if curr.val == val:
                return True
            elif curr.val < val:
                curr = curr.right
            else:
                curr = curr.left
        return False

    def delete(self, val):
        if not self.root:
            return
        parent = None
        curr = self.root
        while curr:
            if curr.val == val:
                if not curr.left and not curr.right:
                    if parent:
                        if parent.left == curr:
                            parent.left = None
                        else:
                            parent.right = None
                    else:
                        self.root = None
                elif not curr.left:
                    if parent:
                        if parent.left == curr:
                            parent.left = curr.right
                        else:
                            parent.right = curr.right
                    else:
                        self.root = curr.right
                elif not curr.right:
                    if parent:
                        if parent.left == curr:
                            parent.left = curr.left
                        else:
                            parent.right = curr.left
                    else:
                        self.root = curr.left
                else:
                    successor = curr.right
                    while successor.left:
                        successor = successor.left
                    curr.val = successor.val
                    self.delete(successor.val)
                return
            elif curr.val < val:
                parent = curr
                curr = curr.right
            else:
                parent = curr
                curr = curr.left
                
bst = BST()

# Insert some values
bst.insert(5)
bst.insert(3)
bst.insert(7)
bst.insert(2)
bst.insert(4)
bst.insert(6)
bst.insert(8)

# Search for a value
print(bst.search(4)) # True

# Delete a value
bst.delete(4)
print(bst.search(4)) # False

