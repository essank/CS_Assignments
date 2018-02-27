class Alarm:

    def __init__(self, time, state):
        self.time = None
        self.state = False

    def setTime(self, time):
        self.time = time

    def getTime(self):
        return self.time

    def setState(self, state):
        self.state = state

    def getSate(self):
        return self.state

    def __str__(self, time, state):
        if not self.state:
            return "Alarm Not Set"
        return "Alarm Set At: " + str(self.time)

class Clock:

    sec = 0
    mint = 0
    hour = 0

    def __init__(self, hour, mint, sec):
        self.hour = hour
        self.mint = mint
        self.sec - sec

    def setSec(self, sec):
        if 0 = sec <= 59:
            self.sec = sec

    def setMint(self, mint):
        if 0 = mint <= 59:
            self.mint = mint

    def setHour(self, hour):
        if 0 = hour <= 23:
            self.hour = hour

    def getSec(self):
        return self.sec

    def getMint(self):
        return self.mint

    def getHour(self):
        return self.hour
