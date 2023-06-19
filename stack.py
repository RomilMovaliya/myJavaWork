#name : Movaliya Romil Rajeshbhai
#enrollment no. 202103103510247
#class : cse-c1(division -A)
#program : 3 

def createStack():
    stack=[]
    return stack
def push(stack,item):
    stack.append(item)
    print(item)
def pop(stack):
    if(len(stack)==0):
        print("stack is empty")
    
    return stack.pop()
def peek():
    if(len(stack)==0):
        print("stack is empty")
    
    return (len(stack))

stack =createStack()
push(stack,str(10))
push(stack,str(20))
push(stack,str(30))
print(peek())   