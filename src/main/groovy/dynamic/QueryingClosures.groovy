package dynamic

def completeOrder(amount, Closure taxComputer) {
    def tax = 0, rate = 6.05
    if(taxComputer.maximumNumberOfParameters == 2) {
        tax = taxComputer(amount, rate)
        println "Sales tax on $amount at a rate of $rate % is $tax"
    } else {
        tax = taxComputer(amount)
        println "Sales tax on $amount is $tax"
    }

}

completeOrder(20) {amount -> amount * 0.0825}
completeOrder(20) {amount, rate -> amount * rate / 100}