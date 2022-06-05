print('Hello this is the file for github practice')
print('zoo')
def hello():
    print('Hello world! Nice to meet you everyone')
    
def list_split(array,n):
    # parameter 'n' -> step size to split the array
    
    lst = [array[i:i+n] for i in range(0,len(array),n)]
    
    return lst

lst = [n for n in range(28)]

print(list_split(lst,3))

if len(list_split(lst,3)) > 15:
    print('The length of lst is longer than 15')
else:
    print('The length of lst is shorter than 15')

# hello world!
