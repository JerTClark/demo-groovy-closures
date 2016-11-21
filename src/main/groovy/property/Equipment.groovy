package property

class Equipment {

    //Will be a closure
    def calculator
    def letter

    //The constructor
    Equipment(calc, letter = "A") {
        this.calculator = calc
        this.letter = letter
    }

    def simulate() {
        println "Running simulation..."
        this.calculator(letter)//We can pass parameters, too
    }

}