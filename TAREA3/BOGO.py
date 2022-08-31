import time
import random
def bogo( data ):
    ordenado = False
    #print(data)
    while not ordenado:
        random.shuffle(data)
        for pivote in range( len(data)-1):
            if data[pivote] <=data[pivote+1]:
                ordenado = True
            else:
                ordenado = False
                break
    print("Final",data)

#def lista(min,max,long):
#    return [random.randint(min,max) for _ in range(long)]

print(time.time())
ini = time.time()
original = [3,1,4,6,5,2,10,7,15,24,11,12]

#
bogo(original)
fin = time.time()
tiempofin = fin - ini
print(tiempofin)
