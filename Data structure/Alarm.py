class Alarm:

    def __init__(self):
        self.time = time
        self.state = True

    def setAlarm(self, time):
        self.state = True
        self.time = time

    def getAlarm(self):
        return self.time

    def onOff(self):
        if self.state:
            self.state = False
        else:
            self.state = True

    def __str__(self, time, state):
        if not self.state:
            return "Alarm Not Set"
        return "Alarm Set At: " + str(self.time)

class Clock:

    def __init__(self, hour, mint, sec):
        self.hour = 0
        self.mint = 0
        self.sec = 0

    def setSec(self, sec):
        if 0 <= sec <= 59:
            self.sec = sec

    def setMint(self, mint):
        if 0 <= mint <= 59:
            self.mint = mint

    def setHour(self, hour):
        if 0 <= hour <= 23:
            self.hour = hour

    def getSec(self):
        return self.sec

    def getMint(self):
        return self.mint

    def getHour(self):
        return self.hour

    def increment(self):
        print("Incremented by one")

        
        if self.sec == 60:
            self.sec = 0
            self.mint += 1
        if self.mint == 60:
            self.mint = 0
            self.hour += 1
        if self.hour == 24:
            self.hour = 0

        def __str__(self):
            return "Time : " + str(self.hour) + ":" + str(self.mint) + ":" + str(self.sec)
