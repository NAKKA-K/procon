word1 = input()
word2 = input()

if word1[-1] == word2[0] and word2[-1] != 'n':
    print("OK", end='\n')
else:
    print("NG", end='\n')
