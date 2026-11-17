
pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Clean') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Verify') {
            steps {
                bat 'mvn verify'
            }
        }
    }

    post {
        success {
            echo 'Maven Build Successful!'
        }

        failure {
            echo 'Maven Build Failed!'
        }
    }
}
