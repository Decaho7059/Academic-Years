def palindrome(chaine):
    if len(chaine) < 2:
        return True
    if chaine[0] != chaine[-1]:
        return False
    return palindrome(chaine[1:-1])


print(palindrome("abcba"))
print(palindrome("anna"))
print(palindrome([]))
print(palindrome("abcdabcd"))
