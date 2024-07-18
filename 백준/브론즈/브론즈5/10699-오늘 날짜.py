from datetime import datetime, timedelta

# 채점 서버에서 제공한 시간 정보
base_time = datetime(2018, 3, 21, 14, 7, 38)

# 현재 시스템 시간을 얻음
system_time = datetime.now()

# KST로 변환 (UTC +09:00)
kst_time = system_time + timedelta(hours=9)
kst_time = kst_time.strftime("%Y-%m-%d")
print(kst_time)
