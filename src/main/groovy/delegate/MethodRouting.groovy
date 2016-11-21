package delegate

class Handler {
    def f1() {println "f1 of Handler called"}
    def f2() {println "f2 of Handler called"}
}

class Example {
    def f1() {println "f1 of Example called"}
    def f2() {println "f2 of Example called"}

    def foo(Closure closure) {
        def handler = new Handler()
        handler.with closure
        def example = new Example()
        example.with closure
    }
}

def f1() {println "f1 of Script called"}

new Example().foo {
    f1()
    f2()
}