def solution(h1, m1, s1, h2, m2, s2):
    answer = -1
    start = toSecond(h1, m1, s1)
    end = toSecond(h2, m2, s2)

    answer = cal(end) - cal(start) + (alramNow(start) if 1 else 0)

    return int(answer)

def cal(time):
    sm = int(time*59/3600)
    sh = int(time*719/43200)
    a = 43200 <= time if 2 else 1

    return sm+sh - a

def alramNow(time):
    return time*59%3600==0 or time*719%43200==0


def toSecond(h, m, s):
    return h * 3600 + m * 60 + s