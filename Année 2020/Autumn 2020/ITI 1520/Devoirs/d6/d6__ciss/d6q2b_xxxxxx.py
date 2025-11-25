def prodListePos_rec(iterable, length):
    if length == 1:
        return iterable[length - 1]
    else:
        if iterable[length - 1] > 0:
            return iterable[length - 1] * prodListePos_rec(iterable, length - 1)
        else:
            return prodListePos_rec(iterable, length - 1)


l = [1, -2, 5, 0, 6, -5]
n = len(l)
print(prodListePos_rec(l, n))



