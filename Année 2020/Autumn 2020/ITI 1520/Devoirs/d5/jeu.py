#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def verifierLigne(grille, row, num):
    '''
        (list, int, int) -> Bool
        Vérifier si la case à ajouter n'existe pas sur la ligne.
        Preconditions: grille est une reference a une matrice 9x9 qui contient déja des nombres de 1 à 9
    '''
    for i in range(len(grille[0])):
        if grille[row][i]==num:
            return False
    return True

def verifierCol(grille, col, num):
    '''
            (list, int, int) -> Bool
            Vérifier si la case à ajouter n'existe pas sur la colonne.
            Preconditions: grille est une reference a une matrice 9x9 qui contient déja des nombres de 1 à 9
    '''
    for i in range(len(grille)):
        if grille[i][col]==num:
            return False
    return True

def verifierSousGrille(grille, row, col, num):
    '''
            (list, int, int, int) -> Bool
            Vérifier si la case à ajouter n'existe pas sur la sous-grille.
            Preconditions: grille est une reference a une matrice 9x9 qui contient déja des nombres de 1 à 9
    '''

    
    lignes = []
    colonnes = []
    grille1 = [[0,1,2],[3,4,5],[6,7,8]]  # longueur pédéfinie des sous matrices
    j = 0
    #i = 0
    while j < len(grille1):
        if col in grille1[j]: #verifie si col existe dans grille
            colonnes = grille1[j] #attribu la val de col a colonnes
        if row in grille1[j]: #verifie row
            lignes = grille1[j]
        j +=1
    l = lignes[0] #donne a l l'indice 0 à chaque  sous lignes 3x3
    while l <= lignes[2]:
        k = colonnes[0] #donne a col l'indice 0 de chaque sous colonnes
        while k <= colonnes[2]:
            if num == grille[l][k]: #vérifie si 0 existe a l'endroit
                return False
            k+=1
        l+=1
    return True
    
def verifierGagner(grille):
    '''(list) ->  bool
    * Preconditions: grille est une reference a une matrice 9x9 qui contient de nombres de 1 à 9
    * Verifie si la grille est completement remplie.
    '''
    cpt = True
    for i in grille: #parcours les lignes
        for j in i: #parcour les lignes
            if j == 0:  #vérifie si un elements est 0
                cpt = False
    return cpt


    
def verifierValide(grille, row, col, num):
   ''' (list, int, int, int) ->  bool
   * verifie si le nombre proposé est bon sur la ligne et colonne et la sous-grille donné en parametre.
   * Preconditions: grille est une reference a une matrice 9 x 9 qui contient des chiffres entre 1 et 9
   '''
   
   if (verifierLigne(grille, row, num) and verifierCol(grille, col, num) and verifierSousGrille(grille, row, col, num))== True: #condition de validité
       return True
   else:
       return False
