package trampoline

Closure factorial

factorial = { int number, BigInteger theFactorial = 1 ->
    number == 1 ? theFactorial :
        factorial.trampoline(number - 1, number * theFactorial)
}.trampoline()

println "Factorial of 5 is ${factorial(5)}"
println "Factorial of 5000 is ${factorial(50)}"