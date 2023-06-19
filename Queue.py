# Name = Movaliya Romil Rajeshbhai 
 # Enrollment no. 202103103510247
 # Roll no. 25
 # Practical no. 4 -- simple Queue
 # Time complexity for insertion --> o(1)
 # Time complexity for search    --> o(1)
 # Time complexity for deletion  --> o(n)

class Queue:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return self.items == []

    def insert(self, item):
        self.items.append(item)

    def delete(self):
        if self.is_empty():
            return None
        else:
            return self.items.pop(0)

    def peek(self):
        if self.is_empty():
            return None
        else:
            return self.items[0]


q = Queue()

q.insert(1)
q.insert(2)
q.insert(3)

print(q.peek())  # output: 1

q.delete()

print(q.peek())  # output: 2
