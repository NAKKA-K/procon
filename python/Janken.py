lines = input()
s = set()

for i in range(int(lines)):
    s.add(input())

if len(s) == 3 or len(s) == 1:
    print("draw")
else:
    s = list(s)
    if (s[0] == "rock" and s[1] == "scissors") or (s[0] == "scissors" and s[1] == "paper") or (s[0] == "paper" and s[1] == "rock"):
        print(s[0])
    else:
        print(s[1])