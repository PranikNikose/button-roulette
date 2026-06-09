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

		stage('Build Applications') {
			parallel {

				stage('Build Backend') {
					steps {
						dir('roulette-backend') {
							bat 'mvn clean package -DskipTests'
						}
					}
				}

				stage('Build Frontend') {
					steps {
						dir('roulette-frontend') {
							bat 'npm ci'
							bat 'npm run build'
						}
					}
				}

			}
		}
		
		stage('Build Docker Images') {
			parallel {

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
							bat 'docker build --build-arg REACT_APP_API_URL=http://localhost:8888 -t roulette-frontend:latest .'
						}
					}
				}

			}
		}
		
		stage('List Docker Images') {
			steps {
				bat 'docker images'
			}
		}
		
		stage('Docker Login') {
			steps {
				withCredentials([usernamePassword(
					credentialsId: 'dockerhub-creds',
					usernameVariable: 'DOCKER_USER',
					passwordVariable: 'DOCKER_PASS'
				)]) {
					bat 'echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin'
				}
			}
		}
		
		stage('Push Docker Images') {
			parallel {

				stage('Push Backend Image') {
					steps {
						bat "docker tag roulette-backend:latest praniknikose/button-roulette-backend:${BUILD_NUMBER}"
						bat "docker tag roulette-backend:latest praniknikose/button-roulette-backend:latest"

						bat "docker push praniknikose/button-roulette-backend:${BUILD_NUMBER}"
						bat "docker push praniknikose/button-roulette-backend:latest"
					}
				}

				stage('Push Frontend Image') {
					steps {
						bat "docker tag roulette-frontend:latest praniknikose/button-roulette-frontend:${BUILD_NUMBER}"
						bat "docker tag roulette-frontend:latest praniknikose/button-roulette-frontend:latest"

						bat "docker push praniknikose/button-roulette-frontend:${BUILD_NUMBER}"
						bat "docker push praniknikose/button-roulette-frontend:latest"
					}
				}
			}
		}
		
		stage('Deploy') {
			steps {
				bat 'docker compose -f docker-compose-deploy.yml down'
				bat 'docker compose -f docker-compose-deploy.yml pull'
				bat 'docker compose -f docker-compose-deploy.yml up -d'
			}
		}
		
		
    }
}