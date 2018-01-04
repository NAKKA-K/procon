num = int(input())
names = input().split(" ")

dic = dict()
#for i in range(num):
#    dic.update({names[i]:0})

book_num = int(input())

for i in range(book_num):
    info = input().split(" ")
    if info[0] in dic.keys():
        dic[info[0]] += int(info[1])
    else:
        dic.update({info[0]:int(info[1])})

for info in sorted(dic.items(), key=lambda x:x[1], reverse = True):
    print(info[0])
