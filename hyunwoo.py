print('Hello this is the file for github practice')

def hello():
    print('Hello world! Nice to meet you everyone')
    
def list_split(array,n):
    # parameter 'n' -> step size to split the array
    
    lst = [array[i:i+n] for i in range(0,len(array),n)]
    
    return lst

lst = [n for n in range(28)]

print(list_split(lst,3))

