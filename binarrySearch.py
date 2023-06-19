#name : Movaliya Romil Rajeshbhai
#enrollment no. 202103103510247
#class : cse-c1(division -A)
#program : 8

def binary_search(arr, n, key):
    s = 0
    e = n - 1  # decrease the end index by 1
    while s <= e:
        mid = (s + e) // 2
        if arr[mid] == key:
            return mid
        elif arr[mid] > key:
            e = mid - 1
        else:
            s = mid + 1
    return -1

arr = [7, 8, 3, 1, 20]
n = len(arr)
key = int(input("Enter the number which you want to find index: "))
print(binary_search(arr, n, key))
