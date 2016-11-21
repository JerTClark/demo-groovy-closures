package duplicates

/**
 * Assume we want to find the sum of <b>even values</b>
 * from 1 to a certain number <b>n</b>
 */

/**
 * The traditional way
 */
def upperLimit = 10

println "The traditional way..."
def sum(n) {
    total = 0
    for(int i = 2; i <= n; i += 2) {
        total += i
    }
    total
}
println "Sum of even numbers from 1 to $upperLimit is ${sum(upperLimit)}"

/**
 * Now suppose we want to find the <b>product</b> of the even number 1 to <b>n</b>
 */
def product(n) {
    total = 1
    for(i = 2; i <= n; i += 2) {
        total *= i
    }
    total
}
println "Product of even numbers from 1 to $upperLimit is ${product(upperLimit)}"

/**
 * What if we wanted to get the <b>square</b> of the even numbers 1 to <b>n</b>?
 */
def square(n) {
    squared = []
    for(int i = 2; i <= n; i += 2) {
        squared << i ** 2
    }
    squared
}
println "The squares of even numbers from 1 to $upperLimit are ${square(upperLimit)}"

/**
 * Let's write the function so that when an even number is picked, the function
 * immediately sends it to a block of code for processing
 */
def pickEven(n, block) {
    for(int i = 2; i <= n; i += 2) {
        block(i)
    }
}

println "\nTesting the pickEven() method..."
print "Even numbers from 1 to $upperLimit are: "
pickEven(10) {evenNumber -> print "$evenNumber "}
println ""

/**
 * Now we can rewrite our previous code to utilize our looping method and closures
 * to accomplish our goals
 */
println "\nUsing closures..."
def total = 0
pickEven(upperLimit) {total += it}
println "Sum of even numbers 1 to $upperLimit is $total"

total = 1
pickEven(upperLimit) {total *= it}
println "Product of even numbers 1 to $upperLimit is $total"

def square = []
pickEven(upperLimit) {square << it ** 2}
println "Squares of even numbers 1 to $upperLimit is $square"