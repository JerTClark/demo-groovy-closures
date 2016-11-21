package parameters
/**
 * Demonstrates a closure with two parameters
 */

def saySomething(closure) {
    def thingsToSay = [
            "Today is a great day!",
            "Today is a good day!",
            "Today is an ok day!",
            "Today is a \"meh\" day... but YOU'RE still great! :)"
    ]
    def random = (int) Math.floor(Math.random() * (thingsToSay.size() - 1))
    closure new Date(System.currentTimeMillis()), thingsToSay.get(random)
}

saySomething({date, something -> println "It's $date: $something"})
saySomething({Date date, String something -> println "It's ${date.after(new Date("09/22/1980"))}: ${something.reverse()}"})