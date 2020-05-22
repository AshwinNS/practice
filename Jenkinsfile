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
            steps{
                echo "$first"
                echo "$second"
                echo 'testing'
            }
        }
    }
}