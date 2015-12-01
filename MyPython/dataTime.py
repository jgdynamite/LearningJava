from datetime import datetime

now = datetime.now()
current_year = now.year
current_month = now.month
current_day = now.day
current_hour = now.hour
current_minute = now.minute
current_second = now.second

print now
print current_year
print current_month
print current_day

print current_hour
print current_minute
print current_second

print '%s:%s:%s' % (now.hour,  now.minute, now.second)
print '%s/%s/%s' % (now.month, now.day, now.year)

print '%s/%s/%s' " " '%s:%s:%s' % (now.month, now.day, now.year, now.hour, now.minute, now.second)

val = "Joseph"
print val[1:4]

time = datetime.now()
day = time.day
print day

ash = "Joseph Glover".lower()
print ash