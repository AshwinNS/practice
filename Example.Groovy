def rollingRestartDC = "${env.Datacenter}".trim()
def stem = 'core'
def numNodes = 5

def exampleMethod() {
    String[] nodes = (1..numOfNodes).inject([]) { a, i -> a + "${stem}0${i}.${rollingRestartDC}.some.com" }  
    echo nodes
}

return this
