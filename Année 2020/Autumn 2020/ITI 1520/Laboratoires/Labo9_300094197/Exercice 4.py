###Comments
###Student name : Decaho Gbegbe
###Student number : 300094197

def bubbleSort(alist):
    ''' (list)-> None
    Trie une liste 
    '''
    exchanges = True
    NPas = 0
    while exchanges: #effectuer la boucle tant que exchanges est vrai
       exchanges = False
       for i in range(len(alist)-1):
           NPas += 1
           if alist[i]>alist[i+1]: #vérifie si le suivant est plus petit que le précédant
               exchanges = True
               alist[i], alist[i+1] = alist[i+1], alist[i] #interchanger si oui
    print("Nombre de pas", NPas)          

alist = [54,26,93,17,77,31,44,55,20]
bubbleSort(alist)
print(alist)
