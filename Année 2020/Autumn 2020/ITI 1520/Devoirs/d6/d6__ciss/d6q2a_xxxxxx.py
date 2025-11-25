def recursiveTriangle(n):
    if n < 0:
        return
    else:
        recursiveTriangle(n - 1)
        print('* ' * n)


recursiveTriangle(5)
