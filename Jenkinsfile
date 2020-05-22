pipeline {
    agent any
    stages{
        stage('Git Checkout') {
            steps{
                checkout([$class: 'GitSCM',
                branches: [[name: '*/roller']],
                doGenerateSubmoduleConfigurations: false,
                userRemoteConfigs: [[credentialsId: '16fd2382-4fcf-466f-8aed-8f93e72de489',
                url: 'https://github.com/AshwinNS/practice']]])
            }
        }
        stage('test'){
            if(env.first == null || env.second == null){
                echo "some or all inputs are empty"
            }else{
                echo env.first
                echo env.Second
            }
        }
    }
}