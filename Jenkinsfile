pipeline {
    agent any

    stages {
        stage("Compile code") {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage("Tests") {
            when {
                branch 'feature-*'
            }
            steps {
                bat 'mvn test'
            }
        }
        stage("Static analyse") {
            when {
                branch 'develop-branch'
            }
            steps {
                bat 'mvn checkstyle:checkstyle'
            }
        }
        stage("Report") {
            when {
                branch 'feature-*'
            }
            steps {
                junit testResults: '**/surefire-reports/*.xml'
                jacoco()
            }
        }
        stage("Install") {
            steps {
                bat 'mvn install'
            }
        }
        stage("Publish") {
            steps {
                bat 'copy "MainModule\\target\\MainModule-1.0-SNAPSHOT.jar" "C:\\MainModule-1.0.jar"'
            }
        }
    }
}