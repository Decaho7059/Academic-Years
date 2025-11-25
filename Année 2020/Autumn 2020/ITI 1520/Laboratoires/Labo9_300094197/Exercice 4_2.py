###Comments
###Student name : Decaho Gbegbe
###Student number : 300094197

def insert(L, b):
  """ (list, int) -> None
  Precondition: L[0:b] est deja trie
  Insert L[b] dans la correcte position en L[0:b + 1].

  """
  pas = 0
  i = b
  while i != 0 and L[i - 1] >= L[b]:
     i = i - 1
     pas += 1
  value = L[b] #attribuer a value la valeur de b
  del L[b] #supprimer b de la liste
  L.insert(i, value) #inserer la nouvelle valeur dan la liste
  return pas

def tri_par_insertion(L):
  """ (list) -> None
  Tri la liste L en ordre ascendante
  """
  i = 0
  NPas = 0
  while i != len(L):
    NPas += 1
    autresPas = insert(L, i)
    NPas = NPas + autresPas #incrémenter les pas
    i = i + 1
  print("Nombre de pas", NPas)  
