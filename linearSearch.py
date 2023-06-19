#name : Movaliya Romil Rajeshbhai
#enrollment no. 202103103510247
#class : cse-c1(division -A)
#program : 8


def linear_search(arr, key):
    for i in range(len(arr)):
        if arr[i] == key:
            return i
    return -1

arr = [7, 8, 3, 1, 2]
key = int(input("Enter the number which you want to find index: "))
index = linear_search(arr, key)
print(index)
