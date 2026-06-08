pipeline {
    agent any

	tools {
		jdk 'JDK21'
		maven 'Maven-3.9.11'
	}
		
    stages {
	
		stage('Environment Check') {
			steps {
				bat 'java -version'
				bat 'javac -version'
				bat 'mvn -version'
				bat 'docker --version'
			}
		}
	
        stage('Checkout') {
            steps {
                git branch: 'button-roulette-Pranik',
                    url: 'https://github.com/PranikNikose/button-roulette.git'
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
		
		stage('Build Backend Docker') {
			steps {
				dir('roulette-backend') {
					bat 'docker build -t roulette-backend:latest .'
				}
			}
		}

		stage('Build Frontend Docker') {
			steps {
				dir('roulette-frontend') {
					bat 'docker build -t roulette-frontend:latest .'
				}
			}
		}
		
		
    }
}