package strategy

/**
 * In this example, totalSelectValues() accepts a closure to help decide the set
 * of values used in a computation...
 */
def upperLimit = 10
def totalSelectValues(n, closure) {
    total = 0
    for (i in 1..n) {
        if(closure(i)) {total += i}
    }
    total
}

def evenBlock = { it % 2 == 0 }
def oddBlock = { it % 2 != 0 }

print "Total of even numbers from 1 to $upperLimit is "
print totalSelectValues(upperLimit, evenBlock)

println ""

print "Total of odd numbers from 1 to $upperLimit is "
print totalSelectValues(upperLimit, oddBlock)

/**
 * Closures in this example were predefined and assigned to variables.
 * Later, they were passed in to the method just like any other parameter would be.
 * The plus side is that we can reuse these closures as many times as needed.
 */