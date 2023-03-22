pipeline {
    agent any

    stages {
        stage('github') {
            steps {
        git 'https://github.com/pradhyuman99/speminiproject.git'           
                }
        }
        stage('mvn') {
            steps {
                sh 'mvn clean install'
                }
        }
        stage('docker build') {
            steps {
                sh 'docker build -t pradhyuman99/speminiproject:latest .'
                }
        }
        stage('docker login and push') {
            steps {
                script{
                    withCredentials([string(credentialsId: 'docker_cred', variable: 'docker_secretText')]) {
                    sh 'docker login -u pradhyuman99 -p ${docker_secretText}'
                    sh 'docker push pradhyuman99/speminiproject:latest'
                }
                }
                }
        }
         stage('ansible') {
            steps {
                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml'
                }
        }
        
        
    }
}
