import time
from random import random
from random import randint
#from future import print_function

def burbuja( data):
    n = len(data)
    for iteracion in range( n ):
        for pivote in range( n - iteracion - 1):
            if data[pivote] > data[pivote +1]:
                tmp = data[pivote]
                data[pivote]=data[pivote+1]
                data[pivote+1]=tmp
    print(data)

ini = time.time()
print(time.time())


original = []

for _ in range (100000):
    original.append(randint(1,100000))

burbuja(original)

print(time.time())
fin = time.time()
final= (fin - ini)
print("milisegundos")
print (final)
