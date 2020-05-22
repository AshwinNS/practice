node(master){
    stage('Git Checkout') {
        vars = checkout scm
        branch = vars.GIT_BRANCH
        commit = vars.GIT_COMMIT
        tag = branch.equals('master') ? 'stable' : branch.toLowerCase().replaceAll(/[^a-z0-9_\-]/, '')
        opts = "TAG='${tag}' SHELL='sh -x'"
        println( "branch=${branch}, tag=${tag}" )
    }

    stage('test'){
        echo $first
        echo $second
    }
}