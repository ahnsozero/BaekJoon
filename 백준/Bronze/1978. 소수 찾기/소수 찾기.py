n = int(input()) # n개의 숫자 입력받기
data = list(map(int, input().split())) # 공백으로 나뉜 숫자들 입력받아 정수 리스트로 변환
count = 0 # 소수갯수 초기화

for x in data:
    if x < 2:
        continue  # 0, 1은 소수가 아님
    for i in range(2, x):
        if x % i == 0:
            break  # 나누어떨어지는 수가 있으면 소수가 아님
    else: # for문이랑 짝을 이룸
        count += 1  # for문이 break 없이 끝났으면 소수임

print(count)

