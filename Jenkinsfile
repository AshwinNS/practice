def rollingRestartDC = "${env.Datacenter}".trim()
def stem = 'core'
def numNodes = 5

node {
    stage('Git Checkout') {
        checkout([$class: 'GitSCM',
        branches: [[name: '*/roller']],
        doGenerateSubmoduleConfigurations: false,
        userRemoteConfigs: [[credentialsId: '16fd2382-4fcf-466f-8aed-8f93e72de489',
        url: 'https://github.com/AshwinNS/practice']]])
    }
    stage('test') {
        exampleMethod("core01.tea2.tivo.com", "40000")
    }
}

def exampleMethod() {
    def url = "http://${hostname}:${adminPort}"
    echo "checking ${url}/info"
    def info = httpRequest(url: url + '/info', validResponseCodes: '200', quiet: true)
    validateInfoSchema(info.content)
}

import groovy.json.JsonSlurper

def validateInfoSchema(String info) {
    def json = new JsonSlurper().parseText(info)
    def build = json.build
    if (!(build.time ==~ /20[0-9]{2}.[0-9]{2}.[0-9]{2}-[0-9]{6}/)) {
        error("Invalid build.time format: ${build.time} != YYYY-MM-DD_hhmmss")
    }
    if (!build.host) {
        error('Missing build.host')
    }
    if (!build.user) {
        error('Missing build.user')
    }
    if (!(build.change ==~ /[0-9a-fA-F]+/)) {
        error("Invalid build.change: ${build.change} not a hex number")
    }
    if (!build.job) {
        error('Missing build.job')
    }
    if (!(build.number ==~ /[0-9]+/)) {
        error("Invalid build.number: ${build.number} not a number")
    }
    if (!build.url) {
        error('Missing build.url')
    }
    def app = json.app
    // allow slightly relaxed semver format permitting variable
    // number of point release levels (i.e. 0 or more, not exactly 2)
    if (!(app.version ==~ /[0-9]+(\.[0-9]+)*(-.*)?/)) {
        error("Invalid app.version: ${app.version} not SemVer-like format")
    }
    if (!app.name) {
        error('Missing app.name')
    }
}
