pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/PranikNikose/button-roulette.git'
            }
        }

        stage('Build Backend') {
            steps {
                dir('roulette-backend') {
                    bat 'mvn clean package'
                }
            }
        }

        stage('Build Frontend') {
            steps {
                dir('roulette-frontend') {
                    bat 'npm install'
                    bat 'npm run build'
                }
            }
        }
    }
}