from functools import cmp_to_key

def addString(x,y):
    x = str(x)
    y = str(y)
    a = x + y
    b = y + x
    if (a > b):
        return -1
    elif (a < b):
        return 1
    else:
        return 0


def solution(numbers):

# 주어진 정수 중 첫 자리가 가장 큰 수 추출 반복
    # numbers 각 자리의 첫 자리 자르기 
    # python max(numbers 첫 자리)
    # 첫 자리가 같을 경우 
    result = sorted(numbers, key=cmp_to_key(addString))    
    result2 = [str(n) for n in result]
    answer = "".join(result2).lstrip('0')
    return answer if answer else '0'

        
