package delegate

def examiningClosure(Closure closure) {
    closure()
}

examiningClosure {
    println "In first closure"
    println "class is " + getClass().name
    println "this is " + this
    println "this.super is " + this.getClass().superclass.name
    println "owner is " + owner
    println "owner.super is " + owner.getClass().superclass.name
    println "delegate is " + delegate
    println "delegate.super is " + delegate.getClass().superclass.name
    println ""
    examiningClosure {
        println "In closure inside of the first closure"
        println "class is " + getClass().name
        println "this is " + this
        println "this.super is " + this.getClass().superclass.name
        println "owner is " + owner
        println "owner.super is " + owner.getClass().superclass.name
        println "delegate is " + delegate
        println "delegate.super is " + delegate.getClass().superclass.name
    }

}