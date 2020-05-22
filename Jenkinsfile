node {
    stage('Git Checkout') {
        checkout([$class: 'GitSCM',
        branches: [[name: '*/roller']],
        doGenerateSubmoduleConfigurations: false,
        userRemoteConfigs: [[credentialsId: '16fd2382-4fcf-466f-8aed-8f93e72de489',
        url: 'https://github.com/AshwinNS/practice']]])
    }
    stage('test'){
        if(env.first == "" || env.second == ""){
            echo "some or all inputs are empty"
        }else{
            echo env.first +":" + env.second+ ":"+ ${env.BUILD_ID}
        }
    }
}