package dynamic

def examine(Closure closure) {
    println "$closure.maximumNumberOfParameters parameters expected:"
    for(parameter in closure.getParameterTypes()) {
        println "$parameter.name"
    }
}

examine {}
examine {String name, int number, ArrayList<String> list, Set set, File file -> }