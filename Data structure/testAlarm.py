from Alarm import *

def main():
    print('Enter the time: ')
    hour = input('Enter hour: ')
    minute = input('Enter minute: ')
    second = input('Enter second: ')

    clock = Clock(hour, minute, second)
    print(clock(hour, minute, second))

    #clock.increment()
    #print(clock)
    #alarm = Alarm()
    #print(alarm)
    #alarm.setAlarm(clock)
    #print(alarm)
main()
