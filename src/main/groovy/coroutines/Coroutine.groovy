package coroutines

def iterate(n, closure) {
    1.upto(n) {
        println "In iteration $it"
        closure(it)
    }
}

println "Calling iterate()"
def total = 0
iterate(4) {
    total += it
    println "In closure total so far is $total"
}
println "Done"