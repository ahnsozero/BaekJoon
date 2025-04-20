num = int(input()) # 사용자한테 정수 n입력받기
i = 2 # 소인수는 1보다 큰 자연수
while num > 1:
    if num % i == 0: # i로 나눠질 경우
        num = num // i
        print(i)
    else: # i로 나눌 수 없는 경우
        i += 1
    