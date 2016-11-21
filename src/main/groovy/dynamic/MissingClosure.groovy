package dynamic

def doSomething(closure) {
    if(closure) {
        closure()
    }
    else println "Didn't get a closure!"
}

doSomething()
doSomething() {println "Provided a closure this time!"}