import datetime

y1,m1,d1 = map(int,input().split())
y2,m2,d2 = map(int,input().split())

d_day = int(str(datetime.date(y2,m2,d2)-datetime.date(y1,m1,d1)).split()[0])

if d_day >= 365243:
    print("gg")
else:
    print(f"D-{d_day}")