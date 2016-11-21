package curry

def saySomething(closure) {
    Date date = new Date("01/09/2042")
    def thingsToSay = [
            "Today is a great day!",
            "Today is a good day!",
            "Today is an ok day!",
            "Today is a \"meh\" day... but YOU'RE still great! :)"
    ]
    //Curry the date
    something = closure.curry(date)

    def random = (int) Math.floor(Math.random() * (thingsToSay.size() - 1))
    something thingsToSay.get(random)
    random = (int) Math.floor(Math.random() * (thingsToSay.size() - 1))
    something thingsToSay.get(random)
    random = (int) Math.floor(Math.random() * (thingsToSay.size() - 1))
    something thingsToSay.get(random)
}

saySomething(){date, something -> println "It's $date: $something"}