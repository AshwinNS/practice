def exampleMethod() {

    def rollingRestartDC = "tea1"
    def stem = 'core'
    int numNodes = 5

    String[] nodes = (1..numNodes).inject([]) { a, i -> a + "${stem}0${i}.${rollingRestartDC}.some.com" }
    println(nodes)
}

return this
