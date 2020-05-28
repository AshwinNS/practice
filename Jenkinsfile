//def rollingRestartDC = "${env.Datacenter}".trim()
//def stem = 'core'
//def numNodes = 5

//String[] nodes = (1..numOfNodes).inject([]) { a, i -> a + "${stem}0${i}.${rollingRestartDC}.some.com" }

node {
    stage('Git Checkout') {
        checkout([$class: 'GitSCM',
        branches: [[name: '*/roller']],
        doGenerateSubmoduleConfigurations: false,
        userRemoteConfigs: [[credentialsId: '16fd2382-4fcf-466f-8aed-8f93e72de489',
        url: 'https://github.com/AshwinNS/practice']]])
    }
    stage('test') {
        exampleMethod()
    }
}

def exampleMethod() {

    def rollingRestartDC = "tea1"
    def stem = 'core'
    int numNodes = 5

    String[] nodes = (1..numNodes).inject([]) { a, i -> a + "${stem}0${i}.${rollingRestartDC}.some.com" }
    for(x in nodes){
        println(x)
    }
}
